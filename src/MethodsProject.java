import java.util.Scanner;
import java.util.regex.Pattern;

public class MethodsProject {
    //***METHODS***//

    //TASK 1//
    // Write a Java method to find the smallest number among three numbers
    //The number should come from a user inputting 3 numbers
    public static double findSmallestNumber (double inputNumber1, double inputNumber2, double inputNumber3){
        double smallestNumber = Math.min(Math.min(inputNumber1, inputNumber2), inputNumber3);
        return smallestNumber;
    }

    //TASK 2//
    // Write a method that as a parameter gets a number
    //It should then print to the console if the number is negative, positive or zero
    public static int findMathValuePositiveNegativeOrZero (int number){
        int inputNumber = number;
        if (number > 0) {
            System.out.println(number + " is a positive number đđŧ");
        } else if (number < 0){
            System.out.println(number + " is a negative number đđŧ");
        } else {
            System.out.println(number + " is neither positive or negative number. - It is zero đ");
        }
        return inputNumber; 
    }

    //TASK 3//
    // Write a method to find the middle character of a string
    public static char findMiddleCharOfAString (String inputString){
        int wordLength = inputString.length() - 1;
        int middleCharIndex = wordLength / 2;
        char middleCharResult = inputString.charAt(middleCharIndex);
        return middleCharResult;
    }
    //This is another method to find middle char. This one will take 2 char in the middle of a string IF there is not 1 char in the middle (lige tal har ikke ÃŠn middle char)
    /*
    public static String findMiddleCharFromAString (String inputString){
        if (inputString.length() <= 2) {
            return inputString;
        }
        int indexOfStartString = (inputString.length() - 1) / 2;
        int indexOfEndString =indexOfStartString + 2 -(inputString.length() % 2);
        return inputString.substring(indexOfStartString,indexOfEndString);

    }

     */


    //TASK 4//
    // Write a java method to calculate the area of a triangle
    // It should take 3 sides as parameter
    public static double findAreaOfATriangle (double sideA, double sideB, double sideC){
        double sumOfSide = (sideA + sideB + sideC) / 2;
        double areaOfATriangle = Math.sqrt(sumOfSide * (sumOfSide - sideA) * (sumOfSide - sideB) *  (sumOfSide-sideC));
        return areaOfATriangle;
    }


    //TASK 5//
    // Write a Java method to check whether an entered string is a valid password
    //Requirements:
    //1. A password must have at least eight characters
    //2. A password must consists of only letters and digits
    //3. It cannot contain the string "secret"
    //4. The first character must not be a dash (-)
    public static boolean isPasswordValid (String inputPassword){
        String password = inputPassword;
        if ( password.length() < 8){
            System.out.println("Your password is not Valid đ");
            return false;
        }
        String regex = "[^a-zA-Z0-9]";
        if (Pattern.compile(regex).matcher(password).find()){
            System.out.println("Your password is not Valid đ");
            return false;
        }
        if (password.contains("secret")){
            System.out.println("Your password is not Valid đ");
            return false;
        }
        System.out.println("YAAAY - Your password is Valid đ đĨŗ");
        return true;
    }


    //TASK 6//
    // Lav en metode ved navn printNumbers som tager et naturligt tal, maximum, som argument og skriver tallene
    // fra 1 til og med maximum i firkantede paranteser
    public static int printNumbers (int inputMaximumNumber) {
        int printNumber = inputMaximumNumber;
        String firkantParantes = "";
        for (int i = 1; i <= printNumber; i++) {
            firkantParantes = firkantParantes + "[" + i + "]";
        }
        System.out.println(firkantParantes);
        return printNumber;
    }


    //USING METHODS in practice//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TASK 1//
        System.out.println("Task number 1: \n");

        //Get 3 inputs from user
        System.out.println("Hey đđŊ - Let me help you find the smallest value among three numbers đđŧ \nPlease type your first number:");
        double inputNumber1 = scanner.nextDouble();
        System.out.println("Please type your second number:");
        double inputNumber2 = scanner.nextDouble();
        System.out.println("Please type your third number:");
        double inputNumber3 = scanner.nextDouble();

        //Using the method
        double smallestNumber = findSmallestNumber(inputNumber1,inputNumber2,inputNumber3);
        String smallestNumberResult = smallestNumber + " is the smallest value đ¤";
        System.out.println(smallestNumberResult);


        //TASK 2//
        System.out.println("Task number 2: \n");

        //Input from User
        System.out.println("Please type a random number:");
        int inputNumber = scanner.nextInt();

        //Using the method
        int resultOfInputNumber = findMathValuePositiveNegativeOrZero(inputNumber);
        System.out.println(resultOfInputNumber);


        //TASK 3//
        System.out.println("Task number 3: \n");

        //Input from User
        System.out.println("Please write a word:");
        String inputWord = scanner.next();

        //Using the method
        String inputMiddleCharResult = "'" + findMiddleCharOfAString(inputWord)+"'" + " is the middle character in the word đ"  ;
        System.out.println(inputMiddleCharResult);


        //TASK 4//
        System.out.println("Task number 4: \n");

        //Input from user
        System.out.println("Lets calculate the area of a triangle  â¤ ");

        System.out.println("Please type the length of the first side of your triangle:");
        double sideAInput = scanner.nextDouble();
        System.out.println("Please type the length of the second side of your triangle:");
        double sideBInput = scanner.nextDouble();
        System.out.println("Please type the length of the third side of your triangle:");
        double sideCInput = scanner.nextDouble();

        //Using the method:
        String areaResult = "The area of the   â¤  is " +  findAreaOfATriangle(sideAInput, sideBInput, sideCInput) + "đđŧ";
        System.out.println(areaResult);


        //TASK 5//
        System.out.println("Task number 5: \n");

        //Requirements info
        System.out.println("Lets check if your password is valid đ  \nHere are the requirements:");
        System.out.println("1. A password must have at least eight characters");
        System.out.println("2. A password must consists of only letters and digits");
        System.out.println("3. It cannot contain the string \"secret\"");
        System.out.println("4. The first character must not be a dash (-)");

        //Input from user
        System.out.println("\nWrite your password:");
        String userPasswordInput = scanner.next();

        //Using the method
        System.out.println(isPasswordValid(userPasswordInput));


        //TASK 6//
        System.out.println("Task number 6: \n");

        //Input from user
        System.out.println("Please type a random number:");
        int userPrintInput = scanner.nextInt();

        //Using the method
        System.out.println(printNumbers(userPrintInput));

    }

}
