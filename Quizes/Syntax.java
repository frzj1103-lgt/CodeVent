package Quizes;
import java.util.*;

public class Syntax {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: If your file name is \"School.java\", what is the correct");
            System.out.println("          classname to match the file name?");
            System.out.println("====================================================================");
            System.out.println("        public class ______ {");
            System.out.println("          public static void main(String[] args) {");
            System.out.println("            System.out.println(\"Hello\");");
            System.out.println("          }");
            System.out.println("        }");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer1 = sc.nextLine();

            if (answer1.equals("School")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the missing symbol to complete the Java statement?");
            System.out.println("====================================================================");
            System.out.println("System.out.println(\"What's up madlang people!\")____");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer2 = sc.nextLine();

            if (answer2.equals(";")) {
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