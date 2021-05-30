package com.company.client;

import java.io.IOException;

public class ChatClient2 {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        //what if you can capture input using scanner class
        client.sendMessage("Hello from the client...");
        client.sendMessage("how are you?");
        client.sendMessage("I'm fine");
        client.sendMessage("thank you");
        client.sendMessage("exit");

        System.out.println("Client finished the execution...\n");

        //send data both ways
        //server sends data according to the client input
    }
}

//accept the user inputs using command line
//use a gui for client and server
//encrypt messages between client and the server
//limit the number of clients

//commit the code to a git repo