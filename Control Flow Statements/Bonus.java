import java.util.Scanner;
class Bonus {
    public double bonus;
    public double salary;
    public int service;
    
    Bonus(double sal,int ser){
        service=ser;
        salary=sal;
    }
    
    public void calculateBonus(){
        if(service>10){
            bonus=salary*0.1;
        }
        else if(service>=6 && service<=10){
            bonus=0.8*salary;
        }
        else if(service>=3 && service<=5){
            bonus=0.5*salary;
        }
        else{
            bonus=0;
        }
        System.out.println("Bonus= Rs. "+bonus);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int yrs;
        double sal;
        System.out.println("Enter years of service and salary: ");
        yrs=in.nextInt();
        sal=in.nextDouble();
        Bonus b=new Bonus(sal,yrs);
        b.calculateBonus();
        in.close();
    }

}
