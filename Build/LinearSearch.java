public class LinearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7};
        int k=87;
        boolean flag=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k){
                System.out.println("Element found");
                flag=true;
                break;
            }

        }
        if(!flag){
            System.out.println("element does not exist");
        }
    }
}
