package com.arloor.operator.gateway.service;

import com.arloor.operator.common.model.Peer;
import com.arloor.operator.gateway.model.RegisterInfo;

/**
 * 职责：
 * 1.接收inline的register
 * 2.向inline索要connection
 */
public interface GatewayHost {
    void register(RegisterInfo registerInfo);

    Peer fetchPeer();
}
