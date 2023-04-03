package operators;

public class operators {
    public static void main(String[] args) {
        // ! Arithmetic operator
        // declare variables
        int a = 12;
        float b = 5;

        // addition operator
        // System.out.println("a + b = " + (a + b));

        // Substraction operator
        // System.out.println("a - b = " + (a - b));

        // multiplication operator
        // System.out.println("a * b = " + (a * b));

        // division operator
        // System.out.println("a / b = " + (a / b));

        // modulo operator
        // System.out.println("a % b = " + (a % b));

        // ! assignment operator
        a = 5;
        int c = (int) b;
        a = c;

        // System.out.println(c);
        // System.out.println(a += c);
        // System.out.println(a -= c);
        // System.out.println(a *= c);
        // System.out.println(a /= c);
        // System.out.println(a %= c);
        // data conversion : https://www.codecademy.com/resources/docs/java/type-conversion
        
        // ! java relational operators
        boolean d = (3 == 5);
        d = (3 > 5);
        d = (3 < 5);
        d = (3 <= 5);
        d = (3 >= 5);
        d = (3 != 5);

        // System.out.println(d);
        
        // ! Logical operator
        // System.out.println((8 == 8) && (5 != 8));
        // System.out.println((7 != 8) || (5 == 8));
        // System.out.println(!(5 == 8));
        
        // ! Unary operator
        c++;
        // System.out.println(c);
        c--;
        // System.out.println(c);
        
        d = !(5 != 3);
        // System.out.println(d);
        
        // ! bitwise operator
        c = ~c;
        // System.out.println(c);
        
        // ! Ternary operator
        String g = (5 % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(g);

        
        



    }
}
