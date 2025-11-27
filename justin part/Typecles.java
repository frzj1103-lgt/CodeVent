public class Typecles {
    public static void main(String[] args) {
        

        System.out.println("============================================================================================================================");
        System.out.println("                                                 JAVA TYPECASTING");
        System.out.println("============================================================================================================================");
        System.out.println("");
        System.out.println("Type casting means converting one data type into another. For example, turning an int into a double.");
        System.out.println("");
        System.out.println("In Java, there are two main types of casting:");
        System.out.println("");
        System.out.println("Widening Casting (automatic) - converting a smaller type to a larger type size");
        System.out.println("byte -> short -> char -> int -> long -> float -> double");
        System.out.println("");
        System.out.println("Narrowing Casting (manual) - converting a larger type to a smaller type size");
        System.out.println("double -> float -> long -> int -> char -> short -> byte");
        System.out.println("");
        System.out.println("");
        System.out.println("Widening Casting");
        System.out.println("");
        System.out.println("Widening casting is done automatically when passing a smaller size type into a larger size type.");
        System.out.println("");
        System.out.println("This works because there is no risk of losing information. For example, an int value can safely fit inside a double:");
        System.out.println("");
        System.out.println("");
        System.out.println("Example");
        System.out.println("");
        System.out.println("int myInt = 9;");
        System.out.println("double myDouble = myInt; // Automatic casting: int to double");
        System.out.println("");
        System.out.println("System.out.println(myInt);    // Outputs 9");
        System.out.println("System.out.println(myDouble); // Outputs 9.0");
        System.out.println("");
        System.out.println("");
        System.out.println("Narrowing Casting");
        System.out.println("Narrowing casting must be done manually by placing the type in parentheses () in front of the value.");
        System.out.println("This is required because narrowing may result in data loss");
        System.out.println("(for example, dropping decimals when converting a double to an int):");
        System.out.println("");
        System.out.println("");
        System.out.println("Example");
        System.out.println("");
        System.out.println("double myDouble = 9.78d;");
        System.out.println("int myInt = (int) myDouble; // Manual casting: double to int");
        System.out.println("");
        System.out.println("System.out.println(myDouble); // Outputs 9.78");
        System.out.println("System.out.println(myInt);    // Outputs 9");
        System.out.println("");
        System.out.println("");
        System.out.println("Real-Life Example");
        System.out.println("");
        System.out.println("Here is a real-life example of type casting. We calculate the percentage of a user's");
        System.out.println(" score in relation to the maximum score in a game.");
        System.out.println("");
        System.out.println("We use type casting to make sure that the result is a floating-point value, rather than an integer:");
        System.out.println("");
        System.out.println("");
        System.out.println("Example");
        System.out.println("");
        System.out.println("// Set the maximum possible score in the game to 500");
        System.out.println("int maxScore = 500;");
        System.out.println("");
        System.out.println("// The actual score of the user");
        System.out.println("int userScore = 423;");
        System.out.println("");
        System.out.println("/* Calculate the percentage of the user's score in relation to the maximum available score.\r\n" + //
                        "Convert userScore to double to make sure that the division is accurate */");
        System.out.println("double percentage = (double) userScore / maxScore * 100.0d;");
        System.out.println("");
        System.out.println("System.out.println(\"User's percentage is \" + percentage);");
        System.out.println("");
        System.out.println("");
      
    }
    
}
