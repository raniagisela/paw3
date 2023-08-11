package com.example3.paw;

public class MethodParameter {
    public static void main(String[] args) {
        SayHello("Rania", "Gisela");
    }

    static void SayHello(String firstname, String LastName) {
        System.out.println("Hello" + firstname + " " + LastName);
    }
    
}
