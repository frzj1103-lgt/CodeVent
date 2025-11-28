package lessons;
import java.util.Scanner;

public class Datatles {
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
            CYAN + "                  JAVA DATA TYPES - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Data Types?" + RESET + "\n" +
            "• Define what kind of data a variable can hold\n" +
            "• Ensure type safety in Java\n" +
            "• Help compiler allocate proper memory\n\n" +
            YELLOW + "💡 Example Variables:" + RESET + "\n" +
            BLUE + "int myNum = 5;           // Integer\n" +
            "float myFloat = 5.99f;      // Floating point\n" +
            "char myLetter = 'D';        // Character\n" +
            "boolean myBool = true;      // Boolean\n" +
            "String myText = \"Hello\";    // String" + RESET + "\n\n" +
            GREEN + "🎯 Two Main Categories:" + RESET + "\n" +
            "• " + BLUE + "Primitive" + RESET + " - Basic built-in types\n" +
            "• " + BLUE + "Non-primitive" + RESET + " - Object references",
            
            // Page 2: Primitive Types Overview
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   PRIMITIVE DATA TYPES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📊 8 Primitive Types in Java:" + RESET + "\n\n" +
            YELLOW + "Integer Types:" + RESET + "\n" +
            "byte    -128 to 127\n" +
            "short   -32,768 to 32,767\n" +
            "int     -2.1B to 2.1B\n" +
            "long    -9.2Q to 9.2Q\n\n" +
            YELLOW + "Decimal Types:" + RESET + "\n" +
            "float   6-7 decimal digits\n" +
            "double  15-16 decimal digits\n\n" +
            YELLOW + "Other Types:" + RESET + "\n" +
            "boolean true or false\n" +
            "char    single character",
            
            // Page 3: Type Safety
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    TYPE SAFETY IN JAVA" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔒 Once Declared, Cannot Change:" + RESET + "\n" +
            "Java is strongly typed - types are fixed!\n\n" +
            YELLOW + "Valid:" + RESET + "\n" +
            BLUE + "int myNum = 5;        // myNum is int\n" +
            "String myText = \"Hi\";   // myText is String" + RESET + "\n\n" +
            RED + "❌ Invalid:" + RESET + "\n" +
            BLUE + "// myNum = \"Hello\";   // Error!\n" +
            "// myText = 123;        // Error!" + RESET + "\n\n" +
            GREEN + "🎯 Why This Matters:" + RESET + "\n" +
            "• Prevents accidental type mixing\n" +
            "• Makes code more reliable\n" +
            "• Catches errors at compile time",
            
            // Page 4: Integer Types
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      INTEGER TYPES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Whole Numbers Only:" + RESET + "\n" +
            "No decimals, positive or negative\n\n" +
            YELLOW + "byte - Smallest (Saves Memory):" + RESET + "\n" +
            BLUE + "byte myNum = 100;           // -128 to 127\n" +
            "System.out.println(myNum);" + RESET + "\n\n" +
            YELLOW + "short - Medium Range:" + RESET + "\n" +
            BLUE + "short myNum = 5000;         // -32768 to 32767\n" +
            "System.out.println(myNum);" + RESET + "\n\n" +
            YELLOW + "int - Most Common:" + RESET + "\n" +
            BLUE + "int myNum = 100000;         // -2.1B to 2.1B\n" +
            "System.out.println(myNum);" + RESET + "\n\n" +
            YELLOW + "long - Very Large:" + RESET + "\n" +
            BLUE + "long myNum = 15000000000L;  // Note the 'L'\n" +
            "System.out.println(myNum);" + RESET,
            
            // Page 5: Floating Point Types
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   FLOATING POINT TYPES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔢 Numbers with Decimals:" + RESET + "\n" +
            "Use when you need fractional parts\n\n" +
            YELLOW + "float - Single Precision:" + RESET + "\n" +
            BLUE + "float myNum = 5.75f;        // Note the 'f'\n" +
            "System.out.println(myNum);" + RESET + "\n\n" +
            YELLOW + "double - Double Precision:" + RESET + "\n" +
            BLUE + "double myNum = 19.99d;      // 'd' is optional\n" +
            "System.out.println(myNum);" + RESET + "\n\n" +
            GREEN + "🎯 Precision Comparison:" + RESET + "\n" +
            "float:  6-7 decimal digits\n" +
            "double: 15-16 decimal digits\n\n" +
            YELLOW + "💡 Recommendation:" + RESET + "\n" +
            "Use " + BLUE + "double" + RESET + " for most calculations - it's more precise!",
            
            // Page 6: Scientific Numbers & Boolean
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "             SCIENTIFIC NUMBERS & BOOLEANS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔬 Scientific Notation:" + RESET + "\n" +
            "Use 'e' for power of 10\n\n" +
            BLUE + "float f1 = 35e3f;     // 35 × 10³ = 35000\n" +
            "double d1 = 12E4d;    // 12 × 10⁴ = 120000\n" +
            "System.out.println(f1);\n" +
            "System.out.println(d1);" + RESET + "\n\n" +
            GREEN + "🎯 Boolean - True/False:" + RESET + "\n" +
            "Only two possible values\n\n" +
            BLUE + "boolean isJavaFun = true;\n" +
            "boolean isFishTasty = false;\n" +
            "System.out.println(isJavaFun);    // true\n" +
            "System.out.println(isFishTasty);  // false" + RESET + "\n\n" +
            YELLOW + "💡 Real-world uses:" + RESET + "\n" +
            "• YES/NO questions\n" +
            "• ON/OFF switches\n" +
            "• TRUE/FALSE conditions",
            
            // Page 7: Characters & Strings
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   CHARACTERS & STRINGS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔤 char - Single Character:" + RESET + "\n" +
            "Surround with single quotes '\n\n" +
            BLUE + "char myGrade = 'B';\n" +
            "System.out.println(myGrade);" + RESET + "\n\n" +
            YELLOW + "Using ASCII Values:" + RESET + "\n" +
            BLUE + "char myVar1 = 65;  // 'A'\n" +
            "char myVar2 = 66;  // 'B'\n" +
            "char myVar3 = 67;  // 'C'\n" +
            "System.out.println(myVar1);\n" +
            "System.out.println(myVar2);\n" +
            "System.out.println(myVar3);" + RESET + "\n\n" +
            GREEN + "📝 String - Text Sequence:" + RESET + "\n" +
            "Surround with double quotes \"\n\n" +
            BLUE + "String greeting = \"Hello World\";\n" +
            "System.out.println(greeting);" + RESET,
            
            // Page 8: Practical Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    PRACTICAL EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🛒 Shopping Cart Calculation:" + RESET + "\n" +
            BLUE + "// Create variables of different data types\n" +
            "int items = 50;\n" +
            "float costPerItem = 9.99f;\n" +
            "float totalCost = items * costPerItem;\n" +
            "char currency = '$';\n\n" +
            "// Print variables\n" +
            "System.out.println(\"Number of items: \" + items);\n" +
            "System.out.println(\"Cost per item: \" + costPerItem + currency);\n" +
            "System.out.println(\"Total cost = \" + totalCost + currency);" + RESET + "\n\n" +
            YELLOW + "🚀 Output:" + RESET + "\n" +
            "Number of items: 50\n" +
            "Cost per item: 9.99$\n" +
            "Total cost = 499.5$",
            
            // Page 9: Non-primitive Types
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  NON-PRIMITIVE TYPES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Reference Types:" + RESET + "\n" +
            "Refer to objects rather than store values directly\n\n" +
            YELLOW + "Key Differences:" + RESET + "\n" +
            "• Created by programmer (except String)\n" +
            "• Can call methods\n" +
            "• Start with uppercase (String, Array, etc.)\n" +
            "• Can be null\n\n" +
            GREEN + "📊 Primitive vs Non-primitive:" + RESET + "\n" +
            BLUE + "int x = 5;           // primitive\n" +
            "String name = \"John\";   // non-primitive\n" +
            "int[] numbers = {1,2,3}; // non-primitive" + RESET + "\n\n" +
            YELLOW + "💡 Remember:" + RESET + "\n" +
            "String is special - it's the only non-primitive\n" +
            "that doesn't need 'new' keyword",
            
            // Page 10: var Keyword
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      var KEYWORD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 Type Inference (Java 10+):" + RESET + "\n" +
            "Compiler figures out the type automatically\n\n" +
            YELLOW + "Basic Usage:" + RESET + "\n" +
            BLUE + "var x = 5;           // int\n" +
            "var myDouble = 9.98;     // double\n" +
            "var myChar = 'D';        // char\n" +
            "var myBoolean = true;    // boolean\n" +
            "var myString = \"Hello\";  // String" + RESET + "\n\n" +
            GREEN + "🎯 Complex Types (Useful!):" + RESET + "\n" +
            BLUE + "// Without var\n" +
            "ArrayList<String> cars = new ArrayList<String>();\n\n" +
            "// With var - much cleaner!\n" +
            "var cars = new ArrayList<String>();" + RESET,
            
            // Page 11: var Rules & Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               var RULES & DATA TYPE SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 var Important Rules:" + RESET + "\n" +
            RED + "❌ var x;              // Error - must assign value\n" +
            GREEN + "✅ var x = 5;          // OK - x is int\n" +
            GREEN + "✅ x = 10;             // OK - still int\n" +
            RED + "❌ x = 9.99;           // Error - can't change type" + RESET + "\n\n" +
            YELLOW + "🚀 When to Use var:" + RESET + "\n" +
            "• Complex types (ArrayList, HashMap)\n" +
            "• When type is obvious from context\n" +
            "• For cleaner code\n\n" +
            YELLOW + "🚫 When NOT to Use var:" + RESET + "\n" +
            "• Simple types (int, double)\n" +
            "• When type isn't clear\n" +
            "• For learning purposes\n\n" +
            PURPLE + "🌟 Data Type Pro Tip:" + RESET + "\n" +
            "Start with explicit types while learning,\n" +
            "use var for complex types later!\n\n" +
            PURPLE + "Congratulations! You've mastered Java Data Types! 🎉" + RESET
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