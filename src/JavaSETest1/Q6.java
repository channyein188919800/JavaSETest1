package JavaSETest1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Spell Flying Transpotation ship ,Start with a");
        String a = in1.next();
        switch (a){
            case "airplane" :
                System.out.println("Yes Correct");
                break;
            case "Drone" :
                System.out.println("It is toy");
                break;
            case "Helicopter" :
                System.out.println("Bad my man");
                break;
            case "UFO" :
                System.out.println("Not Even close");
                break;
            default:
                System.out.println("Take time to think");









        }
    }
}
