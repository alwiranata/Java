package real_project;
//import java
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    //Daftar untuk menyimpan tugas
    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> isCompleted = new ArrayList<>();
  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int choice;
       
       //Tampilan menu
       do{
           System.out.println("\n=== To Do List App===");
           System.out.println("1. Tambah Tugas ");
           System.out.println("2. Lihat Tugas");
           System.out.println("3. Hapus Tuags");
           System.out.println("4. Tandai tugas selesai");
           System.out.println("5. Keluar");
           System.out.print("Pilih Opsi :");
           choice = scanner.nextInt();
           scanner.nextLine();
          
           switch(choice){
               case 1 -> System.out.println("Tambah Tugas");
               case 2 -> System.out.println("lihat Tugas");
               case 3 -> System.out.println("Hapus Tugas");
               case 4 -> System.out.println("Tandai tugas selesai");
               case 5 -> System.out.println("Terima Kasih");
               default -> System.out.println("Piihan tidak tersedia");
           }
           
       }while(choice != 5);
       
       scanner.close();
    }
    
}
