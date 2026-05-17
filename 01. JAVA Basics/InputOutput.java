import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double num1 = sc.nextDouble();
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = sc.nextLine();
        System.out.println("number is : " +num);
        System.out.println("Float number is : " + num1);
        System.out.println("first name : " + firstName);
        System.out.println("last name : " + lastName);
        System.out.println("Full name : " + fullName);
        sc.close();

        // Printing command-line arguments
        System.out.println(args[0] +", "+ args[1]);
    }
}
