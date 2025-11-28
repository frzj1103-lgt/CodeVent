package lessons;
import java.util.Scanner;

public class Lesson {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String PURPLE = "\u001B[35m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String BRIGHT_RED = "\u001B[91m";
    
    public void startMenu(Scanner scanner) {
        int choice = -1;
        
        do {
            clearScreen();
            displayLessonHeader();
            
            System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
            System.out.println(CYAN + "║" + YELLOW + "                     ? LESSON ARCHIVE  ?                   " + CYAN + "   ║" + RESET);
            System.out.println(CYAN + "╠══════════════════════════════════════════════════════════════╣" + RESET);
            System.out.println(CYAN + "║" + RESET + " [1] " + GREEN + "Syntax" + RESET +  "                           [10] "  + GREEN  + "Booleans"              +        "           ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [2] " + GREEN + "Output" + RESET +  "                           [11]"  + GREEN  + " If/Else"              +   CYAN + "            ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [3] " + GREEN + "Comment" + RESET + "                          [12] "  + GREEN  + "Switch"              +  CYAN + "             ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [4] " + GREEN + "Variables" + RESET + "                        [13] "  + GREEN  + "While Loop"             + CYAN + "         ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [5] " + GREEN + "Data Types" + RESET + "                       [14] "  + GREEN  + "For Loop"          +  CYAN + "           ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [6] " + GREEN + "Type Casting" + RESET + "                     [15] "  + GREEN  + "Break/Continue"     +  CYAN + "     ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [7] " + GREEN + "Operators" + RESET + "                        [16] "  + GREEN  + "Arrays"          +  CYAN + "             ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [8] " + GREEN + "Strings" + RESET + "                                     " + CYAN +                         "             ║" + RESET);
            System.out.println(CYAN + "║" + RESET + " [9] " + GREEN + "Math" + RESET + "                                        " + CYAN +                        "             ║" + RESET);
            System.out.println(CYAN + "║" + RESET + "                    [0] " + RED + "Return to Main Menu" + RESET + "          " + CYAN +                      "         ║" + RESET);
            System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
            System.out.print("\n" + YELLOW + "Choose a lesson (1-16) or 0 to return: " + RESET);
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
            
             if (choice >= 1 && choice <= 16) {
                    showLoadingScreen(getLessonName(choice));
                }
                
                clearScreen();
                displayLessonHeader();
                System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
                System.out.println(CYAN + "║" + YELLOW + "                     ? LESSON ARCHIVE ?                    " + CYAN + "║" + RESET);
                System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
                System.out.println("\n" + GREEN + ">>> Loading lesson: " + getLessonName(choice) + RESET);
                
                switch (choice) {
                    case 1:
                        Syntaxles.main(new String[0]);
                        break;
                    case 2:
                        Outples.main(new String[0]);
                        break;
                    case 3:
                        Comles.main(new String[0]);
                        break;
                    case 4:
                        Varles.main(new String[0]);
                        break;
                    case 5:
                        Datatles.main(new String[0]);
                        break;
                    case 6:
                        Typecles.main(new String[0]);
                        break;
                    case 7:
                        Operales.main(new String[0]);
                        break;
                    case 8:
                        Stringles.main(new String[0]);
                        break;
                    case 9:
                        Mathles.main(new String[0]);
                        break;
                    case 10:
                        Booleansles.main(new String[0]);
                        break;
                    case 11:
                        Ifelseles.main(new String[0]);
                        break;
                    case 12:
                        Switchles.main(new String[0]);
                        break;
                    case 13:
                        Whileles.main(new String[0]);
                        break;
                    case 14:
                        Forles.main(new String[0]);
                        break;
                    case 15:
                        BreaknConles.main(new String[0]);
                        break;
                    case 16:
                        Arrayles.main(new String[0]);
                        break;
                    case 0:
                        System.out.println(GREEN + "\nReturning to main menu..." + RESET);
                        break;
                    default:
                        System.out.println(RED + "\nInvalid choice! Please enter 0-16." + RESET);
                }
                
                if (choice != 0 && choice >= 1 && choice <= 16) {
                    System.out.print("\n" + CYAN + "Press Enter to continue..." + RESET);
                    scanner.nextLine();
                }
            } else {
                System.out.println(RED + "\nInvalid input! Please enter a number." + RESET);
                scanner.next(); // Clear invalid input
                System.out.print(CYAN + "Press Enter to continue..." + RESET);
                scanner.nextLine();
            }
            
        } while (choice != 0);
    }
    
    private static void displayLessonHeader() {
        System.out.println(BRIGHT_RED + "\n" +
            " ██      ███████ ███████ ███████  ██████  ███    ██ \n" +
            " ██      ██      ██      ██      ██    ██ ████   ██ \n" +
            " ██      ███████ ███████ ███████ ██    ██ ██ ██  ██ \n" +
            " ██      ██           ██      ██ ██    ██ ██  ██ ██ \n" +
            " ███████ ███████ ███████ ███████  ██████  ██   ████ \n" + RESET);
    }
    
    private static String getLessonName(int choice) {
        switch (choice) {
            case 1: return "Java Syntax";
            case 2: return "Output";
            case 3: return "Comments";
            case 4: return "Variables";
            case 5: return "Data Types";
            case 6: return "Type Casting";
            case 7: return "Operators";
            case 8: return "Strings";
            case 9: return "Math";
            case 10: return "Booleans";
            case 11: return "If/Else Statements";
            case 12: return "Switch Statements";
            case 13: return "While Loops";
            case 14: return "For Loops";
            case 15: return "Break/Continue";
            case 16: return "Arrays";
            default: return "Unknown Lesson";
        }
    }

    private static void showLoadingScreen(String lessonName) {
        clearScreen();
        
        System.out.println(PURPLE + "\n" +
            " ██       ██████    ███   ██████   ████████ ███    ██  ███████         \n" +
            " ██      ██    ██ ██   ██ ██    ██    ██    ██ █   ██  ██        \n" +
            " ██      ██    ██ ███████ ██    ██    ██    ██  █  ██  ███████      \n" +
            " ██      ██    ██ ██   ██ ██    ██    ██    ██   █ ██  ██   ██      \n" +
            " ███████  ██████  ██   ██ ██████    ██████  ██    ███  ███████    \n" + RESET);
        
        System.out.println(CYAN + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "                   LOADING ADVENTURE CONTENT                 " + CYAN + "║" + RESET);
        System.out.println(CYAN + "╠══════════════════════════════════════════════════════════════╣" + RESET);
        System.out.println(CYAN + "║" + RESET + " Lesson: " + GREEN + lessonName + RESET);
        System.out.println(CYAN + "║" + RESET);
        
        // Animated loading bar
        System.out.print(CYAN + "║ " + RESET + "[");
        int barWidth = 40;
        for (int i = 0; i <= barWidth; i++) {
            double progress = (double) i / barWidth;
            int percentage = (int) (progress * 100);
            
            // Build the loading bar
            StringBuilder bar = new StringBuilder();
            for (int j = 0; j < barWidth; j++) {
                if (j < i) {
                    if (progress < 0.3) {
                        bar.append(RED + "█" + RESET);
                    } else if (progress < 0.7) {
                        bar.append(YELLOW + "█" + RESET);
                    } else {
                        bar.append(GREEN + "█" + RESET);
                    }
                } else {
                    bar.append(" ");
                }
            }
            
            // Clear the line and redraw
            System.out.print("\r" + CYAN + "║ " + RESET + "[" + bar + "] " + percentage + "%");
            System.out.flush();
            
            try {
                Thread.sleep(50 + (int)(Math.random() * 30)); // Random delay for realism
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println();
        System.out.println(CYAN + "║" + RESET);
        System.out.println(CYAN + "║" + GREEN + " ✓ Adventure content loaded successfully!" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET);
        
        // Brief pause to show completion
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}