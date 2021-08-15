package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("-------------- System started --------------");

//        Connection connection = new Connection();
        Connection.getInstance().connect();

        Connection.getInstance().statusOfConnection();

        Connection.getInstance().disconnect();

        Connection.getInstance().statusOfConnection();

        System.out.println("-------------- System ended --------------");
    }
}
