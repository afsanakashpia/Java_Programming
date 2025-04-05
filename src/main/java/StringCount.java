public class StringCount {
    public static void main(String[] args) {
        String mystr = "I am a SQA Engineer";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        int count_chars = 0, count_vowels = 0,count_consonants=0;
        String[] str = mystr.split(" ");
        char[] chars = mystr.toLowerCase().toCharArray();
        for (char c : chars) {
            if (characters.indexOf(c) != -1) {
                count_chars++;
            }
            if (vowels.indexOf(c) != -1) {
                count_vowels++;
            }
            if (consonants.indexOf(c) != -1) {
                count_consonants++;
            }
        }
        //count word length
        System.out.println("Words: " + str.length);
        System.out.println("Chars: " + count_chars);
        System.out.println("Vowel: " + count_vowels);
        System.out.println("Consonant: " + count_consonants);
    }
}



