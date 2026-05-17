import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("While Loop");
        int x = 0;
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        // Do While Loop
        System.out.println("Do While Loop");
        int y = 0;
        do {
            System.out.println(y); // Runs at least once
            y++;
        } while (y < 5);


        // For Each loop
        System.out.println("foreach loop");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int num : arr){
            System.out.println(num);
        }
        sc.close();
    }
}