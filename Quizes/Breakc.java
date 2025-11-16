package Quizes;
import java.util.*;

public class Breakc {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct keyword to stop the loop when i is 3.");
            System.out.println("====================================================================");
            System.out.println("for (int i = 0; i < 5; i++) {");
            System.out.println(" if (i == 3) {");
            System.out.println("______;"); 
            System.out.println("    };");
            System.out.println("System.out.println(i);");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer26 = sc.nextLine();

            if (answer26.equals("break")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct keyword to skip printing the number 2.");
            System.out.println("====================================================================");
            System.out.println("for (int i = 0; i < 5; i++) {");
            System.out.println("  if (i == 2) ");
            System.out.println("_______;");
            System.out.println("    };");
            System.out.println("System.out.println(i);");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer27 = sc.nextLine();

            if (answer27.equals("continue")) {
                System.out.println("Correct!");
                break;
            } else {
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