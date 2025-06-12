import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        setTitle("Login - Sistema da Academia");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com padding
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(new EmptyBorder(10, 10, 10, 10)); // margem interna de 10px

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // espaçamento entre os componentes

        JLabel lblUsuario = new JLabel("Usuário:");
        JTextField txtUsuario = new JTextField(15);

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField(15);

        JButton btnEntrar = new JButton("Entrar");

        // Linha 0 - Usuário
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        painel.add(lblUsuario, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painel.add(txtUsuario, gbc);

        // Linha 1 - Senha
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        painel.add(lblSenha, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painel.add(txtSenha, gbc);

        // Linha 2 - Botão
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(btnEntrar, gbc);

        add(painel);

        btnEntrar.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            if (usuario.equals("admin") && senha.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
                dispose(); // Fecha a tela de login
                new TelaHome().setVisible(true); // Abre a tela Home
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.");
            }
        });
    }

    public static void main(String[] args) {
        new TelaLogin().setVisible(true);
    }
}


