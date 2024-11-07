import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class RandomNo {
    public static void main(String[] args) {
        //Apache commons
        String rand=RandomStringUtils.randomNumeric(5);
        System.out.println(rand);

        String rands=RandomStringUtils.randomAlphabetic(5);
        System.out.println(rands);

        //Random
        Random r=new Random();
        System.out.println(r.nextInt(100));
        System.out.println(r.nextDouble(100));

        //Math class
        System.out.println(Math.random());
        //Math.random() gives a double output means between (0 and 1)

          //but if u want in integer
        int r1 =(int) (Math.random()*100);
        System.out.println(r1);



    }
}
