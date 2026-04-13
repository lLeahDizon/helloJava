package com.example;

public class App {
    public String greet(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new App().greet("Java"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }
}
