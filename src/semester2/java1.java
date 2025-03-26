
package semester2;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args){
        
        var input = new Scanner(System.in);
        var  pengeluaran = new double[7];
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis" , "Jumat","Sabtu", "Minggu"};
        
        var totalPengeluaran = 0;
        
        for(var i = 0 ; i < 7;i++){
            System.out.print("Masukkan Pengelauran :" + hari[i] +" RP.");
            pengeluaran[i]= input.nextDouble();
            totalPengeluaran += pengeluaran[i] ;
        }
        
        System.out.println("\nRincian Pengeluaran Mingguan:");
        for (int i = 0; i < 7; i++) {
            System.out.println(hari[i] + ": Rp " + pengeluaran[i]);
        }

       System.out.println("\nTotal Pengeluaran dalam Seminggu: Rp " + totalPengeluaran);

        input.close(); // Menutup Scanner
        
       
    }
}
