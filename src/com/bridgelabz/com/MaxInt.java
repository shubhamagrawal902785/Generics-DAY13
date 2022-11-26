package com.bridgelabz.com;

import java.util.Scanner;

public class MaxInt {

    public static Integer compareTo(Integer num1, Integer num2, Integer num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxInt integer = new MaxInt();

        System.out.println("max Number for 1st TC1.1=" + integer.compareTo(11, 15, 2));
    }
}
