/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikkumGui_1.ModulThreads;

/**
 *
 * @author ASUS
 */
public class Contoh1 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Angka " + i);
            }
        } catch (Exception ex) {
                ex.printStackTrace();
        }
    }
    
    public static void main(String[]args){
            Contoh1 out = new Contoh1();
            out.start();
    }
}
