package perpustakaan;

public class Fiksi extends Buku {

    public Fiksi(String title, String author){
        this.title = title;
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

        System.out.printf("Buku Fiksi: %s oleh %s\n", title, author);
    }
}
