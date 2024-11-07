import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //Approach 1-Using FileReader and BufferedReader
//
//        FileReader fr=new FileReader("C:\\Users\\Gayatri Satpute\\test.txt")  ;     //always add filename too
//        BufferedReader br=new BufferedReader(fr);                         //BufferedReader reads a big chunk of data at
//                                                                                //once and stores it in memory.
//
//        String str;
//        while ((str=br.readLine())!=null){                                  //readLine()) reads only one line isliye loop lagaya
//            System.out.println(str);
//        }
//        br.close();

       //Approach 2-Using Scanner and File

//        File f=new File("C:\\Users\\Gayatri Satpute\\test.txt");
//        Scanner sc=new Scanner(f);
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());               //sc.nextLine() gets the next line of text that the user types.
//        }

        //Approach 3-
        File f=new File("C:\\Users\\Gayatri Satpute\\test.txt");
        Scanner sc=new Scanner(f);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());    //next reads the file as a single token w/o worrying abt lines unlike sc.nextLine()



    }
}


//This sets the delimiter for the Scanner to \\Z, which means it will treat the entire file as a single token.
// The \\Z delimiter means the end of the file, so Scanner will read everything
// in the file as one single chunk (instead of line by line or word by word).
