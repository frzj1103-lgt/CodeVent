package Quizes;
import java.util.*;

public class Datatypes {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct Data type of this.");
            System.out.println("====================================================================");
            System.out.println("___ myNum = 10;");
            System.out.println("System.out.println(myNum);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer8 = sc.nextLine();

            if (answer8.equals("int")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question:What is the correct Java data type keyword to declare a");
            System.out.println("         variable that can store true or false.");
            System.out.println("====================================================================");
            System.out.println("______ isJavaFun = true;");
            System.out.println("System.out.println(isJavaFun);");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer9 = sc.nextLine();

            if (answer9.equals("boolean")) {
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