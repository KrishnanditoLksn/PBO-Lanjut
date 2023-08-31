package ReviewPbo;

public class MasyarakatUmum extends Peminjam {
    private String nomorKtp;

    public MasyarakatUmum(String name, String address, String nomorKtp) {
        super(name, address);
        this.nomorKtp = nomorKtp;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }
}
