import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String BLUE = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        final String WHITE = "\u001B[37m";
        final String BRIGHT_RED = "\u001B[91m";
        final String PURPLE = "\u001B[35m";
        String[] C = {
            "  ██████ ",
            " ██    ██",
            "██       ",
            "██       ",
            "██       ",
            " ██    ██",
            "  ██████ "
        };
        String[] O = {
            "  ██████ ",
            " ██    ██",
            "██      ██",
            "██      ██",
            "██      ██",
            " ██    ██",
            "  ██████ "
        };
        String[] D = {
            "██████   ",
            "██   ██  ",
            "██    ██ ",
            "██    ██ ",
            "██    ██ ",
            "██   ██  ",
            "██████   "
        };
        String[] E = {
            "████████",
            "██      ",
            "██      ",
            "██████  ",
            "██      ",
            "██      ",
            "████████"
        };
        String[] V = {
            "██     ██",
            "██     ██",
            "██     ██",
            " ██   ██ ",
            "  ██ ██  ",
            "   ███   ",
            "    █    "
        };
        String[] N = {
            "██     ██",
            "███    ██",
            "████   ██",
            "██ ██  ██",
            "██  ██ ██",
            "██   ████",
            "██    ███"
        };
        String[] T = {
            "████████",
            "   ██   ",
            "   ██   ",
            "   ██   ",
            "   ██   ",
            "   ██   ",
            "   ██   "
        };

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
        String text = "     >>> CODEVENT - Where Code Meets Adventure <<<";
        text = String.format("%-80s", text);
        System.out.println();
        System.out.println(BRIGHT_RED + text + RESET);

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Start");
        System.out.println("2. Help");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Help");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
        if (choice == 1) {
            System.out.print("Please Enter your name, Adventurer: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Welcome, " + name + "!");
        } else if (choice == 2) {
            System.out.println(">> How to Play <<");
            System.out.println("Choose \"Start\" ");
        }
        
    }
    
}