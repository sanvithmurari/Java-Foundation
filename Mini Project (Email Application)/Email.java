package emailApp;
import java.util.Scanner;
import java.util.Random;
class Email{
    String firstname;
    String lastname;
    String department;
    String mailid;
    private String password="";
    int capacity;
    String altEmail;

    Scanner sc =new Scanner(System.in);

    //Constructor to accept firstname, lastname and dept.
    Email(String fn, String ln, String dept){
        firstname=fn;
        lastname=ln;
        department=dept;
    }

    //generating email with given details
    public void generateEmail(){
        mailid=firstname+"."+lastname+"@"+department+".company.com";
        System.out.println("Generated EMail ID: "+mailid);
        randomPassword();
    }

    //generating intial password with random.
    private void randomPassword(){
        String chars="abcdefghijklmnopqrstuvwxyz123456789";
        Random random=new Random();
        for(int i=0;i<8;i++){
            int rand=random.nextInt(chars.length());
            password+=(chars.charAt(rand));
        }
        System.out.println("Random Password Generated: "+password);
    }

    //method for user to change password
    public void setPassword(){
        String newpw;
        System.out.println("Enter new password: ");
        newpw=sc.next();
        password=newpw;
        System.out.println("Password Changed Successfully to "+password);
    }

    //method to set capacity
    public void setMailboxCapacity(int c){
        capacity=c;
        System.out.println("Mail box Capacity set to: "+capacity);
    }

    //creating alternate email.
    public void setAltEmail(){
        String username;
        System.out.println("Enter username for alternate email: ");
        username=sc.next();
        altEmail=username+"@"+department+".company.com";
        System.out.println("Alternate Email Generated: "+ altEmail);
    }

    //displaying major details
    public void display(){
        System.out.println("Name: "+firstname+" "+lastname);
        System.out.println("Email: "+mailid);
        System.out.println("Mail Box Capacity: "+capacity);
    }
}