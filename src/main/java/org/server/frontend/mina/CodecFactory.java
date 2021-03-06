/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.server.frontend.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

/**
 * 解码工厂
 *
 * @author Hxms
 */
public class CodecFactory implements ProtocolCodecFactory {

    private final ProtocolEncoder _encoder = new MessageEncoder();
    private final ProtocolDecoder _decoder = new MessageDecoder();

    @Override
    public ProtocolEncoder getEncoder(IoSession is) throws Exception {
        return _encoder;
    }

    @Override
    public ProtocolDecoder getDecoder(IoSession is) throws Exception {
        return _decoder;
    }
}
