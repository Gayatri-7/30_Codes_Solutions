import java.util.Scanner;
//program to reverse a string
public class ReverseString{
    public static void main(String[] args) {
        //using reverse method of Stringbuffer class
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

        //using String.charAt method
        String rev="";
        int len=str.length();

        for(int i=len-1;i>=0;i--){
         rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        //using tocharArray
        String reve="";
        char a[]=str.toCharArray();
        for (int i=len-1;i>=0;i--){
            reve=reve+a[i];
        }
        System.out.println(rev);
    }
}