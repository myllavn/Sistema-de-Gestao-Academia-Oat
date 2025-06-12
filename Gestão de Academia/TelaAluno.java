import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TelaAluno {
    public static void main(String[] args) {
        // Janela principal
        JFrame frame = new JFrame("Lista de Alunos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());

        // Cabeçalho da tabela
        String[] colunas = {"Nome", "CPF", "Matrícula", "Telefone"};

        // Dados exemplo (você pode puxar de um banco ou array depois)
        String[][] dados = {
                {"Ana Clara", "123.456.789-00", "2021001", "(11) 99999-1111"},
                {"Bruno Silva", "234.567.890-11", "2021002", "(11) 98888-2222"},
                {"Carlos Souza", "345.678.901-22", "2021003", "(11) 97777-3333"},
                {"Daniela Lima", "456.789.012-33", "2021004", "(11) 96666-4444"}
        };

        // Modelo da tabela
        DefaultTableModel model = new DefaultTableModel(dados, colunas) {
            // Impede edição nas células
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Criação da tabela
        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Botão de voltar
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            frame.dispose();
            TelaHome.main(null);
        });

        // Painel do botão
        JPanel painelBotao = new JPanel();
        painelBotao.add(btnVoltar);
        frame.add(painelBotao, BorderLayout.SOUTH);

        // Exibir janela
        frame.setLocationRelativeTo(null); // Centraliza
        frame.setVisible(true);
    }
}
