import java.util.Scanner;

public class RemoveVowels {
    public static String remove(String input) {
        char[] arr = input.toLowerCase().toCharArray();
        String vowels = "aeiou";
        String rem = "";
        for (char c : arr) {
            if (vowels.indexOf(c) == -1) {
                rem += c;
            }

        }
        return rem;
    }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("input");
                String myString = sc.nextLine();
                String result=remove(myString);
                System.out.println(result);
    }
}
