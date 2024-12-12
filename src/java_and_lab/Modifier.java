 
package java_and_lab;

//abstrack

    abstract class person {
        public String fName = "Aldo";
        public String lName =  "Wiranata";
        public abstract  void study() ;
    }

    class Student  extends person{
        public int graduationYear = 2024;    
        public void study(){
            System.out.println("Studying all day long");
        }
    }

public class Modifier {
    
    //final
    int x =  10;
    final double PI = 3.14;
    
    //Static
    static void staticMethod(){
        System.out.println("Static Method");
    }
    

    public void publicMethod(){
        System.out.println("publicMethod");
    }
    
    
    
  
    
    public static void main(String[] args) {
        //Static
       staticMethod();
       
       Modifier objStatic = new Modifier();
       objStatic.publicMethod();
       //final
       Modifier objFinal = new Modifier();
       objFinal.x = 10;
       System.out.println(objFinal.x);
       
       //abstrack
       Student objAbstract = new Student();
       System.out.println(objAbstract.fName);
       System.out.println(objAbstract.lName);
       System.out.println(objAbstract.graduationYear);
       objAbstract.study();

               
    }
    
}
