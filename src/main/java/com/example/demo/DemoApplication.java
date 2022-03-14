package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @GetMapping("/hello-word")
//    public List<Student> hello() {
//        return List.of(
//                new Student(
//                        1L,
//                        "Mariam",
//                        "mariam.jamail@gmail.com",
//                        LocalDate.of(2000, Month.JANUARY, 5),
//                        21
//                )
//        );
//    }
}
