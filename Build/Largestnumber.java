import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //> operator
        if(a>b && a>c){
            System.out.println("a is the greatest");
        }
        else if(b>a && b>c){
            System.out.println("b is the greatest");
        }
        else {
            System.out.println("c is the greatest");
        }

        //ternary operator
        int largest=a>b?a:b;
        int largest2= c>largest?c:largest;
        System.out.println("the largest number is "+ largest2);

        //combining expression
        int largest3=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("largest number "+largest3);











    }
}
