import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={4, 2, 4, 6, 7, 3, 1};
        System.out.println("Array before sorting"+ Arrays.toString(a));
        int n=a.length;

        for (int i = 0; i < n-1; i++) {              //as n-1 passes to completely in bubble sort  //for passess
            for (int j = 0; j < n-1; j++) {      //for inner iterations--for comparing you always need only n-1 passes
                // to compare 5 elements you need only 4 iterations so j also goes till n-1 only

                 if(a[j]>a[j+1]){

                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting Array"+ Arrays.toString(a));

    }
}

//for optimised version you run inner loop
// for(int j = 0; j < n-1-i ; j++) so that it doesn't compare the last elements (which are sorted in previous itr) again.
//infact use n-1-i only it makes much more sense