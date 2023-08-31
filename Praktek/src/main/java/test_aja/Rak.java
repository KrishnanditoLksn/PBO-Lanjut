package test_aja;

import java.util.ArrayList;

public class Rak {
    ArrayList<Storage> storageArrayList = new ArrayList<>();
    private String name_rak;

    public Rak() {
       /* bukuArrayList.add(new Buku("2132", "Dongeng", "Si kancil"));
        bukuArrayList.add(new Buku("2323", "Fabel", "Malin Kundang"));
        bukuArrayList.add(new Buku("5721","Mitos","Roro Jonggrang"));*/
        storageArrayList.add(new Buku("2132", "Dongeng", "Si kancil"));
        storageArrayList.add(new Buku("2323", "Fabel", "Malin Kundang"));
        storageArrayList.add(new Buku("5721", "Mitos", "Roro Jonggrang"));
        storageArrayList.add(new Kaset("A223", "Kaset Jadul", "Big"));
    }


    public String searchingBuku(String judul) {
        for (Storage buku : storageArrayList) {
            if (buku instanceof Buku) {
                if (((Buku) buku).getJudul().equalsIgnoreCase(judul)) {
                    return ((Buku) buku).getJudul() + "\t" + buku.getJenis() + "\t" + buku.getKode();
                }
            }
        }
        return "nf";
    }

    public void tampilkanRak() {
        System.out.println("Daftar Item di rak : ");
        for (Storage counter1 : storageArrayList) {
            if (counter1 instanceof Buku) {
                System.out.println(((Buku) counter1).getJudul() + "\t" + counter1.getJenis() + "\t" + counter1.getKode());
            }
            if (counter1 instanceof Kaset) {
                System.out.println(((Kaset) counter1).getUkuran() + "\t" + counter1.getJenis() + "\t" + counter1.getKode());
            }
            else{
                throw new ClassCastException();
            }
        }
    }
}
