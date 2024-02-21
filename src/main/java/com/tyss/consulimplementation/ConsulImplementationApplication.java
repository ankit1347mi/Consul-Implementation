package com.tyss.consulimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsulImplementationApplication {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/getDataMessage")
    public String getDataMessage() {
        return appConfig.getDataMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulImplementationApplication.class, args);
    }

}
