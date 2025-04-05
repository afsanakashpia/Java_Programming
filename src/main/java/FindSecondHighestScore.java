public class FindSecondHighestScore {
    public static void main(String[] args) {
        Double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest = cgpa[0];
        double SecondHighest = cgpa[0];
        for (int i = 1; i < cgpa.length; i++) {
            if (cgpa[i] > highest) {
                SecondHighest = highest;
                highest = cgpa[i];

            } else if (cgpa[i] > SecondHighest && cgpa[i] < highest) {
                SecondHighest = cgpa[i];

            }

        }
        System.out.println(SecondHighest);

    }
}
