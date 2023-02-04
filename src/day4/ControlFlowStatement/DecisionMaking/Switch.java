package day4.ControlFlowStatement.DecisionMaking;

public class Switch {
    public static void main(String[] args) {
        String animal="dog";
        switch(animal){
            case "Cat":
                System.out.println("cat");
                break;
            case "dog":
                System.out.println("dog");
                break;
            case "Rabbit":
                System.out.println("rabbit");
                break;
            default:
                System.out.println("there is no animals");
                break;

        }
    }
}
