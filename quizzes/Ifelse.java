package quizzes;
import java.util.*;

public class Ifelse {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct keyword and condition to make the code");
            System.out.println("          print Good night. (Note: time is declared as 'time', not 'x')");
            System.out.println("====================================================================");
            System.out.println("int time = 20;");
            System.out.println("____(time > 18){");
            System.out.println("    System.out.println(\"Good night\");");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String fans = sc.nextLine();

            if (fans.equals("if")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: Print \"1\" if x is equal to y, print \"2\" if x is greater");
            System.out.println("          than y, otherwise print \"3\". Fill the blanks.");
            System.out.println("====================================================================");
            System.out.println("int x = 50;");
            System.out.println("int y = 50;");
            System.out.println("if (x == y){");
            System.out.println("    System.out.println(\"1\");");
            System.out.println("}_____(x > y){");
            System.out.println("    System.out.println(\"2\");");
            System.out.println("}_____{");
            System.out.println("    System.out.println(\"3\");");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Enter the first answer (for the blank before (x > y)): ");
            String fanswer = sc.nextLine();
            System.out.print("Enter the second answer (for the final blank): ");
            String lanswer = sc.nextLine();

            if (fanswer.equals("else if") && lanswer.equals("else")) {
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