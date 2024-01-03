// Operator
// Unary Operators Problem( "+ = plus operator(same sign of operand will be assigned to other operand)" , "-" ,
// "++ (increment operator of {Post and Pre})" , "--" ).

package Lecture2;

public class UnaryOperator {
    public static void main(String[] args) {
//        First Problem
        int x=5;
        int z=10;
        System.out.println("First Problem solution");
        int y = ++x - z++;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
//        Second Problem
        int m= ++x + --y + z--;
        System.out.println("Second Problem solution");
        System.out.println("m = "+m);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
//        System.out.println((x++)++);  X++ gives value but there should be a variable in place of x++

        //Increment and Decrement

    }
}


