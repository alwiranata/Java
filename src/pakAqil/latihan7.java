
package pakAqil;


public class latihan7 {
    public static void main(String[] args){
        for( int i = 0; i < 5; i++ ){
            System.out.println("Iterasi ke" +  i);
        }
        
        int j = 0;
        while (j < 5){
            System.out.println("Iterasi ke" + j);
            j++;
        }
        
        int k = 0;
        do {
            System.out.println("Iterasi ke =" + k);
            k++;
        }while (k < 5);
        
        
        
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int b = 1; b <= i; b++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
        
    }
}
