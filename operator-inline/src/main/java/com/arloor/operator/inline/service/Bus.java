package com.arloor.operator.inline.service;

import com.arloor.operator.common.model.RegisterInfo;

/**
 * 控制总线
 */
public interface Bus {
    boolean sendRegisterInfo(RegisterInfo registerInfo);
}
