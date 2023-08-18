package com.example.hexsample.app.console;

import com.example.hexsample.domain.model.User;
import com.example.hexsample.domain.port.in.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

@Controller
@Slf4j
public class ConsoleController {
    private final UserService userService;
    Scanner scanner;
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";


    public ConsoleController(UserService userService) {
        this.userService = userService;
        scanner = new Scanner(System.in);
    }

    public void startConsole() {
        try {
            Scanner scanner = new Scanner(System.in);

            boolean exit = false;
            while (!exit) {
                System.out.println(ConsoleColor.ANSI_RESET.color+"1. Display Users");
                System.out.println("2. Get User by Email");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");

                int option = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                switch (option) {
                    case 1:
                        displayUsers();
                        break;
                    case 2:
                        getUserByEmail();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }

            scanner.close();
        } catch (Exception exception) {
            log.warn("Invalid value, continue use app");
            startConsole();
        }
    }

    private void displayUsers() {
        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println(ConsoleColor.ANSI_BLUE.color + user.toString());
        }
    }

    private void getUserByEmail() {
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        User user = userService.getByEmail(email);
        if (user != null) {
            System.out.println(ConsoleColor.ANSI_BLUE.color+"User found: " + user);
        } else {
            System.out.println(ConsoleColor.ANSI_PURPLE.color+"User not found for email: " + email);
        }
    }
}