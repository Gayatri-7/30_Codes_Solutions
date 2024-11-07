public class SumOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }
        System.out.println(sum);

        //enhanced for loop
        int sum1=0;
        for(int value:a){
            sum1=sum1+value;
        }
        System.out.println(sum1);
    }
}
