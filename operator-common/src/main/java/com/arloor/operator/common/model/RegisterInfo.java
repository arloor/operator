package com.arloor.operator.common.model;


public class RegisterInfo {
    private String domain;
    private String id;
    private String addr;
    private int inlinePort;
    private int gatewayPort;

    public RegisterInfo(String domain, String id, String addr, int inlinePort, int gatewayPort) {
        this.domain = domain;
        this.id = id;
        this.addr = addr;
        this.inlinePort = inlinePort;
        this.gatewayPort = gatewayPort;
    }

    public String getDomain() {
        return domain;
    }

    public String getId() {
        return id;
    }

    public String getAddr() {
        return addr;
    }

    public int getInlinePort() {
        return inlinePort;
    }

    public int getGatewayPort() {
        return gatewayPort;
    }
}
