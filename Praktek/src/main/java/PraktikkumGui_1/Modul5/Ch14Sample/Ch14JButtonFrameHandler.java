package PraktikkumGui_1.Modul5.Ch14Sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A sample frame to illustrate the placing of GUI objects and event handling
 * with the Swing JFrame.
 */
class Ch14JButtonFrameHandler extends JFrame implements ActionListener
{

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 200;

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
    private static final int BUTTON_WIDTH  = 80;

    /**
     * Default height for buttons
     */
    private static final int BUTTON_HEIGHT = 30;

    /**
     * The Swing button for Cancel
     */
    private JButton cancelButton;


    /**
     * The Swing button for OK
     */
    private JButton okButton;


//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14JButtonFrameHandler frame = new Ch14JButtonFrameHandler();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Ch14JButtonFrameHandler() {

        Container contentPane = getContentPane( );

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program Ch14JButtonFrameHandler");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //set the content pane properties
        contentPane.setLayout(new FlowLayout());
        //contentPane.setBackground(Color.white);

        //create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
      //  okButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
                //Note: setSize does not have an effect with
               //      when a layout manager is used.
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
      //  cancelButton.setBounds(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        //registering this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
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
     *
     */
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();

        String  buttonText = clickedButton.getText();

        this.setTitle("You clicked " + buttonText);
    }

}
