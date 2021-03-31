package com.arloor.operator.gateway.service;

import com.arloor.operator.common.model.Peer;
import com.arloor.operator.common.model.Session;

public interface Gateway {
    Session session(Peer peer);
    void close(Session session);
}
