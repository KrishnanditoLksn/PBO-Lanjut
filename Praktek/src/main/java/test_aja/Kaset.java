package test_aja;

public class Kaset extends Storage{
    private String ukuran;
    public Kaset(String kode, String jenis , String ukuran) {
        super(kode, jenis);
        this.ukuran = ukuran;
    }

    public String getUkuran(){
        return  ukuran;
    }
}
