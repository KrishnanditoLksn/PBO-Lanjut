package ReviewPbo;

public class Koleksi {
    protected String collectionId, title, penerbit, tahunTerbit;

    public Koleksi(String collectionId, String title, String penerbit, String tahunTerbit) {
        this.collectionId = collectionId;
        this.title = title;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }
}