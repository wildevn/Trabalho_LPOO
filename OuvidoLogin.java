import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoLogin implements ActionListener
{
private Janela janela;
private Produto produto;
private int opcao;
private JTextField txtIdUsuario;
private JPasswordField txtSenhaUsuario;

    // Construtores
    public OuvidoLogin(Janela janela, Produto produto)
    {
        setJanela(janela);
        setProduto(produto);
    }
    // fazer outro construtor para login de uma loja
    public OuvidoLogin(Janela janela, int opcao)
    {
        setJanela(janela);
        setOpcao(opcao);
    }


    public void actionPerformed(ActionEvent evento)
    {
        JPanel painelLogin = new JPanel(new GridLayout(5, 1));
        JButton botaoOkLogin = new JButton("Login");
        
        
        painelLogin.add(new JLabel("Id Cliente/Loja:"));
        txtIdUsuario = new JTextField();
        painelLogin.add(txtIdUsuario);

        painelLogin.add(new JLabel("Senha:"));
        txtSenhaUsuario = new JPasswordField();
        painelLogin.add(txtSenhaUsuario);

        if(produto != null) 
        {
            botaoOkLogin.addActionListener(new OuvidoDoBotaoLogin(janela, produto, txtIdUsuario, txtSenhaUsuario));
        }        
        else// se ele nao tiver um produto, entao ele esta tentando fazer o login de uma loja ou cliente
        {
            botaoOkLogin.addActionListener(new OuvidoDoBotaoLogin(janela, txtIdUsuario, txtSenhaUsuario, opcao));
        }        
        painelLogin.add(botaoOkLogin);


        janela.removePainelAnterior();
        janela.setPainelAnterior(painelLogin);
        janela.getFrame().add(painelLogin);
        janela.getFrame().setVisible(true);
    }


    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }
    public void setOpcao(int opcao)
    {
        this.opcao = opcao;
    }
}