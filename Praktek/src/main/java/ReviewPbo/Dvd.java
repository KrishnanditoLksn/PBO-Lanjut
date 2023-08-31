package ReviewPbo;

public class Dvd extends Koleksi {
    protected String format, isbn;

    public Dvd(String collectionId, String title, String isbn, String penerbit, String tahunTerbit, String format) {
        super(collectionId, title, penerbit, tahunTerbit);
        this.format = format;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getFormat() {
        return format;
    }

}
