package JavaSETest1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Choose between 32 and 35 ,if You  are lucky the output will be drop");
        int a = in.nextInt();
        switch (a){
            case 32 :
                System.out.println("Not Even Close");
            break;
            case 33 :
                System.out.println("little Closer");
                break;
            case 34 :
                System.out.println("Boom You Got it ");
                break;
            case 35 :
                System.out.println("So close");
                break;
            default:
                System.out.println("Check your number Range");









    }
}}
