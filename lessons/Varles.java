package lessons;
import java.util.Scanner;

public class Varles {
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
            // Page 1: Introduction to Variables
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  JAVA VARIABLES - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Variables?" + RESET + "\n" +
            "• Containers for storing data values\n" +
            "• Like labeled boxes that hold information\n" +
            "• Essential for all programming\n\n" +
            YELLOW + "💡 Simple Analogy:" + RESET + "\n" +
            "Think of variables as labeled storage boxes:\n" +
            BLUE + "name" + RESET + " box contains " + GREEN + "\"John\"" + RESET + "\n" +
            BLUE + "age" + RESET + " box contains " + GREEN + "25" + RESET + "\n" +
            BLUE + "score" + RESET + " box contains " + GREEN + "95.5" + RESET + "\n\n" +
            GREEN + "🎯 Common Variable Types:" + RESET + "\n" +
            "• String - Text (\"Hello\")\n" +
            "• int - Whole numbers (123)\n" +
            "• float - Decimal numbers (19.99)\n" +
            "• char - Single characters ('A')\n" +
            "• boolean - True/False values",

            // Page 2: Variable Declaration
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  VARIABLE DECLARATION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Creating Variables:" + RESET + "\n" +
            "Three steps to create a variable:\n" +
            "1. Choose data type\n" +
            "2. Give a name\n" +
            "3. Assign value (optional)\n\n" +
            YELLOW + "💡 Basic Syntax:" + RESET + "\n" +
            BLUE + "type variableName = value;" + RESET + "\n\n" +
            GREEN + "🔤 String Example:" + RESET + "\n" +
            BLUE + "String name = \"John\";" + RESET + "\n" +
            BLUE + "System.out.println(name);" + RESET + "\n" +
            GREEN + "Output: John" + RESET + "\n\n" +
            GREEN + "🔢 Integer Example:" + RESET + "\n" +
            BLUE + "int myNum = 15;" + RESET + "\n" +
            BLUE + "System.out.println(myNum);" + RESET + "\n" +
            GREEN + "Output: 15" + RESET + "\n\n" +
            YELLOW + "💡 Declaration Only:" + RESET + "\n" +
            BLUE + "int myNum;        " + YELLOW + "// Declare first" + RESET + "\n" +
            BLUE + "myNum = 15;       " + YELLOW + "// Assign later" + RESET,

            // Page 3: Variable Types and Examples
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               VARIABLE TYPES & EXAMPLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎯 Common Data Types:" + RESET + "\n\n" +
            BLUE + "String" + RESET + " - Text in double quotes\n" +
            BLUE + "int" + RESET + " - Whole numbers (no decimals)\n" +
            BLUE + "float" + RESET + " - Decimal numbers (with f)\n" +
            BLUE + "char" + RESET + " - Single character in single quotes\n" +
            BLUE + "boolean" + RESET + " - true or false only\n\n" +
            YELLOW + "💡 Complete Example:" + RESET + "\n" +
            BLUE + "int myNum = 5;" + RESET + "\n" +
            BLUE + "float myFloatNum = 5.99f;" + RESET + "\n" +
            BLUE + "char myLetter = 'D';" + RESET + "\n" +
            BLUE + "boolean myBool = true;" + RESET + "\n" +
            BLUE + "String myText = \"Hello\";" + RESET + "\n\n" +
            YELLOW + "⚠️ Important Notes:" + RESET + "\n" +
            "• String uses " + BLUE + "\"double quotes\"" + RESET + "\n" +
            "• char uses " + BLUE + "'single quotes'" + RESET + "\n" +
            "• float needs " + BLUE + "f" + RESET + " at the end",

            // Page 4: Changing Variable Values
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               CHANGING VARIABLE VALUES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Variable Reassignment:" + RESET + "\n" +
            "• Variables can change values\n" +
            "• New value overwrites old one\n" +
            "• Same variable name, different content\n\n" +
            YELLOW + "💡 Value Change Example:" + RESET + "\n" +
            BLUE + "int myNum = 15;" + RESET + "\n" +
            BLUE + "System.out.println(myNum); " + GREEN + "// 15" + RESET + "\n\n" +
            BLUE + "myNum = 20; " + YELLOW + "// Change value" + RESET + "\n" +
            BLUE + "System.out.println(myNum); " + GREEN + "// 20" + RESET + "\n\n" +
            GREEN + "🎯 Think of it as:" + RESET + "\n" +
            "Emptying the box and putting something new in it\n\n" +
            YELLOW + "💡 Multiple Changes:" + RESET + "\n" +
            BLUE + "String message = \"Hello\";" + RESET + "\n" +
            BLUE + "message = \"Hi\";" + RESET + "\n" +
            BLUE + "message = \"Welcome\";" + RESET + "\n" +
            BLUE + "System.out.println(message); " + GREEN + "// Welcome" + RESET,

            // Page 5: Displaying Variables
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  DISPLAYING VARIABLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🖨️ Using + for Output:" + RESET + "\n" +
            "Combine text and variables with +\n\n" +
            YELLOW + "💡 Text + Variable:" + RESET + "\n" +
            BLUE + "String name = \"John\";" + RESET + "\n" +
            BLUE + "System.out.println(\"Hello \" + name);" + RESET + "\n" +
            GREEN + "Output: Hello John" + RESET + "\n\n" +
            YELLOW + "💡 Variable + Variable:" + RESET + "\n" +
            BLUE + "String firstName = \"John \";" + RESET + "\n" +
            BLUE + "String lastName = \"Doe\";" + RESET + "\n" +
            BLUE + "String fullName = firstName + lastName;" + RESET + "\n" +
            BLUE + "System.out.println(fullName);" + RESET + "\n" +
            GREEN + "Output: John Doe" + RESET + "\n\n" +
            YELLOW + "💡 Number Addition:" + RESET + "\n" +
            BLUE + "int x = 5, y = 6;" + RESET + "\n" +
            BLUE + "System.out.println(x + y); " + GREEN + "// 11" + RESET,

            // Page 6: The + Operator Mystery
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                THE + OPERATOR MYSTERY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎭 Two Meanings of +:" + RESET + "\n" +
            "• For strings: " + BLUE + "Concatenation" + RESET + " (joining)\n" +
            "• For numbers: " + BLUE + "Addition" + RESET + " (math)\n\n" +
            RED + "⚠️ Common Pitfall:" + RESET + "\n" +
            BLUE + "int x = 5, y = 6;" + RESET + "\n" +
            BLUE + "System.out.println(\"Sum: \" + x + y);" + RESET + "\n" +
            GREEN + "Output: Sum: 56 " + RED + "(WRONG!)" + RESET + "\n\n" +
            GREEN + "✅ The Fix - Use Parentheses:" + RESET + "\n" +
            BLUE + "System.out.println(\"Sum: \" + (x + y));" + RESET + "\n" +
            GREEN + "Output: Sum: 11 " + GREEN + "(CORRECT!)" + RESET + "\n\n" +
            YELLOW + "🔍 What Happens:" + RESET + "\n" +
            "Without ( ): \"Sum: \" + x = \"Sum: 5\"\n" +
            "Then + y = \"Sum: 56\" (concatenation)\n\n" +
            "With ( ): x + y = 11 (addition first)\n" +
            "Then \"Sum: \" + 11 = \"Sum: 11\"",

            // Page 7: Multiple Variables
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  MULTIPLE VARIABLES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📦 Declaring Multiple Variables:" + RESET + "\n" +
            "Use comma-separated lists for same type\n\n" +
            YELLOW + "💡 Separate Lines:" + RESET + "\n" +
            BLUE + "int x = 5;" + RESET + "\n" +
            BLUE + "int y = 6;" + RESET + "\n" +
            BLUE + "int z = 50;" + RESET + "\n\n" +
            YELLOW + "💡 One Line (Shorter):" + RESET + "\n" +
            BLUE + "int x = 5, y = 6, z = 50;" + RESET + "\n\n" +
            GREEN + "🔗 Same Value to Multiple:" + RESET + "\n" +
            BLUE + "int x, y, z;" + RESET + "\n" +
            BLUE + "x = y = z = 50;" + RESET + "\n" +
            BLUE + "System.out.println(x + y + z); " + GREEN + "// 150" + RESET + "\n\n" +
            YELLOW + "💡 Recommendation:" + RESET + "\n" +
            "Use separate lines for better readability\n" +
            "unless variables are closely related",

            // Page 8: Variable Naming (Identifiers)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               VARIABLE NAMING RULES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ Valid Names:" + RESET + "\n" +
            "• Letters, digits, _, $\n" +
            "• Start with letter, _, or $\n" +
            "• Case-sensitive\n" +
            "• Descriptive names recommended\n\n" +
            YELLOW + "💡 Good vs Bad Names:" + RESET + "\n" +
            GREEN + "Good:" + RESET + " minutesPerHour, userName, totalScore\n" +
            YELLOW + "Okay:" + RESET + " x, y, temp (for short-lived variables)\n" +
            RED + "Bad:" + RESET + " a, b, c (not descriptive)\n\n" +
            RED + "❌ Invalid Names:" + RESET + "\n" +
            BLUE + "int 2ndNumber = 5;  " + RED + "// No starting digits" + RESET + "\n" +
            BLUE + "int my var = 10;    " + RED + "// No spaces" + RESET + "\n" +
            BLUE + "int int = 20;       " + RED + "// No keywords" + RESET,

            // Page 9: Constants (final variables)
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  CONSTANTS (final)" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔒 The final Keyword:" + RESET + "\n" +
            "• Creates unchangeable variables\n" +
            "• Values cannot be modified\n" +
            "• Also called \"constants\"\n" +
            "• Use for values that never change\n\n" +
            YELLOW + "💡 Constant Examples:" + RESET + "\n" +
            BLUE + "final int MINUTES_PER_HOUR = 60;" + RESET + "\n" +
            BLUE + "final int BIRTH_YEAR = 1980;" + RESET + "\n" +
            BLUE + "final double PI = 3.14159;" + RESET + "\n\n" +
            RED + "❌ This Causes Error:" + RESET + "\n" +
            BLUE + "final int myNum = 15;" + RESET + "\n" +
            BLUE + "myNum = 20; " + RED + "// ERROR! Cannot change final" + RESET + "\n\n" +
            YELLOW + "💡 Naming Convention:" + RESET + "\n" +
            "Constants use " + BLUE + "UPPER_CASE" + RESET + " with underscores\n" +
            "Makes them easy to identify",

            // Page 10: Real-World Example
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  REAL-WORLD EXAMPLE" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Student Information System:" + RESET + "\n" +
            YELLOW + "💡 Complete Example:" + RESET + "\n" +
            BLUE + "// Student data" + RESET + "\n" +
            BLUE + "String studentName = \"John Doe\";" + RESET + "\n" +
            BLUE + "int studentID = 15;" + RESET + "\n" +
            BLUE + "int studentAge = 23;" + RESET + "\n" +
            BLUE + "float studentFee = 75.25f;" + RESET + "\n" +
            BLUE + "char studentGrade = 'B';" + RESET + "\n\n" +
            BLUE + "// Display student information" + RESET + "\n" +
            BLUE + "System.out.println(\"Student name: \" + studentName);" + RESET + "\n" +
            BLUE + "System.out.println(\"Student id: \" + studentID);" + RESET + "\n" +
            BLUE + "System.out.println(\"Student age: \" + studentAge);" + RESET + "\n" +
            BLUE + "System.out.println(\"Student fee: \" + studentFee);" + RESET + "\n" +
            BLUE + "System.out.println(\"Student grade: \" + studentGrade);" + RESET + "\n\n" +
            GREEN + "📝 Output:" + RESET + "\n" +
            "Student name: John Doe\n" +
            "Student id: 15\n" +
            "Student age: 23\n" +
            "Student fee: 75.25\n" +
            "Student grade: B",

            // Page 11: Practice Exercises
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  PRACTICE EXERCISES" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🧠 Fix the Errors:" + RESET + "\n\n" +
            YELLOW + "Exercise 1 - Invalid Name:" + RESET + "\n" +
            BLUE + "int 1stPlace = 5;" + RESET + "\n" +
            RED + "What's wrong?" + RESET + "\n\n" +
            YELLOW + "Exercise 2 - Wrong Quotes:" + RESET + "\n" +
            BLUE + "char grade = \"A\";" + RESET + "\n" +
            RED + "Fix the quotes" + RESET + "\n\n" +
            YELLOW + "Exercise 3 - Missing f:" + RESET + "\n" +
            BLUE + "float price = 19.99;" + RESET + "\n" +
            RED + "What's missing?" + RESET + "\n\n" +
            YELLOW + "Exercise 4 - Constant Error:" + RESET + "\n" +
            BLUE + "final int MAX_SCORE = 100;" + RESET + "\n" +
            BLUE + "MAX_SCORE = 150;" + RESET + "\n" +
            RED + "Why error?" + RESET + "\n\n" +
            GREEN + "🎯 Solutions:" + RESET + "\n" +
            "1. Cannot start with digit\n" +
            "2. Use ' single quotes for char\n" +
            "3. Add f: 19.99f\n" +
            "4. Cannot change final variable",

            // Page 12: Best Practices & Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "               BEST PRACTICES & SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✅ Naming Best Practices:" + RESET + "\n" +
            "• Use descriptive names (firstName, not fn)\n" +
            "• Start with lowercase letter\n" +
            "• Use camelCase (myVariableName)\n" +
            "• Constants: UPPER_CASE\n\n" +
            GREEN + "✅ Declaration Tips:" + RESET + "\n" +
            "• Initialize variables when possible\n" +
            "• Use final for constants\n" +
            "• One variable per line for clarity\n" +
            "• Choose appropriate data types\n\n" +
            GREEN + "🎓 Key Rules:" + RESET + "\n" +
            "• Variables store data\n" +
            "• Must declare type and name\n" +
            "• Values can be changed (unless final)\n" +
            "• Use + to combine text and variables\n" +
            "• Watch out for + operator confusion\n\n" +
            YELLOW + "💡 Pro Tip:" + RESET + "\n" +
            "Good variable names make code self-documenting!",

            // Page 13: Final Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     FINAL SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 You've Learned:" + RESET + "\n" +
            "• How to declare and use variables\n" +
            "• Different data types and their purposes\n" +
            "• How to display variables with text\n" +
            "• Proper naming conventions and rules\n" +
            "• Using constants with the final keyword\n\n" +
            YELLOW + "🚀 Real Applications:" + RESET + "\n" +
            "• Storing user information\n" +
            "• Game scores and statistics\n" +
            "• Calculator operations\n" +
            "• Data processing\n" +
            "• Any program that needs memory!\n\n" +
            PURPLE + "💡 Remember:" + RESET + "\n" +
            "Variables are the building blocks of all programs!\n" +
            "Master them to create powerful Java applications.\n\n" +
            PURPLE + "Congratulations! You've mastered Java Variables! 🎉" + RESET
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