package org.tnw.server.entity.thrift.server;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.tnw.server.entity.thrift.FileTransService;
import org.tnw.server.entity.thrift.impl.FileTransServiceImpl;

/**
 * Created by Lannister on 2019/11/20.
 */
@Component
public class ThriftServer {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Value("${thrift.port}")
  private int port;

  @Autowired
  private FileTransServiceImpl fileTransService;

  public void start() {
    try {
      TProcessor tprocessor = new FileTransService.Processor<FileTransService.Iface>(fileTransService);
      // 简单的单线程服务模型
      TServerSocket serverTransport = new TServerSocket(port);
      TServer.Args tArgs = new TServer.Args(serverTransport);
      tArgs.processor(tprocessor);
      tArgs.protocolFactory(new TBinaryProtocol.Factory());
      TServer server = new TSimpleServer(tArgs);
      logger.info("thrift服务启动成功, 端口={}", port);
      server.serve();
    } catch (Exception e) {
      logger.error("thrift服务启动失败", e);
    }
  }
}
