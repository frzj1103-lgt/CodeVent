package Quizes;
import java.util.*;

public class Variables {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct data type to declare an integer variable.");
            System.out.println("====================================================================");
            System.out.println("_______ myNum = 15;");
            System.out.println("System.out.println(myNum);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer6 = sc.nextLine();

            if (answer6.equals("int")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct value to complete the Java statement?");
            System.out.println("====================================================================");
            System.out.println("String name = \"John\";");
            System.out.println("int age = _____;");
            System.out.println("System.out.println(age);");
            System.out.println("Choices:");
            System.out.println("·25");
            System.out.println("·\"25\"");
            System.out.println("·name");
            System.out.println("·String");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer7 = sc.nextLine();

            if (answer7.equals("25")) {
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