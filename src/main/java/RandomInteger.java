import java.util.Arrays;
import java.util.Random;
public class RandomInteger {
    public static void main(String[] args) {
        int[] integer = new int[10];
        Random random = new Random();
        for (int i = 0; i < integer.length; i++) {
            integer[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(integer));
        int min = integer[0], max = integer[1];
        for (int i = 0; i <integer.length; i++) {
            if (integer[i] > max) {
                max = integer[i];
            }

            if (integer[i] < min) {
                min = integer[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
