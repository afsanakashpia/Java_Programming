import java.util.Scanner;
public class CheckBinary {
    public static boolean binary(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]!='0' && arr[i]!='1'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.next();
        boolean result = binary(inputNumber);
        System.out.println(result);
        sc.close();
    }
}

