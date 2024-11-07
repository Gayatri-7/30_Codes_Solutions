public class MissingNo {
    public static void main(String[] args) {
        //Array should be sorted and no duplicates and values should be in a range
        int arr[]={1,2,3,4,5,7,8,9};
        int sum=0;
        int sum2=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        for (int i = 1; i <= 9 ; i++) {
            sum2=sum2+i;

        }
        int missing_no= sum2-sum;
        System.out.println("The missing number is: " + missing_no);
    }
}
