
package real_project;

import java.util.ArrayList;

public class Array_dan_Koleksi {
    public static void main(String[] args){
        //Array
        int[] numbers ={1,2,3,4,5};
        for (int number : numbers){
            System.out.println("Number :" + number);
        }
        
        //Array List
        ArrayList<String> names = new  ArrayList<>();
        names.add("AlDO");
        names.add("WIRANATA");
        names.add("18");
        
         System.out.println("Before: " + names);
        // Menghapus elemen berdasarkan nilai
        names.remove("18");
        System.out.println("After: " + names);
        
        
        for(String name : names ){
            System.out.println("Name :" + name); 
        }

        
    }
}
