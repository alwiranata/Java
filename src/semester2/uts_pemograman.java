
package semester2;

import java.util.Scanner;

public class uts_pemograman {
    public static void main(String[] args){
        
       var input = new  Scanner(System.in);
       
       System.out.print("Input Jam Kerja / minggu :");
        var jamKerja= input.nextInt();
        
        System.out.print("Input jumlah Proyek :");
        var  proyek= input.nextInt();
        
        System.out.print("Input Kepuasan Pelanggan 1-100%: " );
        var kepuasan= input.nextInt();
        
        
        
        if(jamKerja > 40  && proyek  >= 3 && kepuasan> 85){
            System.out.println("Status : Sangat Baik");
        }
        
        else if(jamKerja >=35  && proyek >= 2  && kepuasan >= 75){
          System.out.println("Status : Baik");
        }
        
        else {
           System.out.println("Status : evaluasi");
        }
        
    }
}
