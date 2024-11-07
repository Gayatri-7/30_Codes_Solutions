public class RemoveJunk {
    public static void main(String[] args) {

        String str="#@$#@$#@ gayatri 6@@@6138362";
        String s = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
//^a-zA-Z0-9 here ^ is like negation known as caret symbol