
package java_and_lab;


public class Java_and_Lab {

    static int add(){
        int x = 10;
        int y = 20;
        int z = x + y;
        return z;
    }
    
    static void  main(){
        int result = add();
        System.out.println("Result = " + result);
    }
   
    public static void main(String[] args) {
        main();
        main();
        main();
    }
    
}
