import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StatistikNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> daftar = new ArrayList<>();

        System.out.println(" STATISTIK NILAI KELAS ");
        System.out.println("Ketik -1 kalau sudah selesai.");

        while (true) {
            System.out.print("Nilai ke-" + (daftar.size() + 1) + " : ");
            int nilai = input.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak, harus 0-100");
                continue;
            }

            daftar.add(nilai);
        }

        // 2. Mengecek apakah ada nilai yang tersimpan
        if (daftar.isEmpty()) {
            System.out.println();
            System.out.println("Tidak ada nilai yang disimpan.");
            input.close();
            return;
        }

        System.out.println();
        System.out.println("Nilai tersimpan : " + daftar);

        // 3. Menghitung jumlah mahasiswa
        int jumlah = daftar.size();

        // 4. Menghitung total nilai untuk mencari rata-rata
        int total = 0;

        for (int nilai : daftar) {
            total += nilai;
        }

        double rataRata = (double) total / jumlah;

        // 5. Mencari nilai tertinggi dan terendah
        // Menggunakan perulangan sendiri, bukan Collections.max/min
        int tertinggi = daftar.get(0);
        int terendah = daftar.get(0);

        for (int i = 1; i < daftar.size(); i++) {
            int nilai = daftar.get(i);

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        // 6. Menghitung jumlah mahasiswa yang nilainya di atas rata-rata
        int diAtasRataRata = 0;

        for (int nilai : daftar) {
            if (nilai > rataRata) {
                diAtasRataRata++;
    }
 }