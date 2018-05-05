/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treadproject;

/**
 *
 * @author Alexander
 */
public class Main_Test_SocketManager {
    public static void main(String[] args) {
        SocketManager sm = new SocketManager(1340, 2);
        sm.StartListener();
    }
}
