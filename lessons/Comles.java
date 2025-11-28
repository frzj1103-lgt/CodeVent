package lessons;
import java.util.Scanner;

public class Comles {
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
            CYAN + "                   JAVA COMMENTS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Comments?" + RESET + "\n" +
            "• Text ignored by the Java compiler\n" +
            "• Used to explain and document code\n" +
            "• Make programs easier to understand\n\n" +
            YELLOW + "💡 Why use comments?" + RESET + "\n" +
            "✓ Explain complex code\n" +
            "✓ Leave notes for yourself/others\n" +
            "✓ Temporarily disable code\n" +
            "✓ Document how code works\n\n" +
            GREEN + "🎯 Two main types:" + RESET + "\n" +
            BLUE + "// Single-line comments\n" +
            "/* Multi-line comments */" + RESET,
            
            // Page 2: Single-line Comments
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   SINGLE-LINE COMMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            "Start with " + BLUE + "//" + RESET + " - everything after is ignored\n\n" +
            YELLOW + "Example - Comment before code:" + RESET + "\n" +
            BLUE + "// This is a comment\n" +
            "System.out.println(\"Hello World\");" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Hello World\n\n" +
            YELLOW + "Example - Comment after code:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World\"); // This is a comment" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Hello World",
            
            // Page 3: Single-line Comment Uses
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              SINGLE-LINE COMMENT APPLICATIONS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Explaining Code:" + RESET + "\n" +
            BLUE + "// Calculate area of circle\n" +
            "double area = 3.14159 * radius * radius;" + RESET + "\n\n" +
            GREEN + "🔧 Temporary Code Disabling:" + RESET + "\n" +
            BLUE + "// System.out.println(\"Debug message\");\n" +
            "System.out.println(\"Program running...\");" + RESET + "\n\n" +
            GREEN + "📝 TODOs and Notes:" + RESET + "\n" +
            BLUE + "// TODO: Add error handling here\n" +
            "// FIXME: This needs optimization\n" +
            "// NOTE: Remember to update this monthly" + RESET + "\n\n" +
            YELLOW + "💡 Pro Tip:" + RESET + "\n" +
            "Use comments to explain " + RED + "why" + RESET + ", not " + RED + "what" + RESET + " the code does",
            
            // Page 4: Multi-line Comments
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   MULTI-LINE COMMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            "Start with " + BLUE + "/*" + RESET + " and end with " + BLUE + "*/" + RESET + "\n" +
            "Everything between is ignored\n\n" +
            YELLOW + "Example - Block comment:" + RESET + "\n" +
            BLUE + "/* The code below will print the words Hello World\n" +
            "to the screen, and it is amazing */\n" +
            "System.out.println(\"Hello World\");" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Hello World\n\n" +
            YELLOW + "Example - Multiple lines:" + RESET + "\n" +
            BLUE + "/*\n" +
            "This program calculates the\n" +
            "average of three numbers\n" +
            "Created by: Student Name\n" +
            "Date: 2024\n" +
            "*/" + RESET,
            
            // Page 5: Multi-line Comment Uses
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              MULTI-LINE COMMENT APPLICATIONS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 File Headers:" + RESET + "\n" +
            BLUE + "/*\n" +
            "Project: Calculator App\n" +
            "Author: Jane Smith\n" +
            "Version: 1.0\n" +
            "Description: Basic arithmetic operations\n" +
            "*/" + RESET + "\n\n" +
            GREEN + "🔧 Function Documentation:" + RESET + "\n" +
            BLUE + "/*\n" +
            "calculateTotal - computes total price\n" +
            "Parameters: price, quantity, taxRate\n" +
            "Returns: total amount as double\n" +
            "*/" + RESET + "\n\n" +
            GREEN + "🚫 Disabling Code Blocks:" + RESET + "\n" +
            BLUE + "/*\n" +
            "System.out.println(\"Old method\");\n" +
            "oldCalculation();\n" +
            "*/" + RESET,
            
            // Page 6: Comment Best Practices
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  COMMENT BEST PRACTICES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ DO:" + RESET + "\n" +
            "• Explain complex algorithms\n" +
            "• Document function purposes\n" +
            "• Note why unusual approaches are used\n" +
            "• Leave TODOs for future work\n" +
            "• Write clear, concise comments\n\n" +
            RED + "❌ DON'T:" + RESET + "\n" +
            "• State the obvious (\"increment i\")\n" +
            "• Write outdated comments\n" +
            "• Over-comment simple code\n" +
            "• Use bad grammar/spelling\n\n" +
            YELLOW + "💡 Good vs Bad Example:" + RESET + "\n" +
            GREEN + "Good:" + RESET + " // Convert temp from Celsius to Fahrenheit\n" +
            RED + "Bad:" + RESET + "   // Multiply by 1.8 and add 32",
            
            // Page 7: Practical Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    PRACTICAL EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Well-commented Code:" + RESET + "\n" +
            BLUE + "// Main program starts here\n" +
            "public static void main(String[] args) {\n" +
            "    // Get user input\n" +
            "    Scanner scanner = new Scanner(System.in);\n" +
            "    \n" +
            "    /* Calculate final grade based on:\n" +
            "    - Homework: 30%\n" +
            "    - Exams: 50% \n" +
            "    - Participation: 20% */\n" +
            "    double finalGrade = calculateGrade();\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🔧 Debugging with Comments:" + RESET + "\n" +
            BLUE + "// System.out.println(\"Debug: x = \" + x); // Temporary debug\n" +
            "// oldMethod(); // Deprecated - use newMethod() instead" + RESET,
            
            // Page 8: Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      COMMENT SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Points:" + RESET + "\n" +
            "✓ Single-line: " + BLUE + "// comment" + RESET + "\n" +
            "✓ Multi-line: " + BLUE + "/* comment */" + RESET + "\n" +
            "✓ Ignored by compiler\n" +
            "✓ Essential for documentation\n" +
            "✓ Helps with debugging\n\n" +
            YELLOW + "🚀 When to Comment:" + RESET + "\n" +
            "• Complex business logic\n" +
            "• Non-obvious code solutions\n" +
            "• Function/method descriptions\n" +
            "• Temporary code disabling\n" +
            "• Important notes for team\n\n" +
            PURPLE + "🌟 Remember:" + RESET + "\n" +
            "Good comments make good code great!\n" +
            "Your future self will thank you! 😊\n\n" +
            PURPLE + "Congratulations! You've mastered Java Comments! 🎉" + RESET
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