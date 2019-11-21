package org.tnw.server.entity.thrift.client;

import lombok.Getter;
import lombok.Setter;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.tnw.server.entity.thrift.FileTransService;

/**
 * Created by Lannister on 2019/11/20.
 */
public class ThriftClient {

  @Getter
  private FileTransService.Client fileTransService;
  private TBinaryProtocol protocol;
  private TSocket transport;
  @Getter
  @Setter
  private String host;
  @Getter
  @Setter
  private int port;

  public void init() {
    transport = new TSocket(host, port);
    protocol = new TBinaryProtocol(transport);
    fileTransService = new FileTransService.Client(protocol);
  }

  public void open() throws TTransportException {
    transport.open();
  }

  public  void  close() {
    transport.close();
  }
}
