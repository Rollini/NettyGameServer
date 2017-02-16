package com.wolf.shoot.net.message;

import com.wolf.shoot.common.exception.CodecException;

import java.net.InetSocketAddress;

/**
 * Created by jwp on 2017/2/16.
 * 抽象的udp消息
 */
public abstract class NetProtoBufUDPMessage extends NetProtoBufMessage{
    /**
     * 发送方
     */
    private InetSocketAddress send;
    /**
     * 接收方
     */
    private InetSocketAddress receive;

    public InetSocketAddress getSend() {
        return send;
    }

    public void setSend(InetSocketAddress send) {
        this.send = send;
    }

    public InetSocketAddress getReceive() {
        return receive;
    }

    public void setReceive(InetSocketAddress receive) {
        this.receive = receive;
    }
}
