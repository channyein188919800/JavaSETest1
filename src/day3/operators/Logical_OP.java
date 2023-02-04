package day3.operators;

public class Logical_OP {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c=10;
        System.out.println(a<b&&a<c);
        System.out.println(a<b||a<c);
        System.out.println(!(a<b||a<c));
    }
}
