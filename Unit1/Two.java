//Unit 1.2 - Variables and Data Types
//Date - December 11, 2022

package Unit1;

public class Two {
    public static void main(String[] args) {
        //Primitive Data Types - Double, Integer, and Boolean
        double d1;
        int i1;
        boolean b1;

        d1 = 2.5;
        i1 = 2;
        b1 = (i1 == 2);

        System.out.println(d1 + "\n" + i1 + "\n" + b1);

        //A type is a set of values and a set of operations on them
        String s2 = "wow";
        System.out.println(s2); //Prints value of s2
        System.out.println(s2.charAt(1)); //charAt (prints character at specified index)

        //Data types can be categorized as either primitive or reference
        //Each variable has associated memory
        //Memory of primitive type variable holds actual primitive value

        //Final keyword creates an immutable constant variable
        final int i2 = 4;
        //i2 = 5;
        //^^^ Returns an error: The final local variable i2 cannot be assigned. It must be blank and not using a compound assignment
        
    }
}