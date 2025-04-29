import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clientes extends JFrame{
    private JLabel jlCpf;
    private JLabel jlEmail;
    private JLabel jlTelefone;
    private JTextField tfNome;
    private JButton jbNovo;
    private JButton jbEditar;
    private JButton jbDeletar;
    private JButton jbSalvar;
    private JButton jbSair;
    private JTextField tfCpf;
    public JPanel pClientes;
    private JTextField tfEmail;
    private JTextField tfTelefone;
    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelEmail;
    private JLabel labelTelefone;

    public Clientes() {
       setSize(600,500);
       setContentPane(pClientes);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       desabilita();

        jbNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitar();
            }
        });
        jbSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaCampos();
                desabilita();
                jbNovo.setEnabled(true);
            }
        });
        jbSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void limpaCampos(){
        tfNome.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
    }

    public void desabilita(){
        tfNome.setEnabled(false);
        tfCpf.setEnabled(false);
        tfEmail.setEnabled(false);
        tfTelefone.setEnabled(false);
       jbEditar.setEnabled(false);
       jbDeletar.setEnabled(false);
       jbSalvar.setEnabled(false);
       jbNovo.setEnabled(true);
    }

    public void habilitar(){
        tfNome.setEnabled(true);
        tfCpf.setEnabled(true);
        tfEmail.setEnabled(true);
        tfTelefone.setEnabled(true);
        jbEditar.setEnabled(true);
        jbDeletar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbNovo.setEnabled(false);
    }

}
