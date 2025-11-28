package lessons;
import java.util.Scanner;

public class Whileles {
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
            // Page 1: Introduction to Loops
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  JAVA LOOPS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Loops?" + RESET + "\n" +
            "• Repeat code blocks multiple times\n" +
            "• Execute while condition is true\n" +
            "• Essential for automation\n\n" +
            YELLOW + "💡 Why Use Loops?" + RESET + "\n" +
            "✅ Save time - Write once, run many times\n" +
            "✅ Reduce errors - Less code to debug\n" +
            "✅ More readable - Clear repetitive logic\n" +
            "✅ Handle dynamic data - Process collections\n\n" +
            GREEN + "🎯 Loop Types:" + RESET + "\n" +
            "• " + BLUE + "while" + RESET + " - Check condition first\n" +
            "• " + BLUE + "do-while" + RESET + " - Execute first, then check\n" +
            "• " + BLUE + "for" + RESET + " - Compact counter loops\n\n" +
            YELLOW + "🔧 Common Uses:" + RESET + "\n" +
            "• Processing user input\n" +
            "• Reading files\n" +
            "• Game loops\n" +
            "• Data validation",

            // Page 2: While Loop Basics
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    WHILE LOOP BASICS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 While Loop Syntax:" + RESET + "\n" +
            BLUE + "while (condition) {" + RESET + "\n" +
            BLUE + "    // code to repeat" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            YELLOW + "💡 How It Works:" + RESET + "\n" +
            "1. Check condition\n" +
            "2. If true → run code block\n" +
            "3. Repeat from step 1\n" +
            "4. Stop when condition false\n\n" +
            GREEN + "🎯 Simple Example:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "0\n1\n2\n3\n4",

            // Page 3: While Loop Step-by-Step
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               WHILE LOOP - STEP BY STEP" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 Detailed Execution:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            YELLOW + "📊 Iteration Breakdown:" + RESET + "\n" +
            GREEN + "Iteration 1:" + RESET + " i=0 → 0<5=true → print 0 → i=1\n" +
            GREEN + "Iteration 2:" + RESET + " i=1 → 1<5=true → print 1 → i=2\n" +
            GREEN + "Iteration 3:" + RESET + " i=2 → 2<5=true → print 2 → i=3\n" +
            GREEN + "Iteration 4:" + RESET + " i=3 → 3<5=true → print 3 → i=4\n" +
            GREEN + "Iteration 5:" + RESET + " i=4 → 4<5=true → print 4 → i=5\n" +
            RED + "Iteration 6:" + RESET + " i=5 → 5<5=false → STOP\n\n" +
            YELLOW + "💡 Why 'i'?" + RESET + "\n" +
            "• Short for 'index' or 'iterator'\n" +
            "• Traditional counter variable\n" +
            "• Common programming convention",

            // Page 4: Infinite Loop Warning
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               ⚠️ INFINITE LOOP WARNING" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "🚫 DON'T FORGET THE INCREMENT!" + RESET + "\n" +
            "Missing i++ creates infinite loop\n\n" +
            YELLOW + "💡 Infinite Loop Example:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            RED + "    // OOPS! Forgot i++" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "📝 What Happens:" + RESET + "\n" +
            "i always = 0, 0<5 always true\n" +
            "Prints '0' forever! " + RED + "💥" + RESET + "\n\n" +
            GREEN + "✅ The Fix:" + RESET + "\n" +
            BLUE + "i++;" + RESET + " inside the loop\n\n" +
            YELLOW + "💡 Other Increment Options:" + RESET + "\n" +
            BLUE + "i++" + RESET + "   - Add 1 after (post-increment)\n" +
            BLUE + "++i" + RESET + "   - Add 1 before (pre-increment)\n" +
            BLUE + "i += 1" + RESET + " - Add 1 (compound assignment)\n" +
            BLUE + "i = i + 1" + RESET + " - Add 1 (explicit)",

            // Page 5: Do-While Loop Basics
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   DO-WHILE LOOP BASICS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Do-While Syntax:" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    // code to repeat" + RESET + "\n" +
            BLUE + "} while (condition);" + RESET + "\n\n" +
            YELLOW + "💡 Key Difference:" + RESET + "\n" +
            "• " + BLUE + "while" + RESET + " - Check condition FIRST\n" +
            "• " + BLUE + "do-while" + RESET + " - Execute code FIRST\n" +
            "• do-while runs AT LEAST ONCE\n\n" +
            GREEN + "🎯 Simple Example:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "} while (i < 5);" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "0\n1\n2\n3\n4\n\n" +
            YELLOW + "⚠️ Don't Forget:" + RESET + "\n" +
            "Semicolon " + BLUE + ";" + RESET + " after while condition!",

            // Page 6: Do-While vs While Comparison
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              DO-WHILE VS WHILE COMPARISON" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 Critical Difference:" + RESET + "\n" +
            "When initial condition is FALSE\n\n" +
            YELLOW + "💡 While Loop (0 iterations):" + RESET + "\n" +
            BLUE + "int i = 10;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            GREEN + "Output: " + RED + "NOTHING!" + RESET + " (condition false)\n\n" +
            YELLOW + "💡 Do-While Loop (1 iteration):" + RESET + "\n" +
            BLUE + "int i = 10;" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "} while (i < 5);" + RESET + "\n" +
            GREEN + "Output: 10 " + GREEN + "(runs once!)" + RESET + "\n\n" +
            YELLOW + "💡 When to Use Do-While:" + RESET + "\n" +
            "• Menu systems\n" +
            "• Input validation\n" +
            "• When you need at least one execution",

            // Page 7: Real-World While Loop Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "              REAL-WORLD WHILE LOOP EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎮 Game Loop:" + RESET + "\n" +
            BLUE + "boolean gameRunning = true;" + RESET + "\n" +
            BLUE + "while (gameRunning) {" + RESET + "\n" +
            BLUE + "    updateGame();" + RESET + "\n" +
            BLUE + "    renderGraphics();" + RESET + "\n" +
            BLUE + "    gameRunning = checkGameOver();" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "📊 User Input Validation:" + RESET + "\n" +
            BLUE + "Scanner scanner = new Scanner(System.in);" + RESET + "\n" +
            BLUE + "int number;" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    System.out.print(\"Enter 1-10: \");" + RESET + "\n" +
            BLUE + "    number = scanner.nextInt();" + RESET + "\n" +
            BLUE + "} while (number < 1 || number > 10);" + RESET + "\n\n" +
            GREEN + "📈 Countdown Timer:" + RESET + "\n" +
            BLUE + "int countdown = 10;" + RESET + "\n" +
            BLUE + "while (countdown > 0) {" + RESET + "\n" +
            BLUE + "    System.out.println(countdown);" + RESET + "\n" +
            BLUE + "    countdown--;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            BLUE + "System.out.println(\"Blast off!\");" + RESET,

            // Page 8: Common Loop Patterns
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  COMMON LOOP PATTERNS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Counter Pattern:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 10) {" + RESET + "\n" +
            BLUE + "    System.out.println(\"Number: \" + i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "📋 List Processing:" + RESET + "\n" +
            BLUE + "int index = 0;" + RESET + "\n" +
            BLUE + "String[] names = {\"Alice\", \"Bob\", \"Charlie\"};" + RESET + "\n" +
            BLUE + "while (index < names.length) {" + RESET + "\n" +
            BLUE + "    System.out.println(names[index]);" + RESET + "\n" +
            BLUE + "    index++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🎯 Sentinel Pattern:" + RESET + "\n" +
            BLUE + "Scanner scanner = new Scanner(System.in);" + RESET + "\n" +
            BLUE + "String input;\n" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    System.out.print(\"Enter text (quit to exit): \");" + RESET + "\n" +
            BLUE + "    input = scanner.nextLine();" + RESET + "\n" +
            BLUE + "    System.out.println(\"You entered: \" + input);" + RESET + "\n" +
            BLUE + "} while (!input.equals(\"quit\"));" + RESET,

            // Page 9: Loop Control Statements
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                LOOP CONTROL STATEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "⏹️ break Statement:" + RESET + "\n" +
            "Exit loop immediately\n\n" +
            YELLOW + "💡 break Example:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 10) {" + RESET + "\n" +
            BLUE + "    if (i == 5) {" + RESET + "\n" +
            BLUE + "        break; " + RED + "// Exit loop when i=5" + RESET + "\n" +
            BLUE + "    }" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            GREEN + "Output: 0 1 2 3 4" + RESET + "\n\n" +
            GREEN + "⏭️ continue Statement:" + RESET + "\n" +
            "Skip to next iteration\n\n" +
            YELLOW + "💡 continue Example:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            BLUE + "    i++;" + RESET + "\n" +
            BLUE + "    if (i == 3) {" + RESET + "\n" +
            BLUE + "        continue; " + YELLOW + "// Skip printing 3" + RESET + "\n" +
            BLUE + "    }" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            GREEN + "Output: 1 2 4 5" + RESET,

            // Page 10: Common Mistakes & Debugging
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "             COMMON MISTAKES & DEBUGGING" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "❌ Infinite Loops:" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) {" + RESET + "\n" +
            RED + "    // Forgot i++" + RESET + "\n" +
            BLUE + "    System.out.println(i);" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            RED + "❌ Off-by-One Errors:" + RESET + "\n" +
            BLUE + "int i = 1;" + RESET + "\n" +
            BLUE + "while (i <= 5) { " + YELLOW + "// Prints 1-5" + RESET + "\n" +
            BLUE + "// vs" + RESET + "\n" +
            BLUE + "int i = 0;" + RESET + "\n" +
            BLUE + "while (i < 5) { " + YELLOW + "// Prints 0-4" + RESET + "\n\n" +
            RED + "❌ Missing Semicolon:" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    // code" + RESET + "\n" +
            BLUE + "} while (condition) " + RED + "// ERROR! Missing ;" + RESET + "\n\n" +
            GREEN + "✅ Debugging Tip:" + RESET + "\n" +
            "Add print statements to track variable values:\n" +
            BLUE + "System.out.println(\"i = \" + i);" + RESET,

            // Page 11: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Fix the Loops:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Infinite Loop:" + RESET + "\n" +
            BLUE + "int x = 1;" + RESET + "\n" +
            BLUE + "while (x <= 10) {" + RESET + "\n" +
            BLUE + "    System.out.println(x);" + RESET + "\n" +
            RED + "    // What's missing?" + RESET + "\n\n" +
            YELLOW + "Exercise 2 - Wrong Condition:" + RESET + "\n" +
            BLUE + "int count = 10;" + RESET + "\n" +
            BLUE + "while (count >= 0) {" + RESET + "\n" +
            BLUE + "    System.out.println(count);" + RESET + "\n" +
            BLUE + "    count++;" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            RED + "Why infinite?" + RESET + "\n\n" +
            YELLOW + "Exercise 3 - Missing Semicolon:" + RESET + "\n" +
            BLUE + "do {" + RESET + "\n" +
            BLUE + "    System.out.println(\"Hello\");" + RESET + "\n" +
            BLUE + "} while (true)" + RESET + "\n" +
            RED + "What's wrong?" + RESET + "\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. Add x++ inside loop\n" +
            "2. Use count-- (decrement)\n" +
            "3. Add ; after while condition",

            // Page 12: Best Practices & Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               BEST PRACTICES & SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ While Loop Best Practices:" + RESET + "\n" +
            "• Always increment/decrement counter\n" +
            "• Use meaningful variable names\n" +
            "• Avoid infinite loops\n" +
            "• Test edge cases\n\n" +
            GREEN + "✅ When to Use Each:" + RESET + "\n" +
            BLUE + "while" + RESET + " - When may need 0 iterations\n" +
            BLUE + "do-while" + RESET + " - When need at least 1 iteration\n\n" +
            GREEN + "🎓 Key Differences:" + RESET + "\n" +
            "• while checks condition first\n" +
            "• do-while executes code first\n" +
            "• do-while needs semicolon\n" +
            "• Both need loop control\n\n" +
            YELLOW + "💡 Pro Tip:" + RESET + "\n" +
            "Use while for unknown iterations,\n" +
            "do-while for input validation!",

            // Page 13: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How while and do-while loops work\n" +
            "• The critical difference between them\n" +
            "• How to avoid infinite loops\n" +
            "• Real-world applications for each type\n" +
            "• Common patterns and best practices\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Game development loops\n" +
            "• User input validation\n" +
            "• Data processing\n" +
            "• Menu systems\n" +
            "• File reading\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Loops automate repetition and make your programs\n" +
            "more powerful and efficient!\n\n" +
            PURPLE + "Congratulations! You've mastered Java While Loops! 🎉" + RESET
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