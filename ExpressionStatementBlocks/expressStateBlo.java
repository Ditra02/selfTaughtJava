package ExpressionStatementBlocks;

public class expressStateBlo {
    public static void main(String[] args) {
        // ! Expression
        int score = 90; // it's an expression that return an int
        
        double a = 2.2, b = 3.4, result;
        result = a + b - 3.4; // it's also an expression
        
        if (a != b) // it's an expression which return boolean value
        {
            System.out.println("Number a is not equal to b");
        }
        
        // ! Statements
        score = 9 * 5;

        int number;

        // number = 10 it's an expression

        number = 10; // it's a Statements
        // the different in between those two are in the ';'

        // ! Java Block
        String band = "Beatles";

        if (band == "Beatles")  // start of block
        {
            System.out.print("Hey ");
            System.out.print("Jude!");
        }  // end of block

    }
}
