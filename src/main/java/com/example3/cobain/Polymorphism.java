package com.example3.cobain;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Rania");
        employee.sayHello("Vincent");

        employee = new Manager("Rania");
        employee.sayHello("Vincent");

        employee = new VicePresident("Rania");
        employee.sayHello("Vincent");

        sayHello(new Employee("Rania"));
        sayHello(new Manager("Vincent"));
        sayHello(new VicePresident("VinRan"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}