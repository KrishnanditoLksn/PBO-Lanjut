package ReviewPbo.abstractInterface;

public class Main {
    public static void main(String[] args) {
        Penduduk[] anggota = new Penduduk[4];
        Ukm runnerProgram = new Ukm();
        anggota[0] = new Masyarakat();
        anggota[0].setNama("Diva");
        anggota[0].setTanggalLahir("31/9/1945");
        ((Masyarakat) anggota[0]).setNomor("321321321");

        anggota[1] = new Mahasiswa();
        anggota[1].setNama("Jono");
        anggota[1].setTanggalLahir("1/2/1970");
        ((Mahasiswa) anggota[1]).setNim("00000000");
        runnerProgram.setKetua((Mahasiswa) anggota[1]);

        anggota[2] = new Mahasiswa();
        anggota[2].setNama("Adri");
        anggota[2].setTanggalLahir("31/1/1998");
        ((Mahasiswa) anggota[2]).setNim("000000000");
        runnerProgram.setSekre((Mahasiswa) anggota[2]);

        anggota[3] = new Masyarakat();
        anggota[3].setNama("Handoko");
        anggota[3].setTanggalLahir("1/3/1921");
        ((Masyarakat) anggota[3]).setNomor("3213123322");
        runnerProgram.setAnggota(anggota);

        runnerProgram.setNamaUnit("Pelatihan Internet");
        System.out.println("Nama UKM : " + runnerProgram.getNamaUnit());
        System.out.println("Nama Ketua : " + runnerProgram.getKetua().getNama());
        System.out.println("Nama Sekretaris : " + runnerProgram.getSekre().getNama());

        System.out.println("Daftar Anggota  ");

        System.out.println("=".repeat(120));
        System.out.println("Nama" + "\t\t\t\t" + "Iuran" + "\t\t\t\t" + "Jenis Sertifikat" + "\t\t\t\t" + "Fasilitas" + "\t\t\t\t" + "Konsumsi");
        System.out.println("-".repeat(120));

        for (int i = 0; i < runnerProgram.getAnggota().length; i++) {
            if (runnerProgram.getAnggota()[i] instanceof Masyarakat masyarakat) {
                System.out.printf("%-20s%-20.2f%-20s%-20s%-20s%n",
                        masyarakat.getNama(),
                        masyarakat.hitungIuran(),
                        masyarakat.getJenisSertifikat(),
                        masyarakat.getFasilitas(),
                        masyarakat.getKonsumsi()
                );
            }

            if (runnerProgram.getAnggota()[i] instanceof Mahasiswa) {
                if (i == 1 || i == 2) {
                    System.out.printf("%-20s%-20.2s%-20s%-20s%-20s%n",
                            runnerProgram.getAnggota()[i].getNama(),
                            " - ",
                            ((Mahasiswa) runnerProgram.getAnggota()[i]).getJenisSertifikat(),
                            ((Mahasiswa) runnerProgram.getAnggota()[i]).getFasilitas(),
                            ((Mahasiswa) runnerProgram.getAnggota()[i]).getKonsumsi()
                    );
                }
            }
        }
        double totalIuran = 0;
        for (Penduduk penduduk : anggota) {
            totalIuran += penduduk.hitungIuran();
        }
        System.out.println("Total Iuran " + totalIuran);
    }
}