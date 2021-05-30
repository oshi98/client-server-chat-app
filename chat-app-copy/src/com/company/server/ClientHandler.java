package com.company.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable{

    private Socket client;

    public ClientHandler(Socket socket) {

        this.client = socket;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);//wait for 20 seconds before executing the rest of the code
            InputStream inputStream = this.client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            DataOutputStream outputStream = new DataOutputStream(this.client.getOutputStream());

            Scanner myObj = new Scanner(System.in);

            //continues reading data from client
            String inputData;

            while ((inputData = bufferedReader.readLine()) != null){

                System.out.println("Client Says: " + inputData);

                switch (inputData){

                    case "Hello from the client":

                        String answer1 = myObj.nextLine();
                        outputStream.writeBytes(answer1 + "\n");
                        break;

                    case "I want to set an appointment":

                        String answer2 = myObj.nextLine();
                        outputStream.writeBytes(answer2 + "\n");
                        break;

                    case "June 10":

                        String answer3 = myObj.nextLine();
                        outputStream.writeBytes(answer3 + "\n");
                        break;

                    case "10am":

                        String answer4 = myObj.nextLine();
                        outputStream.writeBytes(answer4 + "\n");
                        break;

                    case "exit":
                        outputStream.writeBytes("I didn't understand that \n");
                        break;

                    default:
                        outputStream.writeBytes("I didn't understand that\n");
                }

                if (inputData.equals("exit")){
                    break;
                }
            }

            this.client.close();


        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }

    //two ways to create a thread in java
    //1. Extend the class using Thread Super class.
    //2. Implement the class using Runnable interface.

}
