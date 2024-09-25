package com.demospring.DemoSpring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component // gives the beans across spring classes for the objects to be stored in the container
public class Developer {

    /* Initial code
     @Autowired
     Code code; // instantiating the object od Code class

     use auto-wire for accessing all the beans in main class from container of Spring framework
     public void develop() {
         System.out.println("Just an example of Another class called in main class using beans by Component for Dependency injection");
     }

     */
    @Value("26")
    private int age;
    private Computer compile;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public Computer getCompile() {
        return compile;
    }

    // using @Autowired in this setter autowired --- setter injection
    @Autowired
    @Qualifier("code")
    public void setCompile(Computer compile) {
            this.compile = compile;
}

    public void compile() {
        System.out.println("Implemented compile method in Developer");
    }

    public void develop() {
        System.out.println("Just an example of Another class called in main class using beans by Component for Dependency injection");
        compile.compile();
    }
}
