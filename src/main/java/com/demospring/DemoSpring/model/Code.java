package com.demospring.DemoSpring.model;

import org.springframework.stereotype.Component;

@Component
public class Code implements Computer {
    /* initial code
    public void code(){
        System.out.println("Just an example of Auto-wiring");
    }
     */

    public void compile() {
        System.out.println("Implemented compile method in Code");
    }
}


// Server has layer:
//-- Controller :  Only work with request accept request and send. It doesn't do any processing
// -- Service: To do processing logic: factorial, sum etc
// -- Repository: Service has to connect to db and has no data. Layer is a DAO layer ( Data access object ) or Repository