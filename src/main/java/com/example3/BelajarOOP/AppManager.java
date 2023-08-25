package com.example3.BelajarOOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Rania Gisela";
        manager.sayHello("Rara");

        var vicePresident = new VicePresident();
        vicePresident.name = "Gisela";
        vicePresident.sayHello("Pramesty");
    }
}