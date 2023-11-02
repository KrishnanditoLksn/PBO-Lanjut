/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_PBOL;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataTanaman {

    ArrayList<Tanaman> listTanaman = new ArrayList();

    public DataTanaman() {
        listTanaman.add(new Tanaman("Tanaman Pakis ", 45000, 200));
        listTanaman.add(new Tanaman("Tanaman Bonsai", 100000000, 10));
    }

    public ArrayList<Tanaman> getListTanaman() {
        return listTanaman;
    }

    public void setListTanaman(ArrayList<Tanaman> listTanaman) {
        this.listTanaman = listTanaman;
    }
}
