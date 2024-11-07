public class BinarySearch {
    public static void main(String[] args) {
        //Condition:Aray should be in a sorted order
        int a[]={1,2,3,4,6,7,8};
        int l=0;  //we want indices and not values of l and h , so that we can find mid
        int h=a.length-1;
        int key=40;
        boolean flag=false;

        while(l<=h){
            int mid=(l+h)/2;
            if(key==a[mid]){
                System.out.println("Element found");
                flag=true;
                break;
            }
            if(key>a[mid]){
                l=mid+1;
            }
            if(key<a[mid]){
                h=mid-1;
            }
        }
        if(!flag){
            System.out.println("The element is not there");
        }
    }
}


/*
  Time Complexity Summary:

  Linear Search:
    - Best Case: O(1)  (Element found at the first position)
    - Worst Case: O(n)  (Element not present or is at the last position)
    - Average Case: O(n)  (Element found somewhere in the middle)

  Binary Search:
    - Best Case: O(1)  (Element found at the middle position in the first comparison)
    - Worst Case: O(log n)  (Search space is halved each time)
    - Average Case: O(log n)  (On average, requires log n comparisons)
*/

