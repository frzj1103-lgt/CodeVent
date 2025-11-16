package Quizes;
import java.util.*;

public class JavMath{
    
    public static void main(Scanner sc) {
        
        while (true) {
            System.out.println(" ");
            System.out.println("Question:What is the correct method to return the smallest value.");
            System.out.println("====================================================================");
            System.out.println("int result = Math._______(5, 10);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer16 = sc.nextLine();

            
            if (answer16.equals("min")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            }else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct method to return the square root of 64.");
            System.out.println("====================================================================");
            System.out.println("double result = Math._____(64);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer17 = sc.nextLine();

            if (answer17.equals("sqrt")) {
                System.out.println("Correct!");
                break;
            }else {
                System.out.println("Wrong!");
            }
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            main(sc);
        }
    }
}