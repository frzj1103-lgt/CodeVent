package lessons;
import java.util.Scanner;

public class Typecles {
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
            // Page 1: Introduction to Type Casting
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  JAVA TYPE CASTING - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What is Type Casting?" + RESET + "\n" +
            "• Converting one data type to another\n" +
            "• Essential for data manipulation\n" +
            "• Two main types: Widening and Narrowing\n\n" +
            YELLOW + "💡 Simple Analogy:" + RESET + "\n" +
            "Like pouring water between containers:\n" +
            GREEN + "Small → Large" + RESET + " = Safe (automatic)\n" +
            RED + "Large → Small" + RESET + " = Risky (manual)\n\n" +
            GREEN + "🎯 Common Conversions:" + RESET + "\n" +
            "• int → double (safe)\n" +
            "• double → int (risky)\n" +
            "• char → int (safe)\n" +
            "• long → int (risky)",

            // Page 2: Widening Casting (Automatic)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  WIDENING CASTING - AUTOMATIC" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Widening Casting:" + RESET + "\n" +
            "• Converts smaller → larger types\n" +
            "• Done automatically by Java\n" +
            "• No risk of data loss\n" +
            "• Also called \"implicit casting\"\n\n" +
            YELLOW + "📊 Size Order:" + RESET + "\n" +
            BLUE + "byte → short → char → int → long → float → double" + RESET + "\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "int myInt = 9;" + RESET + "\n" +
            BLUE + "double myDouble = myInt; " + GREEN + "// Automatic casting" + RESET + "\n\n" +
            BLUE + "System.out.println(myInt);    " + GREEN + "// Outputs 9" + RESET + "\n" +
            BLUE + "System.out.println(myDouble); " + GREEN + "// Outputs 9.0" + RESET + "\n\n" +
            YELLOW + "💡 Why Safe?" + RESET + "\n" +
            "double can hold all int values\n" +
            "No precision loss",

            // Page 3: Narrowing Casting (Manual)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  NARROWING CASTING - MANUAL" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "⚠️ Narrowing Casting:" + RESET + "\n" +
            "• Converts larger → smaller types\n" +
            "• Must be done manually\n" +
            "• Risk of data loss\n" +
            "• Also called \"explicit casting\"\n\n" +
            YELLOW + "📊 Size Order:" + RESET + "\n" +
            BLUE + "double → float → long → int → char → short → byte" + RESET + "\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "double myDouble = 9.78d;" + RESET + "\n" +
            BLUE + "int myInt = (int) myDouble; " + RED + "// Manual casting" + RESET + "\n\n" +
            BLUE + "System.out.println(myDouble); " + GREEN + "// Outputs 9.78" + RESET + "\n" +
            BLUE + "System.out.println(myInt);    " + GREEN + "// Outputs 9" + RESET + "\n\n" +
            RED + "💡 Data Loss:" + RESET + "\n" +
            "Decimal part (.78) is lost!",

            // Page 4: Casting Syntax Comparison
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 CASTING SYNTAX COMPARISON" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Widening (Automatic):" + RESET + "\n" +
            BLUE + "int num = 10;" + RESET + "\n" +
            BLUE + "double decimal = num; " + GREEN + "// No special syntax" + RESET + "\n\n" +
            YELLOW + "✅ Safe conversions:" + RESET + "\n" +
            BLUE + "byte → short, short → int, int → long" + RESET + "\n" +
            BLUE + "int → double, long → float" + RESET + "\n\n" +
            GREEN + "⚠️ Narrowing (Manual):" + RESET + "\n" +
            BLUE + "double price = 19.99;" + RESET + "\n" +
            BLUE + "int dollars = (int) price; " + RED + "// Use parentheses" + RESET + "\n\n" +
            YELLOW + "🔧 Syntax: (type) value" + RESET + "\n" +
            BLUE + "(int) 3.14    // → 3" + RESET + "\n" +
            BLUE + "(double) 5    // → 5.0" + RESET + "\n" +
            BLUE + "(char) 65     // → 'A'" + RESET,

            // Page 5: Data Loss Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    DATA LOSS EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "⚠️ Understanding Data Loss:" + RESET + "\n" +
            "Narrowing casting can lose information\n\n" +
            YELLOW + "💡 Double → Int:" + RESET + "\n" +
            BLUE + "double d = 123.456;" + RESET + "\n" +
            BLUE + "int i = (int) d;" + RESET + "\n" +
            GREEN + "i = 123 " + RED + "(lost .456)" + RESET + "\n\n" +
            YELLOW + "💡 Long → Int:" + RESET + "\n" +
            BLUE + "long big = 3000000000L;" + RESET + "\n" +
            BLUE + "int small = (int) big;" + RESET + "\n" +
            GREEN + "small = -1294967296 " + RED + "(overflow!)" + RESET + "\n\n" +
            YELLOW + "💡 Float → Int:" + RESET + "\n" +
            BLUE + "float f = 99.99f;" + RESET + "\n" +
            BLUE + "int i = (int) f;" + RESET + "\n" +
            GREEN + "i = 99 " + RED + "(lost .99)" + RESET + "\n\n" +
            YELLOW + "💡 Be Careful!" + RESET + "\n" +
            "Only use narrowing when you're sure about data ranges",

            // Page 6: Real-World Example - Percentage Calculation
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "             REAL-WORLD EXAMPLE - PERCENTAGE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Game Score Percentage:" + RESET + "\n" +
            "Calculate user's score as percentage of max score\n\n" +
            YELLOW + "💡 The Problem:" + RESET + "\n" +
            "Integer division gives wrong results!\n\n" +
            YELLOW + "✅ The Solution:" + RESET + "\n" +
            "Cast to double before division\n\n" +
            BLUE + "int maxScore = 500;" + RESET + "\n" +
            BLUE + "int userScore = 423;" + RESET + "\n" +
            BLUE + "double percentage = (double) userScore / maxScore * 100.0;" + RESET + "\n\n" +
            GREEN + "📊 Without Casting:" + RESET + "\n" +
            BLUE + "423 / 500 = 0 " + RED + "(integer division!)" + RESET + "\n\n" +
            GREEN + "📊 With Casting:" + RESET + "\n" +
            BLUE + "423.0 / 500 = 0.846" + RESET + "\n" +
            BLUE + "0.846 * 100 = 84.6%" + RESET + "\n\n" +
            YELLOW + "💡 Output: User's percentage is 84.6" + RESET,

            // Page 7: Common Casting Scenarios
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 COMMON CASTING SCENARIOS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Math Calculations:" + RESET + "\n" +
            BLUE + "int a = 5, b = 2;" + RESET + "\n" +
            BLUE + "double result = (double) a / b; " + GREEN + "// 2.5" + RESET + "\n\n" +
            GREEN + "🔤 Character to Number:" + RESET + "\n" +
            BLUE + "char letter = 'A';" + RESET + "\n" +
            BLUE + "int ascii = (int) letter; " + GREEN + "// 65" + RESET + "\n\n" +
            GREEN + "💵 Money Calculations:" + RESET + "\n" +
            BLUE + "double total = 19.99;" + RESET + "\n" +
            BLUE + "int dollars = (int) total; " + GREEN + "// 19 (dollars)" + RESET + "\n" +
            BLUE + "int cents = (int) ((total - dollars) * 100); " + GREEN + "// 99 (cents)" + RESET + "\n\n" +
            GREEN + "📏 Rounding Numbers:" + RESET + "\n" +
            BLUE + "double measurement = 12.7;" + RESET + "\n" +
            BLUE + "int approx = (int) (measurement + 0.5); " + GREEN + "// 13 (rounded)" + RESET,

            // Page 8: Casting Between Different Types
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               CASTING BETWEEN DIFFERENT TYPES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔤 char ↔ int:" + RESET + "\n" +
            BLUE + "char grade = 'B';" + RESET + "\n" +
            BLUE + "int code = (int) grade; " + GREEN + "// 66 (ASCII)" + RESET + "\n" +
            BLUE + "char back = (char) 66; " + GREEN + "// 'B'" + RESET + "\n\n" +
            GREEN + "🔢 int ↔ byte:" + RESET + "\n" +
            BLUE + "int big = 200;" + RESET + "\n" +
            BLUE + "byte small = (byte) big; " + RED + "// -56 (overflow!)" + RESET + "\n\n" +
            GREEN + "📏 double ↔ float:" + RESET + "\n" +
            BLUE + "double precise = 3.14159265359;" + RESET + "\n" +
            BLUE + "float approx = (float) precise; " + GREEN + "// 3.1415927" + RESET + "\n\n" +
            GREEN + "⏰ long ↔ int:" + RESET + "\n" +
            BLUE + "long time = 123456789L;" + RESET + "\n" +
            BLUE + "int seconds = (int) time; " + GREEN + "// 123456789" + RESET + "\n" +
            RED + "⚠️ Watch for overflow with large numbers!" + RESET,

            // Page 9: Common Mistakes and Pitfalls
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               COMMON MISTAKES & PITFALLS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "❌ Forgetting to Cast:" + RESET + "\n" +
            BLUE + "int a = 5, b = 2;" + RESET + "\n" +
            BLUE + "double result = a / b; " + RED + "// 2.0 (wrong!)" + RESET + "\n" +
            GREEN + "✅ Fix: double result = (double) a / b; " + GREEN + "// 2.5" + RESET + "\n\n" +
            RED + "❌ Wrong Casting Order:" + RESET + "\n" +
            BLUE + "double result = (double) (a / b); " + RED + "// 2.0 (still wrong!)" + RESET + "\n" +
            GREEN + "✅ Fix: double result = (double) a / b; " + GREEN + "// 2.5" + RESET + "\n\n" +
            RED + "❌ Unnecessary Casting:" + RESET + "\n" +
            BLUE + "int x = 10;" + RESET + "\n" +
            BLUE + "double y = (double) x; " + YELLOW + "// Works but unnecessary" + RESET + "\n" +
            GREEN + "✅ Better: double y = x; " + GREEN + "// Automatic widening" + RESET + "\n\n" +
            RED + "❌ Overflow Issues:" + RESET + "\n" +
            BLUE + "long big = 3000000000L;" + RESET + "\n" +
            BLUE + "int small = (int) big; " + RED + "// -1294967296 (overflow)" + RESET,

            // Page 10: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Predict the Output:" + RESET + "\n\n" +
            YELLOW + "Exercise 1:" + RESET + "\n" +
            BLUE + "double x = 15.75;" + RESET + "\n" +
            BLUE + "int y = (int) x;" + RESET + "\n" +
            RED + "What is y? " + RESET + "\n\n" +
            YELLOW + "Exercise 2:" + RESET + "\n" +
            BLUE + "int a = 10, b = 3;" + RESET + "\n" +
            BLUE + "double result = a / b;" + RESET + "\n" +
            RED + "What is result? " + RESET + "\n\n" +
            YELLOW + "Exercise 3:" + RESET + "\n" +
            BLUE + "char letter = 'X';" + RESET + "\n" +
            BLUE + "int code = letter;" + RESET + "\n" +
            RED + "What is code? " + RESET + "\n\n" +
            YELLOW + "Exercise 4:" + RESET + "\n" +
            BLUE + "int total = 100;" + RESET + "\n" +
            BLUE + "int count = 30;" + RESET + "\n" +
            BLUE + "double average = (double) total / count;" + RESET + "\n" +
            RED + "What is average? " + RESET + "\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. 15 (decimal lost)\n" +
            "2. 3.0 (integer division)\n" +
            "3. 88 (ASCII of 'X')\n" +
            "4. 3.333... (correct division)",

            // Page 11: Best Practices
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   BEST PRACTICES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ Use Widening When Possible:" + RESET + "\n" +
            "• Let Java handle safe conversions\n" +
            "• Cleaner, more readable code\n" +
            "• No risk of data loss\n\n" +
            GREEN + "✅ Be Explicit with Narrowing:" + RESET + "\n" +
            "• Always use manual casting syntax\n" +
            "• Add comments explaining data loss\n" +
            "• Validate ranges before casting\n\n" +
            GREEN + "✅ Handle Division Carefully:" + RESET + "\n" +
            BLUE + "// Good:" + RESET + "\n" +
            BLUE + "double result = (double) numerator / denominator;" + RESET + "\n" +
            BLUE + "// Avoid:" + RESET + "\n" +
            BLUE + "double result = numerator / denominator; " + RED + "// Wrong if ints!" + RESET + "\n\n" +
            GREEN + "✅ Check for Overflow:" + RESET + "\n" +
            "• Validate large numbers before casting\n" +
            "• Use appropriate data types\n" +
            "• Consider using Math methods for safety",

            // Page 12: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• The difference between widening and narrowing casting\n" +
            "• When to use automatic vs manual casting\n" +
            "• How to prevent data loss in calculations\n" +
            "• Common casting scenarios and pitfalls\n" +
            "• Best practices for type conversion\n\n" +
            YELLOW + "🚀 Key Rules:" + RESET + "\n" +
            "• Small → Large: Automatic (safe)\n" +
            "• Large → Small: Manual (risky)\n" +
            "• Use (type) for manual casting\n" +
            "• Watch for integer division\n" +
            "• Check for overflow with large numbers\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Type casting is essential for accurate calculations\n" +
            "and data manipulation in Java programming!\n\n" +
            PURPLE + "Congratulations! You've mastered Java Type Casting! 🎉" + RESET
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