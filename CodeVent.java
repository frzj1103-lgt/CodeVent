import java.util.*;
import lessons.Lesson;
import quizzes.Quiz;
import help.Help;

public class CodeVent {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";
    private static final String BLUE = "\u001B[34m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String BRIGHT_RED = "\u001B[91m";
    private static final String PURPLE = "\u001B[35m";
    
    private static String[] smallLogo = {
        " ██████   ██████  ██████  ███████ ██   ██ ████████  ███     ██ ████████ ",
        "██       ██    ██ ██   ██ ██      ██   ██ ██        ██ ██   ██    ██     ",
        "██       ██    ██ ██   ██ █████    ██ ██  █████     ██  ██  ██    ██     ",
        "██       ██    ██ ██   ██ ██       ██ ██  ██        ██   ██ ██    ██       ",
        " ██████   ██████  ██████  ███████    █    █████████ ██     ███    ██     "
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayWelcomeScreen(sc);
        
        int choice = 0;
        do {
            clearScreen();
            displayMenuWithLogo();
            System.out.print("\n" + YELLOW + "Choose an option: " + RESET);

            try {
                int choices = sc.nextInt();
                sc.nextLine(); // consume newline
                choice = choices;
                
                // Clear previous output and show selection
                clearScreen();
                displayMenuWithLogo();
                System.out.println("\n" + GREEN + ">>> Selected option: " + choices + RESET);
                
                switch (choices) {
                    case 1:
                        Lesson lessonMenu = new Lesson();
                        lessonMenu.startMenu(sc);
                        break;
                    case 2:
                        Quiz quiz = new Quiz(sc);
                        quiz.startQuizMenu();
                        break;
                    case 3:
                        Help.showTutorial(sc);
                        break;
                    case 0:
                        System.out.println("Goodbye Adventurer!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                
                if (choices != 0) {
                    System.out.print("\n" + CYAN + "Press Enter to continue..." + RESET);
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(RED + "Please enter a valid number!" + RESET);
                sc.nextLine(); // clear invalid input
                System.out.print(CYAN + "Press Enter to continue..." + RESET);
                sc.nextLine();
            }
        } while (choice != 0);
        sc.close();
    }

    private static void displayWelcomeScreen(Scanner sc) {
        clearScreen();
        String[] C = {"  ██████ ", " ██    ██", "██       ", "██       ", "██       ", " ██    ██", "  ██████ "};
        String[] O = {"  ██████ ", " ██    ██", "██      ██", "██      ██", "██      ██", " ██    ██", "  ██████ "};
        String[] D = {"██████   ", "██   ██  ", "██    ██ ", "██    ██ ", "██    ██ ", "██   ██  ", "██████   "};
        String[] E = {"████████", "██      ", "██      ", "██████  ", "██      ", "██      ", "████████"};
        String[] V = {"██     ██", "██     ██", "██     ██", " ██   ██ ", "  ██ ██  ", "   ███   ", "    █    "};
        String[] N = {"██     ██", "███    ██", "████   ██", "██ ██  ██", "██  ██ ██", "██   ████", "██    ███"};
        String[] T = {"████████", "   ██   ", "   ██   ", "   ██   ", "   ██   ", "   ██   ", "   ██   "};

        String[] colors = {PURPLE, RED, GREEN, CYAN, BLUE};
        
        for (int i = 0; i < 7; i++) {
            String line =
                colors[0] + C[i] + RESET + " " +
                colors[0] + O[i] + RESET + " " +
                colors[0] + D[i] + RESET + " " +
                colors[0] + E[i] + RESET + " " +
                colors[3] + V[i] + RESET + " " +
                colors[3] + E[i] + RESET + " " +
                colors[3] + N[i] + RESET + " " +
                colors[3] + T[i] + RESET;
            System.out.println(line);
        }
        
        String text = ">>> CODEVENT - Where Code Meets Adventure <<<";
        text = String.format("%-80s", text);
        System.out.println();
        System.out.println(BRIGHT_RED + text + RESET);
        
        System.out.print("\n" + CYAN + "Press Enter to continue..." + RESET);
        sc.nextLine();
    }

    private static void displayMenuWithLogo() {
        // Main menu content (left side)
        String menu = 
            CYAN + "╔══════════════════════════════════════════════════════════════╗\n" + RESET +
            CYAN + "║" + YELLOW + "                             MENU                             " + CYAN + "║\n" + RESET +
            CYAN + "╠══════════════════════════════════════════════════════════════╣\n" + RESET +
            CYAN + "║" + RESET + " [1] " + GREEN + "Start Lesson" + RESET + "                                             " + CYAN + "║\n" + RESET +
            CYAN + "║" + RESET + " [2] " + GREEN + "Start Quiz" + RESET + "                                               " + CYAN + "║\n" + RESET +
            CYAN + "║" + RESET + " [3] " + GREEN + "Help" + RESET + "                                                     " + CYAN + "║\n" + RESET +
            CYAN + "║" + RESET + " [0] " + GREEN + "EXIT CODEVENT" + RESET + "                                            " + CYAN + "║\n" + RESET +
            CYAN + "╚══════════════════════════════════════════════════════════════╝" + RESET;

        // Split menu into lines
        String[] menuLines = menu.split("\n");
        String[] logoLines = smallLogo;
        
        // Find the maximum number of lines to display
        int maxLines = Math.max(menuLines.length, logoLines.length);
        
        // Display menu and logo side by side
        for (int i = 0; i < maxLines; i++) {
            String menuPart = (i < menuLines.length) ? menuLines[i] : "";
            String logoPart = (i < logoLines.length) ? PURPLE + logoLines[i] + RESET : "";
            
            // Format to create two columns
            System.out.printf("%-65s %s%n", menuPart, logoPart);
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}