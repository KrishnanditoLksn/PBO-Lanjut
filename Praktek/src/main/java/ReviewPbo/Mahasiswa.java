package ReviewPbo;

public class Mahasiswa extends Peminjam {
    private String nim;

    public Mahasiswa(String name, String address, String nim) {
        super(name, address);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
