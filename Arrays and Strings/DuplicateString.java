import java.util.Scanner;
class DuplicateString {
    void findDuplicates(String s) {
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        System.out.println("Duplicate characters:");

        for (int i = 0; i < 256; i++) {
            if (count[i] > 1)
                System.out.println((char)i + " : " + count[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        DuplicateString ds = new DuplicateString();
        ds.findDuplicates(s);
    }
}