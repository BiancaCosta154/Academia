import javax.swing.*;

public class Funcionarios extends JFrame {
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel PFuncionarios;
    private JLabel txtNomeFunc;
    private JLabel txtCargoFunc;
    private JLabel txtDiasFunc;
    private JTextField horáriosTextField;
    private JLabel txtHorariosFunc;
    private JButton bSalvarFunc;
    public JPanel JPFuncionarios;


    public Funcionarios() {
        setSize(400,300);
        setContentPane(JPFuncionarios);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
