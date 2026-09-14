import java.util.Scanner;
class Calc{
    public static void main(String args[]){
        int a,b,ch;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4.DIVIDE\n5. EXIT");
            System.out.println("Enter your choice");
            ch=in.nextInt();
            if (ch==5){
                System.out.println("Exiting");
                break;
            }
            System.out.print("Enter the 2 numbers");
            a=in.nextInt();
            b=in.nextInt();
            switch (ch){
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
        in.close();

    }
};