package com.bridgelabz.com;


public class Refactor1 {

    public static <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {

        if (num2.compareTo(num1) > 0) {
            return num2;
        } else if (num3.compareTo(num2) > 0) {
            return num3;
        } else {
            return num1;
        }

    }

    public static void main(String[] args) {

        System.out.println("Maximum number out of three integers is: " + maximum(11, 15, 2));
        System.out.println("Maximum number out of three float is: " + maximum(1.1f, 331.2f, 96.1f));
        System.out.println("Maximum among three string is: " + maximum("shubham", "gyanesh", "shubh"));
    }   
    }