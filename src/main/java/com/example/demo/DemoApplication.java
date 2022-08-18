package com.example.demo;

import com.example.demo.listLearning.ListLearningStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("HERE I GO!");
        System.out.println("HERE I GO again!");
        System.out.println("HERE I GO again!");
        ListLearningStart listLearningStart = new ListLearningStart();

        ArrayList test = listLearningStart.getArrayList();
    }
}
