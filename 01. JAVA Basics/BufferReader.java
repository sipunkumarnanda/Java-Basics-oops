
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferReader {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello");

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.println("Name is: " + name);

        br.close();

        // File Reading

        BufferedReader br2 =
                new BufferedReader(
                        new FileReader("Notes/01. String_Constant_Pool.md"));

        String line;

        while ((line = br2.readLine()) != null) {
            System.out.println(line);
        }

        br2.close();
    }
}