package perpustakaan;

public class NonFiksi extends Buku{

    public NonFiksi(String nama, String author){
        this.title = nama;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public void displayInfo() {
        String title = getTitle();
        String author = getAuthor();

        System.out.printf("Buku Non-Fiksi: %s oleh %s\n", title, author);
    }
}
