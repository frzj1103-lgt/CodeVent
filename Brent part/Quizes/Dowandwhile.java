package Quizes;
import java.util.*;

public class Dowandwhile {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct keyword to start the loop.");
            System.out.println("====================================================================");
            System.out.println("int i = 0;");
            System.out.println("______(i < 3) {");
            System.out.println("    System.out.println(i);");
            System.out.println("    i++;");
            System.out.println("}");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer22 = sc.nextLine();

            if (answer22.equals("while")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: Complete the do-while loop.");
            System.out.println("====================================================================");
            System.out.println("int i = 0;");
            System.out.println("______{");
            System.out.println("    System.out.println(i);");
            System.out.println("    i++;");
            System.out.println("}while (i < 3);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer23 = sc.nextLine();

            if (answer23.equals("do")) {
                System.out.println("Correct!");
                System.out.print(" ");
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