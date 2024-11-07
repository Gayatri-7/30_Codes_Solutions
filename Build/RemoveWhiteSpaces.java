public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str=" Java     Programming with   me  and      me";

        String s=str.replaceAll("\\s","");
        System.out.println(s);

    }
}

//to remove the need of variable s
//        str=str.replaceAll("\\s","");
//        System.out.println(str);




