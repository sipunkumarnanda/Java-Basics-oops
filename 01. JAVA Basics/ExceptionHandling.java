public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // Error
        } catch (Exception e) {
            System.out.println("Something went wrong." + e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
