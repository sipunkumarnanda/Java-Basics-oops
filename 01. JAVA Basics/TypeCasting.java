public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type casting");

        // Implicit (Widening): Small type to large type (e.g., int to double). This happens automatically by the compiler.
        int x = 123;
        double d = x;
        System.out.println(d);

        // Explicit (Narrowing): Large type to small type (e.g., double to int). This must be done manually by the programmer.
        double a = 10.123;
        int y = (int) a;
        System.out.println(y);


        // constant (final keyword)
        final int num = 10;
        // num += 15; // The final local variable num cannot be assigned
        System.out.println(num);

    }
}
