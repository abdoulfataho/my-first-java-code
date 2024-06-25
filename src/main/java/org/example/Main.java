package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        multiplication table by 2.
        int num = 2;
        int i =  0;
        for(i=0;i<=10;i++) {
                              System.out.println(i*num);
                           }
        float num1 =2.4522435675123f;
        System.out.println(num1);
        String abd = "this is a string";
        System.out.println(abd);

        Scanner response =new Scanner(System.in);
        String yourStory = "";
        System.out.println("Enter yourStory");;
        yourStory= response.nextLine();
        System.out.println("your story is :"+yourStory);
    }
}