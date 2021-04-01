package com.arloor.operator.inline.service.impl;

import com.arloor.operator.common.model.Peer;
import com.arloor.operator.common.model.RegisterInfo;
import com.arloor.operator.inline.service.Bus;
import com.arloor.operator.inline.service.Client;

public class ClientImpl implements Client {
    private Bus bus;

    @Override
    public boolean register(RegisterInfo registerInfo) {
        return bus.sendRegisterInfo(registerInfo);
    }

    @Override
    public Peer supply(String domain, String id) {
        return null;
    }
}
