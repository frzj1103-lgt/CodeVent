package quizzes;
import java.util.*;

public class Comment {
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
        System.out.println(PURPLE + "                    JAVA COMMENTS QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java comment syntax!" + RESET);
        System.out.println(GREEN + "✅ Type the exact symbols as used in Java" + RESET);
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
        System.out.println(YELLOW + "What is the correct syntax for a single-line comment in Java:" + RESET);
        System.out.println();
        System.out.println(BLUE + "_____ This is a single-line comment" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Two forward slashes" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("//")) {
                System.out.println(GREEN + "✅ Correct! '//' is used for single-line comments." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. Think about the single-line comment symbol." + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's two identical punctuation marks used for division" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "//" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "//" + RESET + " comments out everything until the end of the line");
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
        System.out.println(YELLOW + "What is the correct syntax for a multi-line comment in Java:" + RESET);
        System.out.println();
        System.out.println(BLUE + "____This is a multi-line comment____" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: You need to provide both opening and closing symbols" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Enter the opening symbol: " + RESET);
            String open = sc.nextLine().trim();
            System.out.print(YELLOW + "Enter the closing symbol: " + RESET);
            String close = sc.nextLine().trim();
            
            if (open.equals("/*") && close.equals("*/")) {
                System.out.println(GREEN + "✅ Excellent! '/*' and '*/' are used for multi-line comments." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. Check both symbols." + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: Opening is /* and closing is */ - they work as a pair" + RESET);
                    System.out.println(GREEN + "Let's try again..." + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "Opening: /*  Closing: */" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "/* */" + RESET + " can comment out multiple lines of code");
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
            System.out.println("🌟 You're a Java comments expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master Java comments!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review comment syntax and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Key Comment Types Reviewed:" + RESET);
        System.out.println("• " + BLUE + "//" + RESET + " - Single-line comment (end of line)");
        System.out.println("• " + BLUE + "/* */" + RESET + " - Multi-line comment (block comment)"); 
        System.out.println("• " + YELLOW + "Comments are ignored by the compiler - for documentation only" + RESET);
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