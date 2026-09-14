import java.util.Scanner;

public class PosNeg {
    int[] a;
    int n;
    PosNeg() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n=in.nextInt();
        a=new int[n];
        System.out.print("Enter Sorted array: ");
        for(int i=0;i<n;i++){
            this.a[i]=in.nextInt();
        }
        in.close();
    }

    void alternate(){
        int pos[]=new int[n];
        int p=0,ne=0;
        int neg[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]>=0)
                pos[p++]=a[i];
            else
                neg[ne++]=a[i];
        }
        p=0;
        ne=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                a[i]=pos[p++];
            else
                a[i]=neg[ne++];
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        PosNeg pn=new PosNeg();
        pn.alternate();
    }
}
