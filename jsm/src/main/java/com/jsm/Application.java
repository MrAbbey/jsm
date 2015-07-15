package com.jsm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsm.component.MessagePrinter;
import com.jsm.service.MessageService;
@Configuration
@ComponentScan
public class Application {
  public static void main(String[] args) {
      /*ApplicationContext context = 
          new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();*/
	  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	  MessageService messageService = (MessageService) applicationContext.getBean("messageService");
	  messageService.addMessage();
	  //System.out.println(message);
  }
}
