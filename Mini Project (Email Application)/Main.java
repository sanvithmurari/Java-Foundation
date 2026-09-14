package emailApp;
import emailApp.Email;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println("EMAIL CREATION APP\n");
        Scanner in=new Scanner(System.in);
        int ch;
        Email e=null;
        do{
            System.out.println("1. Create email for new employee");
            System.out.println("2. Change password");
            System.out.println("3. Set Mail box capacity");
            System.out.println("4. Create alternate email");
            System.out.println("5. Display Email Details");
            System.out.println("6. Exit\n");

            System.out.println("Enter the operation: ");
            ch=in.nextInt();
            System.out.print("\n");

            switch (ch){
                case 1:
                    String fn,ln,dept;
                    System.out.print("Enter firstname: ");
                    fn=in.next();
                    System.out.print("Enter lastname: ");
                    ln=in.next();
                    System.out.print("Enter Department [Sales, Development, Accounting]: ");
                    dept=in.next();
                    //creating object of email class
                    e= new Email(fn, ln, dept);
                    e.generateEmail();
                    System.out.println("\n");
                    break;
                case 2:
                    e.setPassword();
                    System.out.println("\n");
                    break;
                
                case 3:
                    int cap;
                    System.out.println("Enter capacity: ");
                    cap=in.nextInt();
                    e.setMailboxCapacity(cap);
                    System.out.println("\n");
                    break;
                
                case 4:
                    e.setAltEmail();
                    System.out.println("\n");
                    break;
                
                case 5:
                    e.display();
                    System.out.println("\n");
                    break;
        
                case 6:
                    System.out.println("Exiting...\n");
                    e.sc.close();
                    in.close();
                    System.out.println("\n");
                    break;
            }
        }while(ch!=6);
        in.close();
    }
}
