package day6.UserInput;

import java.util.Scanner;

public class HW_Fibonacci_Number {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 ;
        System.out.println("Enter your term :  ");
        Scanner InputNum = new Scanner(System.in);
       int term =InputNum.nextInt();

        for (int i=0;i<=term;i++){
            System.out.println(num1+"  ");
            num3=num1+num2;
            num1 =num2;
            num2 =num3;
    }
}}
