package PraktikkumGui_1.ModulThreads;

public class Contoh3  extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 5  ; i++) {
            try {
                System.out.println("Angka " + i );
            }catch (Exception ex ){
                System.out.println("Pesan error : " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Contoh3  contoh3 = new Contoh3();

        Thread td = new Thread(contoh3);
        td.start();
    }
}
