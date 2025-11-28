package lessons;
import java.util.Scanner;

public class Switchles {
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
    }
    
    private static void displayPaginatedLesson(Scanner scanner) {
        String[] pages = {
            // Page 1: Introduction to Switch
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    JAVA SWITCH - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What is a Switch Statement?" + RESET + "\n" +
            "• Alternative to multiple if-else statements\n" +
            "• Selects one code block from many options\n" +
            "• Cleaner and more readable for multiple conditions\n\n" +
            YELLOW + "🍕 Restaurant Analogy:" + RESET + "\n" +
            "Like ordering from a menu:\n" +
            GREEN + "1" + RESET + " → Pizza\n" +
            GREEN + "2" + RESET + " → Burger\n" +
            GREEN + "3" + RESET + " → Pasta\n" +
            RED + "Other" + RESET + " → Nothing\n\n" +
            GREEN + "🎯 When to Use Switch:" + RESET + "\n" +
            "• Multiple fixed values to check\n" +
            "• Menu-driven programs\n" +
            "• State machines\n" +
            "• Day/month conversions",

            // Page 2: Switch Syntax
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     SWITCH SYNTAX" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Basic Syntax:" + RESET + "\n" +
            BLUE + "switch(expression) {" + RESET + "\n" +
            BLUE + "    case x:" + RESET + "\n" +
            BLUE + "        // code block" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case y:" + RESET + "\n" +
            BLUE + "        // code block" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    default:" + RESET + "\n" +
            BLUE + "        // code block" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🔧 How It Works:" + RESET + "\n" +
            "1. Expression evaluated once\n" +
            "2. Result compared with each case\n" +
            "3. Matching code block runs\n" +
            "4. " + BLUE + "break" + RESET + " stops further checking\n" +
            "5. " + BLUE + "default" + RESET + " runs if no match\n\n" +
            YELLOW + "💡 Expression Types:" + RESET + "\n" +
            "• int, byte, short, char\n" +
            "• String (Java 7+)\n" +
            "• Enum values",

            // Page 3: Complete Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   COMPLETE EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📅 Day of Week Example:" + RESET + "\n" +
            BLUE + "int day = 4;" + RESET + "\n" +
            BLUE + "switch (day) {" + RESET + "\n" +
            BLUE + "    case 1:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Monday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 2:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Tuesday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 3:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Wednesday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 4:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Thursday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 5:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Friday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 6:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Saturday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 7:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Sunday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🎯 Output: Thursday" + RESET + "\n\n" +
            YELLOW + "🔍 Flow:" + RESET + "\n" +
            "day=4 → matches case 4 → prints \"Thursday\" → break",

            // Page 4: The break Keyword
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    BREAK KEYWORD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🚫 What break Does:" + RESET + "\n" +
            "• Stops switch execution immediately\n" +
            "• Prevents \"fall-through\" to next cases\n" +
            "• Saves execution time\n" +
            "• Makes code more predictable\n\n" +
            YELLOW + "💡 Without break (Fall-through):" + RESET + "\n" +
            BLUE + "switch (day) {" + RESET + "\n" +
            BLUE + "    case 1:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Monday\");" + RESET + "\n" +
            BLUE + "    case 2:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Tuesday\");" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            RED + "If day=1, output would be:" + RESET + "\n" +
            "Monday\n" +
            "Tuesday\n\n" +
            GREEN + "✅ With break:" + RESET + "\n" +
            BLUE + "case 1:" + RESET + "\n" +
            BLUE + "    System.out.println(\"Monday\");" + RESET + "\n" +
            BLUE + "    break;  // Stops here!" + RESET + "\n" +
            BLUE + "case 2:" + RESET + "\n" +
            BLUE + "    System.out.println(\"Tuesday\");" + RESET + "\n" +
            BLUE + "    break;" + RESET,

            // Page 5: The default Keyword
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   DEFAULT KEYWORD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🛡️ What default Does:" + RESET + "\n" +
            "• Runs when no case matches\n" +
            "• Like the \"else\" in if-else\n" +
            "• Optional but recommended\n" +
            "• Handles unexpected values\n\n" +
            YELLOW + "💡 Default Example:" + RESET + "\n" +
            BLUE + "int day = 4;" + RESET + "\n" +
            BLUE + "switch (day) {" + RESET + "\n" +
            BLUE + "    case 6:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Today is Saturday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 7:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Today is Sunday\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    default:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Looking forward to the Weekend\");" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🎯 Output: Looking forward to the Weekend" + RESET + "\n\n" +
            YELLOW + "💡 Note:" + RESET + "\n" +
            "If default is last, no break needed\n" +
            "But using break is still good practice",

            // Page 6: Real-World Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  REAL-WORLD EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Menu System:" + RESET + "\n" +
            BLUE + "switch (choice) {" + RESET + "\n" +
            BLUE + "    case 1:" + RESET + "\n" +
            BLUE + "        startGame();" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 2:" + RESET + "\n" +
            BLUE + "        loadGame();" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 3:" + RESET + "\n" +
            BLUE + "        showSettings();" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    default:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Invalid choice!\");" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🔤 Grade Calculator:" + RESET + "\n" +
            BLUE + "switch (grade) {" + RESET + "\n" +
            BLUE + "    case 'A':" + RESET + "\n" +
            BLUE + "        System.out.println(\"Excellent!\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case 'B':" + RESET + "\n" +
            BLUE + "        System.out.println(\"Good!\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    default:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Needs improvement\");" + RESET + "\n" +
            BLUE + "}" + RESET,

            // Page 7: String Switch Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 STRING SWITCH (Java 7+)" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔤 Switching on Strings:" + RESET + "\n" +
            "Available in Java 7 and later\n\n" +
            YELLOW + "💡 String Example:" + RESET + "\n" +
            BLUE + "String day = \"MONDAY\";" + RESET + "\n" +
            BLUE + "switch (day) {" + RESET + "\n" +
            BLUE + "    case \"MONDAY\":" + RESET + "\n" +
            BLUE + "        System.out.println(\"Start of work week\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case \"FRIDAY\":" + RESET + "\n" +
            BLUE + "        System.out.println(\"Weekend is near!\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    case \"SATURDAY\":" + RESET + "\n" +
            BLUE + "    case \"SUNDAY\":" + RESET + "\n" +
            BLUE + "        System.out.println(\"Weekend!\");" + RESET + "\n" +
            BLUE + "        break;" + RESET + "\n" +
            BLUE + "    default:" + RESET + "\n" +
            BLUE + "        System.out.println(\"Regular work day\");" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            YELLOW + "💡 Multiple Cases Trick:" + RESET + "\n" +
            "You can group cases for same action:\n" +
            BLUE + "case \"SATURDAY\":" + RESET + "\n" +
            BLUE + "case \"SUNDAY\":" + RESET + "\n" +
            BLUE + "    // This runs for both Saturday AND Sunday" + RESET + "\n" +
            BLUE + "    break;" + RESET,

            // Page 8: Common Mistakes
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   COMMON MISTAKES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "❌ Forgetting break:" + RESET + "\n" +
            BLUE + "case 1:" + RESET + "\n" +
            BLUE + "    System.out.println(\"One\");" + RESET + "\n" +
            BLUE + "    // Oops! No break - will fall through!" + RESET + "\n" +
            BLUE + "case 2:" + RESET + "\n" +
            BLUE + "    System.out.println(\"Two\");" + RESET + "\n" +
            BLUE + "    break;" + RESET + "\n\n" +
            RED + "❌ Wrong data types:" + RESET + "\n" +
            BLUE + "switch (3.14) { " + RED + "// ERROR! No doubles!" + RESET + "\n" +
            BLUE + "    case 3.14: " + RED + "// ERROR!" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            RED + "❌ Duplicate cases:" + RESET + "\n" +
            BLUE + "switch (x) {" + RESET + "\n" +
            BLUE + "    case 1: // OK" + RESET + "\n" +
            BLUE + "    case 1: " + RED + "// ERROR! Duplicate!" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "✅ Allowed Types:" + RESET + "\n" +
            "• int, byte, short, char\n" +
            "• String\n" +
            "• Enum",

            // Page 9: Switch vs If-Else
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 SWITCH VS IF-ELSE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 When to Use Switch:" + RESET + "\n" +
            "• Fixed set of values\n" +
            "• Equality comparisons only\n" +
            "• Multiple discrete options\n" +
            "• Menu systems\n\n" +
            GREEN + "🎯 When to Use If-Else:" + RESET + "\n" +
            "• Range comparisons (>, <, >=)\n" +
            "• Complex conditions (&&, ||)\n" +
            "• Few conditions (2-3)\n" +
            "• Non-discrete values\n\n" +
            YELLOW + "💡 Comparison Example:" + RESET + "\n" +
            GREEN + "Switch (better):" + RESET + "\n" +
            BLUE + "switch (day) {" + RESET + "\n" +
            BLUE + "    case 1: case 2: case 3: ..." + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "If-Else (better):" + RESET + "\n" +
            BLUE + "if (score >= 90) { ... }" + RESET + "\n" +
            BLUE + "else if (score >= 80) { ... }" + RESET,

            // Page 10: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Try These Exercises:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Month Names:" + RESET + "\n" +
            "Convert month number (1-12) to month name\n\n" +
            YELLOW + "Exercise 2 - Calculator:" + RESET + "\n" +
            "Create a simple calculator (+, -, *, /)\n\n" +
            YELLOW + "Exercise 3 - Traffic Light:" + RESET + "\n" +
            "Switch on colors: RED→Stop, GREEN→Go, YELLOW→Slow\n\n" +
            YELLOW + "Exercise 4 - Season Finder:" + RESET + "\n" +
            "Given month number, output the season\n\n" +
            YELLOW + "Exercise 5 - Vowel Check:" + RESET + "\n" +
            "Check if a character is a vowel (a,e,i,o,u)\n\n" +
            GREEN + "🎯 Starter Code:" + RESET + "\n" +
            BLUE + "switch (month) {" + RESET + "\n" +
            BLUE + "    case 1: System.out.println(\"January\"); break;" + RESET + "\n" +
            BLUE + "    // Add other months..." + RESET + "\n" +
            BLUE + "}" + RESET,

            // Page 11: Summary & Best Practices
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               SUMMARY & BEST PRACTICES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Points:" + RESET + "\n" +
            "✓ Alternative to multiple if-else\n" +
            "✓ Works with discrete values\n" +
            "✓ Requires break to prevent fall-through\n" +
            "✓ default handles unexpected values\n" +
            "✓ Cleaner for multiple fixed options\n\n" +
            YELLOW + "💡 Best Practices:" + RESET + "\n" +
            "• Always use break (unless intentional fall-through)\n" +
            "• Include default case\n" +
            "• Keep cases in logical order\n" +
            "• Use for readability with many options\n" +
            "• Comment intentional fall-through\n\n" +
            RED + "🚫 Avoid:" + RESET + "\n" +
            "• Forgetting break accidentally\n" +
            "• Using for range comparisons\n" +
            "• Complex logic in cases",

            // Page 12: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to use switch statements effectively\n" +
            "• The importance of break keyword\n" +
            "• How default case handles unexpected values\n" +
            "• When to choose switch over if-else\n" +
            "• Common mistakes and how to avoid them\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Menu-driven programs\n" +
            "• State machines\n" +
            "• Command processors\n" +
            "• Game mechanics\n" +
            "• User interface logic\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Switch statements make your code cleaner and more readable\n" +
            "when dealing with multiple discrete options!\n\n" +
            PURPLE + "Congratulations! You've mastered Java Switch! 🎉" + RESET
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