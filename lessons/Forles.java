package lessons;
import java.util.Scanner;

public class Forles {
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
            CYAN + "                    JAVA FOR LOOP - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 When to Use For Loops:" + RESET + "\n" +
            "• When you know " + RED + "exactly how many times" + RESET + " to loop\n" +
            "• Counting-based iterations\n" +
            "• More compact than while loops\n\n" +
            YELLOW + "💡 Perfect for:" + RESET + "\n" +
            "  Counting from 1 to 10\n" +
            "  Processing arrays\n" +
            "  Repeating actions N times\n" +
            "  Generating sequences",
            
            // Page 2: Syntax & Structure
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FOR LOOP SYNTAX" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Basic Syntax:" + RESET + "\n" +
            BLUE + "for (statement1; statement2; statement3) {\n" +
            "    // code block to execute\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "Three Key Parts:" + RESET + "\n" +
            BLUE + "1. Initialization" + RESET + " - Runs once at start\n" +
            BLUE + "2. Condition" + RESET + " - Checked before each iteration\n" +
            BLUE + "3. Update" + RESET + " - Runs after each iteration\n\n" +
            GREEN + "🎯 Execution Flow:" + RESET + "\n" +
            "1. Execute statement1 (once)\n" +
            "2. Check statement2 (condition)\n" +
            "3. If true → execute code block\n" +
            "4. Execute statement3 (update)\n" +
            "5. Repeat from step 2",
            
            // Page 3: Basic Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     BASIC FOR LOOP EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Print Numbers 0 to 4:" + RESET + "\n" +
            BLUE + "for (int i = 0; i < 5; i++) {\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🚀 Output:" + RESET + "\n" +
            "0\n1\n2\n3\n4\n\n" +
            GREEN + "🔍 Step-by-step:" + RESET + "\n" +
            "Iteration 1: i=0 → Print 0 → i++ → i=1\n" +
            "Iteration 2: i=1 → Print 1 → i++ → i=2\n" +
            "Iteration 3: i=2 → Print 2 → i++ → i=3\n" +
            "Iteration 4: i=3 → Print 3 → i++ → i=4\n" +
            "Iteration 5: i=4 → Print 4 → i++ → i=5\n" +
            "Condition i<5 is false → Loop ends",
            
            // Page 4: Statement Breakdown
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               FOR LOOP STATEMENTS EXPLAINED" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            YELLOW + "Statement 1 - Initialization:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            "• Runs once at loop start\n" +
            "• Usually declares counter variable\n" +
            "• Can declare multiple variables\n\n" +
            YELLOW + "Statement 2 - Condition:" + RESET + "\n" +
            BLUE + "i < 5;" + RESET + "\n" +
            "• Checked before each iteration\n" +
            "• If true → run loop body\n" +
            "• If false → exit loop\n\n" +
            YELLOW + "Statement 3 - Update:" + RESET + "\n" +
            BLUE + "i++" + RESET + "\n" +
            "• Runs after each iteration\n" +
            "• Usually increments/decrements counter\n" +
            "• Can be any expression",
            
            // Page 5: More Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    MORE FOR LOOP EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔽 Count Down:" + RESET + "\n" +
            BLUE + "for (int i = 5; i > 0; i--) {\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n" +
            GREEN + "Output: 5 4 3 2 1" + RESET + "\n\n" +
            GREEN + "🔼 Even Numbers:" + RESET + "\n" +
            BLUE + "for (int i = 2; i <= 10; i += 2) {\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n" +
            GREEN + "Output: 2 4 6 8 10" + RESET + "\n\n" +
            GREEN + "🎯 Custom Step:" + RESET + "\n" +
            BLUE + "for (int i = 0; i <= 20; i += 5) {\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n" +
            GREEN + "Output: 0 5 10 15 20" + RESET,
            
            // Page 6: Nested Loops Introduction
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    NESTED LOOPS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Loop Inside a Loop:" + RESET + "\n" +
            "• One loop inside another\n" +
            "• Inner loop runs completely for each outer iteration\n" +
            "• Useful for grids, tables, matrices\n\n" +
            YELLOW + "💡 Real-world examples:" + RESET + "\n" +
            "  Chess board positions\n" +
            "  Multiplication tables\n" +
            "  Image pixel processing\n" +
            "  Calendar days/weeks",
            
            // Page 7: Nested Loop Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 NESTED LOOP EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Basic Nested Loop:" + RESET + "\n" +
            BLUE + "// Outer loop\n" +
            "for (int i = 1; i <= 2; i++) {\n" +
            "    System.out.println(\"Outer: \" + i);\n" +
            "    \n" +
            "    // Inner loop\n" +
            "    for (int j = 1; j <= 3; j++) {\n" +
            "        System.out.println(\" Inner: \" + j);\n" +
            "    }\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🚀 Output:" + RESET + "\n" +
            "Outer: 1\n" +
            " Inner: 1\n" +
            " Inner: 2\n" +
            " Inner: 3\n" +
            "Outer: 2\n" +
            " Inner: 1\n" +
            " Inner: 2\n" +
            " Inner: 3\n\n" +
            GREEN + "📊 Execution Count:" + RESET + "\n" +
            "Outer loop: 2 times\n" +
            "Inner loop: 3 times each → 6 total",
            
            // Page 8: Multiplication Table
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              MULTIPLICATION TABLE EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 3x3 Multiplication Table:" + RESET + "\n" +
            BLUE + "for (int i = 1; i <= 3; i++) {\n" +
            "    for (int j = 1; j <= 3; j++) {\n" +
            "        System.out.print(i * j + \" \");\n" +
            "    }\n" +
            "    System.out.println(); // New line after each row\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🚀 Output:" + RESET + "\n" +
            "1 2 3\n" +
            "4 5 6\n" +
            "7 8 9\n\n" +
            GREEN + "🔍 How it works:" + RESET + "\n" +
            "Row 1: 1×1=1, 1×2=2, 1×3=3\n" +
            "Row 2: 2×1=2, 2×2=4, 2×3=6\n" +
            "Row 3: 3×1=3, 3×2=6, 3×3=9",
            
            // Page 9: For-each Loop Introduction
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   FOR-EACH LOOP" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Simplified Array Looping:" + RESET + "\n" +
            "• Automatically iterates through arrays/collections\n" +
            "• No counter variable needed\n" +
            "• Cleaner and more readable\n" +
            "• Also called \"enhanced for loop\"\n\n" +
            YELLOW + "💡 Perfect for:" + RESET + "\n" +
            "  Processing all array elements\n" +
            "  When you don't need index positions\n" +
            "  Simple iteration through collections",
            
            // Page 10: For-each Syntax & Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               FOR-EACH SYNTAX & EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            BLUE + "for (type variable : array) {\n" +
            "    // code block\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "Traditional for loop:" + RESET + "\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
            "for (int i = 0; i < cars.length; i++) {\n" +
            "    System.out.println(cars[i]);\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "For-each loop (cleaner!):" + RESET + "\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
            "for (String car : cars) {\n" +
            "    System.out.println(car);\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output (both):" + RESET + "\n" +
            "Volvo\nBMW\nFord\nMazda",
            
            // Page 11: Comparison & When to Use
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               LOOP COMPARISON & BEST USES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Regular For Loop:" + RESET + "\n" +
            "✓ Know exact number of iterations\n" +
            "✓ Need index position\n" +
            "✓ Custom increment steps\n" +
            "✓ Counting up/down\n\n" +
            GREEN + "🎯 For-each Loop:" + RESET + "\n" +
            "✓ Process all array elements\n" +
            "✓ Don't need index positions\n" +
            "✓ Cleaner, more readable code\n" +
            "✓ Working with collections\n\n" +
            YELLOW + "💡 Pro Tip:" + RESET + "\n" +
            "Use for-each when you can, regular for when you need\n" +
            "more control over the iteration process!",
            
            // Page 12: Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      LOOP SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Points:" + RESET + "\n" +
            "✓ For loops: known iteration count\n" +
            "✓ Three parts: init, condition, update\n" +
            "✓ Nested loops: loops within loops\n" +
            "✓ For-each: simplified array iteration\n\n" +
            YELLOW + "🚀 Practice Ideas:" + RESET + "\n" +
            "• Print numbers 1-100\n" +
            "• Create a 5x5 multiplication table\n" +
            "• Process an array of names\n" +
            "• Count down from 10 to 1\n\n" +
            PURPLE + "🌟 Remember:" + RESET + "\n" +
            "Loops make computers do repetitive work for you!\n" +
            "Master them to become a more efficient programmer.\n\n" +
            PURPLE + "Congratulations! You've mastered Java For Loops! 🎉" + RESET
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