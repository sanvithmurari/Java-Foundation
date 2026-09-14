import java.util.Scanner;
class PairsSum{
    int[] a;
    int n;
    int k,count;
    PairsSum() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n=in.nextInt();
        a=new int[n];
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            this.a[i]=in.nextInt();
        }
        System.out.print("Enter sum: ");
        k=in.nextInt();
        in.close();
    }

    void pairs(){
        for (int i=0;i<n-1;i++){
            if(a[i]+a[i+1]==k)
                count++;
        }
        System.out.println("Number of pairs with sum= "+count);
    }

    public static void main(String[] args) {
        PairsSum p=new PairsSum();
        p.pairs();
    }
}