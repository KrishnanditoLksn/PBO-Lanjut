package ReviewPbo.abstractInterface;

public class Ukm {
    Penduduk[] anggota;
    Mahasiswa sekre, ketua;
    private String namaUnit;

    public Ukm() {
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    public Mahasiswa getSekre() {
        return sekre;
    }

    public void setSekre(Mahasiswa sekre) {
        this.sekre = sekre;
    }

    public Penduduk[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Penduduk[] anggota) {
        this.anggota = anggota;
    }
}
