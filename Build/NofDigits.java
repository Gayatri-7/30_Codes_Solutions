public class NofDigits {
    public static void main(String[] args) {
        int num=123;
        int cnt=0;

        while(num!=0){
            num=num/10;
            cnt++;

        }
        System.out.println("The number of digits "+ cnt);
    }
}
