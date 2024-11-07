public class CountTheWords {
    public static void main(String[] args) {
        String str="Welcome to java world hey ";

        int count=1;

        for (int i = 0; i <str.length()-1; i++) {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }

        }
        System.out.println("The no of words are: "+ count);
    }
}


// i <str.length()-1 because:
//You need to stop before the last character when checking pairs (because i + 1 should not go beyond the last character.)