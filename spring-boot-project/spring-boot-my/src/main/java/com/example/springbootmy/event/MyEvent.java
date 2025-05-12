package com.example.springbootmy.event;

import org.springframework.context.ApplicationEvent;

// 自定义事件类
public class MyEvent extends ApplicationEvent {
 
  private String message;
 
  public MyEvent(Object source, String message) {
    super(source);
    this.message = message;
  }
 
  public String getMessage() {
    return message;
  }
}