public class PrimeNo {
    public static void main(String[] args) {
        int num=29;
        int count=0;
        if(num<=1){
            System.out.println("NOT PRIME");
        }
        for (int i = 1; i <=num ; i++) {
            if (num % i == 0) {
                count++;
            }
        }
         if(count==2){
             System.out.println("PRIME");
         }
         else{
             System.out.println("NOT PRIME");
         }

    }
}


//optimised...
// for(int i=2;i*i<=num;i++){
//        if(num%i==0){
//         count++;
//        break;//no more search
//        }
//
//        }
//        if(count==0){
//        System.out.print("prime");
//               }
//        else{
//                System.out.print("not prime");
//             }