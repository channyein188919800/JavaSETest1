package JavaSETest1;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {


                System.out.println("Enter the required size of the array : ");
                Scanner in4 = new Scanner(System.in);
                int size = in4.nextInt();
                int myArray[] = new int [size];
                int sum = 0;
                System.out.println("Enter the elements of the array one by one ");

                for(int i=0; i<size; i++){
                    myArray[i] = in4.nextInt();
                    sum =+ myArray[i];
                }

                System.out.println("Sum of the elements of the array:"+sum);
            }




}
