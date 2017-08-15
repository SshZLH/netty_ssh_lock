package com.wanhuchina.lock.service.impl.netty.server;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by shenguanhao on 2017/4/23.
 */
public class LockServerListenner implements ApplicationListener {

    private static final org.slf4j.Logger log= LoggerFactory.getLogger(LockServerListenner.class);


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        try {
            log.info("------启动服务........");
            LockTcpServer server = new LockTcpServer();
            server.startServer();
            log.info("------启动服务成功------");
        } catch (Exception e) {
            log.error("------启动服务失败------"+e);
            e.printStackTrace();
        }
    }
}
