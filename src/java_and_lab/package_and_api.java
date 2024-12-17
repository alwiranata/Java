
package java_and_lab;

import java.util.*;

public class package_and_api {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username ;
        String password;
        
        System.out.print("Username = ");
        username = input.nextLine();
        
        System.out.print("Password = ");
        password = input.nextLine();
        
      if((password == null || password.trim().isEmpty()) && (username == null || username.trim().isEmpty())){
          System.out.println("Password and Username Wrong");
      }else{
          System.out.println("Login Success");
      }
    }
 }

    

