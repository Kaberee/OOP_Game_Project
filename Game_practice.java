import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

import javax.swing.*;
public class Game_practice{
    public static void main(String[] args){

        JLabel label=new JLabel();
        label.setText("Welcome to the Combat Game!");
        ImageIcon icon=new ImageIcon("logo.jpg");
        Border border=BorderFactory.createLineBorder(Color.WHITE,3);

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Times New Roman",Font.ITALIC,30));
        label.setIconTextGap(10);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 750, 375);

        JFrame frame=new JFrame();
        frame.setTitle("Combat Game Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,750);
        frame.setVisible(true);
        frame.add(label);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(0x81C4CC));
       
    }
}