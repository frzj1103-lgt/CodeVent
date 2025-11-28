package quizzes;
import java.util.*;

public class Breakc {
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
        System.out.println(PURPLE + "                 BREAK & CONTINUE QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of loop control statements!" + RESET);
        System.out.println(GREEN + "✅ Type the exact keywords as shown in Java" + RESET);
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
        System.out.println(YELLOW + "What is the correct keyword to stop the loop when i is 3:" + RESET);
        System.out.println();
        System.out.println(BLUE + "for (int i = 0; i < 5; i++) {" + RESET);
        System.out.println(BLUE + "    if (i == 3) {" + RESET);
        System.out.println(BLUE + "        ______;" + RESET);
        System.out.println(BLUE + "    }" + RESET);
        System.out.println(BLUE + "    System.out.println(i);" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This keyword completely exits the loop" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("break")) {
                System.out.println(GREEN + "✅ Correct! 'break' immediately terminates the loop." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. Think about what stops a loop completely." + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It starts with 'b' and means to interrupt or stop" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "break" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "break" + RESET + " immediately exits the entire loop when i equals 3");
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
        System.out.println(YELLOW + "What is the correct keyword to skip printing the number 2:" + RESET);
        System.out.println();
        System.out.println(BLUE + "for (int i = 0; i < 5; i++) {" + RESET);
        System.out.println(BLUE + "    if (i == 2)" + RESET);
        System.out.println(BLUE + "        _______;" + RESET);
        System.out.println(BLUE + "    System.out.println(i);" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This keyword skips to the next iteration" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("continue")) {
                System.out.println(GREEN + "✅ Excellent! 'continue' skips the current iteration." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. Think about what skips one iteration." + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It starts with 'c' and means to proceed to the next" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "continue" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "continue" + RESET + " skips the rest of the current iteration when i equals 2");
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
            System.out.println("🌟 You're a loop control expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master loop control!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review break and continue statements and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Key Concepts Reviewed:" + RESET);
        System.out.println("• " + BLUE + "break" + RESET + " - Completely exits the loop");
        System.out.println("• " + BLUE + "continue" + RESET + " - Skips to the next iteration"); 
        System.out.println("• " + YELLOW + "break stops the loop, continue skips one iteration" + RESET);
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