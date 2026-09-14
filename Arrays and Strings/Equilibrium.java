import java.util.Scanner;
public class Equilibrium {
    int[] a;
    int n,eq;
    Equilibrium() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n=in.nextInt();
        a=new int[n];
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            this.a[i]=in.nextInt();
        }
        in.close();
    }

    void eqIndex(){
        eq=1;
        
        while(eq<n-1){
            int leftSum=0;
            int rightSum=0;
            for(int i=0;i<eq;i++){
                leftSum+=a[i];
            }
            for(int i=(eq+1);i<n;i++){
                rightSum+=a[i];
            }
            if(leftSum==rightSum){
                System.out.println("Equilibrium index= "+eq);
                break;
            }
            else{
                eq++;
            }
        }
    }

    public static void main(String[] args) {
        Equilibrium e=new Equilibrium();
        e.eqIndex();
    }
}
