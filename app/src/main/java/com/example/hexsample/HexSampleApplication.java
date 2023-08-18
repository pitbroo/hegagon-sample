package com.example.hexsample;

import com.example.hexsample.app.console.ConsoleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HexSampleApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HexSampleApplication.class, args);
        ConsoleController consoleController = context.getBean(ConsoleController.class);
        consoleController.startConsole();
    }

}
