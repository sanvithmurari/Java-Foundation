import java.util.Scanner;
class Student {
    public int marks1, marks2, marks3;
    public int avg;
    public void getData(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects: ");
        marks1=in.nextInt();
        marks2=in.nextInt();
        marks3=in.nextInt();
        in.close();
    }
    public void Grade(){
        avg=(marks1+marks2+marks3)/3;
        if(marks1>35 && marks2>35 && marks3>35){
            if(avg>75){
                System.out.println("Distinction");
            }
            else{
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.getData();
        s1.Grade();
        
    }
}

