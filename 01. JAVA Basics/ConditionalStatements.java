public class ConditionalStatements {
    public static void main(String[] args) {

        // If, Else If, Else
        int marks = 85;
        if (marks > 90) {
            System.out.println("A");
        } else if (marks > 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        // Switch

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
