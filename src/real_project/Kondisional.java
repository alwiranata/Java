
package real_project;

import java.util.Scanner;

public class Kondisional {
    public static void main(String[] args ){
        //if-else input age
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan age :");
        int age =  input.nextInt();
        
        if (age >=  18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
        
        //switch input day
        Scanner inputDay = new Scanner(System.in);
        System.out.print("Masukkan hari berdasarkan angka :");
        int day = inputDay.nextInt();
        
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Thuesday");
            default -> System.out.println("Other day");
        }
        
        
    }
}
