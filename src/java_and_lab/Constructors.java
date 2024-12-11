package java_and_lab;

import java.util.Scanner;

public class Constructors {
    
    int Mounth1;
    int Mounth2;
    int Mounth3;
    int Mounth4;
    int Mounth5;
    int Mounth6;
    int Mounth7;
    int Mounth8;
    int Mounth9;
    int Mounth10;
    int Mounth11;
      
    public Constructors(int inputMounth) {
     
       Mounth1 = 1; 
       Mounth2 = 2;
       Mounth3 = 3;
       Mounth4 = 4;
       Mounth5 = 5; 
       Mounth6 = 6; 
       Mounth7 = 7; 
       Mounth8 = 8; 
       Mounth9 = 9; 
       Mounth10 = 10; 
       Mounth11 = 11; 
       
        if(Mounth1 == inputMounth){
            System.out.println("Januari");
        } else if(Mounth2 == inputMounth){  
            System.out.println("Februari");
        }    else if(Mounth3 == inputMounth){
            System.out.println("Maret");
        }   else if(Mounth4 == inputMounth){
            System.out.println("April");
        }  else if(Mounth5 == inputMounth) {
           System.out.println("Mei");
        } else if (Mounth6 == inputMounth){
            System.out.println("Juni");
        } else if (Mounth7 == inputMounth){
             System.out.println("Juli");
        } else if (Mounth8 == inputMounth){
             System.out.println("Agustus");
        } else if (Mounth9 == inputMounth){
             System.out.println("September");
        } else if (Mounth10 == inputMounth){
             System.out.println("Oktober");
        } else if (Mounth11 == inputMounth){
             System.out.println("November");
        } else{
             System.out.println("Desember");
        }
}
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nomor bulan: ");
        int inputMounth = scanner.nextInt();
        
        new Constructors(inputMounth); 
        
    }
   
}
            
   
    

