package PraktikkumGui_1.Modul4.Ch14Sample;

import javax.swing.*;
import java.awt.*;

public class Ch14JListSample extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public Ch14JListSample(){
        Container contentPane;
        JPanel listPanel , okPanel;

        JButton okButton;
        String [] names = {"Ape","Bat","Bee","Cat","Dog","Eel","Fox","Gnu","Hen","Man","Sow","Yak"};
        setSize(FRAME_WIDTH , FRAME_HEIGHT);
        setTitle("Program Ch14JListSample2");
        setLocation(FRAME_X_ORIGIN , FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place a jList
        listPanel = new JPanel(new GridLayout());
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));

        JList<String>list;
        list = new JList<>(names);
        listPanel.add(new JScrollPane(list));


        //create and place OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);

        contentPane.add(listPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ch14JListSample ch14JListSample = new Ch14JListSample();
        ch14JListSample.setVisible(true);
    }
}
