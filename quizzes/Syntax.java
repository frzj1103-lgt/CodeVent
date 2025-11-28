package quizzes;
import java.util.*;

public class Syntax {
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
        System.out.println(PURPLE + "                    JAVA SYNTAX QUIZ" + RESET);
        System.out.println(CYAN + "═══════════════════════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "🎯 Test your knowledge of Java syntax rules!" + RESET);
        System.out.println(GREEN + "✅ Pay attention to case sensitivity and exact symbols" + RESET);
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
        System.out.println(YELLOW + "If your file name is \"School.java\", what is the correct" + RESET);
        System.out.println(YELLOW + "classname to match the file name?" + RESET);
        System.out.println();
        System.out.println(BLUE + "public class ______ {" + RESET);
        System.out.println(BLUE + "    public static void main(String[] args) {" + RESET);
        System.out.println(BLUE + "        System.out.println(\"Hello\");" + RESET);
        System.out.println(BLUE + "    }" + RESET);
        System.out.println(BLUE + "}" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: Java requires class name to match filename (case-sensitive)" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct1 = false;
        int attempts1 = 0;
        
        while (!correct1 && attempts1 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals("School")) {
                System.out.println(GREEN + "✅ Correct! The class name must match the filename exactly." + RESET);
                score++;
                correct1 = true;
            } else {
                attempts1++;
                System.out.println(RED + "❌ Not quite right. What name matches \"School.java\"?" + RESET);
                if (attempts1 < 3) {
                    System.out.println(YELLOW + "💡 Hint: Remove the .java extension from the filename" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + "School" + RESET);
                    System.out.println(YELLOW + "Explanation: In Java, the " + BLUE + "public class name" + RESET + " must match the filename (case-sensitive)");
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
        System.out.println(YELLOW + "What is the missing symbol to complete the Java statement?" + RESET);
        System.out.println();
        System.out.println(BLUE + "System.out.println(\"What's up madlang people!\")____" + RESET);
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "💡 Hint: This symbol marks the end of every Java statement" + RESET);
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        
        boolean correct2 = false;
        int attempts2 = 0;
        
        while (!correct2 && attempts2 < 3) {
            System.out.print(YELLOW + "Your answer: " + RESET);
            String answer = sc.nextLine().trim();
            
            if (answer.equals(";")) {
                System.out.println(GREEN + "✅ Excellent! The semicolon terminates Java statements." + RESET);
                score++;
                correct2 = true;
            } else {
                attempts2++;
                System.out.println(RED + "❌ That's not correct. What symbol ends Java statements?" + RESET);
                if (attempts2 < 3) {
                    System.out.println(YELLOW + "💡 Hint: It's a punctuation mark used to end sentences in programming" + RESET);
                    System.out.print(GREEN + "Try again: " + RESET);
                } else {
                    System.out.println(RED + "The correct answer is: " + GREEN + ";" + RESET);
                    System.out.println(YELLOW + "Explanation: The " + BLUE + "semicolon (;)" + RESET + " is required to terminate every statement in Java");
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
            System.out.println("🌟 You're a Java syntax expert!");
        } else if (score >= totalQuestions / 2) {
            System.out.println(YELLOW + "📚 GOOD JOB! " + score + "/" + totalQuestions + RESET);
            System.out.println("💪 Keep practicing and you'll master Java syntax!");
        } else {
            System.out.println(RED + "📖 KEEP LEARNING! " + score + "/" + totalQuestions + RESET);
            System.out.println("🔍 Review Java syntax rules and try again!");
        }
        
        System.out.println();
        System.out.println(CYAN + "───────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "Java Syntax Rules Reviewed:" + RESET);
        System.out.println("• " + BLUE + "Class Naming" + RESET + " - Public class name must match filename exactly");
        System.out.println("• " + BLUE + "Semicolon" + RESET + " - Required at the end of every statement"); 
        System.out.println("• " + YELLOW + "Case Sensitivity" + RESET + " - Java is case-sensitive (School ≠ school)");
        System.out.println("• " + YELLOW + "File Extension" + RESET + " - Java source files must end with .java");
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