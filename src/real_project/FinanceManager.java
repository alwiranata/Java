package real_project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class Transakisi
class  Transaction{
    private String type;
    private String category;
    private double amount;
    private String date;
    
    //konstraktor
    public Transaction(String type ,String category, double amount,String date){
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
    
    //getter untuk mendapatkan jenis transaksi
    public String getType(){
        return type;
    }
    
    //getter untuk mendapatkan jumlah uang
    public double getAmount(){
        return amount;
    }
    
    public String toString(){
        return String.format("Jenis: %s | Kategori: %s | jumlah: %.2f | Tanggal %s", type, category,amount,date);
    }
}

//kelas utama
public class FinanceManager{
    
}