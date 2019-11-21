package org.tnw.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tnw.server.entity.thrift.client.ThriftClient;

/**
 * Created by Lannister on 2019/11/20.
 */
@Configuration
public class ThriftClientConfig {

  @Value("${thrift.host}")
  private String host;
  @Value("${thrift.port}")
  private int port;

  @Bean(initMethod = "init")
  public ThriftClient thriftClient() {
    ThriftClient thriftClient = new ThriftClient();
    thriftClient.setHost(host);
    thriftClient.setPort(port);
    return thriftClient;
  }
}
