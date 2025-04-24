import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clientes extends JFrame{
    private JLabel jlCpf;
    private JLabel jlEmail;
    private JLabel jlTelefone;
    private JTextField jfNome;
    private JLabel jlNome;
    private JButton jbNovo;
    private JButton jbEditar;
    private JButton jbDeletar;
    private JButton jbSalvar;
    private JButton jbSair;
    private JTextField tfCpf;
    public JPanel pClientes;
    private JTextField tfEmail;
    private JTextField tfTelefone;

    public Clientes() {
       setSize(1200,400);
       setContentPane(new Clientes().pClientes);
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
    }

    public void limpaCampos(){
        jfNome.setText("");
        jlCpf.setText("");
        jlEmail.setText("");
        jlTelefone.setText("");
    }

    public void desabilita(){
        jfNome.setEnabled(false);
        jlCpf.setEnabled(false);
        jlEmail.setEnabled(false);
        jlTelefone.setEnabled(false);
       jbEditar.setEnabled(false);
       jbDeletar.setEnabled(false);
       jbSalvar.setEnabled(false);
    }

    public void habilitar(){
        jfNome.setEnabled(true);
        jlCpf.setEnabled(true);
        jlEmail.setEnabled(true);
        jlTelefone.setEnabled(true);
        jbEditar.setEnabled(true);
        jbDeletar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbNovo.setEnabled(false);

    }

}
