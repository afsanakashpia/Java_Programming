import java.util.Random;

public class GenerateRandomPassword {
    public static String generate(int length) {
        String chars = "ABCDEEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"01234556789"+"!@#$%^&*()-_=+<>?";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();
    }

    public static void main(String[] args) {

        String result = generate(8);
        System.out.println(result);
    }

}

