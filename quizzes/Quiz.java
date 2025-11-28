package quizzes;

import java.util.Scanner;

public class Quiz {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String PURPLE = "\u001B[35m";
    private static final String BOLD = "\u001B[1m";
    
    private Scanner scanner;
    
    public Quiz(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public boolean startQuizMenu() {
        int choice = -1;
        boolean returnToMain = false;

        while (choice != 0 && !returnToMain) {
            clearScreen();
            displayHeader();
            displayMenu();
            
            System.out.print("\n" + YELLOW + "🎯 Enter your choice (0-16): " + RESET);
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
                returnToMain = handleChoice(choice, scanner);
            } else {
                System.out.println(RED + "❌ Invalid input. Please enter a number." + RESET);
                scanner.nextLine(); 
                pause(scanner);
            }
        }
        
        // Return true to indicate we should go back to main menu
        return true;
    }
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    private static void displayHeader() {
        System.out.println(CYAN + "╔════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + PURPLE + BOLD + "              JAVA QUIZ MASTER             " + RESET + CYAN + "║" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "         Test Your Java Knowledge!        " + RESET + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚════════════════════════════════════════╝" + RESET);
        System.out.println();
    }
    
    private static void displayMenu() {
        String[][] menuItems = {
            {GREEN + "1" + RESET, "Syntax", GREEN + "2" + RESET, "Output"},
            {GREEN + "3" + RESET, "Comments", GREEN + "4" + RESET, "Variables"},
            {GREEN + "5" + RESET, "Data Types", GREEN + "6" + RESET, "Type Casting"},
            {GREEN + "7" + RESET, "Operators", GREEN + "8" + RESET, "Strings"},
            {GREEN + "9" + RESET, "Math", GREEN + "10" + RESET, "Booleans"},
            {GREEN + "11" + RESET, "If/Else", GREEN + "12" + RESET, "Switch"},
            {GREEN + "13" + RESET, "While Loop", GREEN + "14" + RESET, "For Loop"},
            {GREEN + "15" + RESET, "Break/Continue", GREEN + "16" + RESET, "Arrays"}
        };
        
        for (String[] row : menuItems) {
            System.out.printf("  %s %-15s %s %-15s\n", row[0], row[1], row[2], row[3]);
        }
        
        System.out.println("\n" + CYAN + "═".repeat(42) + RESET);
        System.out.println("  " + RED + "0" + RESET + " Return to Main Menu");
        System.out.println(CYAN + "═".repeat(42) + RESET);
    }
    
    private boolean handleChoice(int choice, Scanner sc) {
        switch (choice) {
            case 1:
                showQuizInfo("Syntax Quiz", "Test your knowledge of Java syntax rules", sc);
                quizzes.Syntax.main(sc);
                break;
            case 2:
                showQuizInfo("Output Quiz", "Practice with print and println methods", sc);
                quizzes.Output.main(sc);
                break;
            case 3:
                showQuizInfo("Comments Quiz", "Learn about single and multi-line comments", sc);
                quizzes.Comment.main(sc);
                break;
            case 4:
                showQuizInfo("Variables Quiz", "Test variable declaration and usage", sc);
                quizzes.Variables.main(sc);
                break;
            case 5:
                showQuizInfo("Data Types Quiz", "Identify different Java data types", sc);
                quizzes.Datatypes.main(sc);
                break;
            case 6:
                showQuizInfo("Type Casting Quiz", "Practice implicit and explicit casting", sc);
                quizzes.Typecasting.main(sc);
                break;
            case 7:
                showQuizInfo("Operators Quiz", "Test arithmetic and logical operators", sc);
                quizzes.Operators.main(sc);
                break;
            case 8:
                showQuizInfo("Strings Quiz", "String methods and manipulation", sc);
                quizzes.Javstrings.main(sc);
                break;
            case 9:
                showQuizInfo("Math Quiz", "Math class methods and operations", sc);
                quizzes.JavMath.main(sc);
                break;
            case 10:
                showQuizInfo("Booleans Quiz", "True/false values and logic", sc);
                quizzes.Bool.main(sc);
                break;
            case 11:
                showQuizInfo("If/Else Quiz", "Conditional statements practice", sc);
                quizzes.Ifelse.main(sc);
                break;
            case 12:
                showQuizInfo("Switch Quiz", "Switch statement scenarios", sc);
                quizzes.Switchh.main(sc);
                break;
            case 13:
                showQuizInfo("While Loop Quiz", "Looping with while and do-while", sc);
                quizzes.Dowandwhile.main(sc);
                break;
            case 14:
                showQuizInfo("For Loop Quiz", "For loop syntax and usage", sc);
                quizzes.Forl.main(sc);
                break;
            case 15:
                showQuizInfo("Break/Continue Quiz", "Loop control statements", sc);
                quizzes.Breakc.main(sc);
                break;
            case 16:
                showQuizInfo("Arrays Quiz", "Array declaration and manipulation", sc);
                quizzes.Arraysl.main(sc);
                break;
            case 0:
                showReturnMessage();
                return true; // Return to main menu
            default:
                System.out.println(RED + "❌ Invalid choice. Please select a number from 0-16." + RESET);
                pause(sc);
        }
        return false;
    }
    
    private static void showQuizInfo(String title, String description, Scanner sc) {
        clearScreen();
        System.out.println(PURPLE + "╔════════════════════════════════════════╗" + RESET);
        System.out.println(PURPLE + "║" + CYAN + BOLD + "           STARTING QUIZ: " + String.format("%-15s", title) + RESET + PURPLE + "║" + RESET);
        System.out.println(PURPLE + "╚════════════════════════════════════════╝" + RESET);
        System.out.println();
        System.out.println(YELLOW + "📝 " + description + RESET);
        System.out.println();
        System.out.println(GREEN + "💡 Tips:" + RESET);
        System.out.println("• Read each question carefully");
        System.out.println("• Choose the best answer");
        System.out.println("• You'll get immediate feedback");
        System.out.println("• Your score will be shown at the end");
        System.out.println();
        System.out.print(YELLOW + "Press Enter to start the quiz..." + RESET);
        sc.nextLine();
    }
    
    private static void showReturnMessage() {
        clearScreen();
        System.out.println(CYAN + "╔════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + GREEN + BOLD + "         RETURNING TO MAIN MENU          " + RESET + CYAN + "║" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "        Keep practicing to master Java!      " + RESET + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚════════════════════════════════════════╝" + RESET);
        System.out.println();
        System.out.println(PURPLE + "🌟 Come back anytime for more quiz practice!" + RESET);
        System.out.println();
    }
    
    private static void pause(Scanner sc) {
        System.out.print(YELLOW + "\nPress Enter to continue..." + RESET);
        sc.nextLine();
    }
    
    public static void startQuizzes(Scanner sc) {
        Quiz quiz = new Quiz(sc);
        quiz.startQuizMenu();
    }
}