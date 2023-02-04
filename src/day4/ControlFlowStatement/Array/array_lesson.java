package day4.ControlFlowStatement.Array;


import java.util.Arrays;
import java.util.Scanner;

public class array_lesson {
    public static void main(String[] args) {
        //largest number of Array
        //Crtl+Alt +L      format right
        int Num[] = {1, 2, 3, 4, 5, 9, 7, 7};
        int a = 0;
        for (int i = 0; i < Num.length; i++) {
            if (Num[i] > 0) {
                a = Num[i];
            }
        }
        System.out.println(a);

//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Index number");
        int ArrayNumber = scanner.nextInt();
        int newNumber[] = new int[ArrayNumber];
        System.out.println("enter your Array Number");
        for (int i = 0; i < newNumber.length; i++) {
            int data = scanner.nextInt();
            newNumber[i] = data;
        }
        System.out.println(Arrays.toString(newNumber));


//
//        System.out.println("Enter your  number");
//        int number = scanner.nextInt();
//        if(number%2 == 0){
//            System.out.println("This is Even Number");}
//        else {
//            System.out.println("This is odd Number");
//        }

 int array[][]={{1,2,3,4,5},{6,7,8,9,10},{5,6,9,11,56}};

for(int i=0;i<array.length;i++){
for (int j=0;j<array[i].length;j++){
    System.out.println(array[i][j]);
    }
}}}


