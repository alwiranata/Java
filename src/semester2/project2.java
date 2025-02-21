
package semester2;

import java.util.Scanner;

public class project2 {
    public static void main (String[] args ){
        
        Scanner input = new Scanner(System.in);
        validation2 validasi = new  validation2();
        
        System.out.print("Masukkan Nilai Mahasiswa : ");
        int nilai = input.nextInt();
        validasi.vNilai(nilai);
        
        input.close();
    }
}
