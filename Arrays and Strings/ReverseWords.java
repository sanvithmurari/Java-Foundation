import java.util.Scanner;
class ReverseWords {
    void reverseWords(String s) {
        String result = "";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > 0) {
                    result = word + " " + result;
                    word = "";
                }
            }
        }

        if (word.length() > 0)
            result = word + " " + result;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        ReverseWords rw = new ReverseWords();
        rw.reverseWords(s);
    }
}