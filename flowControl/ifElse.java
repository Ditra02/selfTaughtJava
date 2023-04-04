package flowControl;

public class ifElse {
    public static void main(String[] args) {
        // int number = 0;

        // if (number > 0)
        // {
        // System.out.println("The number is positive");
        // }

        // else if (number == 0)
        // {
        // System.out.println("the number is 0");
        // }

        // else
        // {
        // System.out.println("The number is not positive");
        // }

        // System.out.println("Statement outside of block");

        // String language = "java";
        // if (language == "java")
        // {
        // System.out.println("Best Programming language");
        // }

        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }

            else {
                largest = n3;
            }
        }

        else {
            if (n2 >= n3) {
                largest = n2;
            }

            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}