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
 * A sample frame to illustrate event handling
 * with the Swing JFrame.
 */
class Ch14JButtonFrame extends JFrame implements ActionListener {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * Default width for buttons
     */
    private static final int BUTTON_WIDTH = 80;

    /**
     * Default height for buttons
     */
    private static final int BUTTON_HEIGHT = 30;

    /**
     * The Swing button
     */
    private final JButton button, button2;
    private JTextField pesan;


    /**
     * Default constructor
     */
    public Ch14JButtonFrame() {

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //Membuat text field
        pesan = new JTextField();
        pesan.setColumns(20);
        contentPane.add(pesan);

        //create and place two buttons on the frame's content pane
        button = new JButton("Click Me");
        button2 = new JButton("Tombol2");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        contentPane.add(button2);

        //registering a ButtonHandler as an action listener of the two buttons
        /*       ButtonHandler handler = new ButtonHandler();*/
        button.addActionListener(this);
        button2.addActionListener(this);




        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
    }

//----------------------------------
//    Constructors
//----------------------------------

    //----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }

    //Membuat action untuk button
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();//Membuat objek event menampilkan action
        JRootPane rootPane = clickedButton.getRootPane();//mengakses frame (JFrame) yang mengandung tombol yang telah diklik
        Frame frame = (JFrame) rootPane.getParent();
        String buttontext = clickedButton.getText();//Membuat variabel string yang menerima input click dan akan menampilkan output string di title


        if (buttontext.equals("Click Me")) {//Jika button input  user sama degan button click me
            String isiPesan = pesan.getText();
            frame.setTitle(isiPesan);
        } else {
            frame.setTitle("You clicked" + buttontext);
        }
    }
}
