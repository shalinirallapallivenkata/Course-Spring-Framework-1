package com.demospring.DemoSpring;

import com.demospring.DemoSpring.model.Code;
import com.demospring.DemoSpring.service.CodeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // Search components in same package. run() runs the container and also knows which is the main file with this annotation
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringApplication.class, args);
		// this is container access for object
		//SpringApplication is given by Spring Framework
		// the objects are in the Spring Framework container - DI
		// Ioc ---> inversion of control
		// .run() returns an object of ApplicationContext type


		/*

		Developer object = context.getBean(Developer.class); // we need to access bean that the component annotation provided
		// getting the bean object from context in container from the other class
		// creating an object of type the other class
		System.out.println(object.getAge());
		object.develop();


		*/

		Code code = context.getBean(Code.class);

		CodeService service = context.getBean(CodeService.class);


		service.addProcessing(code);

		// service does processing : Service layer is what is this example



//		Code objectCode = context.getBean(Code.class);
//		objectCode.code();


	}

}
