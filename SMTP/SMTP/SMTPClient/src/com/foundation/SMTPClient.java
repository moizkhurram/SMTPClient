package com.foundation;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;


class SMTPClient{

    final static String MAIL_SERVER = "smtp.gmail.com";
    final static int SMTP_PORT = 25;


    // Constructor
    public SMTPClient(){

    }

    public static void main(String args[]) throws Exception {

        try{
            // Establish TCP Connection With Mail Server
            Socket socket = null;
            socket = new Socket(MAIL_SERVER, SMTP_PORT);

            // Create a Buffered Reader to read one line at a time
            InputStream inStream = socket.getInputStream();
            InputStreamReader inReader = new InputStreamReader(inStream);
            BufferedReader bReader = new BufferedReader(inReader);

            // Read Server's Greeting
            String serverResponse = bReader.readLine();
            if (!serverResponse.startsWith("220")){
                throw new Exception("220 Reply Not Received From Server!");
            }
            System.out.println("\n\nEstablishing Connection to Serve");
            System.out.println(serverResponse);

            // Reference socket's output stream
            OutputStream oStream = socket.getOutputStream();

            // Send EHLO command


            System.out.println("\nSend Hello Command to the Server");
            String heloCommand = "EHLO smtp.gmail.com\r\n";
            oStream.write(heloCommand.getBytes("US-ASCII"));
            serverResponse = bReader.readLine();
            if (!serverResponse.startsWith("250"))
                throw new Exception("Error in Executing Hello Command to Server!");
            System.out.println(serverResponse);

            // Get Responses...
            System.out.println("\nReceivng Hello Command Response from Server");
            serverResponse = bReader.readLine();
            System.out.println("1. " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("2.  " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("3.  " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("4.  " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("5.  " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("6.  " + serverResponse);
            serverResponse = bReader.readLine();
            System.out.println("Final Response: " + serverResponse);
            // END EHLO Responses


        // Send QUIT message
            System.out.println("\nSend QUIT Command to the Server");
        String quitMsg = ("QUIT\r\n");
        oStream.write(quitMsg.getBytes("US-ASCII"));
        serverResponse = bReader.readLine();
            if (!serverResponse.startsWith("221"))
                throw new Exception("Error in Executing Quit Command to Server!");
            System.out.println(serverResponse);

            System.out.println("\nReceivng Quit Command Response from Server");
        System.out.println("Quit Command: "+ serverResponse);

            if (socket != null){
                socket.close();
                System.out.println("Closed Socket Connection!");
            }
        }
        catch(IOException ioe){System.err.println(ioe);}



//        //Loading an existing file
//        File file = new File("C:/Users/CM-Ajk/Desktop/PDF Research/phishing.pdf");
//        PDDocument document = PDDocument.load(file);
//
//        String javaScript = "app.alert( {cMsg: 'this is an example', nIcon: 3,+"
//                + " nType: 0, cTitle: 'PDFBox Javascript example’});";
//
//        //Creating PDActionJavaScript object
//        PDActionJavaScript PDAjavascript = new PDActionJavaScript(javaScript);
//
//        //Embedding java script
//        document.getDocumentCatalog().setOpenAction(PDAjavascript);
//
//        //Saving the document
//        document.save( new File("C:/Users/CM-Ajk/Desktop/PDF Research/jsenabledphishing.pdf") );
//        System.out.println("Data added to the given PDF");
//
//        //Closing the document
//        document.close();
    }
}