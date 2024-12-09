
package java_and_lab;
import java.util.Scanner;

public class Method {
    
    static int number(int one){
        int x = 10;
        int y = one;
        int z = x + y;
        return z;
    }
    
    static int add(int two){
        int result = number(two);
        System.out.println("tambahkan = " + result);
        return 0;
    }
   
    static String name(String myName ){
        String name = myName;
        if(name != null){
           return name; 
        }else{
            return "Name Invailid";
        }
    }
    
    static int age(int myAge){
        int age = myAge;
        if(age >= 0){
            return age;
        }else{
          return 0;  
        }
    }
    
    static void addNameAge(String myName , int myAge){
        String name = name(myName);
        int age = age(myAge);
        System.out.println("My name = " + name + "and my old = " +age );
    }

        
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Your Name :");
        String username = scanner.nextLine();
        
        System.out.print("Enter Your Age :");
        int age = scanner.nextInt();
        
        addNameAge(username,age);
        
        
        scanner.close();
    }
    
}
