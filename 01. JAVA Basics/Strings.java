public class Strings {
    public static void main(String[] args) {

        String name = "Sipun Kumar";
        System.out.println(name);

        System.out.println(name + " has " + "length " + name.length());

        System.out.println(name.charAt(10)); // r
        System.out.println(name.substring(0));
        System.out.println(name.substring(4));

        System.out.println(name.substring(1, 10)); // starts from index 1 and goes till index 9 (10 is excluded)

        // want sipun only
        System.out.println(name.substring(0, 5)); // sipun

        // String concatination
        String firstName = "Sipun";
        String lastName = "Nanda";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name : " + fullName);

        // In Java, Strings are immutable, meaning they cannot be modified.
        // If we change or reassign a String, a new String object is created.
        // This new object is stored at a different memory location.

        String s1 = "Sipun";
        s1 = "Sipun Kumar";

        System.out.println(s1);

        /*
         * What happens here:
         * - Initially, s1 refers to the String object "Sipun".
         * - When we reassign s1 to "Sipun Kumar", the original String is not modified.
         * -Instead, Java creates a new String object with the value "Sipun Kumar"
         * - at a different memory location, and s1 now refers to that new object.
         */

        String existingName = "Sipun";

        System.out.println("Before Reassign:");
        System.out.println("Value : " + existingName);
        System.out.println("HashCode : " + System.identityHashCode(existingName));

        existingName = "Sipun Kumar";

        System.out.println("\nAfter Reassign:");
        System.out.println("Value : " + existingName);
        System.out.println("HashCode : " + System.identityHashCode(existingName));

        // Important concept on String Immutable (String constant pool)
        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

        System.out.println("a memory address : " + System.identityHashCode(a));
        System.out.println("b memory address : " + System.identityHashCode(b));

        // ---------------------------- SCP (String constant pool)
        String x = "apple";
        String y = "apple";

        System.out.println(x == y);
        System.out.println(x.equals(y));

            System.out.println("a memory address : " + System.identityHashCode(x));
        System.out.println("b memory address : " + System.identityHashCode(y));

    }
}
