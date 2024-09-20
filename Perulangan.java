import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        int i;
        int nilaiAwal, nilaiAkhir;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai awal: ");
        nilaiAwal = in.nextInt();
        System.out.println("Masukkan nilai akhir: ");
        nilaiAkhir = in.nextInt();
        i = nilaiAwal;
        while (i <= nilaiAkhir) {

            i++;
            if (i % 6 == 0) {
                System.out.println(i);
            }

        }
        in.close();

    }

}


    

