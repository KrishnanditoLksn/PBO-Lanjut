package PraktikkumGui_1.Modul5.Ch14Sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A sample handler for processing action events of buttons.
 */
class ButtonHandler implements ActionListener {


//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public ButtonHandler() {

    }

//-------------------------------------------------
//      Public Methods:
//
//          void    actionPerformed   (   ActionEvent        )
//
//------------------------------------------------

    /**
     * Standard method to respond the action event.
     *
     * @param event the ActionEvent object
     */
    public void actionPerformed(ActionEvent event) {//Membuat method actionperformed
        String button2 = event.getActionCommand();//action command untuk menerima input yang terhubung dengan komponen
        JButton clickedButton = (JButton) event.getSource();//Membuat objek event menampilkan action
        String buttonText = clickedButton.getText();//Menampilkan output dari sebuah action berupa string
        JRootPane rootPane = clickedButton.getRootPane();//mengakses frame (JFrame) yang mengandung tombol yang telah diklik
        Frame frame = (JFrame) rootPane.getParent();


        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();
        if (button2.equals("Click Me")) {//Jika button 2 sama dengan button click me""
            frame.setTitle("Dibuat dengan cara -2 You clicked " + buttonText);//menampilkan tittle
        } else {
            frame.setTitle("You clicked " + buttonText);//menampilkan title
        }
    }
}
