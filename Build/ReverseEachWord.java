public class ReverseEachWord {
    public static void main(String[] args) {

//        to reverse each word steps are:
//        1)split   2)reverse those split words    3)combine those together and print
        //way-1
//        String s="Java the world";
//        String[] words = s.split(" ");   // split gives array of strings
//
//        String reverseString="";
//
//        for (String w:words){
//            String reverseWord="";
//        for (int i =w.length()-1 ; i >=0 ; i--) {  //for each word w
//            reverseWord=reverseWord+w.charAt(i);
//
//        }
//        reverseString=reverseString+reverseWord+" ";
//    }
//        System.out.println(reverseString);



        //way-2

        String s="Java they world";
        String[] words= s.split(" ");   //    ("\\s") will alos work instead of (" ")

        String reverseword="";
        //StringBuilder use karke reverse
        for(String w:words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword=reverseword+sb.toString()+" ";

        }
        System.out.println(reverseword);
    }
}
