import javax.swing.*;

public class Produtos extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel txtProdutos;
    private JLabel txtNomeProduto;
    private JLabel txtCodProd;
    private JLabel txtPrecoProd;
    private JButton bSalvarProd;
    private JPanel pProdutos;

    public Produtos(){
       setSize(400,300);
       setContentPane(pProdutos);
       setLocationRelativeTo(null);
       setVisible(true);
   }


}
