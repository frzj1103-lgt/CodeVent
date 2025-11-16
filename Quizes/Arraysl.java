package Quizes;
import java.util.*;

public class Arraysl {

    public static void main(Scanner sc) {

        while (true) {
            System.out.println(" ");
            System.out.println("Question: Fill in the blanks to declare an integer array.");
            System.out.println("====================================================================");
            System.out.println("int  _______ numbers = {1, 2, 3, 4, 5};");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer28 = sc.nextLine();

            if (answer28.equals("[]")) {
                System.out.println("Correct!");
                System.out.print(" ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Question: What is the correct data type to declare an array of strings.");
            System.out.println("====================================================================");
            System.out.println("________ [] cars = {\"Volvo\", \"BMW\", \"Ford\"};");
            System.out.println("====================================================================");
            System.out.print("Answer: ");
            String answer29 = sc.nextLine();

            if (answer29.equals("String")) {
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