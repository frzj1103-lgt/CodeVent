import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;


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
                        Quizes.Syntax.main(sc); 
                    break;
                case 2:
                    Quizes.Output.main(sc); 
                    break;
                case 3:
                    Quizes.Comment.main(sc); 
                    break;
                case 4:
                    Quizes.Variables.main(sc); 
                    break;
                case 5:
                    Quizes.Datatypes.main(sc);
                    break;
                case 6:
                    Quizes.Typecasting.main(sc);
                    break;
                case 7:
                    Quizes.Operators.main(sc);
                    break;
                case 8:
                    Quizes.Javstrings.main(sc);
                    break;
                case 9:
                    Quizes.JavMath.main(sc);
                    break;
                case 10:
                    Quizes.Bool.main(sc);
                    break;
                case 11:
                    Quizes.Ifelse.main(sc); 
                    break;
                case 12:
                    Quizes.Switchh.main(sc); 
                    break;
                case 13:
                    Quizes.Dowandwhile.main(sc); 
                    break;
                case 14:
                    Quizes.Forl.main(sc); 
                    break;
                case 15:
                    Quizes.Breakc.main(sc);
                    break;
                case 16:
                    Quizes.Arraysl.main(sc);
                    break;
                case 0:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from the menu (0-16).");
                    break;
            }
        }
    
        sc.close();
    }
}