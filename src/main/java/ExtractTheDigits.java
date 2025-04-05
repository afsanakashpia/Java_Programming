public class ExtractTheDigits {
    public static void main(String[] args) {
        String paragraph ="A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price";
        String[] numbers = paragraph.replaceAll("[^0-9]+", " ").trim().split(" ");
        int laptop= Integer.parseInt(numbers[1]);
        int mouse= Integer.parseInt(numbers[2]);
        int mouseQuantity = Integer.parseInt(numbers[3]);
        int discount = Integer.parseInt(numbers[4]);
        int total = laptop + (mouse * mouseQuantity);
        double discountAmount = total * (discount / 100.0);
        double finalAmount = total - discountAmount;
        System.out.println(" Total cost after giving 15% discount: "+finalAmount+" tk");
    }
}
