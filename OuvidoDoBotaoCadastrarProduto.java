import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoDoBotaoCadastrarProduto implements ActionListener
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
private FrameGerenciarLoja frameGerenciarLoja;

    // Construtor 
    public OuvidoDoBotaoCadastrarProduto(Janela janela, Loja loja, JTextField txtNome, JTextField txtCor, JTextField txtDescricaoTecnica, JTextField txtTipoEspecifico, JTextField txtTipo, JTextField txtPreco, JTextField txtQuantidade)
    {
        setJanela(janela);
        setLoja(loja);
        setTxtNome(txtNome);
        setTxtCor(txtCor);
        setTxtDescricaoTecnica(txtDescricaoTecnica);
        setTxtTipoEspecifico(txtTipoEspecifico);
        setTxtTipo(txtTipo);
        setTxtQuantidade(txtQuantidade);
        setTxtPreco(txtPreco);
    }

    public void actionPerformed(ActionEvent evento)
    {
        if(txtNome.getText().equals("") || txtCor.getText().equals("") || txtDescricaoTecnica.getText().equals("") || txtTipoEspecifico.getText().equals("") || txtPreco.getText().equals("") || txtQuantidade.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para o cadastramento de um novo produto!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtTipo.getText().equals("acessorio") || txtTipo.getText().equals("tecnologia") || txtTipo.getText().equals("diaadia"))
        {
            // cria novo produto e armazena no banco de dados
            JOptionPane.showMessageDialog(null, "Produto cadastrada com sucesso!", "Alert!!!", JOptionPane.ERROR_MESSAGE); // mandar para o bd
            frameGerenciarLoja = new FrameGerenciarLoja(janela, loja);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique se o tipo foi digitado corretamente!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Setters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setLoja(Loja loja)
    {
        this.loja = loja;
    }
    public void setTxtNome(JTextField txtNome)
    {
        this.txtNome = txtNome;
    }
    public void setTxtCor(JTextField txtCor)
    {
        this.txtCor = txtCor;
    }
    public void setTxtDescricaoTecnica(JTextField txtDescricaoTecnica)
    {
        this.txtDescricaoTecnica = txtDescricaoTecnica;
    }
    public void setTxtTipoEspecifico(JTextField txtTipoEspecifico)
    {
        this.txtTipoEspecifico = txtTipoEspecifico;
    }
    public void setTxtTipo(JTextField txtTipo)
    {
        this.txtTipo = txtTipo;
    }
    public void setTxtQuantidade(JTextField txtQuantidade)
    {
        this.txtQuantidade = txtQuantidade;
    }
    public void setTxtPreco(JTextField txtPreco)
    {
        this.txtPreco = txtPreco;
    }

}