
package pakAqil;

import java.util.Scanner;
public class latihan6 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mauskkan Nilai = ");
        int nilai = input.nextInt();
        
        if(nilai > 85){
            System.out.println("Grade A");
        }
        else if(nilai >= 70){
            System.out.println("Grade B");
        }
        else if(nilai >= 55){
            System.out.println("Grade C");
        }
        else if(nilai >= 40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade E");
        }
    }
}
