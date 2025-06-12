import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaTreino {
    public static void main(String[] args) {
        // Criando janela
        JFrame frame = new JFrame("Treino por Grupo Muscular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(1, 3, 10, 10));

        JButton btnInferiores = new JButton("Inferiores");
        JButton btnSuperiores = new JButton("Superiores");
        JButton btnAbdomen = new JButton("Abdômen + Cardio");

        painelBotoes.add(btnInferiores);
        painelBotoes.add(btnSuperiores);
        painelBotoes.add(btnAbdomen);

        // Área de texto para mostrar o treino
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        // Funções dos botões
        btnInferiores.addActionListener(e -> {
            areaTexto.setText("""
🔹Inferiores (Glúteos + Quadríceps)
- Agachamento livre – 4x10-12
- Cadeira extensora – 3x12
- Leg press – 4x10
- Cadeira abdutora – 3x15
- Elevação pélvica (Hip Thrust) – 4x12
- Stiff com halteres – 3x10

🔹Inferiores (Posterior + Glúteos)
- Stiff – 4x10-12
- Mesa flexora – 3x12
- Avanço (passada) – 3x10 por perna
- Elevação pélvica com peso – 4x12
- Glúteo na polia ou 4 apoios – 3x15
""");
        });

        btnSuperiores.addActionListener(e -> {
            areaTexto.setText("""
🔹Superiores (Costas + Bíceps)
- Puxada na frente – 4x12
- Remada baixa – 3x12
- Rosca direta – 3x12
- Rosca alternada – 3x12
- Remada unilateral – 3x10

🔹Superiores (Peito + Tríceps + Ombros)
- Supino reto – 4x10-12
- Crucifixo – 3x12
- Tríceps corda – 3x15
- Tríceps banco – 3x12
- Elevação lateral – 3x12
""");
        });

        btnAbdomen.addActionListener(e -> {
            areaTexto.setText("""
🔹Abdômen + Cardio 
- Abdominal supra – 3x20
- Prancha – 3x30-60 segundos
- Abdominal infra – 3x15
- Esteira ou escada – 20-30min
- Elevação pélvica + isometria – 3x15 seg
""");
        });

        // Botão de voltar (fecha a tela)
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            frame.dispose();
            TelaHome.main(null);
        });

        JPanel painelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelInferior.add(btnVoltar);

        // Adicionando à janela
        frame.add(painelBotoes, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(painelInferior, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
