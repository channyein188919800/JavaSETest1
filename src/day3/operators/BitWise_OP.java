package day3.operators;

public class BitWise_OP {
    public static void main(String[] args) {
int a = 16;
int b = 25;
int bitWiseAnd= a & b;
        System.out.println(bitWiseAnd);
int exclusive_OR=a ^ b;
        System.out.println(exclusive_OR);
int inclusive_OR= a | b;
        System.out.println(inclusive_OR);
int compliment = ~a  ;
        System.out.println(compliment);
    }
}
