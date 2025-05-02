import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame{
    public JPanel principal;
    private JPanel jpanelTopo;
    private JPanel jpanelBotoes;
    private JLabel txtSenha;
    private JLabel txtLogin;
    private JPasswordField jpSenha;
    private JTextField txtFNome;
    private JComboBox comboBox1;
    private JButton jbLogar;
    private JButton jbSair;

    public Cadastro() {

        jbSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtFNome.getText().equals("j") && new String(jpSenha.getPassword()).equals("1")) {
                    JOptionPane.showMessageDialog(null, "Login: " + txtFNome.getText() +
                            "\nPerfil: " + comboBox1.getSelectedItem());
                    new Principal();
                } else {
                    JOptionPane.showMessageDialog(null, "Login inválido");
                    txtFNome.requestFocus();
                    txtFNome.setText("");
                    jpSenha.setText("");
                }
            }
        });
    }
}


