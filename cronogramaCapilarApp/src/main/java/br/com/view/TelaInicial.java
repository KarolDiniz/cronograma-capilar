package br.com.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
public class TelaInicial extends TelaPadrao{

    private Color orchid = new Color(160,82,45);
    private Color magnetta = new Color(255,250,240);
    private Color amarelo = new Color(240,230,140);
    private JButton botaoFuncinario;

    public TelaInicial() {
        super("Menu");
        super.setSize(340,440);
        conf();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void conf() {

        super.addLabel("╔════════ ------ ════════╗", "Serif", 40,10,490,60,20,magnetta);
        super.addLabel("CRONOGRAMA","Calibri", 50,40,490,60,35,Color.cyan);
        super.addLabel("CAPILAR","Calibri", 60,90,490,60,35,Color.magenta);
        super.addLabel("╚════════ ------ ════════╝","Serif", 40,130,490,60, 20,magnetta);
        //super.addLabel("Seja bem vindo(a), a padaria pão com ovo.", "Arial", 40,175,300,30,13,magnetta);


        addButton("Questionario", 40,250,250, 30);
        addButton("Sobre", 40,290,250, 30);
        addButton("Sair", 40,330,250, 30);
    }

    public class OuvinteInternoMenu implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String botao = e.getActionCommand();
            switch (botao) {
                case "Questionario":

                    dispose();
                    break;
                case "Sobre":

                    dispose();
                    break;
                case "Sair":
                    dispose();
            }
        }
    }

    private JButton addButton (String nome, int x, int y, int a, int l) {
        JButton button = new JButton(nome);
        button.setForeground(magnetta);
        button.setBounds(x, y, a,l);
        button.setBackground(orchid);
        add(button);
        button.addActionListener(new OuvinteInternoMenu());
        return button;
    }

    public JButton getBotaoFuncinario() {
        return botaoFuncinario;
    }
}
