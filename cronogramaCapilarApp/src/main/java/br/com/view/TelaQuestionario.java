package br.com.view;
import javax.swing.*;
import java.awt.*;

public class TelaQuestionario extends TelaPadrao {

    public TelaQuestionario() {
        super("Questionario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos ComboBox
        String[] comprimento = {"Curto", "Médio", "Longo"};
        String[] curvatura = {"Liso", "Ondulado", "Cacheado", "Crespo"};
        String[] oleosidade = {"Seco", "Normal", "Oleoso"};
        String[] estado = {"Saudável", "Danificado", "Quebradiço", "Com Queda"};

        JComboBox<String> comprimentoComboBox = new JComboBox<>(comprimento);
        JComboBox<String> curvaturaComboBox = new JComboBox<>(curvatura);
        JComboBox<String> oleosidadeComboBox = new JComboBox<>(oleosidade);
        JComboBox<String> estadoComboBox = new JComboBox<>(estado);

        // Criação do Painel
        JPanel painel = new JPanel(new GridLayout(4, 2));
        painel.add(new JLabel("Comprimento:"));
        painel.add(comprimentoComboBox);
        painel.add(new JLabel("Curvatura:"));
        painel.add(curvaturaComboBox);
        painel.add(new JLabel("Oleosidade:"));
        painel.add(oleosidadeComboBox);
        painel.add(new JLabel("Estado:"));
        painel.add(estadoComboBox);
        setSize(400,500);
        // Adiciona o Painel à TelaQuestionario
        getContentPane().add(painel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaQuestionario();
    }
}