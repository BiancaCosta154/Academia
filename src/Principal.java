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
    private JMenuItem jmiSair;


    //
    public Principal() {
        setSize(1265,700);
        setContentPane(painelPrincipal); // content pane coloca os elemenos no jframe
        setDefaultCloseOperation(EXIT_ON_CLOSE); //maneira de fechar o programa
        setLocationRelativeTo(null); //abre a tela no centro
        setVisible(true); // aparece o frame



        jiClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clientes clientes = new Clientes();
                clientes.setVisible(true);
            }
        });

        jiProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produtos produtos = new Produtos();
                produtos.setVisible(true);
            }
        });
        jiFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funcionarios funcionarios = new Funcionarios();
                funcionarios.setVisible(true);
            }
        });

        ;
        jmiSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    };






}

