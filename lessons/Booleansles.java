package lessons;
import java.util.Scanner;

public class Booleansles {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayPaginatedLesson(scanner);
        scanner.close();
    }
    
    private static void displayPaginatedLesson(Scanner scanner) {
        String[] pages = {
            // Page 1: Introduction
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   JAVA BOOLEANS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Booleans?" + RESET + "\n" +
            "• A data type with only " + RED + "two possible values" + RESET + "\n" +
            "• " + BLUE + "true" + RESET + " or " + BLUE + "false" + RESET + "\n" +
            "• Named after George Boole, mathematician\n\n" +
            YELLOW + "💡 Real-world Boolean examples:" + RESET + "\n" +
            "  ✅ YES / NO\n" +
            "  ✅ ON / OFF\n" +
            "  ✅ TRUE / FALSE\n" +
            "  ✅ RIGHT / WRONG\n" +
            "  ✅ EXISTS / DOESN'T EXIST",
            
            // Page 2: Boolean Values
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    BOOLEAN VALUES & DECLARATION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Declaring Boolean Variables:" + RESET + "\n" +
            "Use the " + BLUE + "boolean" + RESET + " keyword:\n\n" +
            BLUE + "boolean isJavaFun = true;\n" +
            "boolean isFishTasty = false;\n" +
            "boolean isRaining = true;" + RESET + "\n\n" +
            YELLOW + "Example Output:" + RESET + "\n" +
            BLUE + "System.out.println(isJavaFun);    // Outputs: true\n" +
            "System.out.println(isFishTasty);  // Outputs: false" + RESET + "\n\n" +
            GREEN + "🎯 Key Point:" + RESET + "\n" +
            "Booleans can " + RED + "only" + RESET + " be " + BLUE + "true" + RESET + " or " + BLUE + "false" + RESET + " - nothing else!",
            
            // Page 3: Boolean Expressions
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    BOOLEAN EXPRESSIONS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 What are Boolean Expressions?" + RESET + "\n" +
            "• Expressions that return " + BLUE + "true" + RESET + " or " + BLUE + "false" + RESET + "\n" +
            "• Used for comparisons and conditions\n" +
            "• Build program logic and decision-making\n\n" +
            YELLOW + "Using Comparison Operators:" + RESET + "\n" +
            BLUE + "int x = 10;\n" +
            "int y = 9;\n" +
            "System.out.println(x > y);  // Outputs: true" + RESET + "\n\n" +
            GREEN + "📊 Comparison Operators:" + RESET + "\n" +
            ">   Greater than\n" +
            "<   Less than\n" +
            "==  Equal to\n" +
            ">=  Greater than or equal\n" +
            "<=  Less than or equal\n" +
            "!=  Not equal",
            
            // Page 4: More Expression Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                BOOLEAN EXPRESSION EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Direct Comparisons:" + RESET + "\n" +
            BLUE + "System.out.println(10 > 9);   // true\n" +
            "System.out.println(10 == 10);  // true\n" +
            "System.out.println(10 == 15);  // false" + RESET + "\n\n" +
            GREEN + "🔢 Variable Comparisons:" + RESET + "\n" +
            BLUE + "int x = 10;\n" +
            "int y = 15;\n" +
            "System.out.println(x == 10);   // true\n" +
            "System.out.println(x == y);    // false\n" +
            "System.out.println(x < y);     // true" + RESET + "\n\n" +
            YELLOW + "💡 Remember:" + RESET + "\n" +
            BLUE + "==" + RESET + " checks equality\n" +
            BLUE + "=" + RESET + " assigns values",
            
            // Page 5: Real Life Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   REAL-LIFE BOOLEAN EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🗳️ Voting Age Check:" + RESET + "\n" +
            "Check if someone is old enough to vote:\n\n" +
            BLUE + "int myAge = 25;\n" +
            "int votingAge = 18;\n" +
            "boolean canVote = myAge >= votingAge;\n\n" +
            "System.out.println(canVote);  // Outputs: true" + RESET + "\n\n" +
            YELLOW + "🔍 How it works:" + RESET + "\n" +
            "myAge (25) >= votingAge (18)\n" +
            "25 >= 18 → " + GREEN + "true" + RESET + "\n\n" +
            GREEN + "📊 Other real-life uses:" + RESET + "\n" +
            "• Login authentication\n" +
            "• Age verification\n" +
            "• Feature access control\n" +
            "• Game conditions",
            
            // Page 6: Boolean with If-Else
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               BOOLEANS WITH IF-ELSE STATEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Making Decisions:" + RESET + "\n" +
            "Use booleans to control program flow:\n\n" +
            BLUE + "int myAge = 25;\n" +
            "int votingAge = 18;\n\n" +
            "if (myAge >= votingAge) {\n" +
            "    System.out.println(\"Old enough to vote!\");\n" +
            "} else {\n" +
            "    System.out.println(\"Not old enough to vote.\");\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🚀 Output:" + RESET + "\n" +
            GREEN + "Old enough to vote!" + RESET + "\n\n" +
            GREEN + "🔧 How it works:" + RESET + "\n" +
            "1. Check condition: 25 >= 18\n" +
            "2. Condition is " + GREEN + "true" + RESET + "\n" +
            "3. Execute if-block\n" +
            "4. Skip else-block",
            
            // Page 7: Summary & Importance
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   BOOLEAN SUMMARY & IMPORTANCE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Points:" + RESET + "\n" +
            "✓ Boolean values: " + BLUE + "true" + RESET + " or " + BLUE + "false" + RESET + "\n" +
            "✓ Declare with: " + BLUE + "boolean variableName = value;" + RESET + "\n" +
            "✓ Boolean expressions return true/false\n" +
            "✓ Used for comparisons and conditions\n" +
            "✓ Essential for program decision-making\n\n" +
            YELLOW + "🚀 Why Booleans Matter:" + RESET + "\n" +
            "• Foundation of all program logic\n" +
            "• Enable decision-making in code\n" +
            "• Control program flow\n" +
            "• Make programs \"smart\"\n\n" +
            PURPLE + "🌟 Next Step:" + RESET + "\n" +
            "Learn If/Else statements to make your programs\n" +
            "truly dynamic and responsive!\n\n" +
            PURPLE + "Congratulations! You've completed Booleans! 🎉" + RESET
        };
        
        int currentPage = 0;
        boolean exitLesson = false;
        
        while (!exitLesson && currentPage < pages.length) {
            clearScreen();
            System.out.println(pages[currentPage]);
            System.out.println("\n" + "═".repeat(55));
            
            if (currentPage == 0) {
                System.out.println(GREEN + "[N] Next Page" + RESET + "    " + RED + "[0] Exit Lesson" + RESET);
            } else if (currentPage == pages.length - 1) {
                System.out.println(GREEN + "[P] Previous Page" + RESET + "    " + CYAN + "[R] Restart" + RESET + "    " + RED + "[0] Exit Lesson" + RESET);
            } else {
                System.out.println(GREEN + "[P] Previous Page" + RESET + "    " + GREEN + "[N] Next Page" + RESET + "    " + CYAN + "[R] Restart" + RESET + "    " + RED + "[0] Exit Lesson" + RESET);
            }
            
            System.out.print("\n" + YELLOW + "Choose navigation: " + RESET);
            String input = scanner.nextLine().trim().toLowerCase();
            
            switch (input) {
                case "n":
                case "next":
                    if (currentPage < pages.length - 1) {
                        currentPage++;
                    }
                    break;
                case "p":
                case "prev":
                case "previous":
                    if (currentPage > 0) {
                        currentPage--;
                    }
                    break;
                case "r":
                case "restart":
                    currentPage = 0;
                    break;
                case "0":
                case "exit":
                    exitLesson = true;
                    break;
                default:
                    System.out.println(RED + "Invalid choice! Press Enter to try again." + RESET);
                    scanner.nextLine();
            }
        }
        
        if (!exitLesson) {
            System.out.println("\n" + GREEN + "🎉 Lesson completed! Press Enter to return to menu." + RESET);
            scanner.nextLine();
        }
    }
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}