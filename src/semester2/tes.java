package semester2;

public class tes {

    public static void main(String[] args) {
        String[] nama = {"amel", "andin", "syahdan"};
        int[] nilai = {90, 92, 93};
        
        //mennampilkan nilai dengan nama dan nilai 
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + ":" + nilai[i]);
        }
        //rata2
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        
        double rata = (double) total / nilai.length;
        System.out.println("Rata rata: " + rata);
        //nilai tertinggi 
        int max = 0;
        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
        };
        System.out.println("Tertinggi :" +  max);
        
    


    }
}
