import java.util.Scanner;

class StringCompression {

    String compress(String s) {
        String result = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result += s.charAt(i) + "" + count;
                count = 1;
            }
        }
        result += s.charAt(s.length() - 1) + "" + count;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        StringCompression obj = new StringCompression();
        System.out.println("Compressed string: " + obj.compress(s));
    }
}