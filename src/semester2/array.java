package semester2;

public class array {

    public static void main(String[] args) {

        String[] profile = {
            "2455201036",
            "Aldo Wiranata",};

        System.out.println("array 1d");
        for (int i = 0; i < profile.length; i++) {
            System.out.println((i == 0 ? "NIM =" : "Nama =") + profile[i]);
        }

        String[][] profile2 = {
            {
                "2455201036",
                "Aldo Wiranata",}
        };

        System.out.println("array 2d");
        for (String[] data : profile2) {
            for (int i = 0; i < data.length; i++) {
                System.out.println((i == 0 ? "NIM =" : "Nama =") + data[i]);
            }
        }

        System.out.println("array 3d");
        String[][][] profile3 = {
            {
                {
                    "24555201036",
                    "Aldo Wiranata"
                }
            }
        };

        for (String[][] data : profile3) {
            for (String[] data1 : data) {
                for (int i = 0; i < data1.length; i++) {
                    System.out.println((i == 0 ? "NIM =" : "Nama =") + data1[i]);
                }
            }
        }
    }
}
