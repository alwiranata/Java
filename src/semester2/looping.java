

package semester2;


import java.util.Scanner;

public class looping {
    
    public static void main(String[]args){
        //100
        var input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Perulangan : ");
        
        var jumlah = input.nextInt();
        
        System.out.println("FOR Dinamis");
        for(int i= 0; i< jumlah ; i++ ){
            System.out.println("Perulangan Ke - "+ (i + 1));
        }
        
        System.out.println("FOR");
         for(int i= 1; i<= 5; i++ ){
            System.out.println("Perulangan Ke - "+ i);
        }
        
        System.out.println("While");
        var  angka = 1;
        while (angka <= 5) {
           System.out.println("Iterasi Ke - " + angka);
           angka++;
       }
        
        System.out.println("Do While");
        var  n = 1 ;
        do {
            System.out.println("Iterasi Ke- " + n);
            n++;
        }while(n <= 5);
          
        System.out.println("For Each Loop");
        int[] angkaArray = {1,2,3,4,5};
        for (int a : angkaArray){
            System.out.println("Iterasi Ke -" + a);
        }
          
        
        int total = 0;
        
        for(var i = 0 ; i <=10; i++){
            total +=i;
        }
        
        System.out.println("Total :" +  total);
                
       for(var i = 0; i <= 10; i ++){
           if(i % 2 != 0){
               System.out.println("Bil Ganjil : " + i);
           }
       }
       
       for (var i = 1 ; i <= 3; i ++){
           for(var j = 1 ; j<= 2 ; j ++){
               System.out.println("i = " + i  + " j = " +j );
           }
       }
       
        int tinggi = 5;

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
            System.out.println();
        }
    }
}
