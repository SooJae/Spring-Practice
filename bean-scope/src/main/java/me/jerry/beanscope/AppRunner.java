package me.jerry.beanscope;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

//  @Autowired
//  Single single;
//
//  @Autowired
//  Proto proto;

  @Autowired
  ApplicationContext ctx;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("proto");

  }
}
