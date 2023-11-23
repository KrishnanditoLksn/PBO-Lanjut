/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikkumGui_1.ModulThreads;

/**
 * @author ASUS
 */
public class Contoh2 extends Thread {
    public static void main(String[] args) {
            Contoh2 out  = new Contoh2();
            Contoh2 out2 = new Contoh2();

            out.start();
            out2.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Angka " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

