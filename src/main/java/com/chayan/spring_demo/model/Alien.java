package com.chayan.spring_demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("25")
     private int age;

//     @Qualifier("laptop")
      private Computer com ;
      private int salary;
     public Alien()
    {
        System.out.println(" Alien Object created");
    }

//    public Alien(int age,Laptop lap )
//    {
//        this.age=age;
//        this.lap=lap;
//
//    }


    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }



    public void code()
    {
        System.out.println("Coding");
        com.compile();

    }
}
