import java.util.Scanner;
public class PalindromeNo {
    public static void main(String[] args) {
        System.out.println("enter the number to check palindrome");
       Scanner sc=new Scanner(System.in);
       int orgnum=sc.nextInt();
       int temp=orgnum;
       int rev=0;
       while(orgnum!=0){
           rev=rev*10+orgnum%10;
           orgnum=orgnum/10;


       }
        System.out.println(rev);


        if(temp==rev){
            System.out.println("this is a palindorme");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
