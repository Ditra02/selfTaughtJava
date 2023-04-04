package basicInputOutput;
import java.util.Scanner;

public class BasicInOu {
    public static void main(String[] args)
    {
        //! print and println
        System.out.println("1. println");
        System.out.println("2. println");
        
        // System.out.print("1. print ");
        // System.out.print("2. print");
        
        // ! printing variabel and literal
        double number = -10.6;

        // System.out.println(5);
        // System.out.println(number);
        
        // ! print concatenated string
        // System.out.println("I am " + "Awesome");
        // System.out.println("Number = " + number);

        // ! input
        // Create an object of scanner 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter An Integer: ");

        // take input from the user
        int num = input.nextInt();

        System.out.println("You entered : " + num);
        
        System.out.println("Enter A float = ");
        float num2 = input.nextFloat();
        
        System.out.println("You entered : " + num2);
        
        System.out.println("Enter a double : ");
        double num3 = input.nextDouble();

        System.out.println("You entered : " + num3);

        System.out.println();


        // closing the scanner object
        input.close();
        

    }
}
