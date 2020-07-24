import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoDoBotaoLogin implements ActionListener
{
private Janela janela;

private int opcao;
private Produto produto;

private JTextField txtIdUsuario;
private JPasswordField txtSenhaUsuario;

    // Construtor para a compra de um produto
    public OuvidoDoBotaoLogin(Janela janela, Produto produto, JTextField txtIdUsuario, JPasswordField txtSenhaUsuario)
    {
        setJanela(janela);
        setProduto(produto);
        setTxtIdUsuario(txtIdUsuario);
        setTxtSenhaUsuario(txtSenhaUsuario);
    }
    // Construtor para uma loja
    public OuvidoDoBotaoLogin(Janela janela, JTextField txtIdUsuario, JPasswordField txtSenhaUsuario, int opcao)
    {
        setJanela(janela);
        setOpcao(opcao);
        setTxtIdUsuario(txtIdUsuario);
        setTxtSenhaUsuario(txtSenhaUsuario);
    }

    // Action
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        String aux = new String(txtSenhaUsuario.getPassword());
        FrameGerenciarLoja frameGerenciarLoja;
        FrameGerenciarCliente frameGerenciarCliente;
        JPanel painel = new JPanel();

        if(txtIdUsuario.getText().equals("") || aux.equals(""))
            JOptionPane.showMessageDialog(null, "Senha ou usuario invalido!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        else
        {
            //for(int i; i < n; i++)
            //  procura se tem usuario com nome, no final compara se tiver continua, se n mande erro
            //      if(produtos != null) {frame continua compra}
            //      else if opcao == 0 -> {frame gerencia cliente}
            //      else, opcao == 1 -> {frame gerencia loja}
            if(produto != null)
            {
                //frameCompra = new FrameCompra()
            }
            else if(opcao == 0)
            {
                frameGerenciarCliente = new FrameGerenciarCliente(janela, new Cliente("box", "jiar", "545405454", "Rua videl, 123", "1231.124", 13));
            }
            else
            {
                frameGerenciarLoja = new FrameGerenciarLoja(janela, new Loja("id 23", "Casas Bahia", "Rua dos Pardais, 544"));
            }
        }
    } 
    
    // settters e getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }
    public void setTxtIdUsuario(JTextField txtIdUsuario)
    {
        this.txtIdUsuario = txtIdUsuario;
    }
    public void setTxtSenhaUsuario(JPasswordField txtSenhaUsuario)
    {
        this.txtSenhaUsuario = txtSenhaUsuario;
    }
    public void setOpcao(int opcao)
    {
        this.opcao = opcao;
    }


}