public class Swapnumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //using temp variable
//       int t=a;
//       a=b;
//       b=t;
//        System.out.println("After swapping values of a and b are: "+ "a="+ a+ " b="+b);

       //using + -
//        a=a+b;
//        b=a-b;
//        a=a-b;

        //using * /
//        a=a*b;
//        b=a/b;
//        a=a/b;
//
        //using ^ operator
//        a=a^b;
//        b=a^b;
//        a=a^b;

        //using single expression
        b=a+b-(a=b);


        System.out.println("After swapping values of a and b are: "+ "a="+ a+ " b="+b);
    }
}
