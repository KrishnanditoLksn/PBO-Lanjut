/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_PBOL;

/**
 *
 * @author ASUS
 */
public class Tanaman {

    private String namaTanaman;
    private int stokTanaman, hargaTanaman;

    public Tanaman(String namaTanaman, int hargaTanaman, int stokTanaman) {
        this.namaTanaman = namaTanaman;
        this.hargaTanaman = hargaTanaman;
        this.stokTanaman = stokTanaman;
    }

    public String getNamaTanaman() {
        return namaTanaman;
    }

    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }

    public int getHargaTanaman() {
        return hargaTanaman;
    }

    public void setHargaTanaman(int hargaTanaman) {
        this.hargaTanaman = hargaTanaman;
    }

    public int getStokTanaman() {
        return stokTanaman;
    }

    public void setStokTanaman() {
        this.stokTanaman = stokTanaman;
    }

}
