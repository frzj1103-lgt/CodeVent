package quizzes;
import java.util.*;

public class Typecasting {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String PURPLE = "\u001B[35m";

    public static void main(Scanner sc) {
        clearScreen();
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(PURPLE + "                   TYPE CASTING QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java type casting!" + RESET);
        System.out.println(GREEN + "✅ Learn about widening and narrowing conversions" + RESET);
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
        System.out.println(YELLOW + "What is the correct value to show widening casting" + RESET);
        System.out.println(YELLOW + "(automatic type conversion):" + RESET);
        System.out.println();
        System.out.println(BLUE + "int myInt = 9;" + RESET);
        System.out.println(BLUE + "double myDouble = ________ ;" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Widening casting happens automatically" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + "Choices:" + RESET);
        System.out.println(RED + "• " + BLUE + "MyInt" + RESET);
        System.out.println(RED + "• " + BLUE + "int(MyInt)" + RESET);
        System.out.println(RED + "• " + BLUE + "double" + RESET);
        System.out.println(RED + "• " + BLUE + "String" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("myInt")) {
                System.out.println(GREEN + "✅ Correct! Widening casting happens automatically." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. What variable name assigns the value?" + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: Use the variable name (case-sensitive)" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "myInt" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "Widening casting" + RESET + " (int to double) happens automatically without special syntax");
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
        System.out.println(YELLOW + "What is the correct syntax to perform narrowing casting" + RESET);
        System.out.println(YELLOW + "(manual conversion):" + RESET);
        System.out.println();
        System.out.println(BLUE + "double myDouble = 9.78;" + RESET);
        System.out.println(BLUE + "int myInt = _______  myDouble;" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Narrowing casting requires explicit syntax" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + "Choices:" + RESET);
        System.out.println(RED + "• " + BLUE + "(int)" + RESET);
        System.out.println(RED + "• " + BLUE + "(i)" + RESET);
        System.out.println(RED + "• " + BLUE + "int()" + RESET);
        System.out.println(RED + "• " + BLUE + "(Int))" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("(int)")) {
                System.out.println(GREEN + "✅ Excellent! (int) is the correct syntax for narrowing casting." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What syntax casts to int?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It uses parentheses around the type name" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "(int)" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "Narrowing casting" + RESET + " requires explicit syntax like (int) and may lose data");
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
            System.out.println("🌟 You're a type casting expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master type casting!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review type casting concepts and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Type Casting Concepts Reviewed:" + RESET);
        System.out.println("• " + BLUE + "Widening Casting" + RESET + " - Automatic (small to large type)");
        System.out.println("• " + BLUE + "Narrowing Casting" + RESET + " - Manual with (type) syntax"); 
        System.out.println("• " + YELLOW + "Examples: byte → short → int → long → float → double" + RESET);
        System.out.println("• " + YELLOW + "Note: Narrowing may lose data (9.78 → 9)" + RESET);
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