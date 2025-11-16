package Quizes;
import java.util.*;

public class Switchh {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question:What is the correct keywords to complete the switch structure.");
            System.out.println("====================================================================");
            System.out.println("int day = 2;");
            System.out.println("______(day) {");
            System.out.println("case 1:");
            System.out.println("    System.out.println(\"Monday\");");
            System.out.println("break;");
            System.out.println("case 2:");
            System.out.println("    System.out.println(\"Tuesday\");");
            System.out.println("break;");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Enter the answer: ");
            String firstans = sc.nextLine();

            if (firstans.equals("switch")) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct keyword to exit a case block and prevent fall-through in the switch statement.");
            System.out.println("====================================================================");
            System.out.println("int number = 5;");
            System.out.println("switch(number) {");
            System.out.println("case 1:");
            System.out.println("    System.out.println(\"Monday\");");
            System.out.println("    ______;");
            System.out.println("case 2:");
            System.out.println("    System.out.println(\"Tuesday\");");
            System.out.println("break;");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer21 = sc.nextLine();

            if (answer21.equals("break")) {
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