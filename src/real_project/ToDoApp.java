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
               case 1 -> addTask(scanner);
               case 2 -> viewTask();
               case 3 -> deleteTask(scanner);
               case 4 -> markTaskComplete(scanner);
               case 5 -> System.out.println("Terima Kasih");
               default -> System.out.println("Piihan tidak tersedia");
           }
           
       }while(choice != 5);
       
       scanner.close();
    }
    //add task
    public static void addTask(Scanner scanner){
        
        System.out.print("Masukkan Deskripsi Tugas :");
        String task = scanner.nextLine();
        
        tasks.add(task);
        
        isCompleted.add(false);
        
        System.out.println("Tugas berhasil ditambhkan");
    }
    
    //view taks
    public static void viewTask(){
        
        if(tasks.isEmpty()){
            System.out.println("Tidak ada tugas dalam daftar.");
            return;
        }
        
        System.out.println("\nDaftar Tugas");
        for(int i = 0; i <tasks.size() ; i++){
            String status = isCompleted.get(i) ? "Selesai" : "Belum Selesai";
            System.out.println((i + 1 ) +". " + tasks.get(i)+ "[" + status + "]");
        }
    }
    
    //delete task
    public static void deleteTask(Scanner scanner){
        
        viewTask();
        
        if(tasks.isEmpty()) return;
        
        System.out.print("Masukkan nomor tugas yang ingin di hapus :");
        int index = scanner.nextInt() - 1;
        
        if (index >= 0 && index < tasks.size() ){
            tasks.remove(index);
            isCompleted.remove(index);
            System.out.println("Tugas Berhasil Dihapus");
        }else{
            System.out.println("Nomor tugas tidak valid");
        }    
    }
    
    //mark Task
    public static void markTaskComplete (Scanner scanner){
        viewTask();
        if(tasks.isEmpty())return;
        
        System.out.print("Masukkan nomor tugas yang ingin datandai selesai :");
        int index = scanner.nextInt() -1;
        
        if(index >= 0 && index< tasks.size()){
            isCompleted.set(index, true);
            System.out.println("Tugas berhasil ditandai selesai! ");
        }else{
            System.out.println("Nomor tugas tidak valid");
        }
    }
}
