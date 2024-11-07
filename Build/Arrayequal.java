import java.util.Arrays;

public class Arrayequal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]={1,2,3,4,5};

        //Approach-1 Arrays.equals--import java.util.Arrays
//        boolean status= Arrays.equals(arr,arr2);
//        if(status==true){
//            System.out.println("The arrays are equal");
//
//        }
//        else{
//            System.out.println("they are NOt equal");
//        }
        //Approach-2 for loop
        boolean status=true;
        if(arr.length==arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    status = false;

                }
            }
        }
        else{
            status=false;

            }
        if(status==true){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }


    }
}
