package com.example.springbootmy.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Autowired
  private ApplicationContext context;
 
  @GetMapping("/hello")
  public void hello() {
    System.out.println("准备发送事件");
    context.publishEvent(new MyEvent(this, "welcome to hangge.com"));
    System.out.println("事件发送完毕");
  }
}