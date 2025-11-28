import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while(choice != 0){
            System.out.println("=====================================");
            System.out.println("            LESSONS MENU");
            System.out.println("=====================================");
            System.out.println(" [1] Syntax             [2] Output");
            System.out.println(" [3] Comment            [4] Variables");
            System.out.println(" [5] Data Types         [6] Type Casting");
            System.out.println(" [7] Operators          [8] Strings");
            System.out.println(" [9] Math               [10] Boleans");
            System.out.println(" [11] If/else           [12] Switch");
            System.out.println(" [13] While loop        [14] For loop");
            System.out.println(" [15] Break/Continue    [16] Arrays");
            System.out.println(" [0] Exit");
            System.out.println("=====================================");
        System.out.print("Enter the number of the lesson you want to run (0-16): ");
        
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            System.out.println(" ");

            switch (choice) {
                case 1:
                    Syntaxles.main(new String[0]);
                    break;
                case 2:
                    Outples.main(new String[0]);
                    break;
                case 3:
                    Comles.main(new String[0]);
                    break;
                case 4:
                    Varles.main(new String[0]);
                    break;
                case 5:
                    Datatles.main(new String[0]);
                    break;
                case 6:
                    Typecles.main(new String[0]);
                    break;
                case 7:
                    Operales.main(new String[0]);
                    break;
                case 8:
                    Mathles.main(new String[0]);
                    break;
                case 9:
                    Mathles.main(new String[0]);
                    break;
                case 10:
                    Booleansles.main(new String[0]);
                    break;
                case 11:
                    Ifelseles.main(new String[0]);
                    break;
                case 12:
                    Switchles.main(new String[0]);
                    break;
                case 13:
                    Whileles.main(new String[0]);
                    break;
                case 14:
                    Forles.main(new String[0]);
                    break;
                case 15:
                    BreaknConles.main(new String[0]);
                    break;
                case 16:
                    Arrayles.main(new String[0]);
                    break;
                case 0:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number(0 to 16)");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        System.out.println(" ");
    } 
        scanner.close();
    }
}