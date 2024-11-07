
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
//        String arr[]={"Java","blue","go","Python"};
//        //Approach-1
//        boolean flag=false;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    System.out.println("DUPLICATE FOUND");
//                    flag = true;
//                      break;
//                }
//
//            }
//        }
//            if(flag==false){    //can also be written as if(!flag)
//                System.out.println("NO DUPLICATES");
//            }

            //Approach-2// using hashset
        String arr[]={"Java","blue","go","Python","Java"};
        HashSet<String> langs=new HashSet<>();

        boolean flag=false;
        for(String l:arr){
            if(langs.add(l)==false){
                System.out.println("DUPLICATE");
                flag=true;
                break;
            }
        }
        if(!flag){  //can also be written as if(flag==false)
            System.out.println("NO DUPLICATES");
        }



        }
    }

