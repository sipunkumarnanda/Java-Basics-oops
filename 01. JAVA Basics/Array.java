import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Array");
        
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // print hash 
        System.out.println(arr); // [I@4617c264

        // print uisng string method 
        System.out.println(Arrays.toString(arr));

        // print using loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // array
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));




        // 2-d array
        int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}} ;

        // deepToString()
        System.out.println("print 2-d array using deepToString() method");
        System.out.println(Arrays.deepToString(arr2));



        System.out.println("Print 2-d array using loop");
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
