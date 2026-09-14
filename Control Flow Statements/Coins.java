import java.util.Scanner;
public class Coins {
    public int num,rem;
    public int ten,five,two,one;
    public void calcCoins(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        ten=num/10;
        num=num%10;
        five=num/5;
        num=num%5;
        two=num/2;
        num=num%2;
        one=num;
        System.out.println("10= "+ten+"\n5="+five+"\n2="+two+"\n1="+one);
        in.close();
    }
    public static void main(String args[]){
        Coins c=new Coins();
        c.calcCoins();
    }
};
