import java.util.Scanner;
class SubarraySum {
    int[] a;
    int n;
    public SubarraySum() {
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
    
    void maxSum(){
        int maxSum=0;
        int current=0;
        for(int i=0;i<n;i++){                                                                                             
            current+=a[i];
            if(current<0){
                current=0;
            }
            if(current>maxSum){
                maxSum=current;
            }
        }
        System.out.println("Maximum subarray sum= "+maxSum);
    }

    public static void main(String[] args) {
        SubarraySum s=new SubarraySum();
        s.maxSum();
    }
}
