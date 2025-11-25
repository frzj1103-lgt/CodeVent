package Quizes;
import java.util.*;

public class Comment {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");     
            System.out.println("Question: What is the correct syntax for a single-line comment in Java.");
            System.out.println("====================================================================");
            System.out.println("_____ This is a single-line comment");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer5 = sc.nextLine();

            if (answer5.equals("//")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct syntax for a Multi-line comment in Java.");
            System.out.println("====================================================================");
            System.out.println("____This is a multi-line comment____");
            System.out.println("====================================================================");
            System.out.print("Enter the opening symbol (e.g., /*): ");
            String open = sc.nextLine();
            System.out.print("Enter the closing symbol (e.g., */): ");
            String close = sc.nextLine();

            if (open.equals("/*") && close.equals("*/")) {
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