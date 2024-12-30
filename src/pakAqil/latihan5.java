package pakAqil;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class latihan5 {
    public static void main(String[] args) {
        // Membuat PrintWriter untuk mencatat output
        PrintWriter writer = new PrintWriter(System.out, true);

        // Cetak menggunakan println
        writer.println("Catat Mengunnakan PrinntHello World");
        
        double nilai = 100;
        writer.printf("Cetak menggunakan printf : %.2f\n", nilai);

        // Cetak menggunakan format
        writer.format("Cetak menggunakan Format : Angka  = %d\n", 100);

        // Cetak menggunakan System.err
        System.err.println("Cetak menggunakan system err : Ini adalah pesan error");

        // Cetak menggunakan Logger
        Logger logger = Logger.getLogger(latihan5.class.getName());
        logger.info("Cetak menggunakan log : ini logger");

        // Cetak array menggunakan Arrays.toString()
        int[] array = {1, 2, 3, 4, 5};
        writer.println("cetak array  menggunakan Arrays.toString()" + Arrays.toString(array));

        // Cetak array 2D menggunakan Arrays.deepToString()
        int[][] array2D = {{1, 2}, {3, 4}};
        writer.println("Cetak array menggunakan Arrays.deepToString()" + Arrays.deepToString(array2D));

        // Cetak karakter tunggal
        try {
            writer.println('A');
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan saat mencetak karakter tunggal: " + e.getMessage());
        }
    }
}
