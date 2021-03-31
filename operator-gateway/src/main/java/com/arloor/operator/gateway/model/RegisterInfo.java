package com.arloor.operator.gateway.model;


public class RegisterInfo {
    private String token;
    private String id;
    private String addr;
    private int inlinePort;
    private int gatewayPort;

    public RegisterInfo(String addr, int inlinePort, int gatewayPort) {
        this.addr = addr;
        this.inlinePort = inlinePort;
        this.gatewayPort = gatewayPort;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getInlinePort() {
        return inlinePort;
    }

    public void setInlinePort(int inlinePort) {
        this.inlinePort = inlinePort;
    }

    public int getGatewayPort() {
        return gatewayPort;
    }

    public void setGatewayPort(int gatewayPort) {
        this.gatewayPort = gatewayPort;
    }
}
