package day6.UserInput;

import java.io.Reader;
import java.util.Scanner;

public class HW_Calculator {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter First Number  ");
        double number1 = scanner.nextInt();
        System.out.print("Enter Second Number  ");
        double number2 = scanner.nextInt();
        System.out.println("Type your operator");
        String operator = scanner.next();




        switch (operator){
            case "+" :
                System.out.println("This is your Result "+(number1 + number2));
                break;
            case "-" :
                System.out.println("This is your Result "+(number1 - number2));
                break;
            case "*" :
                System.out.println("This is your Result "+(number1 * number2));
                break;
            case "/" :
                System.out.println("This is your Result "+(number1 / number2));
                break;
            case "%" :
                System.out.println("This is your Result "+(number1 % number2));
                break;
            default:
                System.out.println("Type your Operator correctly");
        }
    }}

