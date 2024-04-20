package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("Car Store app started! Goto http://localhost:8080/student_name");
    }
}

@RestController
@RequestMapping("/dic_student_name")  
class StudentController {  

    @Value("${fullname:Charafeddine Adham}")
    private String fullname;

    @GetMapping("/student_name")
    public String getFullname() {
        return "Work done by " + this.fullname + "!";
    }
}
