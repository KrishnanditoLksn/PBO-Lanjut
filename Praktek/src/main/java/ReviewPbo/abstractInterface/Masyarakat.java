package ReviewPbo.abstractInterface;

public class Masyarakat extends Penduduk implements Peserta {
    private String nomor;

    public Masyarakat() {}

    @Override
    public double hitungIuran() {
        String substring= nomor.substring(0, 2);
        return Integer.parseInt(substring) * 100;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }


    @Override
    public String getJenisSertifikat() {
        return "Sertifikat Peserta";
    }

    @Override
    public String getFasilitas() {
        return "block note , alat tulis , modul pelatihan";
    }

    @Override
    public String getKonsumsi() {
        return "snack , makan siang";
    }
}
