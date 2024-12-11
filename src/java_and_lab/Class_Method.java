
package java_and_lab;

public class Class_Method {

    public void studentCollage(String Name){
       String name = Name;
       System.out.println("Name :" + name);
   }
    
    
    public void NIM(long NIM){
        long nim = NIM;
        System.out.println("Nim :" + nim);
    }
    
    public static void main(String[] args) {    
        Class_Method student = new Class_Method();
        student.studentCollage("Aldo Wiranata");
        student.NIM(2455201036L);
        
    }
    
}
