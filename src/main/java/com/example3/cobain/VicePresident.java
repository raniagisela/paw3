package com.example3.cobain;

public class VicePresident extends Manager{
    VicePresident (String name){
        super(name);
    }
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}