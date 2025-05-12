package com.example.springbootmy.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 事件监听器
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
  // 事件发生时执行
  @Override
  public void onApplicationEvent(MyEvent event) {
    System.out.println("接收到事件: " + event.getMessage());
    // 模拟事件处理
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}