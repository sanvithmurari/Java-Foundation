import java.util.Scanner;
public class Duplicate {
    int[] a;
    int n;
    Duplicate() {
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
    
    void remove(){
        int i=0;
        int j;
        for(j=i+1;j<n;j++){
            if(a[j]!=a[i]){
                i++;
                a[i]=a[j];
            }
        }

        System.out.println("Number of unique elements= "+(i+1));
    }

    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        d.remove();
    }

}
