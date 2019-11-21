package org.tnw.server.entity.thrift.impl;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;
import org.tnw.server.entity.thrift.Code;
import org.tnw.server.entity.thrift.FileTransInfo;
import org.tnw.server.entity.thrift.FileTransService;

import java.util.Random;

/**
 * Created by Lannister on 2019/11/20.
 */
@Component
public class FileTransServiceImpl implements FileTransService.Iface {

  @Override
  public int createTask(FileTransInfo info) throws TException {
    System.out.println(info.filePath);
    System.out.println(info.targetIp);
    return new Random().nextInt();
  }

  @Override
  public Code getStatus() throws TException {
    return new Code(new Random().nextInt(),new Random().nextInt());
  }

  @Override
  public int reset() throws TException {
    return new Random().nextInt();
  }
}
