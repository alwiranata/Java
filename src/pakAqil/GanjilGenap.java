
package pakAqil;

import javax.swing.JOptionPane;
public class GanjilGenap {
    public static void main(String[] args){
        
         //pilih opsi
          String add = JOptionPane.showInputDialog(
                    "Pilih salah satu opsi:\n" +
                    "1. Untuk memeriksa satu angka (genap/ganjil)\n" +
                    "2. Untuk memeriksa angka genap/ganjil dari 1 hingga banyak angka"
            );
          
            int opsi = Integer.parseInt(add);
        
        try{
          
           
            if(opsi == 1 ){
               //input 1 angka
               String input = JOptionPane.showInputDialog("Masukkan angka");
               //mengubah input menjadi angka
               int angka =  Integer.parseInt(input);
               
               if(angka %2 == 0){
                   JOptionPane.showMessageDialog(null, angka + " Adalah Bilangan genap");
               }
               
               else if(angka % 2 == 1){
                  JOptionPane. showMessageDialog(null, angka + " Adalah Bilagan ganjil") ;
               }
               
               else{
                   JOptionPane.showMessageDialog(null, angka + "Masukkan");
               }
               
               
           }
            
            else if(opsi == 2 ){
                //input banyak angka
                String input = JOptionPane.showInputDialog("Masukkan Banyak angka");
                //mengubah input menjadi ankga
                int angka = Integer.parseInt(input);
                //for 
                for(int i = 1; i<= angka; i++){
                  //Genap
                  if(i % 2 == 0){
                    JOptionPane.showMessageDialog(null, i +" Adalah Bilgan Genap");
                  }
                  //Ganjil
                  else if(i % 2 == 1){
                    JOptionPane.showMessageDialog(null, i + " Adalah Bilangan Ganjil" );
                  }
                  
                  else{
                      JOptionPane.showMessageDialog(null, i + "pilihan tidak valid!");
                  }
                  
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid !");
            }
            
        }catch(NumberFormatException e){ 
          JOptionPane.showMessageDialog(null, 
                    "Input tidak valid! Harap masukkan angka yang benar.");
        }
        
        
    }
}
