import java.util.Arrays;
public class CgpaSorting {
    public static void main(String[] args) {
        Double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for (int i = 0; i <= cgpa.length-1; i++) {
            for (int j = i + 1; j <= cgpa.length-1; j++) {
                if (cgpa[i] < cgpa[j]) {
                    Double tmp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(cgpa));
    }
}
