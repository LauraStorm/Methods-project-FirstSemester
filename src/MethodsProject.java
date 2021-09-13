import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsProject {
    //METHODS:

    //TASK 1: Write a Java method to find the smallest number among three numbers.
    //The number should come from a user inputting 3 numbers

    public static double findSmallestNumber (double inputNumber1, double inputNumber2, double inputNumber3){
        double smallestNumber = Math.min(Math.min(inputNumber1, inputNumber2), inputNumber3);
        return smallestNumber;
    }

    //TASK 2:Write a method that as a parameter gets a number.
    // It should then print to the console if the number is negative, positive or zero.

    public static int findMathValuePositiveNegativeOrZero (int number){
        int inputNumber = number;
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0){
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither positive or negative number. It is zero");
        }
        return inputNumber; 
    }

    //TASK 3: Write a method to find the middle character of a string
    public static String findMiddleCharOfAString (String inputString){
        if (inputString.length() <= 2) {
            return inputString;
        }
        int indexOfStartString = (inputString.length() - 1) / 2;
        int indexOfEndString =indexOfStartString + 2 -(inputString.length() % 2);
        return inputString.substring(indexOfStartString,indexOfEndString);

    }

    //TASK 4: Write a java method to calculate the area of a triangle.
    // It should take 3 sides as parameter
    public static double findAreaOfATriagle (double sideA, double sideB, double sideC){
        double sumOfSide = (sideA + sideB + sideC) / 2;
        double areaOfATriangle = Math.sqrt(sumOfSide * (sumOfSide - sideA) * (sumOfSide - sideB) *  (sumOfSide-sideC));
        return areaOfATriangle;

    }

    //TASK 5: Write a Java method to check whether an entered string is a valid password.
    /*
    public static boolean validPassword (String inputPassword){
        String password = inputPassword;
        if ( password.length() < 8) return false;

    }

     */


    //TASK 6:
    public static int printNumbers (int inputMaximumNumber) {
        int printNumber = inputMaximumNumber;
        String firkantParantes = "";
        for (int i = 1; i <= printNumber; i++) {
            firkantParantes = "[" + i + "]" + firkantParantes ;

        }
        System.out.println(firkantParantes);
        return printNumber;

    }


    public static void main(String[] args) {
        //USING METHODS:

        //TASK 1:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task number 1: \n");
        //Get 3 inputs from user:
        System.out.println("Hey 👋🏽 - Let me help you find the smallest value among three numbers 🙏🏼 \nPlease type your first number:");
        double inputNumber1 = scanner.nextDouble();
        System.out.println("Please type your second number:");
        double inputNumber2 = scanner.nextDouble();
        System.out.println("Please type your third number:");
        double inputNumber3 = scanner.nextDouble();


        //Using the method
        double smallestNumber = findSmallestNumber(inputNumber1,inputNumber2,inputNumber3);
        String smallestNumberResult = "The smallest value you typed is " + smallestNumber;
        System.out.println(smallestNumberResult);


        //TASK 2:
        System.out.println("Task number 2: \n");
        System.out.println("Please type a random number");
        int inputNumber = scanner.nextInt();
        System.out.println(findMathValuePositiveNegativeOrZero(inputNumber));


        //TASK 3:
        System.out.println("Task number 3: \n");
        System.out.println("Please write a word:");
        String inputWord = scanner.next();

        String inputMiddleCharResult = "The middle character(s) in the word you wrote is " + "'" + findMiddleCharOfAString(inputWord)+"'";
        System.out.println(inputMiddleCharResult);


        //TASK 4:
        System.out.println("Task number 4: \n");

        //Input from user: 3 numbers:
        System.out.println("Lets calculate the area of a triangle");
        System.out.println("Please type the length of the first side of your triangle");
        double sideAInput = scanner.nextDouble();
        System.out.println("Please type the length of the second side of your triangle");
        double sideBInput = scanner.nextDouble();
        System.out.println("Please type the length of the third side of your triangle");
        double sideCInput = scanner.nextDouble();

        //Calculate the area
        String areaResult = "The area of the triangle is " +  findAreaOfATriagle(sideAInput, sideBInput, sideCInput);
        System.out.println(areaResult);

        //TASK 5:


        //TASK 6:
        System.out.println("Task number 6: \n");
        System.out.println("Please type a random number:");
        int userPrintNmuberInput = scanner.nextInt();

        System.out.println(printNumbers(userPrintNmuberInput));
        //DEN PRINTER BAGLÆNS PT


    }

}
