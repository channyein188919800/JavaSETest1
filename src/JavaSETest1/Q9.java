package JavaSETest1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int []array ={3,4,5,6,7,8,9,10};
        for (int i =0;i<array.length;i++) {
            System.out.println(array[i]+" ");
        }


        Scanner index = new Scanner(System.in);
        System.out.println("Enter your Index number");
        int ArrayNumber = index.nextInt();
        System.out.println("You got"+(array[ArrayNumber]));


    }
}
