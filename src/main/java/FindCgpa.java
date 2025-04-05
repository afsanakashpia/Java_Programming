import java.util.Scanner;
public class FindCgpa {
    public static int binarySearch(Double[] cgpa, double target) {
        int left = 0, right = cgpa.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == target) {
                return mid;
            }

            if (cgpa[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Double[] cgpa = {3.86, 3.75, 3.63, 3.6, 3.52, 3.5, 3.48, 3.43, 3.32, 3.3};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA: ");
        double inputCgpa = scanner.nextDouble();
        int result = binarySearch(cgpa, inputCgpa);
        if (result == -1) {
            System.out.println("CGPA " + inputCgpa + " is not found.");
        } else {
            System.out.println("CGPA " + inputCgpa + " is found ");
        }
    }

}
