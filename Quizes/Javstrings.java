package Quizes;
import java.util.*;

public class Javstrings {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct operator to combine firstName and");
            System.out.println("          lastName into one string.");
            System.out.println("====================================================================");
            System.out.println("String firstName = \"John\";");
            System.out.println("String lastName = \"Doe\";");
            System.out.println("System.out.println(firstName ______lastName);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer14 = sc.nextLine();

            if (answer14.equals("+")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct operator to add two integers a and b.");
            System.out.println("====================================================================");
            System.out.println("int a = 10;");
            System.out.println("int b = 20;");
            System.out.println("System.out.println(a ___ b);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer15 = sc.nextLine();

            if (answer15.equals("+")) {
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