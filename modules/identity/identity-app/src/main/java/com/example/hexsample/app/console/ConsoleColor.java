package com.example.hexsample.app.console;

public enum ConsoleColor {
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_RESET ("\u001B[0m");
    final String color;

    ConsoleColor( String color) {
        this.color = color;
    }
}
