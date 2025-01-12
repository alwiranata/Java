
package real_project;

import java.util.Scanner;
public class inputNilai {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //Masukkan Jumlah Siswa
        System.out.print("Masukkan Jumlah Siswa = ");
        int jumlahSiswa = input.nextInt();
        
        //array untuk menyimpan jumlah siswa
        double[] nilaiMahasiswa = new double[jumlahSiswa];
        double totalNilai = 0;
        double nilaiTertinggi = 0;
        int indeksTertinggi = 0;
        
        for(int i = 0; i< jumlahSiswa ; i++){
            double nilai;
             do{
                 System.out.print("Masukkan Nilai siswa ke -"+ (i + 1) + "(0-100) = ");
                 nilai = input.nextDouble();
                 
                 if(nilai < 0 || nilai > 100){
                     System.out.println("Nilai Tidak valid , Masukkan nilai 0-100 ");
                 }
             }while(nilai < 0 || nilai > 100);
             
             nilaiMahasiswa[i] = nilai;
             totalNilai += nilai;
             
             //cek nilai tertinggi
             if(nilai > nilaiTertinggi){
                 nilaiTertinggi = nilai;
                 indeksTertinggi = i ;
             }
        }
        
        // Hitung rata-rata nilai 
        double rataRata = totalNilai / jumlahSiswa;
        
        //Tampilkan Hasil  
        System.out.printf("\nRata Rata Nilai Siswa : %.2f\n",rataRata);
        System.out.printf("Nilai Tertinggi : %.2f (diperoleh oleh siswa ke-%d)\n", nilaiTertinggi ,indeksTertinggi +1);
        
         
        
    }
}
