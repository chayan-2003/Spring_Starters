package com.chayan.spring_demo;

import com.chayan.spring_demo.config.AppConfig;
import com.chayan.spring_demo.model.Alien;
import com.chayan.spring_demo.model.Laptop;
import com.chayan.spring_demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {

//       ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//   Alien obj1= context.getBean("alien1",Alien.class);
////       Desktop obj2= (Desktop) context.getBean("com2");
// obj1.code();
////   obj1.setAge(21);
//   System.out.println(obj1.getAge());
////   Alien obj2= (Alien) context.getBean("alien1");
//////   obj2.code();
////        System.out.println(obj2.age);
////
// ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        ApplicationContext context= SpringApplication.run(SpringDemoApplication.class,args);
//  Desktop dt1 = context.getBean(Desktop.class);
//  Desktop dt2 = context.getBean(Desktop.class);
//
//  dt1.compile();
//        Alien obj1= context.getBean(Alien.class);
//
//obj1.code();
//int age1=obj1.getAge() ;
//System.out.println(age1);
        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
//        lap.compile();
    }

}
