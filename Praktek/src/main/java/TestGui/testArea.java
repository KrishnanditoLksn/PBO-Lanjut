package TestGui;

import javax.swing.*;
import java.awt.*;

public class testArea {
    public static void main(String[] args) {
        JTextArea jTextArea;
        JFrame jFrame = new JFrame();
        Container container = new Container();
        jTextArea = new JTextArea();
        jTextArea.setColumns(22);
        jTextArea.setRows(8);
        jTextArea.setEditable(false);
        jTextArea.setText("sopo jenengmu ? ");
        jTextArea.setText("pie kabare jon");
        container.add(jTextArea);
        jFrame.setTitle("kok iso ??");
        jFrame.add(container);
    }
}
