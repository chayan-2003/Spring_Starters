package com.chayan.spring_demo;

import com.chayan.spring_demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap)
    {
        System.out.println("Saved in database");
    }
}
