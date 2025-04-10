
package semester2;


import java.util.Scanner;
public class tugaspakWeli2 {
  
    public static void main (String[] args){
        var input = new Scanner(System.in);
        
        //soal 1 menentukan harag tiket bioskop berdasarkan usia
        
//        System.out.print("Masukkan Usia :");
//        var usia = input.nextInt();
//        
//        if(usia < 5){
//            System.out.println("Gratis");
//        }else if(usia <= 12){
//            System.out.println("Rp 25.000");
//        }else if(usia <= 59){
//            System.out.println("Rp 50.000");
//        }else{
//            System.out.println("Rp 30.000");
//        }
          //soal no 2 mencari billgan postif  / negatif
//          System.out.print("Masukkan Bilangan : ");
//          var bilangan = input .nextInt();
//          
//          if (bilangan < 0){
//              System.out.println(bilangan + "= Negatif");
//          } else if (bilangan > 0){
//              System.out.println(bilangan + "= Positif");
//          }else {
//              System.out.println(bilangan + "= NOL");
//          }
           //soal 3 .menetukan kelulusan 
           System.out.print("Masukkan Nilai Akhir :");
           var nilaiAkhir = input.nextInt();
           
           System.out.print("Masukkan Jumlah Pertemuan : ");
           var jumlahPertemuan = input.nextInt();
           
            System.out.print("Masukkan jumlah Kehadiran : ");
           var  jumlahKehadiran = input.nextInt();
           
            System.out.print("Masukkan 1 jika semua tugas selesai , 0 jika belum  : ");
           var tugas = input.nextInt();
           
           var persentaseKehadiran = ((double)jumlahKehadiran  / jumlahPertemuan)* 100;
           
           System.out.println("Nilai Akhir : " + nilaiAkhir);
           System.out.println("Rata2 Kehadiran  : " + persentaseKehadiran  + " % " );
           System.out.println("Tugas : " + (tugas == 1 ? "Tugas Sudah Selesai" : " Tugas belum Selesai"));

           if(nilaiAkhir >= 60 && persentaseKehadiran >=75 && tugas == 1){
               System.out.println("Mahasiswa Lulus");
           } else{
               System.out.println("Mahasiswa Tidak Lulus");

           }

           
    }
}
