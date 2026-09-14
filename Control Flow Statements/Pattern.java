import java.util.Scanner;
class Pattern {
    public static void main(String args[]){
        String ch;
        int h,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter height:");
        h=in.nextInt();
        System.out.print("Enter character: ");
        ch=in.next();
        for(i=0;i<h;i++){
            for(j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
