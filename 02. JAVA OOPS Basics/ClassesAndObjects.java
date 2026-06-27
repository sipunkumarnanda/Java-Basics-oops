
import java.util.Scanner;

// Static method example
class Test {
    public static void printTest() {
        System.out.println("print test 1");
    }
}

// Non-static method example
class Test2 {
    public void printTest2() {
        System.out.println("Print test 2");
    }
}

// Class to store and assign age
class AssignAge {
    int age;
    // Method to assign a value to age
    public void assignAge(int num) {
        age = num;
    }
}

// class to find sum (Protected method)
class Sum{
    protected int summ(int x, int y){
        return x+y;
    }
}




// This is the main class of the program
public class ClassesAndObjects {

    // Private method that returns the sum of two integers
    private static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling the static method
        Test.printTest();

        // Calling the non-static method
        Test2 ts = new Test2();
        ts.printTest2();


        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Print the entered string
        System.out.println("This is the string: " + s);


        // Create an object of AssignAge and assign age
        AssignAge x = new AssignAge();
        x.assignAge(10);
        System.out.println("X age is: " + x.age); // 10


        // Create another object of AssignAge
        AssignAge y = new AssignAge();
        y.assignAge(15);
        System.out.println("Y age is: " + y.age); // 15

        
        // calling private object
        int result = sum(10, 20);
        System.out.println("Sum is : " + result);

        // calling protected summ
        Sum z = new Sum();
        int ans = z.summ(10, 20);
        System.out.println("summ is : "+ans);
    }
}