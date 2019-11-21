package org.tnw.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tnw.server.entity.thrift.Code;
import org.tnw.server.entity.thrift.FileTransInfo;
import org.tnw.server.entity.thrift.client.ThriftClient;

/**
 * Created by Lannister on 2019/11/12.
 */
@RestController
public class LoaderController {

  @Autowired
  ThriftClient client;

  @GetMapping("/loader/createTask")
  public Integer createTask(){
    try{
      client.open();
      int task = client.getFileTransService().createTask(new FileTransInfo("192.168.1.2", "/usr/local/table.txt"));
      client.close();
      return task;
    }catch (Exception e){
      return null;
    }
  }

  @GetMapping("/loader/getStatus")
  public Code getStatus(){
    try{
      client.open();
      Code status = client.getFileTransService().getStatus();
      client.close();
      return status;
    }catch (Exception e){
      return null;
    }
  }

  @GetMapping("/loader/reset")
  public Integer reset(){
    try{
      client.open();
      int reset = client.getFileTransService().reset();
      client.close();
      return reset;
    }catch (Exception e){
      return null;
    }
  }
}
