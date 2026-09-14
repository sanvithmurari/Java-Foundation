import java.util.Scanner;

public class FirstRepeat {
    int[] a;
    int n;
    FirstRepeat() {
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

    int repeat(){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    return a[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FirstRepeat f=new FirstRepeat();
        System.out.println("First repeting element="+f.repeat());
    }
}
