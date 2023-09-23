package PraktikkumGui_1.Modul4.Ch14Sample;

import javax.swing.*;
import java.awt.*;

public class Ch14AbsolutePositioning extends JFrame {
    //Membuat variabel untuk frame
    private static  final  int FRAME_WIDTH =  300;
    private static final  int FRAME_HEIGHT = 200;
    private  static  final int FRAME_X_ORIGIN = 100;
    private  static  final int FRAME_Y_ORIGIN = 100;
    private  static final int BUTTON_HEIGHT = 40;
    private  static final int BUTTON_WIDTH = 80;

    public static void main(String[] args) {
        //Membuat objek absolute positioning
        Ch14AbsolutePositioning frame = new Ch14AbsolutePositioning();
        frame.setVisible(true);//membuat frame agar terlihat
    }

    public Ch14AbsolutePositioning(){
        //Membuat container
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH , FRAME_HEIGHT);//Mengatur ukuran container
        setResizable(true);//Membuat frame agar bisa diatur ukuran
        setTitle("Program Ch14AbsolutePositioning");//Membuat judul program
        setLocation(FRAME_X_ORIGIN , FRAME_Y_ORIGIN);//Membuat lokasi untuk komponen
        contentPane.setLayout(null);//Mengautr layout container dengan null
        contentPane.setBackground(Color.white);//Mengatur warna latar putih
        JButton okButton = new JButton("OK");//Membuat button ok
        okButton.setBounds(50 , 100 , BUTTON_WIDTH , BUTTON_HEIGHT);//Mengatur ukuran dan letak okbutton
        contentPane.add(okButton);//memambahkan okbutton ke dalam container

        JButton cancelButton = new JButton("Cancel");//membuat cancel button
        cancelButton.setBounds(160,100, BUTTON_WIDTH , BUTTON_HEIGHT);//mengatur ukuran dan letak cancelbutton
        contentPane.add(cancelButton);//menambahkan cancelbutton ke container

        setDefaultCloseOperation(EXIT_ON_CLOSE);//membuat program agar bisa close
    }
}
