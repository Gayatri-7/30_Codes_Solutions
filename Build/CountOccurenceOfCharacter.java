public class CountOccurenceOfCharacter {
    public static void main(String[] args) {
        String s="Java oops java program";
        int tot_count= s.length();
        int tot_count_afterremove = s.replaceAll("a","").length();
        int count=tot_count-tot_count_afterremove;
        System.out.println("total no of a are:"+ count);

    }
}
