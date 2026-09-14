import java.util.Scanner;
class StringToInteger {
    int num = 0;
    int sign = 1;
    void convert(String s) {
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }
        while (i < s.length()) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
            i++;
        }
        System.out.println(num * sign);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        StringToInteger sti = new StringToInteger();
        sti.convert(s);
    }
}