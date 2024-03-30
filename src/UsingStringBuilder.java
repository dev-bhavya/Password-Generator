import java.util.Random;
import java.util.Scanner;

public class UsingStringBuilder {
    public static String lowerAlphaString(int pwlen) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(pwlen);
        for(int i=0; i<pwlen; i++) {
            int randomInt = 97 + (int) (random.nextFloat() * (122-97+1));
            stringBuilder.append((char) randomInt);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Password Generator");
        System.out.println("Enter the required length of password: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = lowerAlphaString(n);
        System.out.println(s);
    }
}
