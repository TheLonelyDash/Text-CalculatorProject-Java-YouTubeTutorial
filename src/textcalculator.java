import java.util.Scanner;

public class textcalculator {
    public static void main(String args[]){

        //Introduction to the program
        System.out.println("Welcome to The Lonely Dash text calculator - thanks for taking the time to see our little project.  We hope you enjoy working on it!\n");

        //Loop the questions until it's quitting time!
        boolean condition = true;
        while (condition == true){
            System.out.println("What would you like to do?\n" + "A. Add\n" + "B. Subtract\n" + "C. Divide\n" + "D. Multiply\n" + "E. Quit\n\n");
                System.out.println("Please choose an option: ");
                Scanner userInput = new Scanner(System.in);
                String choice = userInput.nextLine();

            //If the input choice was to quit, just change the condition to false.
            if (choice.equalsIgnoreCase("E")) {
                System.out.println("We are sorry to see you go!  Thank you for trying The Lonely Dash calculator!");
                condition = false;
            }
            //If the input is a valid choice move forward with the calculation questions.
            else if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D")){
                //Ask for the FIRST number
                System.out.println("What is the first number for you calculation?");
                Scanner input1 = new Scanner(System.in);
                double num1 = input1.nextDouble();
                //Ask for the SECOND number
                System.out.println("What is the second number for your calculation?");
                Scanner input2 = new Scanner(System.in);
                double num2 = input2.nextDouble();

                //If choice was addition, create an addition object
                if (choice.equalsIgnoreCase("A")) {
                    addition add = new addition(num1, num2);
                }
                //If the choice was subtraction, create a subtraction object
                else if (choice.equalsIgnoreCase("B")){
                    subtraction sub = new subtraction(num1, num2);
                }
                //If the choice was division, create a division object
                else if (choice.equalsIgnoreCase("C")){
                    division div = new division(num1, num2);
                }
                //If the choice was multiplication, create a multiplication object
                else {
                    multiplication mul = new multiplication(num1, num2);
                }
            }
            else {
                System.out.println("That's an invalid answer.  Please choose A, B, C, D, or E.\n");
            }
        }
        System.exit(0);
    }
}

//Create operator classes
class addition{
    addition(double x, double y){
        double answer = x + y;
        System.out.println(x + " + " + y + " = " + answer + "\n");
    }
}

class subtraction{
    subtraction(double x, double y){
        double answer = x - y;
        System.out.println(x + " - " + y + " = " + answer + "\n");
    }
}

class division{
    division(double x, double y){
        double answer = x / y;
        System.out.println(x + " / " + y + " = " + answer + "\n");
    }
}

class multiplication{
    multiplication(double x, double y){
        double answer = x * y;
        System.out.println(x + " * " + y + " = " + answer + "\n");
    }
}
