package Quizes;
import java.util.*;

public class Output {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct method to print Hello World in Java");
            System.out.println("====================================================================");
            System.out.println("System.out._________(\"Hello World\");");
            System.out.println(" ");
            System.out.println("Choices:");
            System.out.println("·prntl");
            System.out.println("·echo");
            System.out.println("·printline");
            System.out.println("·println");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer3 = sc.nextLine();

            if (answer3.equals("println")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct text so the code prints Hello Java");
            System.out.println("====================================================================");
            System.out.println("System.out.println(_____________);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer4 = sc.nextLine();

            if (answer4.equals("\"Hello Java\"")) {
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