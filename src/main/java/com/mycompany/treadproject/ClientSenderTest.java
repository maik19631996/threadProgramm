/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treadproject;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Alexander
 */


public class ClientSenderTest {
    
    
    public static void main(String[] args){
        
        int port = 1340;
        String host = "127.0.0.1";
        
        for(int i=0; i < args.length; i++){
            String arg = args[i];
            switch(arg){
                case "-p":
                    port = Integer.parseInt(args[i+1]);
                    break;
                case "-h":
                    host = args[i+1];
                    break;
            }
        }
        
        try{
            Socket s = new Socket(host, port);   
            OutputStream stream = s.getOutputStream();
            
            stream.write("this is a test".getBytes());
        } catch(Exception e){
            
        }
    }
    
}
