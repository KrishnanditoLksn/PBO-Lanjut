package ReviewPbo;

public class Buku extends Koleksi {
    protected String jumlahHalaman, Isbn;

    public Buku(String penerbit, String Isbn, String title, String collectionId, String tahunTerbit, String jumlahHalaman) {
        super(penerbit, title, collectionId, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
        this.Isbn = Isbn;
    }

    public String getIsbn() {
        return Isbn;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }
}
