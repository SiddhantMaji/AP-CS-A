//Unit 1.3 - Expressions and Assignment Statements
//Date - December 17, 2022

package Unit1;

public class Three {
    public static void main(String[] args) {
        //A literal is the source code representation of a fixed value
        int n = 20; //20 is the literal
        System.out.println(n);

        //Arithmetic expressions include expressions of type int and double
        double product = 2 * 2.5 - 2; //Answer should be 3.0
        System.out.println(product);
        //Arithmetic operators include +, -, *, /, and %

        //Arithmetic expression with 2 ints will evaluate to int
        System.out.println(2 * 4);
        //Arithmetic expression with 2 doubles will evaluate to double
        System.out.println(2.0 * 4.0);

        //Dividing int by 0 will result in ArithmeticException error
        System.out.println(2 / 0);
    }
}