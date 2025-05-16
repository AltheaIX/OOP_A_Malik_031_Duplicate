package app;

import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        NonFiksi nonFiksi = new NonFiksi("Madilog", "Tan Malaka (Bidang: Sejarah & Ilmu Pengetahuan");
        nonFiksi.displayInfo();

        Fiksi fiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu (Genre: Dongeng)");
        fiksi.displayInfo();

        System.out.println();

        Anggota anggota1 = new Anggota("Malik", "A031");
        Anggota anggota2 = new Anggota("Firdaus", "B039");

        System.out.println();

        anggota1.borrowBook("Madilog");
        anggota2.borrowBook("Hainuwele: Sang Putri Kelapa", "7 hari");

        System.out.println();

        anggota1.borrowBook(nonFiksi);
        anggota2.borrowBook(fiksi, "7 hari");

        System.out.println();

        anggota1.returnBook("Madilog");
        anggota2.returnBook("Hainuwele: Sang Putri Kelapa");

        System.out.println();

        anggota1.returnBook(nonFiksi);
        anggota2.returnBook(fiksi);
    }
}
