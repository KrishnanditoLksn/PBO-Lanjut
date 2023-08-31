package test_aja;

public class Buku extends Storage {
    private final String judul;

    public Buku(String kode, String jenis, String judul) {
        super(kode, jenis);
        this.judul = judul;

    }

    public String getJudul() {
        return judul;
    }
}
