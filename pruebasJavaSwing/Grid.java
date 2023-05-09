import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid {
    public static void main(String[] args) {
        JFrame ventanita = new JFrame("prueba FlowLayout");
        ventanita.setSize(300, 300);

        JPanel control=new JPanel(new GridLayout(2,2));
        JButton[] botones=new JButton[4];

        for (int i = 0; i < botones.length; i++) {
            botones[i]=new JButton("button"+(i+1));
            control.add(botones[i]);
        }

        ventanita.add(control);
        ventanita.setVisible(true);
        }
}
