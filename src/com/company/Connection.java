package com.company;

public class Connection {
    private Connection connection;
    private String urlConnection;
    private Integer port = 8080;
    private Boolean state = false;

    private static Connection INSTANCE;

    private Connection() {

    }

    public static synchronized Connection getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }

    public void connect() {
        state = true;
        System.out.println("connect started on port " + port);
    }

    public void statusOfConnection(){
        System.out.println("status of connection " + state);
    }

    public void disconnect() {
        state = false;
        System.out.println("disconnect");
    }
}
