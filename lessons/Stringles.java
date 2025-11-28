package lessons;
import java.util.Scanner;

public class Stringles {
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
            // Page 1: Introduction to Strings
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                    JAVA STRINGS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Strings?" + RESET + "\n" +
            "• Used for storing text\n" +
            "• Collection of characters in double quotes\n" +
            "• One of the most commonly used data types\n\n" +
            YELLOW + "💡 Basic String Creation:" + RESET + "\n" +
            BLUE + "String greeting = \"Hello\";" + RESET + "\n" +
            BLUE + "String name = \"John\";" + RESET + "\n" +
            BLUE + "String message = \"Welcome to Java!\";" + RESET + "\n\n" +
            GREEN + "🎯 Key Points:" + RESET + "\n" +
            "• Strings are objects in Java\n" +
            "• They have built-in methods\n" +
            "• Text must be in " + BLUE + "\"double quotes\"" + RESET + "\n" +
            "• Case-sensitive",

            // Page 2: String Length
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     STRING LENGTH" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📏 length() Method:" + RESET + "\n" +
            "Finds how many characters are in a string\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "String txt = \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\";" + RESET + "\n" +
            BLUE + "System.out.println(\"Length: \" + txt.length());" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Length: 26\n\n" +
            YELLOW + "🔍 More Examples:" + RESET + "\n" +
            BLUE + "\"Hello\".length()    // 5" + RESET + "\n" +
            BLUE + "\"Java\".length()     // 4" + RESET + "\n" +
            BLUE + "\" \".length()        // 1 (space counts!)" + RESET + "\n" +
            BLUE + "\"\".length()         // 0 (empty string)" + RESET + "\n\n" +
            YELLOW + "💡 Remember:" + RESET + "\n" +
            "Spaces and punctuation count as characters",

            // Page 3: Case Conversion Methods
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 CASE CONVERSION METHODS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Changing Letter Case:" + RESET + "\n" +
            BLUE + "toUpperCase()" + RESET + " - Converts to ALL CAPS\n" +
            BLUE + "toLowerCase()" + RESET + " - Converts to all lowercase\n\n" +
            YELLOW + "💡 Examples:" + RESET + "\n" +
            BLUE + "String txt = \"Hello World\";" + RESET + "\n" +
            BLUE + "System.out.println(txt.toUpperCase());" + RESET + "\n" +
            GREEN + "Output: HELLO WORLD" + RESET + "\n\n" +
            BLUE + "System.out.println(txt.toLowerCase());" + RESET + "\n" +
            GREEN + "Output: hello world" + RESET + "\n\n" +
            YELLOW + "🔧 Real Usage:" + RESET + "\n" +
            "• User input normalization\n" +
            "• Case-insensitive comparisons\n" +
            "• Data formatting\n\n" +
            BLUE + "String userInput = \"AdMiN\";" + RESET + "\n" +
            BLUE + "if (userInput.toLowerCase().equals(\"admin\")) {" + RESET + "\n" +
            BLUE + "    System.out.println(\"Access granted\");" + RESET + "\n" +
            BLUE + "}" + RESET,

            // Page 4: Finding Characters
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 FINDING CHARACTERS IN STRINGS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 indexOf() Method:" + RESET + "\n" +
            "• Finds position of first occurrence\n" +
            "• Returns -1 if not found\n" +
            "• Java counts from " + RED + "0" + RESET + " (not 1!)\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "String txt = \"Please locate where 'locate' occurs!\";" + RESET + "\n" +
            BLUE + "System.out.println(txt.indexOf(\"locate\"));" + RESET + "\n" +
            GREEN + "Output: 7" + RESET + "\n\n" +
            GREEN + "👆 charAt() Method:" + RESET + "\n" +
            "Gets character at specific position\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "String txt = \"Hello\";" + RESET + "\n" +
            BLUE + "System.out.println(txt.charAt(0));  // H" + RESET + "\n" +
            BLUE + "System.out.println(txt.charAt(4));  // o" + RESET + "\n\n" +
            YELLOW + "📊 Position Reference:" + RESET + "\n" +
            "H e l l o\n" +
            "0 1 2 3 4",

            // Page 5: Comparing Strings
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  COMPARING STRINGS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ equals() Method:" + RESET + "\n" +
            "• Compares string content\n" +
            "• Returns " + GREEN + "true" + RESET + " or " + RED + "false" + RESET + "\n" +
            "• Case-sensitive comparison\n\n" +
            YELLOW + "💡 Examples:" + RESET + "\n" +
            BLUE + "String txt1 = \"Hello\";" + RESET + "\n" +
            BLUE + "String txt2 = \"Hello\";" + RESET + "\n" +
            BLUE + "String txt3 = \"Greetings\";" + RESET + "\n\n" +
            BLUE + "System.out.println(txt1.equals(txt2));  // true" + RESET + "\n" +
            BLUE + "System.out.println(txt1.equals(txt3));  // false" + RESET + "\n\n" +
            GREEN + "🚫 Common Mistake:" + RESET + "\n" +
            RED + "if (txt1 == txt2) " + RESET + "// Don't use == for strings!\n" +
            GREEN + "✅ Correct:" + RESET + "\n" +
            BLUE + "if (txt1.equals(txt2))" + RESET + "\n\n" +
            YELLOW + "🔧 equalsIgnoreCase():" + RESET + "\n" +
            BLUE + "\"Hello\".equalsIgnoreCase(\"HELLO\")  // true" + RESET,

            // Page 6: Removing Whitespace
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                 REMOVING WHITESPACE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧹 trim() Method:" + RESET + "\n" +
            "• Removes spaces from start and end\n" +
            "• Does NOT affect spaces in middle\n" +
            "• Useful for cleaning user input\n\n" +
            YELLOW + "💡 Example:" + RESET + "\n" +
            BLUE + "String txt = \"   Hello World   \";" + RESET + "\n" +
            BLUE + "System.out.println(\"Before: [\" + txt + \"]\");" + RESET + "\n" +
            BLUE + "System.out.println(\"After:  [\" + txt.trim() + \"]\");" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Before: [   Hello World   ]\n" +
            "After:  [Hello World]\n\n" +
            YELLOW + "🔍 Visual Example:" + RESET + "\n" +
            RED + "␣␣␣Hello␣World␣␣␣" + RESET + " → " + GREEN + "Hello␣World" + RESET + "\n\n" +
            YELLOW + "💡 Real Usage:" + RESET + "\n" +
            "• Cleaning form inputs\n" +
            "• Preparing data for processing\n" +
            "• User authentication",

            // Page 7: String Concatenation
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  STRING CONCATENATION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔗 Using + Operator:" + RESET + "\n" +
            "Combines strings together\n\n" +
            YELLOW + "💡 Examples:" + RESET + "\n" +
            BLUE + "String firstName = \"John\";" + RESET + "\n" +
            BLUE + "String lastName = \"Doe\";" + RESET + "\n" +
            BLUE + "System.out.println(firstName + \" \" + lastName);" + RESET + "\n" +
            GREEN + "Output: John Doe" + RESET + "\n\n" +
            GREEN + "🔤 Building Sentences:" + RESET + "\n" +
            BLUE + "String name = \"John\";" + RESET + "\n" +
            BLUE + "int age = 25;" + RESET + "\n" +
            BLUE + "System.out.println(\"My name is \" + name + \" and I am \" + age + \" years old.\");" + RESET + "\n" +
            GREEN + "Output: My name is John and I am 25 years old." + RESET + "\n\n" +
            YELLOW + "💡 Tip:" + RESET + "\n" +
            "Add spaces between variables for readable output",

            // Page 8: concat() Method
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   CONCAT() METHOD" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 concat() Alternative:" + RESET + "\n" +
            "Another way to join strings\n\n" +
            YELLOW + "💡 Basic Usage:" + RESET + "\n" +
            BLUE + "String firstName = \"John \";" + RESET + "\n" +
            BLUE + "String lastName = \"Doe\";" + RESET + "\n" +
            BLUE + "System.out.println(firstName.concat(lastName));" + RESET + "\n" +
            GREEN + "Output: John Doe" + RESET + "\n\n" +
            GREEN + "⛓️ Chaining concat():" + RESET + "\n" +
            BLUE + "String a = \"Java \";" + RESET + "\n" +
            BLUE + "String b = \"is \";" + RESET + "\n" +
            BLUE + "String c = \"fun!\";" + RESET + "\n" +
            BLUE + "String result = a.concat(b).concat(c);" + RESET + "\n" +
            BLUE + "System.out.println(result);" + RESET + "\n" +
            GREEN + "Output: Java is fun!" + RESET + "\n\n" +
            YELLOW + "💡 Recommendation:" + RESET + "\n" +
            "Most developers prefer " + BLUE + "+" + RESET + " operator:\n" +
            "• Shorter to write\n" +
            "• Easier to read\n" +
            "• More flexible",

            // Page 9: Numbers vs Strings
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               NUMBERS VS STRINGS - WARNING!" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            RED + "⚠️ IMPORTANT: + Operator Does Both!" + RESET + "\n" +
            "• Numbers: " + GREEN + "Addition" + RESET + "\n" +
            "• Strings: " + GREEN + "Concatenation" + RESET + "\n\n" +
            YELLOW + "🔢 Number Addition:" + RESET + "\n" +
            BLUE + "int x = 10;" + RESET + "\n" +
            BLUE + "int y = 20;" + RESET + "\n" +
            BLUE + "int z = x + y;  // z = 30" + RESET + "\n\n" +
            YELLOW + "🔤 String Concatenation:" + RESET + "\n" +
            BLUE + "String x = \"10\";" + RESET + "\n" +
            BLUE + "String y = \"20\";" + RESET + "\n" +
            BLUE + "String z = x + y;  // z = \"1020\"" + RESET + "\n\n" +
            YELLOW + "🔀 Mixed Types:" + RESET + "\n" +
            BLUE + "String x = \"10\";" + RESET + "\n" +
            BLUE + "int y = 20;" + RESET + "\n" +
            BLUE + "String z = x + y;  // z = \"1020\"" + RESET + "\n\n" +
            RED + "💡 Rule: Number + String = String" + RESET,

            // Page 10: Escape Characters
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  ESCAPE CHARACTERS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 The Problem:" + RESET + "\n" +
            RED + "String txt = \"We are the so-called \"Vikings\" from the north.\";" + RESET + "\n" +
            RED + "// ERROR! Java gets confused by quotes inside quotes" + RESET + "\n\n" +
            GREEN + "✅ The Solution:" + RESET + "\n" +
            "Use backslash " + BLUE + "\\" + RESET + " to escape special characters\n\n" +
            YELLOW + "🔤 Common Escape Sequences:" + RESET + "\n" +
            BLUE + "\\\"" + RESET + " - Double quote\n" +
            BLUE + "\\'" + RESET + " - Single quote\n" +
            BLUE + "\\\\" + RESET + " - Backslash\n" +
            BLUE + "\\n" + RESET + " - New line\n" +
            BLUE + "\\t" + RESET + " - Tab",

            // Page 11: Escape Character Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               ESCAPE CHARACTER EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔤 Double Quotes:" + RESET + "\n" +
            BLUE + "String txt = \"We are the so-called \\\"Vikings\\\" from the north.\";" + RESET + "\n" +
            GREEN + "Output: We are the so-called \"Vikings\" from the north." + RESET + "\n\n" +
            GREEN + "🔤 Single Quote:" + RESET + "\n" +
            BLUE + "String txt = \"It\\'s alright.\";" + RESET + "\n" +
            GREEN + "Output: It's alright." + RESET + "\n\n" +
            GREEN + "🔤 Backslash:" + RESET + "\n" +
            BLUE + "String txt = \"The character \\\\ is called backslash.\";" + RESET + "\n" +
            GREEN + "Output: The character \\ is called backslash." + RESET + "\n\n" +
            GREEN + "🔤 New Line:" + RESET + "\n" +
            BLUE + "String txt = \"Hello\\nWorld\";" + RESET + "\n" +
            GREEN + "Output:" + RESET + "\n" +
            "Hello\n" +
            "World\n\n" +
            GREEN + "🔤 Tab:" + RESET + "\n" +
            BLUE + "String txt = \"Name:\\tJohn\";" + RESET + "\n" +
            GREEN + "Output: Name:    John" + RESET,

            // Page 12: Summary & Practice
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   SUMMARY & PRACTICE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key String Methods:" + RESET + "\n" +
            "✓ length() - Get string length\n" +
            "✓ toUpperCase()/toLowerCase() - Change case\n" +
            "✓ indexOf() - Find character position\n" +
            "✓ charAt() - Get character at position\n" +
            "✓ equals() - Compare strings\n" +
            "✓ trim() - Remove spaces\n" +
            "✓ concat() - Join strings\n\n" +
            YELLOW + "💡 Important Rules:" + RESET + "\n" +
            "• Use " + BLUE + "\"double quotes\"" + RESET + " for strings\n" +
            "• Positions start at " + RED + "0" + RESET + "\n" +
            "• Use " + BLUE + "equals()" + RESET + " not " + RED + "==" + RESET + " for comparison\n" +
            "• " + BLUE + "+" + RESET + " does addition OR concatenation\n\n" +
            GREEN + "🧠 Practice Exercises:" + RESET + "\n" +
            "1. Create a full name from first/last names\n" +
            "2. Convert user input to uppercase\n" +
            "3. Find if \"Java\" exists in a sentence\n" +
            "4. Clean user input with trim()\n" +
            "5. Create a formatted address using \\n",

            // Page 13: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to create and manipulate strings\n" +
            "• Essential string methods for everyday use\n" +
            "• How to compare and combine strings\n" +
            "• The difference between numbers and strings with +\n" +
            "• How to use escape characters for special symbols\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• User input processing\n" +
            "• Data validation and cleaning\n" +
            "• Text formatting and display\n" +
            "• File and data processing\n" +
            "• Web application development\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Strings are everywhere in programming!\n" +
            "Mastering them is essential for any Java developer.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Strings! 🎉" + RESET
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