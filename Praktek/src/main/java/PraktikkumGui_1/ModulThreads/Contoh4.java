package PraktikkumGui_1.ModulThreads;

public class Contoh4 {
    public static void main(String[] args) {
        Thread out = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 5  ; i++) {
                        System.out.println("Angka " + i);
                        Thread.sleep(1000);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        out.start();
    }
}
