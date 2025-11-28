package help;

import java.util.Scanner;

public class Help {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String BRIGHT_RED = "\u001B[91m";
    
    public static void showTutorial(Scanner scanner) {
        int tutorialChoice;
        
        do {
            clearScreen();
            displayTutorialHeader();
            
            System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
            System.out.println(CYAN + "║" + YELLOW + "                    ? TUTORIAL MENU ?                      " + CYAN + "║" + RESET);
            System.out.println(CYAN + "╠══════════════════════════════════════════════════════════════╣" + RESET);
            System.out.println(CYAN + "║" + RESET + " [1] " + GREEN + "What is CodeVent?" + RESET + "                                  " + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [2] " + GREEN + "How to Play" + RESET + "                                       " + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [3] " + GREEN + "Lesson Progression Guide" + RESET + "                          " + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [4] " + GREEN + "Learning Tips" + RESET + "                                     " + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [5] " + GREEN + "Game Controls" + RESET + "                                     " + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [0] " + RED + "Return to Main Menu" + RESET + "                              " + CYAN + "║" + RESET);
            System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
            System.out.print("\n" + YELLOW + "Choose a tutorial topic " + RESET);
            
            tutorialChoice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            switch (tutorialChoice) {
                case 1:
                    showWhatIsCodeVent();
                    break;
                case 2:
                    showHowToPlay();
                    break;
                case 3:
                    showLessonProgression();
                    break;
                case 4:
                    showLearningTips();
                    break;
                case 5:
                    showGameControls();
                    break;
                case 0:
                    System.out.println(GREEN + "\nReturning to main menu..." + RESET);
                    break;
                default:
                    System.out.println(RED + "\nInvalid choice! Please enter 0-5." + RESET);
            }
            
            if (tutorialChoice != 0) {
                System.out.print("\n" + CYAN + "Press Enter to continue..." + RESET);
                scanner.nextLine();
            }
            
        } while (tutorialChoice != 0);
    }
    
    private static void displayTutorialHeader() {
        System.out.println(BRIGHT_RED + "\n" +
            " ██    ██ ██████  ██      ██████  \n" +
            " ██    ██ ██      ██      ██   ██ \n" +
            " ████████ █████   ██      ██████  \n" +
            " ██    ██ ██      ██      ██      \n" +
            " ██    ██ ███████ ███████ ██      \n" + RESET);
    }
    
    private static void showWhatIsCodeVent() {
        clearScreen();
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                    🎯 WHAT IS CODEVENT?                    " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        System.out.println("\n" + GREEN + "🌟 CodeVent is an educational adventure game that makes learning" + RESET);
        System.out.println(GREEN + "   Java programming fun and engaging!" + RESET);
        
        System.out.println("\n" + BLUE + "🎮 " + YELLOW + "Game Concept:" + RESET);
        System.out.println("   • Learn Java through interactive adventures");
        System.out.println("   • Each lesson is a new 'venture' in your coding journey");
        System.out.println("   • Progress from basic syntax to advanced concepts");
        
        System.out.println("\n" + BLUE + "📚 " + YELLOW + "Educational Value:" + RESET);
        System.out.println("   • Based on W3Schools Java curriculum");
        System.out.println("   • Hands-on coding exercises");
        System.out.println("   • Real programming concepts in game context");
        
        System.out.println("\n" + BLUE + "🎯 " + YELLOW + "Mission:" + RESET);
        System.out.println("   Transform from coding novice to Java master through");
        System.out.println("   exciting adventures and challenges!");
    }
    
    private static void showHowToPlay() {
        clearScreen();
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                     🎮 HOW TO PLAY                         " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        System.out.println("\n" + GREEN + "🚀 " + YELLOW + "Getting Started:" + RESET);
        System.out.println("   1. Choose " + BLUE + "'Start Adventure'" + RESET + " from main menu");
        System.out.println("   2. Enter your adventurer name");
        System.out.println("   3. Access the Lesson Archive");
        
        System.out.println("\n" + GREEN + "📖 " + YELLOW + "Learning Process:" + RESET);
        System.out.println("   1. " + BLUE + "Select a lesson" + RESET + " from the menu (1-16)");
        System.out.println("   2. " + BLUE + "Read the concepts" + RESET + " and examples");
        System.out.println("   3. " + BLUE + "Practice" + RESET + " with interactive exercises");
        System.out.println("   4. " + BLUE + "Complete" + RESET + " the lesson to unlock knowledge");
        
        System.out.println("\n" + GREEN + "⭐ " + YELLOW + "Progression Tips:" + RESET);
        System.out.println("   • Start with Lesson 1 (Syntax) and progress in order");
        System.out.println("   • Don't rush - understand each concept thoroughly");
        System.out.println("   • Practice makes perfect - repeat lessons if needed");
    }
    
    private static void showLessonProgression() {
        clearScreen();
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                📚 LESSON PROGRESSION GUIDE               " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        System.out.println("\n" + GREEN + "🏆 " + YELLOW + "Recommended Learning Path:" + RESET);
        
        System.out.println("\n" + BLUE + "🔰 " + YELLOW + "BEGINNER LEVEL (Foundation):" + RESET);
        System.out.println("   1.  Syntax          - Java program structure");
        System.out.println("   2.  Output          - Displaying information");
        System.out.println("   3.  Comments        - Code documentation");
        System.out.println("   4.  Variables       - Data storage");
        System.out.println("   5.  Data Types      - Different kinds of data");
        System.out.println("   6.  Type Casting    - Converting data types");
        
        System.out.println("\n" + BLUE + "⚡ " + YELLOW + "INTERMEDIATE LEVEL (Operations):" + RESET);
        System.out.println("   7.  Operators       - Mathematical operations");
        System.out.println("   8.  Strings         - Text manipulation");
        System.out.println("   9.  Math            - Advanced calculations");
        System.out.println("   10. Booleans        - True/False logic");
        
        System.out.println("\n" + BLUE + "🎯 " + YELLOW + "ADVANCED LEVEL (Control Flow):" + RESET);
        System.out.println("   11. If/Else         - Decision making");
        System.out.println("   12. Switch          - Multiple choices");
        System.out.println("   13. While Loop      - Conditional repetition");
        System.out.println("   14. For Loop        - Counted repetition");
        System.out.println("   15. Break/Continue  - Loop control");
        System.out.println("   16. Arrays          - Data collections");
    }
    
    private static void showLearningTips() {
        clearScreen();
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                     💡 LEARNING TIPS                       " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        System.out.println("\n" + GREEN + "🎓 " + YELLOW + "Effective Learning Strategies:" + RESET);
        System.out.println("   • " + BLUE + "Code Along" + RESET + " - Type examples yourself, don't just read");
        System.out.println("   • " + BLUE + "Experiment" + RESET + " - Change code and see what happens");
        System.out.println("   • " + BLUE + "Take Notes" + RESET + " - Write down key concepts");
        System.out.println("   • " + BLUE + "Practice Daily" + RESET + " - Consistency beats cramming");
        
        System.out.println("\n" + GREEN + "🛠️ " + YELLOW + "When You Get Stuck:" + RESET);
        System.out.println("   • " + BLUE + "Re-read" + RESET + " the lesson carefully");
        System.out.println("   • " + BLUE + "Check syntax" + RESET + " - Java is case-sensitive!");
        System.out.println("   • " + BLUE + "Review previous lessons" + RESET + " - Concepts build on each other");
        System.out.println("   • " + BLUE + "Take a break" + RESET + " - Fresh eyes see new solutions");
        
        System.out.println("\n" + GREEN + "🚀 " + YELLOW + "Maximizing Your Progress:" + RESET);
        System.out.println("   • Complete lessons in order");
        System.out.println("   • Don't skip fundamentals");
        System.out.println("   • Apply concepts to small projects");
        System.out.println("   • Celebrate each milestone!");
    }
    
    private static void showGameControls() {
        clearScreen();
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                     🎛️  GAME CONTROLS                      " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        System.out.println("\n" + GREEN + "⌨️ " + YELLOW + "Navigation Controls:" + RESET);
        System.out.println("   • Enter numbers to make selections (0, 1, 2, etc.)");
        System.out.println("   • Press " + BLUE + "Enter" + RESET + " to confirm choices");
        System.out.println("   • Use " + BLUE + "0" + RESET + " to exit or go back");
        
        System.out.println("\n" + GREEN + "📋 " + YELLOW + "Menu Navigation:" + RESET);
        System.out.println("   • " + BLUE + "Main Menu" + RESET + " - Start game, get help, or exit");
        System.out.println("   • " + BLUE + "Lesson Menu" + RESET + " - Choose from 16 Java topics");
        System.out.println("   • " + BLUE + "Tutorial Menu" + RESET + " - Access this help system");
        
        System.out.println("\n" + GREEN + "💾 " + YELLOW + "Progress Tracking:" + RESET);
        System.out.println("   • Lessons completed are marked in your adventure log");
        System.out.println("   • Your knowledge grows with each completed lesson");
        System.out.println("   • Revisit lessons anytime for review");
    }
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}