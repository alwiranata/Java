package semester2;

public class RecursifBacktracking {

    static int vactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * vactorial(n - 1);
        }
    }

    ;

    static int vibonachi(int n) {
        if (n <= 1) {
            return n;
        }
        return vibonachi(n - 1) + vibonachi(n - 2);
// 4  = 
    };
    
   public static void main(String[] args) {

        int angka = 4;
        int hasil = vactorial(angka);
        int hasil2 = vibonachi(angka);

        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
        System.out.println("Vibonachi  dari " + angka + " adalah: " + hasil2);

    }
}
