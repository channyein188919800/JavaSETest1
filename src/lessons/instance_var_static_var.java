package lessons;

public class instance_var_static_var {
    int global= 34;
    static int global2= 45;
    public static void main(String[] args) {
        instance_var_static_var obj1= new instance_var_static_var();//Create obj to access global
        System.out.println(obj1.global);//Access instance variable
        System.out.println(new second().global3);//Access instance variable from second class
    }
}

class second{
    int global3 = 67;
   public static void main (String[] args ){

        System.out.println(new instance_var_static_var().global);//Anonymous operator
       System.out.println(instance_var_static_var.global2);// Access static variable
    }
}