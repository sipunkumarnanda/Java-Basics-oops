public class Operators {
    public static void main(String[] args) {

        int num1 = 20, num2 = 10;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        int addition = num1 + num2;
        int subtract = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);



        // Unary Operators - Operators that require only one operand
        System.out.println("Unary Operators");

        // ++ (Increment): Increases a value by 1.
        System.out.println(num1++); // first assign then increment
        System.out.println(++num1); // first increment then assign

        // -- (Decrement): Decreases a value by 1.
        System.out.println(num1--);

        // ! (Logical NOT): Inverts the boolean value.
        System.out.println(!true);

        // Ternary Opeartor
        String result = num1 > num2 ? "num1 is greater then num2" : "num2 is greater than num1";
        System.out.println(result);



        // Relational Operators - Used to compare two values. They return a boolean -
        // result (true or false).
        System.out.println("Relational Operators");

        // == (Equal to): Checks if two values are equal.
        System.out.println(num1 == num2);

        // != (Not equal to): Checks if two values are not equal.
        System.out.println(num1 != num2);

        // > (Greater than): Checks if the left value is greater than the right.
        System.out.println(num1 > num2);

        // < (Less than): Checks if the left value is less than the right.
        System.out.println(num1 < num2);

        // >= (Greater than or equal to): Checks if the left value is greater than or
        // equal to the right.
        System.out.println(num1 >= num2);

        // <= (Less than or equal to): Checks if the left value is less than or equal to
        // the right.
        System.out.println(num1 <= num2);

        // Logical Operators - Used to determine the logic between variables or values
        System.out.println("Logical Opeartor");

        // && (Logical AND): Returns true if both statements are true
        System.out.println(num1 > num2 && num1 == num2);

        // || (Logical OR): Returns true if at least one of the statements is true.
        System.out.println(num1 > num2 || num1 == num2);
        System.out.println(num1 < num2 || num1 == num2);




        // Assignment Operators - Used to assign values to variables.
        System.out.println("Assignment Opeartor");

        // = (Assignment): Assigns the value on the right to the variable on the left.
        num1 = 50;
        System.out.println(num1); // 50

        // += (Add and Assign): Adds a value to the variable and assigns the result.
        num2 += 10;
        System.out.println(num2); // 20

        // -= (Subtract and Assign): Subtracts a value from the variable and assigns the
        // result.
        num1 -= 10;
        System.out.println(num1); // 40

        // *= (Multiply and Assign): Multiplies the variable by a value and assigns the
        // result.
        num2 *= 2;
        System.out.println(num2); // 40

        // /= (Divide and Assign): Divides the variable by a value and assigns the
        // result.
        num1 /= 2;
        System.out.println(num1); // 20

        // %= (Modulo and Assign): Assigns the remainder of the division to the
        // variable.
        num2 %= 2;
        System.out.println(num2); // 0

    }
}
