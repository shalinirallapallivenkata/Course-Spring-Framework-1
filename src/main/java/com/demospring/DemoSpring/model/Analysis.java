package com.demospring.DemoSpring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Analysis implements Computer{
    public void compile(){
        System.out.println("Implemented compile method in Analysis");
    }
}
