package Quizes;
import java.util.*;

public class Operators {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct operator to add the numbers.");
            System.out.println("====================================================================");
            System.out.println("int sum = 5 ____ 3");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer12 = sc.nextLine();

            if (answer12.equals("+")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct operator to division the numbers.");
            System.out.println("====================================================================");
            System.out.println("int result = 10 ____ 2;");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer13 = sc.nextLine();

            if (answer13.equals("/")) {
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