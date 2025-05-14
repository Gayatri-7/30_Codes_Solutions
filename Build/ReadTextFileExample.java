import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        // Approach 1: Using FileReader and BufferedReader
        /*
        FileReader fr = new FileReader("C:\\Users\\your_computer_name\\test.txt");  // Provide full path including filename
        BufferedReader br = new BufferedReader(fr);  // BufferedReader reads a large block of data into memory

        String str;
        while ((str = br.readLine()) != null) {  // readLine() reads one line at a time
            System.out.println(str);
        }
        br.close();
        */

        // Approach 2: Using Scanner with File object
        /*
        File f = new File("C:\\Users\\Your_username\\test.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());  // Reads the next line of text from the file
        }
        */

        // Approach 3: Reading the entire file as a single string using delimiter
        File f = new File("C:\\Users\\Your_username\\test.txt");
        Scanner sc = new Scanner(f);
        sc.useDelimiter("\\Z");  // Set the delimiter to the end of file marker
        System.out.println(sc.next());  // Reads the entire file content as a single token
        sc.close();
    }
}
