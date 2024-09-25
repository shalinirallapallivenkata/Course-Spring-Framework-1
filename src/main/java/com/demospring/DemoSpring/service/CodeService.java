package com.demospring.DemoSpring.service;

import com.demospring.DemoSpring.model.Code;
import com.demospring.DemoSpring.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component is not the only option
// Service does the same thing. Makes us understand this is service even component works but Service makes more sense
@Service
public class CodeService {

    @Autowired // injecting this object
    // repository and code objects need wiring
    private CodeRepository repository;

    public void addProcessing(Code code) { // needs to be added in database
        System.out.println("Processing...");
        code.compile();
        repository.saveDbProperties(code);
    }

    public CodeRepository getRepository() {
        return repository;
    }

    public void setRepository(CodeRepository repository) {
        this.repository = repository;
    }

    public boolean performance(Code code) {
        return true;
    }
}
