
package semester2;

import java.util.Scanner;
public class tugasPemograman {
    public static void main(String[] args){
        //Program login dengan validasi username dan password; //aldo
        var input = new Scanner(System.in);
        
        var usernameAdmin = "Aldo";
        var pwAdmin = 12345678;
        
        System.out.print("Masukkan Username :");
        var username = input.nextLine();
        
        System.out.print("Masukkan PW :");
        var pw = Integer.parseInt(input.nextLine());
        
        if(username.equals(usernameAdmin) && pw == pwAdmin){
            System.out.println("Admin Login");
        } else{
            System.out.println("Username atau Password kamu salah!");
        }
        
        
   
        
        
        
        //menentukan kelulusan berdasarkan  3 nilai ujian
//       
//        var input = new Scanner(System.in);
//        
//        System.out.print("Input Logika 1-100 : ");
//        var logika = input.nextInt();
//                
//        System.out.print("Input MTK 1-100 : ");
//        var MTK = input.nextInt();
//        
//        System.out.print("Input Pemograman 1-100 : ");
//        var pemograman = input.nextInt();
//        
//        var jumlah = logika + MTK + pemograman;
//        var rata2 = jumlah / 3;
//        System.out.println("Rata - Rata : " + rata2);
//       
//        if (rata2 >= 90){
//            System.out.println("Lulus dengan nilai A");
//        }else if(rata2 >= 80){
//            System.out.println("Lulus dengan nilai B");
//        }else if(rata2 >= 70){
//            System.out.println("Lulus dengan nilai c");
//        }else {
//            System.out.println("Remedial");
//        }
//        var input = new Scanner(System.in);
//        
//        //kategori usia
//        System.out.print("Input Usia :");
//        var usia = input.nextInt();
//        if(usia >=60){
//            System.out.println(usia + " Termasuk Kategori Lansia");
//        }else if(usia >=50){
//            System.out.println(usia + " Termasuk Kategori Tua");
//        }else if(usia >=30){
//            System.out.println(usia + " Termasuk Kategori Dewasa");
//        }else if(usia >=10){
//             System.out.println(usia + " Termasuk Kategori Remaja");
//        }else {
//             System.out.println(usia + " Termasuk Kategori Anak-Anak");
//        }
    }
}
