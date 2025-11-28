package quizzes;
import java.util.*;

public class Dowandwhile {
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
        System.out.println(PURPLE + "                 WHILE & DO-WHILE QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java loop keywords!" + RESET);
        System.out.println(GREEN + "✅ Type the exact loop keywords as used in Java" + RESET);
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
        System.out.println(YELLOW + "What is the correct keyword to start the while loop:" + RESET);
        System.out.println();
        System.out.println(BLUE + "int i = 0;" + RESET);
        System.out.println(BLUE + "______(i < 3) {" + RESET);
        System.out.println(BLUE + "    System.out.println(i);" + RESET);
        System.out.println(BLUE + "    i++;" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This loop checks condition first" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("while")) {
                System.out.println(GREEN + "✅ Correct! 'while' starts a loop that checks condition first." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. What keyword starts a while loop?" + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a 5-letter word that means 'during the time that'" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "while" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "while" + RESET + " loops check the condition before executing the code block");
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
        System.out.println(YELLOW + "Complete the do-while loop:" + RESET);
        System.out.println();
        System.out.println(BLUE + "int i = 0;" + RESET);
        System.out.println(BLUE + "______{" + RESET);
        System.out.println(BLUE + "    System.out.println(i);" + RESET);
        System.out.println(BLUE + "    i++;" + RESET);
        System.out.println(BLUE + "}while (i < 3);" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This loop executes first, then checks condition" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("do")) {
                System.out.println(GREEN + "✅ Excellent! 'do' starts a loop that executes at least once." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What keyword pairs with 'while' in do-while?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a 2-letter word that means 'perform'" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "do" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "do" + RESET + " loops execute the code block first, then check the condition");
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
            System.out.println("🌟 You're a Java loop expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master loops!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review while and do-while loops and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Key Loop Types Reviewed:" + RESET);
        System.out.println("• " + BLUE + "while" + RESET + " - Checks condition first (0 or more executions)");
        System.out.println("• " + BLUE + "do-while" + RESET + " - Executes first, then checks condition (1 or more executions)"); 
        System.out.println("• " + YELLOW + "do-while always runs at least once, while may not run at all" + RESET);
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