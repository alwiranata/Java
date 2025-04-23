
package semester2;

import java.util.Arrays;
public class arrayPemograman {
    public static void main(String[] args){
//         var items = new Object[]{
//            "aldo", 123 ,true
//        };
//        
//        for(var item : items){
//            System.out.println(item);
//        }
    
//        int[] nilai = {
//            90 ,85 ,78,92,88
//        };
//        nilai[2] = 20;
        
//        int total = 0;
//        for(var i = 0 ; i < nilai.length ; i++){
//            total +=  nilai[i];
//        }
//        for( var item : nilai ){
//            total +=  item;
//            System.out.println(total);
//        }
//        System.out.println(total);
//        System.out.println(nilai[2]);

//        int[][] values = {
//            {1,2} ,{3,4}
//        };
//        
//        for (int i = 0 ; i < values.length; i++){
//            for (int j =  0 ; j < v alues[i].length;j++){
//                System.out.print(values[i][j] + " ");
//            }
//        }
        
        int[] values=  {
            70,80,90,100,50,70,80,90,100,100
        };
        var total = 0;
        for(var value : values){
            total += value;
        }
        
        var rataRata = total / values.length;
        
        System.out.println(total);
        System.out.println(rataRata);
        
    }
}
