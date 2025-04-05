public class QuestionMark {
    public static void main(String[] args) {

        for (int fiveMarkQ = 0; fiveMarkQ <= 15; fiveMarkQ++) {
            int tenMarkQ = 15 - fiveMarkQ;
            int totalMark = (fiveMarkQ * 5) + (tenMarkQ * 10);
            if (totalMark == 100) {
                System.out.println("5 marks question is " + fiveMarkQ);
                System.out.println("10 marks question is " + tenMarkQ);
            }
        }
    }
}
