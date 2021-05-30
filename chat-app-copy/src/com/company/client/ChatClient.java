package com.company.client;

import java.util.Scanner;

import java.io.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        //what if you can capture input using scanner class
        client.sendMessage("Hello from the client");
        client.sendMessage("I want to set an appointment");
        client.sendMessage("June 10");
        client.sendMessage("10am");
        client.sendMessage("exit");

        System.out.println("Client finished the execution...\n");

        //send data both ways
        //server sends data according to the client input
    }
}
