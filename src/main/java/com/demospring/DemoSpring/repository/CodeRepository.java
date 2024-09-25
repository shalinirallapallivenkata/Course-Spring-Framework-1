package com.demospring.DemoSpring.repository;

import com.demospring.DemoSpring.model.Code;
import org.springframework.stereotype.Repository;


@Repository // same as @Component and @Component works too!
public class CodeRepository {
    public void saveDbProperties(Code code){
        // JDBC steps here
        // Don't write jdbc steps in service class
        // can implement CRUD too here
        System.out.println("Adding properties to DB");
    }
}
