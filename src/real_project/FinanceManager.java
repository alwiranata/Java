package real_project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class transaction
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

//Main class
public class FinanceManager{
    private List<Transaction> transactions = new ArrayList<>();
    private double balance = 0.0;
    
    
    //add transaction on list
    public void addTransaction(String type, String category ,double amount, String date){
        //add transactiont to list
        transactions.add(new Transaction(type,category ,amount ,date));
        //update balance
        if(type.equalsIgnoreCase("1")){
            balance += amount;
        }else if(type.equalsIgnoreCase("2")){
            balance -= amount;
        }
    }
    
    //show all transaction
    public void showTranscation(){
        if(transactions.isEmpty()){
            System.out.println("Belum ada Transaksi");
        }else{
            System.out.println("=== Riwayat Transaksi ===");
            for(Transaction t : transactions){
                System.out.println(t);
            }
        }
    }
    
    public void  showSummary(){
        System.out.println("=== Ringaksan Keuangan ===");
        System.out.printf("Total Saldo : %.2f\n",balance);
        
        double totalIncome = transactions.stream()
                .filter(t -> t.getType().equalsIgnoreCase("1"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        double totalExpense = transactions.stream()
                .filter(t ->t.getType().equalsIgnoreCase("2"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.printf("Total pemasukan: %.2f%n", totalIncome);
        System.out.printf("Total pengeluaran: %.2f%n", totalExpense);

    }
    
    public void handleAddTransaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Pilih Jenis ===");
        System.out.println("1.Pemasukan");
        System.out.println("2.Pengeluaran");
        System.out.print("Jenis :");
        String type = scanner.nextLine();

        System.out.print("Kategori :");
        String category = scanner.nextLine();

        System.out.print("Jumlah :");
        double amount = scanner.nextDouble();

        String date = java.time.LocalDate.now().toString();

        addTransaction(type,category,amount,date);

        System.out.println("Transaksi berhasil ditambahkan");

    }
    
    public void handleDefault(Scanner scanner){
        System.out.println("Terima kasih telah menggunakan aplikasi ini");
        scanner.close();
        System.exit(0);
    }
    
    //main metode 
    public static void main(String[] args){
       FinanceManager manager = new FinanceManager();
       Scanner scanner = new Scanner(System.in);
       
       while(true){
           System.out.println("\n=== Pengeluaran Pribadi ===");
           System.out.println("1.Tambah Transaksi");
           System.out.println("2.Lihat Riwayat Transaksi");
           System.out.println("3.lihat Ringkasan Keuangan");
           System.out.println("4.Keluar");
           System.out.print("Pilih opsi :");
           int choice = scanner.nextInt();
           scanner.nextLine();
       
           
         switch(choice){
             case 1 -> manager.handleAddTransaction();
             case 2 ->manager.showTranscation();
             case 3 ->manager.showSummary();
             case 4 -> manager.handleDefault(scanner);
         }
       }  
    }
}