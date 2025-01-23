package pakAqil;

//library
import javax.swing.JOptionPane;
import java.util.ArrayList;

//class user
class User{
    //2 variabel instance
    String email;
    String password;
    
    //konstruktor dengan parameter email dan string
    public User(String email , String password){
        this.email = email;
        this.password= password;
    }
}

public class RegisterAndLogin {
    static ArrayList<User> users = new ArrayList<>();
     
    public static void main (String[] args) {
     
        boolean running  = true;
        
        while (running){
    
          String[] options = {
            "Registrasi" ,
             "Login",
             "Kembali"
          };
          
          int choice =  JOptionPane.showOptionDialog(
                  null,
                  "Pilih action",
                  "menu",
                  JOptionPane.DEFAULT_OPTION,
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  options,
                  options[0]
          );
          
          switch(choice){
            case 0 :
                registrasi();
                break;
            case 1 :
                login();
                break;
            case 2: 
                running =false;
                break;
            default :
                break;
           };
        }
    }
    
    public static void registrasi () {
        String email = JOptionPane.showInputDialog("Masukkan Email :");
        String password = JOptionPane.showInputDialog("Masukkan Password :");
        users.add(new User(email, password));
        JOptionPane.showMessageDialog(null,"Registrasi Berhasil");
    }
    
    public static void login (){
        String email  = JOptionPane.showInputDialog(null,"Masukkan Email :");
        String password = JOptionPane.showInputDialog(null, "Masukkan password :");
        
        for(User user : users){
            if(user.email.equals(email) && user.password.equals(password)){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                HomePage();
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Login gagal");
            }
        }
    }
    
    public static void  HomePage(){
        boolean run  = true;
        
        while (run){
    
          String[] options = {
             "Kembali",
          };
          
          int choice =  JOptionPane.showOptionDialog(
                  null,
                  "Home Page",
                  "Dashboard",
                  JOptionPane.DEFAULT_OPTION,
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  options,
                  options[0]
          );
          
          switch(choice){
            case 0 :
                run = false;
            default :
                break;
           };
        }
    }
    
    
}
