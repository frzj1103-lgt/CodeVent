package Quizes;
import java.util.*;

public class Typecasting {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct value to show widening casting ");
            System.out.println("          (automatic type conversion).");
            System.out.println("====================================================================");
            System.out.println("int myInt = 9;");
            System.out.println("double myDouble = ________ ;");
            System.out.println("Choices:");
            System.out.println("·MyInt");
            System.out.println("·int(MyInt)");
            System.out.println("·double");
            System.out.println("·String");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer10 = sc.nextLine();

            if (answer10.equals("myInt")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct syntax to perform narrowing casting");
            System.out.println("         (manual).");
            System.out.println("====================================================================");
            System.out.println("double myDouble = 9.78;");
            System.out.println("int myInt = _______  myDouble;");
            System.out.println("Choices:");
            System.out.println("·(int)");
            System.out.println("·(i)");
            System.out.println("·int()");
            System.out.println("·(Int))");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer11 = sc.nextLine();

            if (answer11.equals("(int)")) {
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