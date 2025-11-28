package lessons;
import java.util.Scanner;

public class Outples {
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
            CYAN + "                    JAVA OUTPUT - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What is Output?" + RESET + "\n" +
            "• Displaying information to the user\n" +
            "• Essential for showing results and messages\n" +
            "• Uses " + BLUE + "System.out" + RESET + " methods\n\n" +
            YELLOW + "💡 Basic Print Method:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World!\");" + RESET + "\n\n" +
            GREEN + "🎯 Output Methods:" + RESET + "\n" +
            "• " + BLUE + "println()" + RESET + " - Prints with new line\n" +
            "• " + BLUE + "print()" + RESET + " - Prints without new line\n" +
            "• " + BLUE + "printf()" + RESET + " - Formatted printing\n\n" +
            YELLOW + "🔧 Multiple Outputs:" + RESET + "\n" +
            "You can use multiple " + BLUE + "println()" + RESET + " methods\n" +
            "Each creates a new line automatically",

            // Page 2: println() Method
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   PRINTLN() METHOD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 System.out.println()" + RESET + "\n" +
            "• Prints text or values\n" +
            "• Adds a new line at the end\n" +
            "• Most commonly used output method\n\n" +
            YELLOW + "💡 Multiple println() Example:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World!\");" + RESET + "\n" +
            BLUE + "System.out.println(\"I am learning Java.\");" + RESET + "\n" +
            BLUE + "System.out.println(\"It is awesome!\");" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Hello World!\n" +
            "I am learning Java.\n" +
            "It is awesome!\n\n" +
            YELLOW + "🔍 Notice:" + RESET + "\n" +
            "Each message appears on a new line",

            // Page 3: Double Quotes Importance
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 DOUBLE QUOTES - IMPORTANCE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Text Must Be in Double Quotes:" + RESET + "\n" +
            "• Text: " + BLUE + "\"Hello World\"" + RESET + "\n" +
            "• Numbers: " + BLUE + "42" + RESET + " (no quotes needed)\n\n" +
            YELLOW + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(\"This sentence will work!\");" + RESET + "\n\n" +
            RED + "❌ Incorrect:" + RESET + "\n" +
            BLUE + "System.out.println(This sentence will produce an error);" + RESET + "\n\n" +
            GREEN + "📝 Error Message:" + RESET + "\n" +
            RED + "error: ';' expected" + RESET + "\n" +
            RED + "error: not a statement" + RESET + "\n\n" +
            YELLOW + "💡 Remember:" + RESET + "\n" +
            "Always wrap text in " + BLUE + "\"double quotes\"" + RESET,

            // Page 4: print() vs println()
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                PRINT() VS PRINTLN()" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Key Difference:" + RESET + "\n" +
            BLUE + "println()" + RESET + " - Adds new line after output\n" +
            BLUE + "print()" + RESET + " - No new line after output\n\n" +
            YELLOW + "💡 print() Example:" + RESET + "\n" +
            BLUE + "System.out.print(\"Hello World! \");" + RESET + "\n" +
            BLUE + "System.out.print(\"I will print on the same line.\");" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Hello World! I will print on the same line.\n\n" +
            YELLOW + "🔍 Compare with println():" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World!\");" + RESET + "\n" +
            BLUE + "System.out.println(\"I will print on a new line.\");" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Hello World!\n" +
            "I will print on a new line.",

            // Page 5: Printing Numbers
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   PRINTING NUMBERS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Printing Numbers:" + RESET + "\n" +
            "• No double quotes needed for numbers\n" +
            "• Java understands numbers directly\n" +
            "• Can print calculations\n\n" +
            YELLOW + "💡 Number Examples:" + RESET + "\n" +
            BLUE + "System.out.println(3);" + RESET + "\n" +
            BLUE + "System.out.println(358);" + RESET + "\n" +
            BLUE + "System.out.println(50000);" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "3\n" +
            "358\n" +
            "50000\n\n" +
            YELLOW + "⚠️ Common Mistake:" + RESET + "\n" +
            RED + "System.out.println(\"3\");" + RESET + " - This is text, not a number!",

            // Page 6: Mathematical Calculations
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              MATHEMATICAL CALCULATIONS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Calculations in Output:" + RESET + "\n" +
            "• Java can calculate inside println()\n" +
            "• No quotes for calculations\n" +
            "• Results are computed automatically\n\n" +
            YELLOW + "💡 Calculation Examples:" + RESET + "\n" +
            BLUE + "System.out.println(3 + 3);" + RESET + "\n" +
            GREEN + "Output: 6" + RESET + "\n\n" +
            BLUE + "System.out.println(2 * 5);" + RESET + "\n" +
            GREEN + "Output: 10" + RESET + "\n\n" +
            BLUE + "System.out.println(10 - 4);" + RESET + "\n" +
            GREEN + "Output: 6" + RESET + "\n\n" +
            BLUE + "System.out.println(15 / 3);" + RESET + "\n" +
            GREEN + "Output: 5" + RESET + "\n\n" +
            YELLOW + "🔧 Complex Calculations:" + RESET + "\n" +
            BLUE + "System.out.println(5 + 3 * 2);" + RESET + " // 11 (follows math rules)",

            // Page 7: Combining Text and Numbers
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "            COMBINING TEXT AND NUMBERS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Using + Operator:" + RESET + "\n" +
            "• Combines text and numbers\n" +
            "• Converts numbers to text automatically\n" +
            "• Called \"string concatenation\"\n\n" +
            YELLOW + "💡 Combination Examples:" + RESET + "\n" +
            BLUE + "System.out.println(\"The answer is: \" + 42);" + RESET + "\n" +
            GREEN + "Output: The answer is: 42" + RESET + "\n\n" +
            BLUE + "System.out.println(\"5 + 3 = \" + (5 + 3));" + RESET + "\n" +
            GREEN + "Output: 5 + 3 = 8" + RESET + "\n\n" +
            BLUE + "System.out.println(\"I am \" + 25 + \" years old\");" + RESET + "\n" +
            GREEN + "Output: I am 25 years old" + RESET + "\n\n" +
            YELLOW + "💡 Important:" + RESET + "\n" +
            "Use parentheses for calculations in text",

            // Page 8: Escape Sequences
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   ESCAPE SEQUENCES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Special Characters:" + RESET + "\n" +
            "Use backslash " + BLUE + "\\" + RESET + " for special characters\n\n" +
            YELLOW + "Common Escape Sequences:" + RESET + "\n" +
            BLUE + "\\n" + RESET + " - New line\n" +
            BLUE + "\\t" + RESET + " - Tab space\n" +
            BLUE + "\\\"" + RESET + " - Double quote\n" +
            BLUE + "\\\\" + RESET + " - Backslash\n\n" +
            YELLOW + "💡 Examples:" + RESET + "\n" +
            BLUE + "System.out.println(\"Line 1\\nLine 2\");" + RESET + "\n" +
            GREEN + "Output:" + RESET + "\n" +
            "Line 1\n" +
            "Line 2\n\n" +
            BLUE + "System.out.println(\"Name:\\tJohn\");" + RESET + "\n" +
            GREEN + "Output: Name:    John" + RESET + "\n\n" +
            BLUE + "System.out.println(\"He said \\\"Hello\\\"\");" + RESET + "\n" +
            GREEN + "Output: He said \"Hello\"" + RESET,

            // Page 9: Real-Life Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  REAL-LIFE EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Game Score Display:" + RESET + "\n" +
            BLUE + "System.out.println(\"=== GAME SCORE ===\");" + RESET + "\n" +
            BLUE + "System.out.println(\"Player: \" + playerName);" + RESET + "\n" +
            BLUE + "System.out.println(\"Score: \" + score);" + RESET + "\n" +
            BLUE + "System.out.println(\"Level: \" + level);" + RESET + "\n\n" +
            GREEN + "📊 Calculator Output:" + RESET + "\n" +
            BLUE + "System.out.print(\"The result of \" + num1 + \" + \" + num2);" + RESET + "\n" +
            BLUE + "System.out.println(\" is: \" + (num1 + num2));" + RESET + "\n\n" +
            GREEN + "👤 User Information:" + RESET + "\n" +
            BLUE + "System.out.println(\"Name: \\t\\t\" + name);" + RESET + "\n" +
            BLUE + "System.out.println(\"Age: \\t\\t\" + age);" + RESET + "\n" +
            BLUE + "System.out.println(\"Country: \\t\" + country);" + RESET + "\n\n" +
            YELLOW + "💡 Formatting Tip:" + RESET + "\n" +
            "Use " + BLUE + "\\t" + RESET + " for nice column alignment",

            // Page 10: Common Mistakes
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   COMMON MISTAKES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "❌ Forgetting Quotes:" + RESET + "\n" +
            BLUE + "System.out.println(Hello World); // ERROR!" + RESET + "\n" +
            GREEN + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World\");" + RESET + "\n\n" +
            RED + "❌ Quotes Around Numbers:" + RESET + "\n" +
            BLUE + "System.out.println(\"5 + 3\"); // Prints text \"5 + 3\"" + RESET + "\n" +
            GREEN + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(5 + 3); // Calculates result 8" + RESET + "\n\n" +
            RED + "❌ Missing Parentheses:" + RESET + "\n" +
            BLUE + "System.out.println \"Hello\"; // ERROR!" + RESET + "\n" +
            GREEN + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello\");" + RESET + "\n\n" +
            RED + "❌ Wrong Case:" + RESET + "\n" +
            BLUE + "system.out.println(\"Hello\"); // ERROR!" + RESET + "\n" +
            GREEN + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello\");" + RESET,

            // Page 11: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Try These Exercises:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Basic Output:" + RESET + "\n" +
            "Print your name, age, and favorite color on separate lines\n\n" +
            YELLOW + "Exercise 2 - Calculations:" + RESET + "\n" +
            "Print the results of: 15 × 4, 100 ÷ 5, and 7²\n\n" +
            YELLOW + "Exercise 3 - Combined Output:" + RESET + "\n" +
            "Print: \"The sum of 8 and 12 is: \" followed by the actual sum\n\n" +
            YELLOW + "Exercise 4 - Formatting:" + RESET + "\n" +
            "Use tabs to create a neat product list with names and prices\n\n" +
            YELLOW + "Exercise 5 - Quotes in Text:" + RESET + "\n" +
            "Print: She said \"Java is fun!\" to her friend\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. Use 3 println() statements\n" +
            "2. Use println(15*4), etc.\n" +
            "3. println(\"The sum... \" + (8+12))\n" +
            "4. Use \\t between name and price\n" +
            "5. Use escape sequence \\\"",

            // Page 12: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to display text with println() and print()\n" +
            "• The importance of double quotes for text\n" +
            "• How to output numbers and calculations\n" +
            "• Combining text and numbers with + operator\n" +
            "• Using escape sequences for special formatting\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Displaying program results\n" +
            "• User interfaces and menus\n" +
            "• Game score displays\n" +
            "• Calculator outputs\n" +
            "• Data reporting\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Output is how your program communicates with users!\n" +
            "Clear, well-formatted output makes better applications.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Output! 🎉" + RESET
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