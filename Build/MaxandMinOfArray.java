public class MaxandMinOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,2};

        int max=a[0];

        for (int i = 0; i <a.length ; i++) {
           if(a[i]>max){
               max=a[i];

           }
        }
        System.out.println("The max number "+ max);

        int min=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("The minnimum number is "+ min);
    }
}
