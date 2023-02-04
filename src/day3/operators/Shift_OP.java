package day3.operators;

public class Shift_OP {
    public static void main(String[] args) {
        int a =678;
        int rightShift= a>>3;
        System.out.println(rightShift);

        int leftShift = a <<2;
        System.out.println(leftShift);

        int unsignedRightShift = a >>> 3;
        System.out.println(unsignedRightShift);

    }
}
