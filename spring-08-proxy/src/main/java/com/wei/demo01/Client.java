package com.wei.demo01;

public class Client {

    public static void main(String[] args) {
        Host host = new Host();

        RentProxy rentProxy = new RentProxy(host);

        rentProxy.rent();
    }
}
