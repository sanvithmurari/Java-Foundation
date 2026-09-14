import java.util.Scanner;
public class Rotatebyk {
    int[] a;
    int[] b;
    int n;
    int k;
    public Rotatebyk() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n=in.nextInt();
        a=new int[n];
        b=new int[n];
        System.out.print("Enter Sorted array: ");
        for(int i=0;i<n;i++){
            this.a[i]=in.nextInt();
        }
        System.out.print("Enter k ");
        k=in.nextInt();
        in.close();
    }
    void rotate(){
        for(int i=(n-1);i>=0;i--){
            b[((k+i)%n)]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Rotatebyk r=new Rotatebyk();
        r.rotate();
    }
}
