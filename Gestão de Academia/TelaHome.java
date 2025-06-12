import javax.swing.*;
import java.awt.*;

public class TelaHome extends JFrame {

    public TelaHome() {
        setTitle("Home - Sistema da Academia");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com layout em coluna e bordas
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel titulo = new JLabel("🏋️ Academia Vida Ativa", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Boas-vindas
        JLabel boasVindas = new JLabel("Bem-vindo(a)!", SwingConstants.CENTER);
        boasVindas.setFont(new Font("Arial", Font.PLAIN, 16));
        boasVindas.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Painel de botões com espaçamento
        JPanel painelBotoes = new JPanel(new GridLayout(2, 2, 10, 10));
        painelBotoes.setMaximumSize(new Dimension(250, 200)); // limita a largura dos botões
        painelBotoes.setAlignmentX(Component.CENTER_ALIGNMENT); // centraliza no eixo X

        JButton btnAluno = new JButton("Aluno");
        JButton btnTreino = new JButton("Treino");
        JButton btnSobre = new JButton("Sobre");
        JButton btnSair = new JButton("Sair");


        painelBotoes.add(btnAluno);
        painelBotoes.add(btnTreino);
        painelBotoes.add(btnSobre);
        painelBotoes.add(btnSair);

        // Adicionando tudo no painel principal
        painelPrincipal.add(titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));
        painelPrincipal.add(boasVindas);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 30)));
        painelPrincipal.add(painelBotoes);

        add(painelPrincipal);

        // Ações dos botões
        btnAluno.addActionListener(e -> {
            dispose();
            TelaAluno.main(null);
        });

        btnTreino.addActionListener(e -> {
            dispose();
            TelaTreino.main(null);
        });


        btnSobre.addActionListener(e -> {
            dispose();
            TelaSobre.main(null);
        });

        btnSair.addActionListener(e -> {
            dispose();
            TelaLogin.main(null);
        });
    }

    public static void main(String[] args) {
        new TelaHome().setVisible(true);
    }
}
