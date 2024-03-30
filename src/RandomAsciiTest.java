import java.util.Random;

public class RandomAsciiTest {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<2; i++) {
            float value = random.nextFloat();
            float num = 97 + (value * (122-97+1));
            int ans = (int) num;
            System.out.println(ans);
        }
    }
}
