package ReviewPbo.abstractInterface;

public abstract class Penduduk {
    protected String nama;
    protected String tanggalLahir;

    public Penduduk() {
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract double hitungIuran();
}
