package TheApp.LoginPage;

import java.io.BufferedReader;
//import java.util.Scanner;
import java.io.InputStreamReader;

class loginpage {

    // public static void main (String[] args) {
    //     try (Scanner input = new Scanner (System.in)) {
    //     System.out.println("Hello Welcome to J Bank");
        
    //     System.out.print("Email / Phone Number: ");
    //     String userID = input.nextLine();
    //     System.out.print("Password: ");
    //     String password = input.nextLine();
    //     }
    // }
    
    void loginui() throws Exception{
        System.out.println("Hello Welcome to J Bank");
        
            System.out.print("Email / Phone Number: ");
            BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            String userID = input.readLine();
            System.out.print("Password: ");
            String password = input.readLine(); 

            
            
            verifylogin verdetails = new verifylogin (userID, password);
            verdetails.details();
    }
        
            static void userdetails() throws Exception{
                System.out.println("            J BANK");
                System.out.println("            SIGN UP");
                
                BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
                System.out.print("Phone Number: ");
                String phonenumber = input.readLine();
                System.out.print("Email:");
                String email = input.readLine();
                System.out.print("First Name: ");
                String firstname = input.readLine();
                System.out.print("Last Name: ");
                String lastname = input.readLine();
                System.out.print("Date Of Birth: ");
                String DOB = input.readLine();
                System.out.print("BVN: ");
                String BVN = input.readLine();
                System.out.print("Any Valid ID showing Proof Of Address Given Above: ");
                String ValidID = input.readLine();
        
                System.out.println("/n");
        
                System.out.println("Set Password");
                String passSet = input.readLine();
            
                System.out.println("Thanks for Choosing Us");
                System.out.println("LOG IN");
                loginpage login = new loginpage ();
                login.loginui();
    
            
            }
            

    static class verifylogin {
        String userID;
        String password;
        String passSet;
        String email;

        verifylogin(String userID, String password) {
        this.userID = userID;
        this.password = password;
        }

        

        void details() throws Exception{

            while (!passSet.equals(password) || !email.equals(userID)){
                
                System.out.print("Email / Phone Number: ");
            BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            String userID = input.readLine();
            System.out.print("Password: ");
            String password = input.readLine();

            if (passSet.equals(password) && email.equals(userID)){
                useraccount dashboard = new useraccount ();
                dashboard.loggedin();
                break;
            }
            System.out.println("Wrong Email/Password");

            }

        }

    }
}
