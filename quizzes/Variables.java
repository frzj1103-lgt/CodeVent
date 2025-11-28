package quizzes;
import java.util.*;

public class Variables {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String PURPLE = "\u001B[35m";

    public static void main(Scanner sc) {
        clearScreen();
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(PURPLE + "                    VARIABLES QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java variables and data types!" + RESET);
        System.out.println(GREEN + "✅ Learn about variable declaration and initialization" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.print(GREEN + "Press Enter to start the quiz..." + RESET);
        sc.nextLine();

        int score = 0;
        int totalQuestions = 2;

        // Question 1
        clearScreen();
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(PURPLE + "                     QUESTION 1/2" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "What is the correct data type to declare an integer variable:" + RESET);
        System.out.println();
        System.out.println(BLUE + "_______ myNum = 15;" + RESET);
        System.out.println(BLUE + "System.out.println(myNum);" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This data type stores whole numbers" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("int")) {
                System.out.println(GREEN + "✅ Correct! int is used for integer variables." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. What data type stores whole numbers?" + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a 3-letter abbreviation for 'integer'" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "int" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "int" + RESET + " is the data type for storing integer values (whole numbers)");
                }
            }
        }
        
        System.out.print(GREEN + "Press Enter to continue..." + RESET);
        sc.nextLine();

        // Question 2
        clearScreen();
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(PURPLE + "                     QUESTION 2/2" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "What is the correct value to complete the Java statement:" + RESET);
        System.out.println();
        System.out.println(BLUE + "String name = \"John\";" + RESET);
        System.out.println(BLUE + "int age = _____;" + RESET);
        System.out.println(BLUE + "System.out.println(age);" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: int variables store numbers without quotes" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + "Choices:" + RESET);
        System.out.println(RED + "• " + BLUE + "25" + RESET);
        System.out.println(RED + "• " + BLUE + "\"25\"" + RESET);
        System.out.println(RED + "• " + BLUE + "name" + RESET);
        System.out.println(RED + "• " + BLUE + "String" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("25")) {
                System.out.println(GREEN + "✅ Excellent! int variables store numeric values without quotes." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What value fits an int variable?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: Numbers don't need quotes, strings do" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "25" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "int variables" + RESET + " store numeric values directly, without quotes");
                }
            }
        }

        // Quiz Results
        clearScreen();
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(PURPLE + "                     QUIZ RESULTS" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println();
        
        if (score == totalQuestions) {
            System.out.println(GREEN + "🎉 PERFECT SCORE! " + score + "/" + totalQuestions + RESET);
            System.out.println("🌟 You're a variables expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master variables!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review variables and data types and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Variable Concepts Reviewed:" + RESET);
        System.out.println("• " + BLUE + "int" + RESET + " - Stores integer values (whole numbers)");
        System.out.println("• " + BLUE + "String" + RESET + " - Stores text in double quotes"); 
        System.out.println("• " + YELLOW + "Other types: double, boolean, char, float" + RESET);
        System.out.println("• " + YELLOW + "Note: Numbers don't use quotes, Strings do" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println();
        System.out.print(GREEN + "Press Enter to return to menu..." + RESET);
        sc.nextLine();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            main(sc);
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}