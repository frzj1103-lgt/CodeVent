package lessons;
import java.util.Scanner;

public class Syntaxles {
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
            // Page 1: Introduction to Java Syntax
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    JAVA SYNTAX - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What is Syntax?" + RESET + "\n" +
            "• Rules for writing Java code\n" +
            "• Like grammar for programming\n" +
            "• Must be followed exactly\n" +
            "• Computers are strict about syntax!\n\n" +
            YELLOW + "💡 Basic Java Program:" + RESET + "\n" +
            BLUE + "public class Main {" + RESET + "\n" +
            BLUE + "    public static void main(String[] args) {" + RESET + "\n" +
            BLUE + "        System.out.println(\"Hello World\");" + RESET + "\n" +
            BLUE + "    }" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🎯 Key Components:" + RESET + "\n" +
            "• Class declaration\n" +
            "• main() method\n" +
            "• Output statement\n" +
            "• Proper structure",

            // Page 2: Classes and Files
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  CLASSES & FILE NAMES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🏗️ Every Java Program Needs a Class:" + RESET + "\n" +
            "• All code must be inside a class\n" +
            "• Class name starts with uppercase letter\n" +
            "• File name MUST match class name\n\n" +
            YELLOW + "✅ Correct:" + RESET + "\n" +
            BLUE + "public class Main {" + RESET + "  →  File: " + GREEN + "Main.java" + RESET + "\n" +
            BLUE + "public class Calculator {" + RESET + "  →  File: " + GREEN + "Calculator.java" + RESET + "\n\n" +
            RED + "❌ Incorrect:" + RESET + "\n" +
            BLUE + "public class Main {" + RESET + "  →  File: " + RED + "main.java" + RESET + " (wrong case)\n" +
            BLUE + "public class MyProgram {" + RESET + "  →  File: " + RED + "Program.java" + RESET + " (different name)\n\n" +
            YELLOW + "⚠️ Important:" + RESET + "\n" +
            "Java is " + RED + "case-sensitive" + RESET + ":\n" +
            BLUE + "Main" + RESET + " and " + BLUE + "main" + RESET + " are different!\n" +
            BLUE + "MyClass" + RESET + " and " + BLUE + "myclass" + RESET + " are different!",

            // Page 3: The main() Method
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    MAIN() METHOD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎬 Program Starting Point:" + RESET + "\n" +
            "• Every Java program needs main()\n" +
            "• Execution begins here\n" +
            "• Required for program to run\n\n" +
            YELLOW + "💡 main() Method Syntax:" + RESET + "\n" +
            BLUE + "public static void main(String[] args) {" + RESET + "\n" +
            BLUE + "    // Your code goes here" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🔑 Keywords (For Later):" + RESET + "\n" +
            BLUE + "public" + RESET + " - Accessible from anywhere\n" +
            BLUE + "static" + RESET + " - Can run without creating object\n" +
            BLUE + "void" + RESET + " - Doesn't return a value\n" +
            BLUE + "String[] args" + RESET + " - Command line arguments\n\n" +
            YELLOW + "💡 For Now:" + RESET + "\n" +
            "Just remember: main() is where your program starts!",

            // Page 4: System.out.println()
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 SYSTEM.OUT.PRINTLN()" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🖨️ Printing to Screen:" + RESET + "\n" +
            "The command to display text/output\n\n" +
            YELLOW + "💡 Basic Usage:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World\");" + RESET + "\n" +
            GREEN + "Output: Hello World" + RESET + "\n\n" +
            GREEN + "🔍 Breaking It Down:" + RESET + "\n" +
            BLUE + "System" + RESET + " - Built-in Java class\n" +
            BLUE + "out" + RESET + " - Output stream (where text goes)\n" +
            BLUE + "println" + RESET + " - \"Print line\" method\n" +
            BLUE + "(\"text\")" + RESET + " - What to display\n\n" +
            YELLOW + "💡 Think of it as:" + RESET + "\n" +
            "\"Send this text to the screen\"\n\n" +
            GREEN + "🎯 Remember:" + RESET + "\n" +
            "• Text in " + BLUE + "\"double quotes\"" + RESET + "\n" +
            "• End with " + BLUE + "semicolon ;" + RESET,

            // Page 5: Curly Braces and Code Blocks
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               CURLY BRACES & CODE BLOCKS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "{} Curly Braces:" + RESET + "\n" +
            "• Mark beginning and end of code blocks\n" +
            "• Used with classes, methods, and control structures\n" +
            "• Must be properly matched\n\n" +
            YELLOW + "💡 Proper Structure:" + RESET + "\n" +
            BLUE + "public class Main {" + RESET + "          " + GREEN + "← Opening brace" + RESET + "\n" +
            BLUE + "    public static void main(String[] args) {" + RESET + "\n" +
            BLUE + "        // Code here" + RESET + "\n" +
            BLUE + "    }" + RESET + "                       " + GREEN + "← Closing brace" + RESET + "\n" +
            BLUE + "}" + RESET + "                           " + GREEN + "← Closing brace" + RESET + "\n\n" +
            RED + "❌ Common Mistakes:" + RESET + "\n" +
            "• Missing opening or closing brace\n" +
            "• Braces not properly aligned\n" +
            "• Extra or missing braces\n\n" +
            YELLOW + "💡 Tip:" + RESET + "\n" +
            "Use proper indentation for readability",

            // Page 6: Semicolons - The Line Enders
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  SEMICOLONS - LINE ENDERS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "⏹️ Semicolon ;" + RESET + "\n" +
            "• Ends every Java statement\n" +
            "• Like a period in English\n" +
            "• Tells Java \"this instruction is complete\"\n\n" +
            YELLOW + "✅ Correct:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello\");" + RESET + "\n" +
            BLUE + "int x = 5;" + RESET + "\n" +
            BLUE + "String name = \"John\";" + RESET + "\n\n" +
            RED + "❌ Missing Semicolon:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello\")" + RED + "  // ERROR!" + RESET + "\n" +
            RED + "error: ';' expected" + RESET + "\n\n" +
            YELLOW + "💡 When to Use Semicolons:" + RESET + "\n" +
            "• After every executable statement\n" +
            "• NOT after curly braces { }\n" +
            "• NOT after method declarations\n\n" +
            GREEN + "🎯 Rule:" + RESET + "\n" +
            "When in doubt, add a semicolon!",

            // Page 7: Java Statements
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    JAVA STATEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📜 What are Statements?" + RESET + "\n" +
            "• Instructions for the computer\n" +
            "• Executed one by one\n" +
            "• In order from top to bottom\n" +
            "• Each ends with a semicolon\n\n" +
            YELLOW + "💡 Example Program:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World!\");" + RESET + "\n" +
            BLUE + "System.out.println(\"Have a good day!\");" + RESET + "\n" +
            BLUE + "System.out.println(\"Learning Java is fun!\");" + RESET + "\n\n" +
            GREEN + "🎯 Execution Order:" + RESET + "\n" +
            "1. Print \"Hello World!\"\n" +
            "2. Print \"Have a good day!\"\n" +
            "3. Print \"Learning Java is fun!\"\n\n" +
            YELLOW + "💡 Think of it as:" + RESET + "\n" +
            "A recipe - follow steps in order",

            // Page 8: Complete Program Structure
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               COMPLETE PROGRAM STRUCTURE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🏛️ Full Java Program Template:" + RESET + "\n" +
            BLUE + "public class ClassName {" + RESET + "          " + YELLOW + "// 1. Class declaration" + RESET + "\n" +
            BLUE + "    public static void main(String[] args) {" + RESET + "  " + YELLOW + "// 2. Main method" + RESET + "\n" +
            BLUE + "        // 3. Your statements here" + RESET + "\n" +
            BLUE + "        System.out.println(\"Hello\");" + RESET + "\n" +
            BLUE + "        System.out.println(\"World\");" + RESET + "\n" +
            BLUE + "    }" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            GREEN + "🔑 Required Parts:" + RESET + "\n" +
            "1. " + BLUE + "class" + RESET + " declaration with matching filename\n" +
            "2. " + BLUE + "main()" + RESET + " method\n" +
            "3. Executable statements\n" +
            "4. Proper braces and semicolons\n\n" +
            YELLOW + "💡 File Naming:" + RESET + "\n" +
            "Class: " + BLUE + "MyProgram" + RESET + " → File: " + GREEN + "MyProgram.java" + RESET,

            // Page 9: Common Syntax Errors
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 COMMON SYNTAX ERRORS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "❌ Missing Semicolon:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello\")" + RED + "  // ERROR!" + RESET + "\n" +
            GREEN + "✅ Fix: System.out.println(\"Hello\");" + RESET + "\n\n" +
            RED + "❌ Wrong File Name:" + RESET + "\n" +
            BLUE + "public class Main" + RESET + " in file " + RED + "main.java" + RESET + "\n" +
            GREEN + "✅ Fix: Save as Main.java" + RESET + "\n\n" +
            RED + "❌ Missing Braces:" + RESET + "\n" +
            BLUE + "public class Main" + RESET + "\n" +
            BLUE + "    public static void main(String[] args)" + RED + "  // ERROR!" + RESET + "\n" +
            GREEN + "✅ Fix: Add { } around code" + RESET + "\n\n" +
            RED + "❌ Case Sensitivity:" + RESET + "\n" +
            BLUE + "system.out.println(\"Hello\");" + RED + "  // ERROR!" + RESET + "\n" +
            GREEN + "✅ Fix: System.out.println(\"Hello\");" + RESET,

            // Page 10: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Fix the Errors:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Missing Semicolon:" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello World\")" + RESET + "\n" +
            RED + "What's missing?" + RESET + "\n\n" +
            YELLOW + "Exercise 2 - Wrong Case:" + RESET + "\n" +
            BLUE + "system.Out.println(\"Java is fun\");" + RESET + "\n" +
            RED + "Find 2 case errors" + RESET + "\n\n" +
            YELLOW + "Exercise 3 - File Name:" + RESET + "\n" +
            BLUE + "public class MyProgram {" + RESET + "\n" +
            BLUE + "    // code here" + RESET + "\n" +
            BLUE + "}" + RESET + "\n" +
            RED + "What should the file be named?" + RESET + "\n\n" +
            YELLOW + "Exercise 4 - Braces:" + RESET + "\n" +
            BLUE + "public class Test" + RESET + "\n" +
            BLUE + "public static void main(String[] args) {" + RESET + "\n" +
            BLUE + "    System.out.println(\"Test\");" + RESET + "\n" +
            RED + "What's wrong with braces?" + RESET + "\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. Add ; at end\n" +
            "2. System.out.println (capital S and P)\n" +
            "3. MyProgram.java\n" +
            "4. Missing { after class Test",

            // Page 11: Best Practices
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   BEST PRACTICES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ Naming Conventions:" + RESET + "\n" +
            "• Class names: " + BLUE + "PascalCase" + RESET + " (MyClass, Calculator)\n" +
            "• File names: Match class name exactly\n" +
            "• Be descriptive with names\n\n" +
            GREEN + "✅ Code Organization:" + RESET + "\n" +
            "• Use proper indentation (4 spaces)\n" +
            "• Align opening/closing braces\n" +
            "• One statement per line\n" +
            "• Add comments for clarity\n\n" +
            GREEN + "✅ Common Patterns:" + RESET + "\n" +
            BLUE + "public class ClassName {" + RESET + "\n" +
            BLUE + "    public static void main(String[] args) {" + RESET + "\n" +
            BLUE + "        // Your code" + RESET + "\n" +
            BLUE + "    }" + RESET + "\n" +
            BLUE + "}" + RESET + "\n\n" +
            YELLOW + "💡 Pro Tip:" + RESET + "\n" +
            "Use an IDE (like VS Code) to catch syntax errors automatically",

            // Page 12: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• Java program structure and syntax rules\n" +
            "• The importance of classes and main() method\n" +
            "• How to use System.out.println() for output\n" +
            "• The role of semicolons and curly braces\n" +
            "• Common errors and how to fix them\n\n" +
            YELLOW + "🚀 Key Rules to Remember:" + RESET + "\n" +
            "• File name must match class name\n" +
            "• Every program needs a main() method\n" +
            "• Statements end with semicolons\n" +
            "• Code blocks use curly braces\n" +
            "• Java is case-sensitive\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Good syntax is the foundation of all Java programming!\n" +
            "Master these basics and you'll build amazing applications.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Syntax! 🎉" + RESET
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