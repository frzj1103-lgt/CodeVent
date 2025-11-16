import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        System.out.println("Welcome to the Java Quiz Suite!");

        while (choice != 0) {
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("            QUIZ MENU");
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
            System.out.print("Enter your choice (0-16): ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- Starting Syntax Quiz ---");
                    Exercises.Syntax.main(sc); 
                    break;
                case 2:
                    System.out.println("\n--- Starting Output Quiz ---");
                    Exercises.Output.main(sc); 
                    break;
                case 3:
                    System.out.println("\n--- Starting Comment Quiz ---");
                    Exercises.Comment.main(sc); 
                    break;
                case 4:
                    System.out.println("\n--- Starting Variables Quiz ---");
                    Exercises.Variables.main(sc); 
                    break;
                case 5:
                    System.out.println("\n--- Starting Data Types Quiz ---");
                    Exercises.Datatypes.main(sc);
                    break;
                case 6:
                    System.out.println("\n--- Starting Type Casting Quiz ---");
                    Exercises.Typecasting.main(sc);
                    break;
                case 7:
                    System.out.println("\n--- Starting Operators Quiz ---");
                    Exercises.Operators.main(sc);
                    break;
                case 8:
                    System.out.println("\n--- Starting Strings Quiz ---");
                    Exercises.Javstrings.main(sc);
                    break;
                case 9:
                    System.out.println("\n--- Starting Math Quiz ---");
                    Exercises.JavMath.main(sc);
                    break;
                case 10:
                    System.out.println("\n--- Starting Boolean Quiz ---");
                    Exercises.Bool.main(sc);
                    break;
                case 11:
                    System.out.println("\n--- Starting if/else Quiz ---");
                    Exercises.Ifelse.main(sc); 
                    break;
                case 12:
                    System.out.println("\n--- Starting Switch Quiz ---");
                    Exercises.Switchh.main(sc); 
                    break;
                case 13:
                    System.out.println("\n--- Starting While loop Quiz ---");
                    Exercises.Dowandwhile.main(sc); 
                    break;
                case 14:
                    System.out.println("\n--- Starting For loop Quiz ---");
                    Exercises.Forl.main(sc); 
                    break;
                case 15:
                    System.out.println("\n--- Starting Break/Continue Quiz ---");
                    Exercises.Breakc.main(sc);
                    break;
                case 16:
                    System.out.println("\n--- Starting Arrays Quiz ---");
                    Exercises.Arraysl.main(sc);
                    break;
                case 0:
                    System.out.println("Thank you for using the Quiz Suite. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from the menu (0-3).");
                    break;
            }
        }
    
        sc.close();
    }
}