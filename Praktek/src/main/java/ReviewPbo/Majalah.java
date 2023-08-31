package ReviewPbo;

public class Majalah extends Koleksi {
    protected String volume, series, issn, jumlahHalaman;
    public Majalah(String jumlahHalaman, String tahunTerbit, String title, String penerbit, String collectionId,String series,String volume,String issn) {
        super(tahunTerbit, title, penerbit, collectionId);
        this.jumlahHalaman = jumlahHalaman;
        this.series = series;
        this.volume = volume;
        this.issn = issn;
    }

    public String getSeries() {
        return series;
    }
    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public String getIssn() {
        return issn;
    }

    public String getVolume() {
        return volume;
    }
}
