
package semester2;

import java.util.Scanner;

class getProfile  {
    
    public void profile (int nim , String name){
        System.out.println("----- My ID -----");
        System.out.println("NIM Saya =" + nim );
        System.out.println("Nama Saya =" + name);
    }
    
}

public class project1 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        getProfile Profile = new getProfile();
        
        System.out.print("Masukkan NIM :");
        int  nim = input.nextInt();
        
        input .nextLine();
        
        System.out.print("Masukkan Nama :");
        String  nama =  input.nextLine();
        
        Profile.profile(nim ,nama);
        
        input.close();
        
        
    }
}
