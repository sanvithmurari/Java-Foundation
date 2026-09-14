
import java.util.Scanner;
class Sum {
    public int num,sum;
    public int sumofDigs(int n){
        int a=0;
        while(n>0){
            a+=n%10;
            n=n/10;
        }
        return a;
    }
    
    public void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        while(num>9){
            sum=sumofDigs(num);
            System.out.println(sum);
            num=sum;
        }
        in.close();
    }
    public static void main(String[] args) {
        Sum s=new Sum();
        s.sum();
    }
}
