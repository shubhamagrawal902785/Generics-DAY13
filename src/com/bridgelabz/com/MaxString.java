package com.bridgelabz.com;

public class MaxString {

    public static String compareTO(String name1, String name2, String name3) {

        int num1 = name1.compareTo(name2);
        int num2 = name1.compareTo(name3);
        int num3 = name2.compareTo(name3);

        if (num1 > num2 && num1 > num2) {
            return name1;
        } else if (num2 > num3) {
            return name2;
        } else {
            return name3;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxString value = new MaxString();
        System.out.println("max Number for First String=" + value.compareTO("shubham", "gyansh", "shubh"));
    }
}