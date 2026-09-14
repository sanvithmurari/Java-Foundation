import java.util.Scanner;
class LongestUniqueSubstring {
    void findLength(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1)
                    break;

                temp += ch;

                if (temp.length() > max)
                    max = temp.length();
            }
        }

        System.out.println("Length: " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        LongestUniqueSubstring lus = new LongestUniqueSubstring();
        lus.findLength(s);
    }
}