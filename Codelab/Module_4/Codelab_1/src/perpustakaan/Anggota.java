package perpustakaan;

public class Anggota implements Peminjaman {
    String name;
    String memberID;

    public Anggota(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;

        System.out.printf("Anggota: %s (ID: %s)\n", name, memberID);
    }

    public String getName() {
        return name;
    }

    public void borrowBook(String title){
        String name = getName();
        System.out.printf("%s meminjam buku berjudul %s\n", name, title);
    }

    public void borrowBook(Buku buku){
        String name = getName();
        System.out.printf("%s meminjam buku berjudul %s\n", name, buku.title);
    }

    @Override
    public void borrowBook(String title, String loanDuration) {
        String name = getName();
        System.out.printf("%s meminjam buku berjudul %s selama %s\n", name, title, loanDuration);
    }

    public void borrowBook(Buku buku, String loanDuration){
        String name = getName();
        System.out.printf("%s meminjam buku berjudul %s selama %s\n", name, buku.title, loanDuration);
    }

    @Override
    public void returnBook(String title) {
        String name = getName();
        System.out.printf("%s Mengembalikan buku berjudul %s\n", name, title);
    }

    public void returnBook(Buku buku) {
        String name = getName();
        System.out.printf("%s Mengembalikan buku berjudul %s\n", name, buku.title);
    }
}
