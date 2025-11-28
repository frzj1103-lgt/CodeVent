package lessons;
import java.util.Scanner;

public class Operales {
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
            CYAN + "                    JAVA OPERATORS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Operators?" + RESET + "\n" +
            "• Used to perform operations on variables and values\n" +
            "• Essential for calculations and logic\n" +
            "• Make programs dynamic and interactive\n\n" +
            YELLOW + "💡 Basic Example:" + RESET + "\n" +
            BLUE + "int x = 100 + 50;" + RESET + "\n" +
            "The " + GREEN + "+" + RESET + " operator adds two values\n\n" +
            GREEN + "🎯 Operator Types:" + RESET + "\n" +
            "• Arithmetic Operators (+, -, *, /, %)\n" +
            "• Assignment Operators (=, +=, -=, etc.)\n" +
            "• Comparison Operators (==, !=, >, <, etc.)\n" +
            "• Logical Operators (&&, ||, !)\n\n" +
            YELLOW + "🔧 Multiple Usage:" + RESET + "\n" +
            "Operators can work with:\n" +
            "• Values: 100 + 50\n" +
            "• Variables: sum1 + 250\n" +
            "• Other variables: sum2 + sum2",

            // Page 2: Arithmetic Operators Overview
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 ARITHMETIC OPERATORS - OVERVIEW" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Arithmetic Operators:" + RESET + "\n" +
            "Used for common mathematical operations\n\n" +
            YELLOW + "Operator\tName\t\tDescription" + RESET + "\n" +
            GREEN + "+" + RESET + "\t\tAddition\tAdds two values\n" +
            GREEN + "-" + RESET + "\t\tSubtraction\tSubtracts one value from another\n" +
            GREEN + "*" + RESET + "\t\tMultiplication\tMultiplies two values\n" +
            GREEN + "/" + RESET + "\t\tDivision\tDivides one value by another\n" +
            GREEN + "%" + RESET + "\t\tModulus\t\tReturns division remainder\n" +
            GREEN + "++" + RESET + "\t\tIncrement\tIncreases value by 1\n" +
            GREEN + "--" + RESET + "\t\tDecrement\tDecreases value by 1\n\n" +
            YELLOW + "💡 Quick Examples:" + RESET + "\n" +
            BLUE + "int sum1 = 100 + 50;    // 150" + RESET + "\n" +
            BLUE + "int sum2 = sum1 + 250;  // 400" + RESET + "\n" +
            BLUE + "int sum3 = sum2 + sum2; // 800" + RESET,

            // Page 3: Arithmetic Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 ARITHMETIC OPERATORS - EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Complete Example:" + RESET + "\n" +
            BLUE + "int x = 10;" + RESET + "\n" +
            BLUE + "int y = 3;" + RESET + "\n\n" +
            BLUE + "System.out.println(x + y); // 13" + RESET + "\n" +
            BLUE + "System.out.println(x - y); // 7" + RESET + "\n" +
            BLUE + "System.out.println(x * y); // 30" + RESET + "\n" +
            BLUE + "System.out.println(x / y); // 3" + RESET + "\n" +
            BLUE + "System.out.println(x % y); // 1" + RESET + "\n\n" +
            YELLOW + "💡 Important Note:" + RESET + "\n" +
            "Integer division truncates decimals:\n" +
            BLUE + "10 / 3 = 3" + RESET + " (not 3.333...)\n\n" +
            GREEN + "🎯 For Decimal Results:" + RESET + "\n" +
            BLUE + "double a = 10.0;" + RESET + "\n" +
            BLUE + "double b = 3.0;" + RESET + "\n" +
            BLUE + "System.out.println(a / b); // 3.333..." + RESET,

            // Page 4: Increment and Decrement
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               INCREMENT & DECREMENT OPERATORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 ++ and -- Operators:" + RESET + "\n" +
            "Increase or decrease a value by 1\n\n" +
            YELLOW + "Increment Example:" + RESET + "\n" +
            BLUE + "int x = 5;" + RESET + "\n" +
            BLUE + "++x; // Increment x by 1" + RESET + "\n" +
            BLUE + "System.out.println(x); // 6" + RESET + "\n\n" +
            YELLOW + "Decrement Example:" + RESET + "\n" +
            BLUE + "int x = 5;" + RESET + "\n" +
            BLUE + "--x; // Decrement x by 1" + RESET + "\n" +
            BLUE + "System.out.println(x); // 4" + RESET + "\n\n" +
            GREEN + "🔄 Combined Example:" + RESET + "\n" +
            BLUE + "int x = 5;" + RESET + "\n" +
            BLUE + "++x; // x becomes 6" + RESET + "\n" +
            BLUE + "--x; // x becomes 5 again" + RESET + "\n" +
            BLUE + "System.out.println(x); // 5" + RESET,

            // Page 5: Real-Life Counting Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               REAL-LIFE EXAMPLE: COUNTING PEOPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Scenario:" + RESET + "\n" +
            "Counting people entering/leaving a room\n\n" +
            YELLOW + "Code Implementation:" + RESET + "\n" +
            BLUE + "int peopleInRoom = 0;" + RESET + "\n\n" +
            GREEN + "// 3 people enter" + RESET + "\n" +
            BLUE + "peopleInRoom++;" + RESET + "\n" +
            BLUE + "peopleInRoom++;" + RESET + "\n" +
            BLUE + "peopleInRoom++;" + RESET + "\n\n" +
            BLUE + "System.out.println(peopleInRoom); // 3" + RESET + "\n\n" +
            GREEN + "// 1 person leaves" + RESET + "\n" +
            BLUE + "peopleInRoom--;" + RESET + "\n\n" +
            BLUE + "System.out.println(peopleInRoom); // 2" + RESET + "\n\n" +
            YELLOW + "💡 Perfect for:" + RESET + "\n" +
            "• Counters\n" +
            "• Loops\n" +
            "• Inventory tracking\n" +
            "• Any situation needing counting",

            // Page 6: Assignment Operators
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  ASSIGNMENT OPERATORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Basic Assignment:" + RESET + "\n" +
            BLUE + "int x = 10; // Assign value 10 to x" + RESET + "\n\n" +
            GREEN + "📝 Compound Assignment Operators:" + RESET + "\n" +
            YELLOW + "Operator\tExample\t\tSame As" + RESET + "\n" +
            GREEN + "=" + RESET + "\t\tx = 5\t\tx = 5\n" +
            GREEN + "+=" + RESET + "\t\tx += 3\t\tx = x + 3\n" +
            GREEN + "-=" + RESET + "\t\tx -= 3\t\tx = x - 3\n" +
            GREEN + "*=" + RESET + "\t\tx *= 3\t\tx = x * 3\n" +
            GREEN + "/=" + RESET + "\t\tx /= 3\t\tx = x / 3\n" +
            GREEN + "%=" + RESET + "\t\tx %= 3\t\tx = x % 3\n\n" +
            YELLOW + "💡 Benefits:" + RESET + "\n" +
            "• Shorter code\n" +
            "• Easier to read\n" +
            "• Less typing",

            // Page 7: Assignment Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               ASSIGNMENT OPERATORS - EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Addition Assignment:" + RESET + "\n" +
            BLUE + "int x = 10;" + RESET + "\n" +
            BLUE + "x += 5; // x becomes 15" + RESET + "\n\n" +
            GREEN + "🎯 Real-Life Example: Savings Tracker" + RESET + "\n" +
            BLUE + "int savings = 100;" + RESET + "\n" +
            BLUE + "savings += 50; // Add 50 to savings" + RESET + "\n" +
            BLUE + "System.out.println(\"Total savings: \" + savings);" + RESET + "\n\n" +
            GREEN + "📊 More Examples:" + RESET + "\n" +
            BLUE + "int score = 100;" + RESET + "\n" +
            BLUE + "score -= 20; // score = 80" + RESET + "\n\n" +
            BLUE + "int quantity = 5;" + RESET + "\n" +
            BLUE + "quantity *= 3; // quantity = 15" + RESET + "\n\n" +
            BLUE + "int total = 100;" + RESET + "\n" +
            BLUE + "total /= 4; // total = 25" + RESET,

            // Page 8: Comparison Operators
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  COMPARISON OPERATORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 What are Comparison Operators?" + RESET + "\n" +
            "• Compare two values/variables\n" +
            "• Return " + GREEN + "true" + RESET + " or " + RED + "false" + RESET + "\n" +
            "• Essential for decision making\n\n" +
            YELLOW + "Basic Example:" + RESET + "\n" +
            BLUE + "int x = 5, y = 3;" + RESET + "\n" +
            BLUE + "System.out.println(x > y); // true" + RESET + "\n\n" +
            GREEN + "📊 Comparison Operators:" + RESET + "\n" +
            YELLOW + "Operator\tName\t\t\tExample" + RESET + "\n" +
            GREEN + "==" + RESET + "\t\tEqual to\t\tx == y\n" +
            GREEN + "!=" + RESET + "\t\tNot equal\t\tx != y\n" +
            GREEN + ">" + RESET + "\t\tGreater than\t\tx > y\n" +
            GREEN + "<" + RESET + "\t\tLess than\t\tx < y\n" +
            GREEN + ">=" + RESET + "\t\tGreater than or equal\tx >= y\n" +
            GREEN + "<=" + RESET + "\t\tLess than or equal\tx <= y",

            // Page 9: Comparison Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               COMPARISON OPERATORS - EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Real-Life Example: Voting Age" + RESET + "\n" +
            BLUE + "int age = 18;" + RESET + "\n\n" +
            BLUE + "System.out.println(age >= 18); // true - old enough to vote" + RESET + "\n" +
            BLUE + "System.out.println(age < 18);  // false - not old enough" + RESET + "\n\n" +
            GREEN + "🔒 Password Length Check:" + RESET + "\n" +
            BLUE + "int passwordLength = 5;" + RESET + "\n\n" +
            BLUE + "System.out.println(passwordLength >= 8); // false - too short" + RESET + "\n" +
            BLUE + "System.out.println(passwordLength < 8);  // true - needs more" + RESET + "\n\n" +
            YELLOW + "💡 Common Uses:" + RESET + "\n" +
            "• Age verification\n" +
            "• Password validation\n" +
            "• Score thresholds\n" +
            "• Quantity limits",

            // Page 10: Logical Operators
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   LOGICAL OPERATORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 What are Logical Operators?" + RESET + "\n" +
            "• Combine multiple conditions\n" +
            "• Determine logic between variables/values\n" +
            "• Return " + GREEN + "true" + RESET + " or " + RED + "false" + RESET + "\n\n" +
            GREEN + "📊 Logical Operators:" + RESET + "\n" +
            YELLOW + "Operator\tName\t\tDescription" + RESET + "\n" +
            GREEN + "&&" + RESET + "\t\tLogical AND\tTrue if BOTH are true\n" +
            GREEN + "||" + RESET + "\t\tLogical OR\tTrue if ONE is true\n" +
            GREEN + "!" + RESET + "\t\tLogical NOT\tReverses the result\n\n" +
            YELLOW + "💡 Truth Table:" + RESET + "\n" +
            "A && B: True only if A AND B are true\n" +
            "A || B: True if A OR B (or both) are true\n" +
            "!A: Opposite of A",

            // Page 11: Logical Operator Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              LOGICAL OPERATORS - EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 AND Operator (&&):" + RESET + "\n" +
            BLUE + "int age = 25;" + RESET + "\n" +
            BLUE + "boolean hasLicense = true;" + RESET + "\n" +
            BLUE + "boolean canDrive = (age >= 18) && hasLicense;" + RESET + "\n" +
            BLUE + "System.out.println(canDrive); // true" + RESET + "\n\n" +
            GREEN + "🔢 OR Operator (||):" + RESET + "\n" +
            BLUE + "boolean isWeekend = true;" + RESET + "\n" +
            BLUE + "boolean isHoliday = false;" + RESET + "\n" +
            BLUE + "boolean isDayOff = isWeekend || isHoliday;" + RESET + "\n" +
            BLUE + "System.out.println(isDayOff); // true" + RESET + "\n\n" +
            GREEN + "🔢 NOT Operator (!):" + RESET + "\n" +
            BLUE + "boolean isRaining = true;" + RESET + "\n" +
            BLUE + "boolean canPlayOutside = !isRaining;" + RESET + "\n" +
            BLUE + "System.out.println(canPlayOutside); // false" + RESET,

            // Page 12: Summary & Practice
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   SUMMARY & PRACTICE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Operator Categories:" + RESET + "\n" +
            "✓ Arithmetic: +, -, *, /, %, ++, --\n" +
            "✓ Assignment: =, +=, -=, *=, /=, %=\n" +
            "✓ Comparison: ==, !=, >, <, >=, <=\n" +
            "✓ Logical: &&, ||, !\n\n" +
            YELLOW + "💡 Key Points:" + RESET + "\n" +
            "• Integer division truncates decimals\n" +
            "• Use ++/-- for counting\n" +
            "• Compound operators save time\n" +
            "• Comparisons return true/false\n" +
            "• Logical operators combine conditions\n\n" +
            GREEN + "🧠 Practice Exercises:" + RESET + "\n" +
            "1. Calculate: (15 + 7) * 3 - 10\n" +
            "2. Check if 25 is between 20 and 30\n" +
            "3. Track score with += and -=\n" +
            "4. Combine age and height conditions\n" +
            "5. Use ! to check if NOT raining",

            // Page 13: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to perform calculations with arithmetic operators\n" +
            "• Efficient variable assignment with compound operators\n" +
            "• Compare values and make decisions\n" +
            "• Combine multiple conditions logically\n" +
            "• Apply operators to real-world scenarios\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Calculator programs\n" +
            "• Game scoring systems\n" +
            "• User input validation\n" +
            "• Business logic\n" +
            "• Data analysis\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Operators are the building blocks of program logic!\n" +
            "Master them to create powerful, dynamic applications.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Operators! 🎉" + RESET
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