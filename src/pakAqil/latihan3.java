
package pakAqil;

import java.util.Scanner;


public class latihan3 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama :");
        String nama = scanner.nextLine();
        
        System.out.print("masukkan Usia anda :");
        int usia = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("masukkan Alamat anda :");
        String alamat = scanner.nextLine();
        
        System.out.print("masukkan Jenis Kelamin anda (L/P) :");
        char jenisKelamin = scanner.next().charAt(0);
        
        System.out.println("\n=== Data diri anda === ");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis kelamin : " + (jenisKelamin == 'L' ? "Laki-Laki" : "Perempuan"));





    }
}
