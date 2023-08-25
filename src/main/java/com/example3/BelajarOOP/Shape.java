package com.example3.BelajarOOP;

public class Shape {
    int getCorner(){
        return 0;
    }
}
    class Rectangle extends Shape {
        int getCorner(){
            return 4;
        }

        int getParentCorner(){
            return super.getCorner();
        }
    }
