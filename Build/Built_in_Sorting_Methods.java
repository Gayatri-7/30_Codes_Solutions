
import java.util.Arrays;
import java.util.Collections;

public class Built_in_Sorting_Methods {
    public static void main(String[] args) {
        int a[]={1,4,2,5,6,4,6,7};
        //way-1
//        Arrays.parallelSort(a);
//        System.out.println("Array after sorting"+ Arrays.toString(a));

        //way-2
//        Arrays.sort(a);
//        System.out.println("Array after sorting"+ Arrays.toString(a));

        //way-3
        //first two only sort in ascending order ,for descending we have to :
        Integer arr[]={1,2,5,6,7,3,21,1,2};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array in descending "+ Arrays.toString(arr));

        //We use Integer[] array instead of int[] because Integer is an object that
        // can be used with collections (like Collections.reverseOrder()),
        // while int[] is a primitive array that does not support such features. collections do not work with primitives.



    }
}
