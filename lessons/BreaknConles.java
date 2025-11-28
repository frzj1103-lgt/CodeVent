package lessons;
import java.util.Scanner;

public class BreaknConles {
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
            CYAN + "              BREAK & CONTINUE - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Loop Control Statements:" + RESET + "\n" +
            "• " + BLUE + "break" + RESET + " - Stop the loop entirely\n" +
            "• " + BLUE + "continue" + RESET + " - Skip to next iteration\n" +
            "• Give you precise control over loop execution\n\n" +
            YELLOW + "💡 Real-world analogy:" + RESET + "\n" +
            "Imagine reading a book:\n" +
            BLUE + "break" + RESET + " = Close the book completely\n" +
            BLUE + "continue" + RESET + " = Skip a boring page, keep reading",
            
            // Page 2: Break Statement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      BREAK STATEMENT" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 What break does:" + RESET + "\n" +
            "• Immediately exits the loop\n" +
            "• No more iterations happen\n" +
            "• Program continues after the loop\n\n" +
            YELLOW + "Example - Stop at number 4:" + RESET + "\n" +
            BLUE + "for (int i = 0; i < 10; i++) {\n" +
            "    if (i == 4) {\n" +
            "        break;      // Exit loop when i is 4\n" +
            "    }\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n\n" +
            GREEN + "📊 What gets printed:" + RESET + "\n" +
            "0\n1\n2\n3\n" +
            RED + "→ Loop stops at 4!" + RESET,
            
            // Page 3: Break Visualization
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 BREAK STATEMENT IN ACTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 Step-by-step execution:" + RESET + "\n" +
            "Loop: for (int i = 0; i < 10; i++)\n\n" +
            YELLOW + "Iteration 1:" + RESET + " i=0 → Print 0\n" +
            YELLOW + "Iteration 2:" + RESET + " i=1 → Print 1\n" +
            YELLOW + "Iteration 3:" + RESET + " i=2 → Print 2\n" +
            YELLOW + "Iteration 4:" + RESET + " i=3 → Print 3\n" +
            YELLOW + "Iteration 5:" + RESET + " i=4 → " + RED + "BREAK! Loop exits" + RESET + "\n\n" +
            GREEN + "🎯 When to use break:" + RESET + "\n" +
            "• Found what you're looking for\n" +
            "• Error condition occurs\n" +
            "• User wants to stop\n" +
            "• Task is completed early",
            
            // Page 4: Continue Statement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     CONTINUE STATEMENT" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 What continue does:" + RESET + "\n" +
            "• Skips current iteration\n" +
            "• Jumps to next iteration\n" +
            "• Loop continues running\n\n" +
            YELLOW + "Example - Skip number 4:" + RESET + "\n" +
            BLUE + "for (int i = 0; i < 10; i++) {\n" +
            "    if (i == 4) {\n" +
            "        continue;   // Skip this iteration\n" +
            "    }\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n\n" +
            GREEN + "📊 What gets printed:" + RESET + "\n" +
            "0\n1\n2\n3\n" +
            RED + "→ 4 is skipped! ←" + RESET + "\n" +
            "5\n6\n7\n8\n9",
            
            // Page 5: Continue Visualization
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                CONTINUE STATEMENT IN ACTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 Step-by-step execution:" + RESET + "\n" +
            "Loop: for (int i = 0; i < 10; i++)\n\n" +
            YELLOW + "Iteration 1-4:" + RESET + " Print 0, 1, 2, 3\n" +
            YELLOW + "Iteration 5:" + RESET + " i=4 → " + RED + "CONTINUE! Skip printing" + RESET + "\n" +
            YELLOW + "Iteration 6-10:" + RESET + " Print 5, 6, 7, 8, 9\n\n" +
            GREEN + "🎯 When to use continue:" + RESET + "\n" +
            "• Skip invalid data\n" +
            "• Skip specific values\n" +
            "• Skip error cases\n" +
            "• Filter out unwanted items",
            
            // Page 6: Comparison & Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                BREAK VS CONTINUE - COMPARISON" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📊 Side-by-side comparison:" + RESET + "\n\n" +
            YELLOW + "BREAK - Stop completely:" + RESET + "\n" +
            BLUE + "for (int i = 0; i < 5; i++) {\n" +
            "    if (i == 2) break;\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n" +
            GREEN + "Output: 0 1" + RESET + "\n\n" +
            YELLOW + "CONTINUE - Skip one:" + RESET + "\n" +
            BLUE + "for (int i = 0; i < 5; i++) {\n" +
            "    if (i == 2) continue;\n" +
            "    System.out.println(i);\n" +
            "}" + RESET + "\n" +
            GREEN + "Output: 0 1 3 4" + RESET,
            
            // Page 7: Real-world Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  REAL-WORLD APPLICATIONS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🛒 Shopping Cart Example:" + RESET + "\n" +
            BLUE + "for (Item item : cart) {\n" +
            "    if (item.isOutOfStock()) {\n" +
            "        continue;  // Skip out-of-stock items\n" +
            "    }\n" +
            "    if (item.price > budget) {\n" +
            "        break;     // Stop if too expensive\n" +
            "    }\n" +
            "    addToPurchase(item);\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🔍 Search Example:" + RESET + "\n" +
            BLUE + "for (String name : names) {\n" +
            "    if (name == null) {\n" +
            "        continue;  // Skip null values\n" +
            "    }\n" +
            "    if (name.equals(target)) {\n" +
            "        System.out.println(\"Found!\");\n" +
            "        break;     // Stop searching\n" +
            "    }\n" +
            "}" + RESET,
            
            // Page 8: Summary & Best Practices
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  SUMMARY & BEST PRACTICES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Differences:" + RESET + "\n" +
            "✓ " + BLUE + "break" + RESET + " = Stop the loop completely\n" +
            "✓ " + BLUE + "continue" + RESET + " = Skip current, continue loop\n" +
            "✓ " + BLUE + "break" + RESET + " = No more iterations\n" +
            "✓ " + BLUE + "continue" + RESET + " = Next iteration starts\n\n" +
            YELLOW + "🚀 Best Practices:" + RESET + "\n" +
            "• Use break when task is complete\n" +
            "• Use continue to filter data\n" +
            "• Avoid too many break/continue (can be confusing)\n" +
            "• Use meaningful condition checks\n\n" +
            PURPLE + "🌟 Remember:" + RESET + "\n" +
            "break = \"I'm done with this loop!\"\n" +
            "continue = \"Skip this one, show me the next!\"\n\n" +
            PURPLE + "Congratulations! You've mastered Break & Continue! 🎉" + RESET
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