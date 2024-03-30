import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static String getLowerAlpha(int n) {
        Random random = new Random();
        return random.ints(97, 122+1)
                .limit(n)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String genAlphaNumeric(int n) {
        Random random = new Random();
        return random.ints(48,122+1)
                .filter(i -> (i<=57 || i>=65) && (i<=90||i>=97))
                .limit(n)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Password Generator");
        System.out.println("Enter the required length of password: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pw = genAlphaNumeric(n);
        System.out.println(pw);
    }
}
