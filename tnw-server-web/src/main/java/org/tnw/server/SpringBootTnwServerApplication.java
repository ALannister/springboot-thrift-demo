package org.tnw.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tnw.server.entity.thrift.server.ThriftServer;

/**
 * Created by Lannister on 2019/10/11.
 * SpringBoot应用启动类
 */
@SpringBootApplication
public class SpringBootTnwServerApplication {
  private static ThriftServer thriftServer;

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringBootTnwServerApplication.class, args);

    try {
      thriftServer = context.getBean(ThriftServer.class);
      thriftServer.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
