package com.lesnikov.client;

public class Client {

    public static void main(String[] args) {
        System.out.println("Client has been started!");
        new CommandReceiver().run();;
    }

}
