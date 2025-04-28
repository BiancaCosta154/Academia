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
    private JButton button1;
    public JPanel JPFuncionarios;


    public Funcionarios() {
        setSize(1200,600);
        setContentPane(JPFuncionarios); // content pane coloca os elemenos no jframe
        setDefaultCloseOperation(EXIT_ON_CLOSE); //maneira de fechar o programa
        setLocationRelativeTo(null); //abre a tela no centro
        setVisible(true); // aparece o frame
    }
}
