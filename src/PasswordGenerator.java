import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String genPassWord(int n, boolean hasUC, boolean hasLC, boolean hasNums, boolean hasChars) {
        Random random = new Random();

        return random.ints(33, 122+1)
                .filter(i -> (hasUC && i >= 65 && i <= 90) ||
                        (hasLC && i >= 97 && i <= 122) ||
                        (hasChars && i >= 33 && i <= 47) ||
                        (hasChars && i>=58 && i<=64) ||
                        (hasNums && i >= 48 && i <= 57))
                .limit(n)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
//special characters  - $,&,*,/,?,@ - boolean - 36,38,42,47,63,64
    public static void main(String[] args) {

        System.out.println("Welcome to Password Generator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want PW to have Uppercase letters? Y/N");
        boolean hasUC = sc.nextLine().equalsIgnoreCase("Y");

        System.out.println("Do you want PW to have lowercase letters? Y/N");
        boolean hasLC = sc.nextLine().equalsIgnoreCase("Y");

        System.out.println("Do you want PW to have Numbers(0..9)? Y/N");
        boolean hasNums = sc.nextLine().equalsIgnoreCase("Y");

        System.out.println("Do you want PW to have Characters(@$&..)? Y/N");
        boolean hasChars = sc.nextLine().equalsIgnoreCase("Y");


        if(!hasUC && !hasLC && !hasNums && !hasChars) {
            System.out.println("Password cannot be generated as you haven't selected any possible literal to make up password. Please start again.");
        }
        else {
            System.out.println("Please enter the length for your PW (recommended length is 8 to 16)");
            int n = sc.nextInt();
            sc.nextLine();
            String password = genPassWord(n, hasUC, hasLC, hasNums, hasChars);
            System.out.println(password);
        }


    }
}
