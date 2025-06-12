import javax.swing.*;
import java.awt.*;

public class TelaSobre extends JFrame {

    public TelaSobre() {
        setTitle("Sobre a Academia");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com borda
        JPanel painel = new JPanel(new BorderLayout(10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // margem interna

        // Área de texto com rolagem
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setText(
                "🏋️‍♂️ Academia Vida Ativa\n\n" +
                        "Bem-vindo ao nosso sistema de gerenciamento!\n\n" +
                        "Este sistema permite cadastrar alunos, registrar treinos e consultar informações de maneira prática e eficiente.\n\n" +
                        "Desenvolvido por: Mylla Viana de Oliveira\nCurso: Sistema de Informação\nAno: 2025"
        );

        JScrollPane scroll = new JScrollPane(areaTexto);

        // Botão voltar centralizado no rodapé
        JButton btnVoltar = new JButton("Voltar");
        JPanel rodape = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rodape.add(btnVoltar);

        btnVoltar.addActionListener(e -> {
            dispose();
            new TelaHome().setVisible(true);
        });

        // Adiciona ao painel principal
        painel.add(scroll, BorderLayout.CENTER);
        painel.add(rodape, BorderLayout.SOUTH);

        add(painel);
    }

    public static void main(String[] args) {
        new TelaSobre().setVisible(true);
    }
}
