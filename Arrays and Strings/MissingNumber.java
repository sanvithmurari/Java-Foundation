import java.util.Scanner;
class MissingNumber{
    int[] a;
    int n;
    MissingNumber(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n=in.nextInt();
        a=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            this.a[i]=in.nextInt();
        }
        in.close();
    }

    int find(){
        for(int i=0;i<n;i++){
            if(this.a[i]!=i+1){
                return (i+1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MissingNumber m=new MissingNumber();
        System.out.println("Missing Number= "+m.find());
    }
}