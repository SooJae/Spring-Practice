package me.jerry.envprofile;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;

public class AppRunner implements ApplicationRunner {

  @Autowired
  ApplicationContext ctx;

  @Override
  public void run(ApplicationArguments args) throws Exception {
//    Environment environment = ctx.get
  }
}
