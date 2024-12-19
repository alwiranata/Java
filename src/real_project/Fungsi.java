
package real_project;

public class Fungsi {

    public static void greet(String name){
        System.out.println("Hello,"+ name + "!");
    }
    
    public static int add (int a , int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        greet("Aldo Wiranata");
        int sum = add(1,4);
        System.out.println(sum);
    }
    
}
