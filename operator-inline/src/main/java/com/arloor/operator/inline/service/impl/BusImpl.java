package com.arloor.operator.inline.service.impl;

import com.arloor.operator.common.exception.Connec2HostException;
import com.arloor.operator.common.model.RegisterInfo;
import com.arloor.operator.common.utils.OsHelper;
import com.arloor.operator.inline.service.Bus;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BusImpl implements Bus {
    private static final Logger log = LoggerFactory.getLogger(BusImpl.class);
    private EventLoopGroup bossGroup = OsHelper.buildEventLoopGroup(1);
    private EventLoopGroup workerGroup = OsHelper.buildEventLoopGroup(0);
    private final Bootstrap b = new Bootstrap() {
        {
            group(bossGroup)
                    .channel(OsHelper.socketChannelClazz())
                    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .handler(new LoggingHandler(LogLevel.INFO));
        }
    };

    private Channel busChannel;

    public BusImpl() throws Connec2HostException {
        try {
            busChannel = b.connect("localhost", 9999).sync().channel();
        } catch (InterruptedException e) {
            log.error("创建控制总线链接失败");
        }
        if (busChannel == null) {
            throw new Connec2HostException();
        }
    }

    @Override
    public boolean sendRegisterInfo(RegisterInfo registerInfo) {
        return false;
    }
}
