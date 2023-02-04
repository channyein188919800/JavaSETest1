package lessons;

public class Method_Training {
    public static void main(String[] args) {
        int x ;
        x = 34;
        System.out.println(x); //Direct Reference
       Method_Training obj1 =new Method_Training();
        obj1.doAdd(58,78);
        obj1.doAdd(34,78);
    }


    //Oject Initialiazation
     void doAdd(int x,int y){
        int result=x+y;
         System.out.println(result);
    }
}


