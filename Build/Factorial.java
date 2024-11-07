public class Factorial {
    public static void main(String[] args) {
        int num=5;
        long fac=1;

        // for increment
        for (int i = 1; i <=num ; i++) {
         fac = fac*i;
        }
        System.out.println("Factorial of the num is "+ fac);

        //for decrement
        long fac1=1;
        for (int i = num; i>=1 ; i--) {
        fac1=fac1*i;
        }
        System.out.println("Factorial of the num is "+ fac1);
    }
}
