import java.util.Scanner;
class Anagram {
    void isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = in.nextLine();
        Anagram anagram = new Anagram();
        anagram.isAnagram(s1, s2);
    }
}