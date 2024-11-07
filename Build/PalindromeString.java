import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String rev="";

        int len=str.length();
        for (int i = len-1; i >=0 ; i--) {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)) {
            System.out.println("PALINDROME");
        }
        else{
                System.out.println("NOT PALINDROME");
            }
        }


    }

