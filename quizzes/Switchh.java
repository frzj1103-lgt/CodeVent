package quizzes;
import java.util.*;

public class Switchh {
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
        System.out.println(PURPLE + "                  SWITCH STATEMENTS QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java switch statements!" + RESET);
        System.out.println(GREEN + "✅ Type the exact keywords as used in Java" + RESET);
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
        System.out.println(YELLOW + "What is the correct keyword to complete the switch structure:" + RESET);
        System.out.println();
        System.out.println(BLUE + "int day = 2;" + RESET);
        System.out.println(BLUE + "______(day) {" + RESET);
        System.out.println(BLUE + "    case 1:" + RESET);
        System.out.println(BLUE + "        System.out.println(\"Monday\");" + RESET);
        System.out.println(BLUE + "        break;" + RESET);
        System.out.println(BLUE + "    case 2:" + RESET);
        System.out.println(BLUE + "        System.out.println(\"Tuesday\");" + RESET);
        System.out.println(BLUE + "        break;" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This keyword starts the multi-branch statement" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("switch")) {
                System.out.println(GREEN + "✅ Correct! The switch keyword starts the switch statement." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. What keyword begins the multi-branch structure?" + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a 6-letter word starting with 'sw'" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "switch" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "switch" + RESET + " starts the multi-branch selection structure");
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
        System.out.println(YELLOW + "What keyword exits a case block and prevents fall-through:" + RESET);
        System.out.println();
        System.out.println(BLUE + "int number = 5;" + RESET);
        System.out.println(BLUE + "switch(number) {" + RESET);
        System.out.println(BLUE + "    case 1:" + RESET);
        System.out.println(BLUE + "        System.out.println(\"Monday\");" + RESET);
        System.out.println(BLUE + "        ______;" + RESET);
        System.out.println(BLUE + "    case 2:" + RESET);
        System.out.println(BLUE + "        System.out.println(\"Tuesday\");" + RESET);
        System.out.println(BLUE + "        break;" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This keyword stops execution from continuing to next case" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("break")) {
                System.out.println(GREEN + "✅ Excellent! The break statement exits the case block." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What keyword prevents fall-through?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a 5-letter word used to exit loops and switches" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "break" + RESET);
                    System.out.println(YELLOW + "Explanation: " + BLUE + "break" + RESET + " exits the case block and prevents executing the next case");
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
            System.out.println("🌟 You're a switch statement expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master switch statements!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review switch statements and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Switch Statement Concepts Reviewed:" + RESET);
        System.out.println("• " + BLUE + "switch" + RESET + " - Starts the multi-branch statement");
        System.out.println("• " + BLUE + "break" + RESET + " - Exits case block and prevents fall-through"); 
        System.out.println("• " + YELLOW + "Other keywords: case, default" + RESET);
        System.out.println("• " + YELLOW + "Note: Without break, execution 'falls through' to next case" + RESET);
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