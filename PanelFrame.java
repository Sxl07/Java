import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
class PanelFrame extends JFrame {
    private final JPanel buttonJPanel;
    private final JButton[] botones;
    private final JPanel midPanel;

    PanelFrame(){
        super("demostracion de paneles");
        botones=new JButton[5];
        buttonJPanel = new JPanel();

        buttonJPanel.setLayout(new GridLayout(1,botones.length));


        for (int i = 0; i < botones.length; i++) {
            botones[i]=new JButton("button "+(i+1));
            buttonJPanel.add(botones[i]);
        }

        midPanel = new JPanel();
        //midPanel.setLayout(new FlowLayout());
        JTextArea comentario = new JTextArea();
        JLabel lbl_comentario = new JLabel("sucre mantiene candela");
        midPanel.add(lbl_comentario);
        midPanel.add(comentario);
        this.add(midPanel,BorderLayout.CENTER);
        this.add(buttonJPanel,BorderLayout.SOUTH);
    }
}