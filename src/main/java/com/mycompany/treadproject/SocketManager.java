/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treadproject;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;


/**
 *
 * @author Alexander
 */
public class SocketManager {
    
    private int _port = 80;
    private int _max_sockets = 2;
    
    private Semaphore _semaphore;
    private final Map<String, Client> _clients = new HashMap<>();
    
    
    
    public SocketManager(){
        _semaphore = new Semaphore(_max_sockets);
    }
    
    public SocketManager(int port, int max_sockets){
        _port = port;
        _max_sockets = max_sockets;
        _semaphore = new Semaphore(max_sockets);
    }
    
    public void StartListener(){
        Thread t = new Thread(() -> ThreadSocketListener());
        t.start();
    }
    
    private void ThreadSocketListener(){
        try{
            
            System.out.print("Waiting for Connections");
            ServerSocket serverSocket = new ServerSocket(_port);
            while(true){
                
                
                _semaphore.acquireUninterruptibly();
                
                Socket socket = serverSocket.accept();
                
                if(socket != null){
                    HandleConnection(socket);
                }
                
                
                _semaphore.release();
                
            }
        } catch(Exception e){
            System.out.print (e);
        }
    }
    
    private void HandleConnection(Socket socket){
        Thread t = new Thread(() -> ThreadHandleConnection(socket));
        t.start();
    }
    
    private void ThreadHandleConnection(Socket socket){
        
        String xml = ReadStream(socket);
        
        // TODO: REMOVE THIS
        System.out.println("Received :" + xml);
        
        // Get Client ID
        // TODO: CHANGE TO TAG
        String clientTag = "PC1";
        
        Client client;
        if(_clients.containsKey(clientTag)){
            client = _clients.get(clientTag);
        } else {
            client = new Client(clientTag);
            _clients.put(client.getTag(), client);
        }
        
        //TODO: DO HERE CLIENT SHI*
    }
    
    private String ReadStream(Socket socket){
        
        String content = "";
        
        try{
            InputStream stream = socket.getInputStream();
            
            byte[] buffer = new byte[4096];
            int offset = 0;
            
            
            int bytes;
            
            do{
                bytes = stream.read(buffer, offset, buffer.length);
                for(int i = 0; i < bytes; i++){
                    content += buffer[i];
                }
                
            } while(bytes == buffer.length);
            
        } catch (Exception e){
            System.out.print(e);
        }
        
        return content;
    }
}
