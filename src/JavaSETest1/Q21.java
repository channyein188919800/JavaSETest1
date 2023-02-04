package JavaSETest1;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 ;
        System.out.println("Enter your want :  ");
        Scanner InputNum = new Scanner(System.in);
        int term =InputNum.nextInt();

        for (int i=0;i<=term;i++){
            System.out.println(num1+"  ");
            num3=num1+num2;
            num1 =num2;
            num2 =num3;
        }
    }
}
