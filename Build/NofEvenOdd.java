public class NofEvenOdd {
    public static void main(String[] args) {
        int num=12345678;
        int evencnt=0;
        int oddcnt=0;
        String evendigits="";
        String odddigits="";

        if(num==0){
            evencnt=1;
        }
        while(num!=0){
            int rem=num%10;
            if(rem%2==0){
                evencnt++;
                evendigits= rem+" "+evendigits;

            }
            else{
                oddcnt++;
                odddigits= rem+" "+odddigits;

            }
            num=num/10;
        }
        System.out.println("no of even numbers "+ evencnt);
        System.out.println("no of odd numbers "+ oddcnt);
        System.out.println("even digits are "+evendigits);
        System.out.println("odd digits are "+ odddigits);
    }
}

////we can also use
//StringBuilder evendigits = new StringBuilder();
//
// evendigits.insert(0, rem + " ");
