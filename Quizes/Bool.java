package Quizes;
import java.util.*;

public class Bool {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question:What is the correct operator to check if 10 is greater than 9.");
            System.out.println("====================================================================");
            System.out.println("System.out.println(10 ___ 9);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer18 = sc.nextLine();

            if (answer18.equals(">")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct operator to check if 10 is equal to 15.");
            System.out.println("====================================================================");
            System.out.println("System.out.println(10 ____ 15);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer19 = sc.nextLine();

            if (answer19.equals("==")) {
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