/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mockup_Project;

import java.util.ArrayList;

/**
 * @author ASUS
 */
public class data_tanaman {

    ArrayList<Tanaman> listTanaman;

    public data_tanaman() {
        listTanaman = new ArrayList<>();
        listTanaman.add(new Tanaman(500, "Tanaman Pakis", 4500));
        listTanaman.add(new Tanaman(1000, "Tanaman Bonsai", 5000000));
    }

    public ArrayList<Tanaman> getListTanaman() {
        return listTanaman;
    }

    public void setListTanaman(ArrayList<Tanaman> listTanaman) {
        this.listTanaman = listTanaman;
    }

}
