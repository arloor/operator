package com.arloor.operator.inline.service;

import com.arloor.operator.common.model.Peer;
import com.arloor.operator.common.model.RegisterInfo;

public interface Client {
    boolean register(RegisterInfo registerInfo);

    Peer supply(String domain, String id);
}
