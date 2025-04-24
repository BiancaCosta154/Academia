import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    public JPanel painelPrincipal;
    private JPanel jpTop;
    private JMenu jmRelatorios;
    private JMenu jmVendas;
    private JMenu jmSair;
    private JMenu jmProdutos;
    private JMenu jmEquipamentos;
    private JMenu jmFuncionarios;
    private JMenu jmCadastro;
    private JMenuItem jiClientes;
    private JMenuItem jiProdutos;
    private JMenuItem jiRecepcionistas;
    private JMenuItem jiFuncionarios;


    //
    public Principal() {
        setSize(1200,600);
        setContentPane(painelPrincipal); // content pane coloca os elemenos no jframe
        setDefaultCloseOperation(EXIT_ON_CLOSE); //maneira de fechar o programa
        setLocationRelativeTo(null); //abre a tela no centro
        setVisible(true); // aparece o frame


    }
}

