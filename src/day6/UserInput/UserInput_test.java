package day6.UserInput;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number");
        int a =scanner.nextInt();
        System.out.println("this is "+a);



        Scanner index = new Scanner(System.in);
        System.out.println("Enter your Index number");
        int ArrayNumber = index.nextInt();
        int newNumber[] = new int[ArrayNumber];
        System.out.println("enter your Array Number");
        for (int i = 0; i < newNumber.length; i++) {
            int data = index.nextInt();
            newNumber[i] = data;
        }
        System.out.println(Arrays.toString(newNumber));



        System.out.println("Enter your  number");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println("This is Even Number");}
        else {
            System.out.println("This is odd Number");
        }

    }
}
