package perpustakaan;

public interface Peminjaman {
    public void borrowBook(String title, String loanDuration);
    public void returnBook(String title);
}
