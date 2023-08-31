package test_aja;

public class Storage {
    protected String kode, jenis;

    public Storage(String kode, String jenis) {
        this.kode = kode;
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public String getKode() {
        return kode;
    }
}
