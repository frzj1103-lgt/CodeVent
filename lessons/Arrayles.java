package lessons;
import java.util.Scanner;

public class Arrayles {
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
            CYAN + "                    JAVA ARRAYS - INTRODUCTION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🌟 What are Arrays?" + RESET + "\n" +
            "• Arrays store multiple values in a single variable\n" +
            "• Instead of separate variables for each value\n" +
            "• Organized way to handle related data\n\n" +
            YELLOW + "💡 Think of arrays like:" + RESET + "\n" +
            "  A bookshelf with numbered slots\n" +
            "  A train with numbered cars\n" +
            "  A playlist with numbered songs",
            
            // Page 2: Declaration
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  ARRAY DECLARATION & CREATION" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📝 Declaring Arrays:" + RESET + "\n" +
            "Use square brackets [ ] after the type:\n\n" +
            BLUE + "String[] cars;          // Declare\n" +
            "int[] numbers;          // Declare\n" +
            "double[] prices;        // Declare" + RESET + "\n\n" +
            GREEN + "🎯 Creating Arrays:" + RESET + "\n" +
            "Use curly braces { } with values:\n\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
            "int[] myNum = {10, 20, 30, 40};\n" +
            "double[] prices = {19.99, 9.99, 29.99};" + RESET,
            
            // Page 3: Accessing Elements
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                   ACCESSING ARRAY ELEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔍 Access by Index:" + RESET + "\n" +
            "• Use square brackets with index number\n" +
            "• Array indexes start at " + RED + "0" + RESET + " (not 1!)\n\n" +
            YELLOW + "Example Array:" + RESET + "\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};" + RESET + "\n\n" +
            "Index    Element\n" +
            "─────    ───────\n" +
            "  0   →  Volvo\n" +
            "  1   →  BMW\n" +
            "  2   →  Ford\n" +
            "  3   →  Mazda\n\n" +
            BLUE + "System.out.println(cars[0]);  // Output: Volvo\n" +
            "System.out.println(cars[2]);  // Output: Ford" + RESET,
            
            // Page 4: Modifying Elements
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  MODIFYING ARRAY ELEMENTS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "✏️ Changing Values:" + RESET + "\n" +
            "• Assign new value to specific index\n" +
            "• Original value gets replaced\n\n" +
            YELLOW + "Before Change:" + RESET + "\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};" + RESET + "\n" +
            "cars[0] = \"Opel\";\n\n" +
            YELLOW + "After Change:" + RESET + "\n" +
            "Index    Element\n" +
            "─────    ───────\n" +
            "  0   →  Opel\n" +
            "  1   →  BMW\n" +
            "  2   →  Ford\n" +
            "  3   →  Mazda\n\n" +
            BLUE + "System.out.println(cars[0]);  // Now outputs: Opel" + RESET,
            
            // Page 5: Array Length
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                     ARRAY LENGTH" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "📏 Getting Array Size:" + RESET + "\n" +
            "• Use the " + BLUE + ".length" + RESET + " property\n" +
            "• Returns number of elements\n" +
            "• Useful for loops and bounds checking\n\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
            "System.out.println(cars.length);  // Outputs: 4" + RESET + "\n\n" +
            YELLOW + "💡 Important:" + RESET + "\n" +
            "• Length is " + RED + "4" + RESET + " but last index is " + RED + "3" + RESET + "\n" +
            "• Highest valid index: length - 1\n" +
            "• cars[4] would cause an error!",
            
            // Page 6: Looping Through Arrays
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                  LOOPING THROUGH ARRAYS" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🔄 Using For Loops:" + RESET + "\n" +
            "• Loop through all elements\n" +
            "• Use length property as limit\n" +
            "• Access each element by index\n\n" +
            BLUE + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n\n" +
            "for (int i = 0; i < cars.length; i++) {\n" +
            "    System.out.println(cars[i]);\n" +
            "}" + RESET + "\n\n" +
            YELLOW + "Output:" + RESET + "\n" +
            "Volvo\nBMW\nFord\nMazda\n\n" +
            GREEN + "🎯 Why this works:" + RESET + "\n" +
            "i=0 → cars[0] = Volvo\n" +
            "i=1 → cars[1] = BMW\n" +
            "i=2 → cars[2] = Ford\n" +
            "i=3 → cars[3] = Mazda",
            
            // Page 7: Summary
            "═══════════════════════════════════════════════════════════════\n" +
            CYAN + "                      ARRAY SUMMARY" + RESET + "\n" +
            "═══════════════════════════════════════════════════════════════\n\n" +
            GREEN + "🎓 Key Points:" + RESET + "\n" +
            "✓ Arrays store multiple values\n" +
            "✓ Declare with: Type[] name\n" +
            "✓ Create with: {value1, value2, ...}\n" +
            "✓ Access with: arrayName[index]\n" +
            "✓ Indexes start at " + RED + "0" + RESET + "\n" +
            "✓ Use .length to get size\n" +
            "✓ Loop with for loops\n\n" +
            YELLOW + "🚀 Practice Ideas:" + RESET + "\n" +
            "• Create array of favorite foods\n" +
            "• Print all elements using loop\n" +
            "• Change one element and print again\n" +
            "• Find the array length\n\n" +
            PURPLE + "Congratulations! You've completed Arrays! 🎉" + RESET
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