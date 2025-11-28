package lessons;
import java.util.Scanner;

public class Ifelseles {
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
            CYAN + "                 JAVA IF-ELSE - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Program Decision Making:" + RESET + "\n" +
            "• Control which code runs and when\n" +
            "• Make programs \"smart\" and responsive\n" +
            "• Handle different situations automatically\n\n" +
            YELLOW + "💡 Real-life analogy:" + RESET + "\n" +
            "If it rains → take umbrella\n" +
            "Otherwise → do nothing\n\n" +
            GREEN + "🎯 Basic Example:" + RESET + "\n" +
            BLUE + "boolean isRaining = true;\n\n" +
            "if (isRaining) {\n" +
            "    System.out.println(\"Bring an umbrella!\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🔑 Key Point:" + RESET + "\n" +
            "if statements need conditions that result in " + BLUE + "true" + RESET + " or " + BLUE + "false" + RESET,
            
            // Page 2: If Statement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      IF STATEMENT" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            BLUE + "if (condition) {\n" +
            "    // code to execute if condition is true\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "Important Notes:" + RESET + "\n" +
            "• Condition must be boolean (true/false)\n" +
            "• Use lowercase " + BLUE + "if" + RESET + " (not If or IF)\n" +
            "• Curly braces {} are required for multiple lines\n\n" +
            GREEN + "🔢 Example - Comparison:" + RESET + "\n" +
            BLUE + "if (20 > 18) {\n" +
            "    System.out.println(\"20 is greater than 18\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "20 is greater than 18",
            
            // Page 3: Else Statement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      ELSE STATEMENT" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            BLUE + "if (condition) {\n" +
            "    // code if condition is true\n" +
            "} else {\n" +
            "    // code if condition is false\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🎯 When to use:" + RESET + "\n" +
            "When you want to handle both cases:\n" +
            "• What to do when condition is true\n" +
            "• What to do when condition is false\n\n" +
            GREEN + "⏰ Example - Time Greeting:" + RESET + "\n" +
            BLUE + "int time = 20;\n\n" +
            "if (time < 18) {\n" +
            "    System.out.println(\"Good day.\");\n" +
            "} else {\n" +
            "    System.out.println(\"Good evening.\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Good evening.",
            
            // Page 4: Else-If Statement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    ELSE-IF STATEMENT" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            BLUE + "if (condition1) {\n" +
            "    // code if condition1 is true\n" +
            "} else if (condition2) {\n" +
            "    // code if condition1 is false AND condition2 is true\n" +
            "} else {\n" +
            "    // code if all conditions are false\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "🎯 When to use:" + RESET + "\n" +
            "When you have multiple conditions to check\n" +
            "• First condition checked first\n" +
            "• Second condition only if first fails\n" +
            "• else as final fallback\n\n" +
            GREEN + "⏰ Example - Multiple Time Greetings:" + RESET + "\n" +
            BLUE + "int time = 22;\n\n" +
            "if (time < 10) {\n" +
            "    System.out.println(\"Good morning.\");\n" +
            "} else if (time < 18) {\n" +
            "    System.out.println(\"Good day.\");\n" +
            "} else {\n" +
            "    System.out.println(\"Good evening.\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Good evening.",
            
            // Page 5: Nested If Statements
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   NESTED IF STATEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 If inside If:" + RESET + "\n" +
            "• Check additional conditions only if first condition is true\n" +
            "• Useful for complex decision trees\n" +
            "• Allows precise control flow\n\n" +
            GREEN + "📝 Syntax:" + RESET + "\n" +
            BLUE + "if (condition1) {\n" +
            "    // code if condition1 is true\n" +
            "    if (condition2) {\n" +
            "        // code if both conditions are true\n" +
            "    }\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🔢 Example:" + RESET + "\n" +
            BLUE + "int x = 15;\n" +
            "int y = 25;\n\n" +
            "if (x > 10) {\n" +
            "    System.out.println(\"x is greater than 10\");\n" +
            "    \n" +
            "    // Nested if\n" +
            "    if (y > 20) {\n" +
            "        System.out.println(\"y is also greater than 20\");\n" +
            "    }\n" +
            "}" + RESET,
            
            // Page 6: Logical Operators Introduction
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  LOGICAL OPERATORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Combine & Modify Conditions:" + RESET + "\n" +
            "Build complex conditions from simple ones\n\n" +
            YELLOW + "Three Main Operators:" + RESET + "\n" +
            BLUE + "&&" + RESET + " (AND) - all conditions must be true\n" +
            BLUE + "||" + RESET + " (OR) - at least one condition true\n" +
            BLUE + "!" + RESET + " (NOT) - reverses the condition\n\n" +
            GREEN + "🎯 Real-world thinking:" + RESET + "\n" +
            "AND: \"I need both my keys AND my wallet\"\n" +
            "OR: \"I can pay with cash OR credit card\"\n" +
            "NOT: \"I do NOT have my phone\"",
            
            // Page 7: AND Operator (&&)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     AND OPERATOR (&&)" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Use when ALL conditions must be true:" + RESET + "\n" +
            "• Both condition1 AND condition2 must be true\n" +
            "• If any condition is false → entire expression false\n\n" +
            YELLOW + "Truth Table:" + RESET + "\n" +
            "true && true   = true\n" +
            "true && false  = false\n" +
            "false && true  = false\n" +
            "false && false = false\n\n" +
            GREEN + "🔢 Example:" + RESET + "\n" +
            BLUE + "int a = 200;\n" +
            "int b = 33;\n" +
            "int c = 500;\n\n" +
            "if (a > b && c > a) {\n" +
            "    System.out.println(\"Both conditions are true\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "Both conditions are true",
            
            // Page 8: OR Operator (||)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     OR OPERATOR (||)" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Use when AT LEAST ONE condition must be true:" + RESET + "\n" +
            "• Either condition1 OR condition2 must be true\n" +
            "• Only false if ALL conditions are false\n\n" +
            YELLOW + "Truth Table:" + RESET + "\n" +
            "true || true   = true\n" +
            "true || false  = true\n" +
            "false || true  = true\n" +
            "false || false = false\n\n" +
            GREEN + "🔢 Example:" + RESET + "\n" +
            BLUE + "int a = 200;\n" +
            "int b = 33;\n" +
            "int c = 500;\n\n" +
            "if (a > b || a > c) {\n" +
            "    System.out.println(\"At least one condition is true\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "At least one condition is true",
            
            // Page 9: NOT Operator (!)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     NOT OPERATOR (!)" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Reverse the condition:" + RESET + "\n" +
            "• true becomes false\n" +
            "• false becomes true\n" +
            "• Useful for checking the opposite\n\n" +
            YELLOW + "Truth Table:" + RESET + "\n" +
            "!true  = false\n" +
            "!false = true\n\n" +
            GREEN + "🔢 Example:" + RESET + "\n" +
            BLUE + "int a = 33;\n" +
            "int b = 200;\n\n" +
            "if (!(a > b)) {\n" +
            "    System.out.println(\"a is NOT greater than b\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🚀 Output:" + RESET + "\n" +
            "a is NOT greater than b",
            
            // Page 10: Real-World Security Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 REAL-WORLD SECURITY EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔒 Access Control System:" + RESET + "\n" +
            "Requirements for system access:\n" +
            "• Must be logged in AND\n" +
            "• Either be admin OR have high security clearance\n\n" +
            BLUE + "boolean isLoggedIn = true;\n" +
            "boolean isAdmin = false;\n" +
            "int securityLevel = 3; // 1 = highest\n\n" +
            "if (isLoggedIn && (isAdmin || securityLevel <= 2)) {\n" +
            "    System.out.println(\"Access granted\");\n" +
            "} else {\n" +
            "    System.out.println(\"Access denied\");\n" +
            "}" + RESET + "\n\n" +
            GREEN + "🔍 Test Different Scenarios:" + RESET + "\n" +
            YELLOW + "securityLevel 1:" + RESET + " Access granted ✓\n" +
            YELLOW + "securityLevel 2:" + RESET + " Access granted ✓\n" +
            YELLOW + "securityLevel 3:" + RESET + " Access denied ✗\n" +
            YELLOW + "isAdmin = true:" + RESET + " Access granted ✓\n" +
            YELLOW + "isLoggedIn = false:" + RESET + " Access denied ✗",
            
            // Page 11: Best Practices & Tips
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  BEST PRACTICES & TIPS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ DO:" + RESET + "\n" +
            "• Use meaningful condition names\n" +
            "• Use parentheses for complex conditions\n" +
            "• Keep conditions simple and readable\n" +
            "• Use else-if for mutually exclusive cases\n" +
            "• Add comments for complex logic\n\n" +
            RED + "❌ DON'T:" + RESET + "\n" +
            "• Nest too deeply (hard to read)\n" +
            "• Forget curly braces {}\n" +
            "• Write overly complex conditions\n" +
            "• Use uppercase IF (syntax error)\n\n" +
            YELLOW + "💡 Pro Tips:" + RESET + "\n" +
            "• Use variables to store complex conditions\n" +
            "• Test all possible paths in your code\n" +
            "• Use descriptive variable names",
            
            // Page 12: Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      IF-ELSE SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Concepts:" + RESET + "\n" +
            "✓ if - execute when condition true\n" +
            "✓ else - execute when if condition false\n" +
            "✓ else-if - check additional conditions\n" +
            "✓ Nested if - if inside another if\n\n" +
            GREEN + "🔧 Logical Operators:" + RESET + "\n" +
            "✓ && (AND) - both must be true\n" +
            "✓ || (OR) - at least one true\n" +
            "✓ ! (NOT) - reverse condition\n\n" +
            YELLOW + "🚀 Practice Ideas:" + RESET + "\n" +
            "• Grade calculator (A, B, C, D, F)\n" +
            "• Login system with username/password\n" +
            "• Age verification for content\n" +
            "• Temperature range classifier\n\n" +
            PURPLE + "🌟 Remember:" + RESET + "\n" +
            "If-else statements give your programs\n" +
            "the power to make decisions!\n\n" +
            PURPLE + "Congratulations! You've mastered Java If-Else! 🎉" + RESET
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