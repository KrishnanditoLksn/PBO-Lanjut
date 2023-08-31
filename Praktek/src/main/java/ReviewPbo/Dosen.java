package ReviewPbo;

public class Dosen extends Peminjam {
    private String nip;

    public Dosen(String name, String address, String nip) {
        super(name, address);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
