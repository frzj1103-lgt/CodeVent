package Quizes;
import java.util.*;

public class Forl {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: Fill in the blanks to start a for loop.");
            System.out.println("====================================================================");
            System.out.println("_____ (int i = 0; i < 5; i ++ ) {");
            System.out.println("    System.out.println(i);");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer24 = sc.nextLine();

            if (answer24.equals("for")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: drop the correct condition to stop the loop when i is no");
            System.out.println("          longer less than 5.");
            System.out.println("====================================================================");
            System.out.println("for (int i = 0;______; i++) {");
            System.out.println("    System.out.println(i);");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer25 = sc.nextLine();

            if (answer25.equals("i<5") || answer25.equals("i < 5")) {
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