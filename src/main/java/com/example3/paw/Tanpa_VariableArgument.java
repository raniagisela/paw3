package com.example3.paw;

public class Tanpa_VariableArgument {
        
        static void SayCongrats(String name, int[] values) {

            int total = 0;
            for (var value : values) {
                total += value;
            }
            int finalValue = total / values.length;

            if (finalValue >= 75) {
                System.out.println("Selamat " + name + ", Anda Lulus");
            } else {
                System.out.println("Maaf " + name + ", Anda Lulus");
        }
    }
    
}
