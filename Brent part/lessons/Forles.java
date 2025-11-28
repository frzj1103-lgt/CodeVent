public class Forles {
    public static void main(String[] args) {
        System.out.println(
                "=========================================================================================================================");
        System.out.println("                                                      JAVA FOR LOOP");
        System.out.println(
                "=========================================================================================================================");
        System.out.println(" ");
        System.out.println("-When you know exactly how many times you want to loop through a block of code,");
        System.out.println(" use the for loop instead of a while loop:");
        System.out.println(" ");
        System.out.println("Syntax:");
        System.out.println(" ");
        System.out.println("for (statement 1; statement 2; statement 3) {");
        System.out.println("    // code block to be executed");
        System.out.println("}");
        System.out.println(" ");
        System.out.println("· Statement 1 is executed (one time) before the execution of the code block.");
        System.out.println("· Statement 2 defines the condition for executing the code block.");
        System.out.println("· Statement 3 is executed (every time) after the code block has been executed.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Print Numbers");
        System.out.println("");
        System.out.println("The example below will print the numbers 0 to 4:");
        System.out.println(" ");
        System.out.println("Example:");
        System.out.println(" ");
        System.out.println("for (int i = 0; i < 5; i++) {");
        System.out.println("    System.out.println(i);");
        System.out.println("}");
        System.out.println(" ");
        System.out.println("Example explained");
        System.out.println(" ");
        System.out.println("·Statement 1 sets a variable before the loop starts: int i = 0");
        System.out.println("·Statement 2 defines the condition for the loop to run: i < 5. If the condition is true,");
        System.out.println("             the loop will run again; if it is false, the loop ends.");
        System.out.println("·Statement 3 increases a value each time the code block has run: i++");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(
                "=========================================================================================================================");
        System.out.println("                                                    JAVA NESTED LOOPS");
        System.out.println(
                "=========================================================================================================================");
        System.out.println(" ");
        System.out.println("Nested loops");
        System.out.println(" ");
        System.out.println("- It is also possible to place a loop inside another loop. This is called a nested loop.");
        System.out.println(" ");
        System.out.println("The \"inner loop\" will be executed one time for each iteration of the \"outer loop\":");
        System.out.println(" ");
        System.out.println("Example: ");
        System.out.println(" ");
        System.out.println("// Outer loop");
        System.out.println("for (int i = 1; i <= 2; i++) {");
        System.out.println("    System.out.println(\"Outer: \" + i); // Executes 2 times");
        System.out.println(" ");
        System.out.println("    // Inner loop");
        System.out.println("     for (int j = 1; j <= 3; j++) {");
        System.out.println("         System.out.println(\" Inner: \" + j); // Executes 6 times (2 * 3)");
        System.out.println("    }");
        System.out.println("}");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Multiplication Table Example");
        System.out.println(" ");
        System.out.println("This example uses nested loops to print a simple multiplication table (1 to 3):");
        System.out.println(" ");
        System.out.println("Example:");
        System.out.println(" ");
        System.out.println("for (int i = 1; i <= 3; i++) {");
        System.out.println("    for (int j = 1; j <= 3; j++) {");
        System.out.println("        System.out.print(i * j + \" \");");
        System.out.println("    }");
        System.out.println("System.out.println();");
        System.out.println("}");
        System.out.println(" ");
        System.out.println("Output:");
        System.out.println(" ");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(
                "=========================================================================================================================");
        System.out.println("                                                   JAVA FOR EACH LOOP");
        System.out.println(
                "=========================================================================================================================");
        System.out.println(" ");
        System.out.println("The for-each Loop");
        System.out.println(" ");
        System.out.println(
                "- There is also a \"for-each\" loop, which is used exclusively to loop through elements in an array");
        System.out.println("(or other data structures):");
        System.out.println(" ");
        System.out.println("Syntax");
        System.out.println("     ");
        System.out.println("for (type variableName : arrayName) {");
        System.out.println("    // code block to be executed");
        System.out.println("}");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(
                "-The for-each loop is simpler and more readable than a regular for loop, since you don't need a counter (like i < array.length).");
        System.out.println(" ");
        System.out.println("The following example prints all elements in the cars array:");
        System.out.println(" ");
        System.out.println("Example:");
        System.out.println(" ");
        System.out.println("String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};");
        System.out.println(" ");
        System.out.println("for (String car : cars) {");
        System.out.println("    System.out.println(car);");
        System.out.println("}");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

    }

}
