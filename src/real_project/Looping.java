
package real_project;

import java.util.Scanner;
public class Looping {
    public static void main ( String[] args){
        //for loop (untuk jumlah tetentu)
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah input :");
        int jumlahInput =input.nextInt();
        
        for( int i = 0; i< jumlahInput; i++){
            System.out.println("Hello :"+ i);
        }
        
        //While Loop
        Scanner input2  = new Scanner(System.in);
        System.out.print("Masukkan jumlah 1-5:");
        int i = input2.nextInt();
        while(i <= 5) {
            System.out.println("Hello Again" + i);
            i++;
        }
        
        //Do While Loop
        int tambah = 1;
        do {
            System.out.println("angka :" + tambah);
           tambah++;
        } while(tambah <= 5);
    } 
}
