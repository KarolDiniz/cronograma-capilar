package br.com.view;
import java.awt.Color;
import java.awt.Font;
//import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class TelaPadrao extends JFrame {

    public TelaPadrao(String nome) {
        setTitle(nome);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        Color azulEscuro = new Color(0,50,90);
        getContentPane().setBackground(azulEscuro);
        this.setIconImage(new javax.swing.ImageIcon("src/main/java/view/assets/icon.png").getImage());

    }
    protected JLabel addLabel(String nome, String fonte, int x, int y, int a, int l, int tamanho,Color cor) {
        JLabel label = new JLabel(nome);
        label.setForeground(cor);
        label.setBounds(x, y, a,l);
        label.setFont(new Font(fonte, Font.PLAIN, tamanho));
        add(label );
        return label;
    }
}