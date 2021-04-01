package com.arloor.operator.gateway.service;

import com.arloor.operator.common.model.Peer;
import com.arloor.operator.common.model.RegisterInfo;

/**
 * 职责：
 * 1.接收inline的register
 * 2.向inline索要connection
 */
public interface Host {
    void record(RegisterInfo registerInfo);

    Peer fetchPeer(String domain,String id);
}
