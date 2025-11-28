package quizzes;
import java.util.*;

public class Arraysl {
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
        System.out.println(PURPLE + "                     ARRAY DECLARATION QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your array knowledge with these exercises!" + RESET);
        System.out.println(GREEN + "✅ Type your answers exactly as shown in the examples" + RESET);
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
        System.out.println(YELLOW + "Fill in the blank to declare an integer array:" + RESET);
        System.out.println();
        System.out.println(BLUE + "int  _______ numbers = {1, 2, 3, 4, 5};" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Look for the array declaration symbol" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("[]")) {
                System.out.println(GREEN + "✅ Correct! The [] indicates this is an array variable." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. Remember the array declaration symbol." + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's two characters that go before the variable name" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "[]" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "int[]" + RESET + " declares an integer array variable");
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
        System.out.println(YELLOW + "What is the correct data type to declare an array of strings:" + RESET);
        System.out.println();
        System.out.println(BLUE + "________ [] cars = {\"Volvo\", \"BMW\", \"Ford\"};" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Think about what type of data we're storing" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("String")) {
                System.out.println(GREEN + "✅ Excellent! String is the correct data type for text data." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What data type holds text?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It starts with 'S' and is used for text" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "String" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "String[]" + RESET + " declares a string array for text data");
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
            System.out.println("🌟 You're an array expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master arrays!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review the lesson and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Key Concepts Reviewed:" + RESET);
        System.out.println("• " + BLUE + "int[]" + RESET + " - Integer array declaration");
        System.out.println("• " + BLUE + "String[]" + RESET + " - String array declaration"); 
        System.out.println("• Array initialization with {}");
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