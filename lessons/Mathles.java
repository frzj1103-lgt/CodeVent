package lessons;
import java.util.Scanner;

public class Mathles {
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
            CYAN + "                    JAVA MATH - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Java Math Class:" + RESET + "\n" +
            "• Built-in class for mathematical operations\n" +
            "• No need to create objects - use directly\n" +
            "• Provides common math functions\n\n" +
            YELLOW + "💡 How to use:" + RESET + "\n" +
            "Math.methodName(parameters)\n\n" +
            GREEN + "🎯 Common Math Methods:" + RESET + "\n" +
            "• Math.max() - Find larger number\n" +
            "• Math.min() - Find smaller number\n" +
            "• Math.sqrt() - Square root\n" +
            "• Math.pow() - Power/exponent\n" +
            "• Math.abs() - Absolute value\n" +
            "• Math.random() - Random numbers",
            
            // Page 2: Math.max() and Math.min()
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 MATH.MAX() & MATH.MIN()" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📈 Math.max(x, y)" + RESET + "\n" +
            "Returns the larger of two values\n\n" +
            BLUE + "System.out.println(Math.max(5, 10));" + RESET + "\n" +
            GREEN + "Output: 10" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.max(15, 8));" + RESET + "\n" +
            GREEN + "Output: 15" + RESET + "\n\n" +
            GREEN + "📉 Math.min(x, y)" + RESET + "\n" +
            "Returns the smaller of two values\n\n" +
            BLUE + "System.out.println(Math.min(5, 10));" + RESET + "\n" +
            GREEN + "Output: 5" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.min(15, 8));" + RESET + "\n" +
            GREEN + "Output: 8" + RESET + "\n\n" +
            YELLOW + "💡 Works with any numbers:" + RESET + "\n" +
            "integers, decimals, negative numbers",
            
            // Page 3: Math.sqrt() and Math.abs()
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 MATH.SQRT() & MATH.ABS()" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Math.sqrt(x)" + RESET + "\n" +
            "Returns the square root of x\n\n" +
            BLUE + "System.out.println(Math.sqrt(64));" + RESET + "\n" +
            GREEN + "Output: 8.0" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.sqrt(25));" + RESET + "\n" +
            GREEN + "Output: 5.0" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.sqrt(10));" + RESET + "\n" +
            GREEN + "Output: 3.1622776601683795" + RESET + "\n\n" +
            GREEN + "🎯 Math.abs(x)" + RESET + "\n" +
            "Returns the absolute (positive) value\n\n" +
            BLUE + "System.out.println(Math.abs(-4.7));" + RESET + "\n" +
            GREEN + "Output: 4.7" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.abs(10));" + RESET + "\n" +
            GREEN + "Output: 10" + RESET + "\n\n" +
            BLUE + "System.out.println(Math.abs(-15));" + RESET + "\n" +
            GREEN + "Output: 15" + RESET,
            
            // Page 4: Math.pow() - Power/Exponent
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    MATH.POW() - POWER" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "⚡ Math.pow(x, y)" + RESET + "\n" +
            "Returns x raised to the power of y\n\n" +
            BLUE + "System.out.println(Math.pow(2, 8));" + RESET + "\n" +
            GREEN + "Output: 256.0" + RESET + "\n\n" +
            YELLOW + "What this means:" + RESET + "\n" +
            "2 × 2 × 2 × 2 × 2 × 2 × 2 × 2 = 256\n\n" +
            GREEN + "🔢 More Examples:" + RESET + "\n" +
            BLUE + "System.out.println(Math.pow(5, 3));" + RESET + "\n" +
            GREEN + "Output: 125.0" + RESET + " (5 × 5 × 5)\n\n" +
            BLUE + "System.out.println(Math.pow(10, 2));" + RESET + "\n" +
            GREEN + "Output: 100.0" + RESET + " (10 × 10)\n\n" +
            BLUE + "System.out.println(Math.pow(3, 4));" + RESET + "\n" +
            GREEN + "Output: 81.0" + RESET + " (3 × 3 × 3 × 3)\n\n" +
            YELLOW + "💡 Important:" + RESET + "\n" +
            "Always returns " + BLUE + "double" + RESET + ", even for whole numbers",
            
            // Page 5: Rounding Methods
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    ROUNDING METHODS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Three Rounding Methods:" + RESET + "\n\n" +
            YELLOW + "Math.round(x)" + RESET + "\n" +
            "Rounds to nearest integer\n" +
            BLUE + "Math.round(4.6)  // 5" + RESET + "\n" +
            BLUE + "Math.round(4.4)  // 4" + RESET + "\n\n" +
            YELLOW + "Math.ceil(x)" + RESET + "\n" +
            "Rounds UP to next integer\n" +
            BLUE + "Math.ceil(4.1)   // 5.0" + RESET + "\n" +
            BLUE + "Math.ceil(4.9)   // 5.0" + RESET + "\n\n" +
            YELLOW + "Math.floor(x)" + RESET + "\n" +
            "Rounds DOWN to previous integer\n" +
            BLUE + "Math.floor(4.9)  // 4.0" + RESET + "\n" +
            BLUE + "Math.floor(4.1)  // 4.0" + RESET + "\n\n" +
            GREEN + "📊 Visual Example:" + RESET + "\n" +
            "Number: 4.3\n" +
            "round: 4, ceil: 5.0, floor: 4.0",
            
            // Page 6: Rounding Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   ROUNDING EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 More Rounding Examples:" + RESET + "\n\n" +
            YELLOW + "Math.round() examples:" + RESET + "\n" +
            BLUE + "Math.round(7.2)   // 7" + RESET + "\n" +
            BLUE + "Math.round(7.8)   // 8" + RESET + "\n" +
            BLUE + "Math.round(3.5)   // 4" + RESET + "\n" +
            BLUE + "Math.round(9.1)   // 9" + RESET + "\n\n" +
            YELLOW + "Math.ceil() examples:" + RESET + "\n" +
            BLUE + "Math.ceil(2.1)    // 3.0" + RESET + "\n" +
            BLUE + "Math.ceil(5.8)    // 6.0" + RESET + "\n" +
            BLUE + "Math.ceil(9.0)    // 9.0" + RESET + "\n" +
            BLUE + "Math.ceil(1.001)  // 2.0" + RESET + "\n\n" +
            YELLOW + "Math.floor() examples:" + RESET + "\n" +
            BLUE + "Math.floor(2.9)   // 2.0" + RESET + "\n" +
            BLUE + "Math.floor(5.8)   // 5.0" + RESET + "\n" +
            BLUE + "Math.floor(9.999) // 9.0" + RESET + "\n" +
            BLUE + "Math.floor(1.0)   // 1.0" + RESET + "\n\n" +
            YELLOW + "💡 Remember:" + RESET + "\n" +
            "ceil = ceiling = always rounds UP\n" +
            "floor = ground = always rounds DOWN",
            
            // Page 7: Math.random() Introduction
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  MATH.RANDOM() - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎲 Math.random()" + RESET + "\n" +
            "Generates random numbers\n\n" +
            YELLOW + "Range:" + RESET + "\n" +
            "0.0 (inclusive) to 1.0 (exclusive)\n" +
            "[0.0, 1.0) - includes 0.0, excludes 1.0\n\n" +
            GREEN + "🔢 Basic Usage:" + RESET + "\n" +
            BLUE + "System.out.println(Math.random());" + RESET + "\n" +
            GREEN + "Possible outputs:" + RESET + "\n" +
            "0.123456789\n" +
            "0.987654321\n" +
            "0.5\n" +
            "0.0\n" +
            "(but never 1.0)\n\n" +
            YELLOW + "💡 Every run gives different number!" + RESET,
            
            // Page 8: Controlling Random Numbers
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               CONTROLLING RANDOM NUMBERS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Get Specific Ranges:" + RESET + "\n" +
            "Multiply and cast to get desired range\n\n" +
            YELLOW + "Random 0 to 100:" + RESET + "\n" +
            BLUE + "int randomNum = (int)(Math.random() * 101);" + RESET + "\n" +
            GREEN + "Range: 0, 1, 2, ..., 100" + RESET + "\n\n" +
            YELLOW + "Random 1 to 6 (dice):" + RESET + "\n" +
            BLUE + "int dice = (int)(Math.random() * 6) + 1;" + RESET + "\n" +
            GREEN + "Range: 1, 2, 3, 4, 5, 6" + RESET + "\n\n" +
            YELLOW + "Random 10 to 20:" + RESET + "\n" +
            BLUE + "int num = (int)(Math.random() * 11) + 10;" + RESET + "\n" +
            GREEN + "Range: 10, 11, 12, ..., 20" + RESET + "\n\n" +
            GREEN + "🔧 How it works:" + RESET + "\n" +
            "Math.random() * range → gives 0 to (range-1)\n" +
            "Add minimum value to shift range",
            
            // Page 9: Practical Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    PRACTICAL EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Game Development:" + RESET + "\n" +
            BLUE + "// Random dice roll (1-6)\n" +
            "int diceRoll = (int)(Math.random() * 6) + 1;\n" +
            "System.out.println(\"You rolled: \" + diceRoll);" + RESET + "\n\n" +
            GREEN + "📊 Data Analysis:" + RESET + "\n" +
            BLUE + "// Find maximum of three numbers\n" +
            "int a = 15, b = 25, c = 10;\n" +
            "int max = Math.max(a, Math.max(b, c));\n" +
            "System.out.println(\"Maximum: \" + max);" + RESET + "\n\n" +
            GREEN + "🔢 Distance Calculation:" + RESET + "\n" +
            BLUE + "// Calculate distance using Pythagorean theorem\n" +
            "double x = 3, y = 4;\n" +
            "double distance = Math.sqrt(x*x + y*y);\n" +
            "System.out.println(\"Distance: \" + distance);" + RESET + "\n\n" +
            GREEN + "🎲 Lottery Number:" + RESET + "\n" +
            BLUE + "// Random number between 1-100\n" +
            "int lottery = (int)(Math.random() * 100) + 1;\n" +
            "System.out.println(\"Lottery number: \" + lottery);" + RESET,
            
            // Page 10: Summary & Tips
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    SUMMARY & TIPS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Methods:" + RESET + "\n" +
            "✓ Math.max(x,y) - Larger value\n" +
            "✓ Math.min(x,y) - Smaller value\n" +
            "✓ Math.sqrt(x) - Square root\n" +
            "✓ Math.abs(x) - Absolute value\n" +
            "✓ Math.pow(x,y) - Power\n" +
            "✓ Math.random() - Random 0.0-1.0\n\n" +
            GREEN + "🔢 Rounding Methods:" + RESET + "\n" +
            "✓ Math.round() - Nearest integer\n" +
            "✓ Math.ceil() - Always rounds up\n" +
            "✓ Math.floor() - Always rounds down\n\n" +
            YELLOW + "💡 Pro Tips:" + RESET + "\n" +
            "• Math.pow() always returns double\n" +
            "• Use (int) cast for integer random numbers\n" +
            "• Math.random() excludes 1.0\n" +
            "• No need to create Math objects",
            
            // Page 11: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Try These Exercises:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Calculator:" + RESET + "\n" +
            "Calculate 5³ + 2⁴ - √81\n\n" +
            YELLOW + "Exercise 2 - Random Game:" + RESET + "\n" +
            "Generate a random number between 50-100\n\n" +
            YELLOW + "Exercise 3 - Distance:" + RESET + "\n" +
            "Find distance between points (0,0) and (6,8)\n\n" +
            YELLOW + "Exercise 4 - Rounding:" + RESET + "\n" +
            "Round 7.8 up and 7.2 down\n\n" +
            YELLOW + "Exercise 5 - Comparison:" + RESET + "\n" +
            "Find the smallest of: 15, 23, 8, 42\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. Math.pow(5,3) + Math.pow(2,4) - Math.sqrt(81)\n" +
            "2. (int)(Math.random() * 51) + 50\n" +
            "3. Math.sqrt(6*6 + 8*8)\n" +
            "4. Math.ceil(7.8) and Math.floor(7.2)\n" +
            "5. Math.min(15, Math.min(23, Math.min(8, 42)))",
            
            // Page 12: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to perform common math operations\n" +
            "• Compare numbers and find extremes\n" +
            "• Calculate powers and roots\n" +
            "• Round numbers different ways\n" +
            "• Generate random numbers\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Games and simulations\n" +
            "• Data analysis\n" +
            "• Scientific calculations\n" +
            "• Financial applications\n" +
            "• Graphics and animations\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Math methods are your built-in calculators!\n" +
            "Use them to make complex calculations simple.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Math! 🎉" + RESET
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