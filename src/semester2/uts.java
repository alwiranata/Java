package semester2;

import java.util.Scanner;

public class uts {

    public static void main(String[] args) {
        //1.perkalian 1-10
        for (var i = 1; i <= 10; i++) {
            for (var j = 1; j <= 10; j++) {
                var perkalian = i * j;
                System.out.print(i + "*" + j + "=" + perkalian + "\t");
            }
            System.out.println();
        }
        //2.segitiga bintang
        var input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga : ");
        var tinggi = input.nextInt();

        for (var i = 1; i <= tinggi; i++) {
            //mencetak spasi
            for (var j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            //mencetak bintang 
            for (var k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //3 meneutkan kehadiran berdasrkan boolean
        var kehadiran = new Boolean[]{
            true , false ,true ,true,true, 
        };
        var totalKehadiran = 0;
        var jumlahHari = kehadiran.length;
        
        for(var hadir : kehadiran){
           if(hadir){
               totalKehadiran++;
           }
        }
        
        var persentaseKehadiran = (totalKehadiran * 100) / jumlahHari ;
        System.out.println("Jumlah Kehadiran " + totalKehadiran + " Dari " + jumlahHari);
        System.out.println("Persentase Kehadiran =" + persentaseKehadiran + "%");
        if(persentaseKehadiran >= 75){
            System.out.println("Lulus");
        }else{
            System.out.println("Gagal");
        }
    }
}
