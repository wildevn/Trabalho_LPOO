import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoDoBotaoAdicionarProduto implements ActionListener
{
private Janela janela;
private Loja loja;

private JPanel painel;
private JTextField txtNome;
private JTextField txtCor;
private JTextField txtDescricaoTecnica;
private JTextField txtTipoEspecifico;
private JTextField txtTipo;
private JTextField txtPreco;
private JTextField txtQuantidade;
private JButton botaoCadastrar;


    // construtor;
    public OuvidoDoBotaoAdicionarProduto(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
    }

    // Action
    public void actionPerformed(ActionEvent evento)
    {
        painel = new JPanel(new GridLayout(9, 2));

        painel.add(new JLabel(" Nome do Produto:"));
        txtNome = new JTextField();
        painel.add(txtNome);

        painel.add(new JLabel(" Cor: "));
        txtCor = new JTextField();
        painel.add(txtCor);

        painel.add(new JLabel(" Descricao Tecnica:"));
        txtDescricaoTecnica = new JTextField();
        painel.add(txtDescricaoTecnica);

        painel.add(new JLabel(" Tipo (acessorio, tecnologia ou diaadia):"));
        txtTipo = new JTextField();
        painel.add(txtTipo);
        
        painel.add(new JLabel(" Tipo (Mais especifico):"));
        txtTipoEspecifico = new JTextField();
        painel.add(txtTipoEspecifico);

        painel.add(new JLabel(" Quantidade:"));
        txtQuantidade = new JTextField();
        painel.add(txtQuantidade);

        painel.add(new JLabel(" Preco:"));
        txtPreco = new JTextField();
        painel.add(txtPreco);

        painel.add(new JLabel("")); // setado no painel apenas para preeencher espacos do grid e mandar o botao para a proxima linha a direita

        botaoCadastrar = new JButton("Cadastrar"); 
        botaoCadastrar.addActionListener(new OuvidoDoBotaoCadastrarProduto(janela, loja, txtNome, txtCor, txtDescricaoTecnica, txtTipoEspecifico, txtTipo, txtPreco, txtQuantidade));
        painel.add(botaoCadastrar);


        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel);
        janela.getFrame().setVisible(true);
        
    }

// setters
public void setJanela(Janela janela)
{
    this.janela = janela;
}
public void setLoja(Loja loja)
{
    this.loja = loja;
}
}