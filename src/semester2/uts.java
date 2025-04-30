package semester2;

import java.util.Scanner;

public class uts {

    public static void main(String[] args) {
//        //1.perkalian 1-10
//        for (var i = 1; i <= 10; i++) {
//            for (var j = 1; j <= 10; j++) {
//                var perkalian = i * j;
//                System.out.print(i + "*" + j + "=" + perkalian + "\t");
//            }
//            System.out.println();
//        }
//        //2.segitiga bintang
//        var input = new Scanner(System.in);
//
//        System.out.print("Masukkan tinggi segitiga : ");
//        var tinggi = input.nextInt();
//
//        for (var i = 1; i <= tinggi; i++) {
//            //mencetak spasi
//            for (var j = i; j < tinggi; j++) {
//                System.out.print(" ");
//            }
//            //mencetak bintang 
//            for (var k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        //3 meneutkan kehadiran berdasrkan boolean
//        var kehadiran = new Boolean[]{
//            true , false ,true ,true,true, 
//        };
//        var totalKehadiran = 0;
//        var jumlahHari = kehadiran.length;
//        
//        for(var hadir : kehadiran){
//           if(hadir){
//               totalKehadiran++;
//           }
//        }
//        
//        var persentaseKehadiran = (totalKehadiran * 100) / jumlahHari ;
//        System.out.println("Jumlah Kehadiran " + totalKehadiran + " Dari " + jumlahHari);
//        System.out.println("Persentase Kehadiran =" + persentaseKehadiran + "%");
//        if(persentaseKehadiran >= 75){
//            System.out.println("Lulus");
//        }else{
//            System.out.println("Gagal");
//        }
//        
//        //4.Input perulangan dari user 
//        var inputUser = new Scanner(System.in);
//        
//        System.out.print("Masukkan jumlah perulangan : ");
//        var handleInputPerulangan = inputUser.nextInt();
//        
//        for(var i = 1 ;  i <= handleInputPerulangan ; i++){
//            System.out.println("Perulangan ke : " + i + "\t");
//        }
//        
//        //5 for
//        var value = 5;
//        for (var i = 1; i <= value; i++) {
//            System.out.println("Ini perulangan ke : " + i);
//        }
//
//        //while
//        var perulangan = 1;
//        var nilai = 5;
//        while (perulangan <= nilai) {
//            System.out.println("Perulangan ke : " + perulangan);
//            perulangan++;
//        }
//
//        //Do While 
//        var perulangan2 = 1;
//        var nilai2 = 5;
//        do {
//            System.out.println("Perulangan : " + perulangan2);
//            perulangan2++;
//        } while (perulangan2 <= nilai2);
//
//        //6.genap dan  ganjil
//        var angka = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (var n : angka) {
//            if (n % 2 == 0) {
//                System.out.println(n + " Genap");
//            } else {
//                System.out.println(n + " Ganjil");
//            }
//        }
//
//        //7 menghitung total angka 1 - 10
//        var v = new int[]{
//            10, 20, 30, 40, 50, 60, 70, 80, 90, 100
//        };
//        var total = 0;
//        var index = 1;
//        for (var v2 : v) {
//            System.out.println("nilai ke " + index + " : " + v2);
//            total += v2;
//            index++;
//        }
//
//        System.out.println("Total : " + total);
//
//        //8 nested loop
//        for (var i = 1; i <= 3; i++) {
//            for (var j = 1; j <= 2; j++) {
//                System.out.println("i = " + i + ", j = " + j);
//            }
//        }
//        //9segitga menurun;
//        var t = 5;
//        for (var i = 1; i <= t; i++) {
//            for (var j = 5; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //10
//        var input = new Scanner(System.in);
//
//        var hari = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
//        var pengeluaranHarian = new double[hari.length];
//        var totalPengeluaran = 0.0;
//
//        var i = 0;
//        for (var h : hari) {
//            System.out.print("Masukkan Pengeluran Hari " + h + " :Rp.");
//            pengeluaranHarian[i] = input.nextDouble();
//            totalPengeluaran += pengeluaranHarian[i];
//            i++;
//        }
//
//        for (var pH : pengeluaranHarian) {
//            System.out.println("Pengeluran Harian Rp." + pH);
//        }
//        System.out.println("Total pengeluaran = " + totalPengeluaran);
//
//        //11
//        var size = new int[]{
//            10, 20, 30, 40, 50, 60, 70
//        };
//        var jumlahSize = size.length;
//        var totalSize = 0;
//
//        for (var s : size) {
//            totalSize += s;
//        }
//
//        System.out.println("TotalSize : " + totalSize);
//        System.out.println("Rata Rata : " + totalSize / jumlahSize);
//        
//        //13
//        var inputProfile = new Scanner(System.in);
//        
//        System.out.print("Input nama :");
//        var nama = inputProfile.nextLine();
//        System.out.print("Input nim :");
//        var nim =inputProfile.nextLine();
//        
//        System.out.println(profile(nama, nim));
//
//        //14
//        var inputNilaiMahasiswa = new Scanner(System.in);
//        System.out.print("Nilai Mahasiswa : ");
//        var inputNilai = inputNilaiMahasiswa.nextInt();
//        System.out.println(nilaiMahasiswa(inputNilai));
//        
//        //15
//        var validasi = new Scanner(System.in);
//        
//        System.out.print("Masukkan Username :");
//        var username = validasi.nextLine();
//        System.out.print("Masukkan Password :");
//        var password = validasi.nextLine();
//        
//        if(username.equals("aldo")  && password.equals("admin")){
//            System.out.println("Dashboard Admin");
//        }else{
//            System.out.println("username and password wrong");
//        }
//        
//        //16 input nilai mencari rata rata  ,  jumlah nilai dan kelulusan dari 7 milai
//        var in = new Scanner(System.in);
//        
//       var totalN = 0;
//       var  totalData1 = 7;
//       
//       for (var j = 1; j <= totalData1; j++){
//           System.out.println("Masukkan Data Ke " + j + ": ");
//           var inputData = in.nextInt();
//           totalN += inputData;
//       };
//       System.out.println("Total Nilai :"+ totalN);
//       var rataRata = totalN  / totalData1 ;
//       System.out.println("Rata Rata :" + rataRata);
//       
//       if(rataRata >= 75 ){
//            System.out.println("Lulus");
//       }else{
//           System.out.println("Gagal");
//       }
//       
       
       //17 mencari kehadiran 
        var kehadiran = new int[]{
            1,1,1,0,1,1,0,1,1,1,
            1,1,1,1,0,1,1,1,1,0,
            1,1,1,1,1,1,1,0,1,1
        };
       
        var totalHadir = 0;
        var totalHari = kehadiran.length;
        
        for(var k : kehadiran){
            if(k == 1){
                totalHadir++;
            }
        }
        
        var totalBolos = totalHari - totalHadir;
        var persentaseKehadiran =  ((double) totalHadir / totalHari) * 100;
        
        System.out.println("Total Kehadiran : " + totalHadir);
        System.out.println("Total Alfa : " + totalBolos);
        System.out.printf("Persentase Kehadiran :%.2f%%\n", persentaseKehadiran , "%");
        
        if(persentaseKehadiran >= 75){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda Gagal");
        }
        
        
        
        
        
    }

    static String nilaiMahasiswa(int nilai){
       if(nilai >= 75){
           return ("Lulus");
       }else{
           return("Gagal");
       }
    }
    
    static String profile(String nama, String nim) {
        return ("Nama : " + nama +" "+ "NIM : " + nim);
    }
}


