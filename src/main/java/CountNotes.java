import java.util.Scanner;
public class CountNotes {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount");
        int inputAmount = sc.nextInt();
        for (int i = 0; i < notes.length; i++) {
            int count = inputAmount / notes[i];
            inputAmount = inputAmount % notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " " + count);
            }
        }
    }
}
