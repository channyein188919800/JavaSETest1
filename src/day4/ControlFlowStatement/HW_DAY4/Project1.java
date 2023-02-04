package day4.ControlFlowStatement.HW_DAY4;

public class Project1 {
    public static void main(String[] args) {
       int Math =40;
       int Eng =71;
       int  Myn =40;
       int Total= Math + Eng + Myn;
         if (Math >= 40 && Eng >=40 && Myn >= 40){
        System.out.println("You pass the exam and your total marks is "+Total);}
         else if(Math < 40 || Eng <40 || Myn < 40 )
         {System.out.println("You fail the Exam Try Again and your total marks is "+Total);
         }




    if (Math >= 40 && Math <= 70){
            System.out.println("You pass Math Sub and your Mark is " +Math);
    } else if ( Math > 70) {
            System.out.println("You pass and got a Distinction in Math and your Mark is "+ Math);
    }else{
            System.out.println("You fail the Math with " + Math);
    }




    if (Myn >= 40 && Myn <= 70){
            System.out.println("You pass Myanmar Sub and your Mark is " +Myn);
    } else if ( Myn > 70) {
            System.out.println("You pass and got a Distinction in Myanmar and your Mark is "+ Myn);
    }else{
            System.out.println("You fail the Myanmar with " + Myn);
    }




    if (Eng >= 40 && Eng <= 70){
            System.out.println("You pass English Sub and your Mark is " + Eng);
    } else if ( Eng > 70) {
            System.out.println("You pass and got a Distinction in English and your Mark is "+ Eng);
    }else{
            System.out.println("You fail the English with " + Eng);
    }


}}
