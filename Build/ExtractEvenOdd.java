import java.util.Scanner;

public class ExtractEvenOdd {
    public static void main(String[] args) {
        System.out.println("enter the size of the array ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        //array
        int a[]=new int[n];

        //input in array
        System.out.println("Enter elements:");
        for (int i = 0; i <n ; i++) {
            a[i] =sc.nextInt();

        }
        //output the array (optional )
        System.out.print("so your array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println();
        //actual prog
        System.out.println("Even elements in the array are");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");

            }
        }
        System.out.println();

        System.out.println("Odd elements in the array are");
            for (int i = 0; i < n; i++) {
                if(a[i]%2!=0){
                    System.out.print(a[i]+" ");

                }

        }
    }
}
//enhanced for loop
//System.out.println("Even elements in the array are");
//        for (int value:a) {
//        if (value % 2 == 0) {
//        System.out.print(value + " ");
//
//            }
//                    }
//                    System.out.println();
//
//        System.out.println("Odd elements in the array are");
//            for (int value:a) {
//        if(value%2!=0){
//        System.out.print(value+" ");
//
//                }
