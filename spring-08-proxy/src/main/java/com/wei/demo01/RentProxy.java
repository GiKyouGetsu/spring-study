package com.wei.demo01;

public class RentProxy {
    private Host host;

    public RentProxy() {
    }
    public RentProxy(Host host) {
        this.host = host;
    }
     public void rent() {
        this.host.rent();
     }
}
