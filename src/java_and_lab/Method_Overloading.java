
package java_and_lab;

public class Method_Overloading {

    
    static int addMethodInt(int x , int y){
        return x + y;
    }
    
    static double addMethodDouble(double x , double y){
        return x + y;
    }
    
    public static void main(String[] args) {
       int addInt = addMethodInt(10,20);
       double addDouble = addMethodDouble(10.1 ,10.2);
       System.out.println(addInt);
       System.out.println(addDouble);
    }
    
}
