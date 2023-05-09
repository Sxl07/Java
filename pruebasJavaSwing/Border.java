import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Border{
    public static void main(String[] args) {
        JButton [] botones = new JButton[4];
        JFrame ventanita = new JFrame("prueba Borderlayout");
        ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i=0; i<botones.length; i++ ){
            botones[i]=new JButton("Boton"+(i+1));
        }
        
        ventanita.add(botones[0],BorderLayout.NORTH);
        ventanita.add(botones[1],BorderLayout.EAST);
        ventanita.add(botones[2],BorderLayout.WEST);
        ventanita.add(botones[3],BorderLayout.SOUTH);
        ventanita.add(new JLabel("este es el centro"),BorderLayout.CENTER);
        ventanita.setSize(400,400);
        //ventanita.pack();
        ventanita.setVisible(true);

        botones[0].addActionListener(new ActionListener(){
        @Override
         public void actionPerformed(ActionEvent e){
            System.out.println("sebastian");
         }
        });
    }


}