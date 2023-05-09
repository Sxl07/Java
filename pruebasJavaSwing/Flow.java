import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow {
    public static void main(String[] args) {
        JFrame ventanita=new JFrame("prueba flow layout");
        ventanita.setSize(300, 300);
        Container container =ventanita.getContentPane();
        container.setLayout(new FlowLayout());
        JButton[] botonoes = new JButton[4];

        for(int i=0;i<botonoes.length;i++){
            botonoes[i]=new JButton("buttton"+(i+1));
            ventanita.add(botonoes[i]);
            botonoes[i].repaint();
        }
        ventanita.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        ventanita.setVisible(true);
    }
}
