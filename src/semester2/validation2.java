
package semester2;


public class validation2 {
    public void  vNilai(int nilai){
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Nilai A");
        }
        else if (nilai >= 80){
            System.out.println("Nilai B");
        }
        else if (nilai >= 70){
            System.out.println("Nilai C");
        } 
        else if( nilai >= 60){
            System.out.println("Nilai D, Remedial !");
        }
        else if(nilai >= 0 && nilai < 60 ) {
            System.out.println("Nilai E, Remedial");
        }
        else {
            System.out.println("Masukkan hanya nilai 0-100!");
        }
    }
}
