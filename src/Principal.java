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
    private JMenu jmCadastro;
    private JMenuItem jiClientes;
    private JMenuItem jiProdutos;
    private JMenuItem jiFuncionarios;
    private JMenuItem jmiSair;
    private JMenuItem jitemComputadores;
    private JMenuItem jitemComponentesHard;
    private JMenuItem jitemManutencao;
    private JMenuItem jitemOperacionaisAtend;
    private JMenuItem jiProdutosProntos;
    private JMenuItem jiServicos;
    private JMenuItem jiVendasR;
    private JMenuItem jiProdutosR;


    //
    public Principal() {
        setSize(1070,700);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);



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

