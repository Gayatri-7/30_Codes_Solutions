import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\Gayatri Satpute\\test123.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("hey hey hey\n");    // newline character (\n)
        bw.write("ha ha ha\n ");
        bw.write("la la la la ");

        System.out.println("Finished writing!"); //optional*

        bw.close();

    }
}

//instead of writing to a file every time you add a single character,
// BufferedWriter collects a chunk of characters in memory and writes them to the file all at once.
