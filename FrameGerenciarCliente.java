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

public class FrameGerenciarCliente
{
private Janela janela;
private Cliente cliente;
private Produto produto;

    // Construtor
    public FrameGerenciarCliente(Janela janela, Cliente cliente)
    {
        setJanela(janela);
        setCliente(cliente);
        configJanelaDeGerenciamento();
    }


    // metodos
    public void configJanelaDeGerenciamento()
    {
        JPanel painel = new JPanel(new GridLayout(8, 2)); // deve ser arrumado para caber 

        painel.add(new JLabel(" id Cliente: " + cliente.getIdCliente()));
        painel.add(new JLabel(" Nome: " + cliente.getNome()));
        painel.add(new JLabel(" Cpf: " + cliente.getCpf()));
        painel.add(new JLabel(" Endereco: " + cliente.getEndereco()));
        painel.add(new JLabel(" Idade: " + cliente.getIdade()));
        painel.add(new JLabel(" Num do Cartao: " + cliente.getNumCartao()));
        painel.add(new JLabel("Produto:"));
        painel.add(new JLabel("Preco:")); ///////////////////////////// ALTERAR
        for (int i = 0; i < 5; i++)
        {
            //produto = // busca o produto no bd
            //painel.add(new JLabel(produto.getNome()));
            //painel.add(new JLabel(produto.getPreco()));
        }
        // depois de tudo
        painel.add(new JLabel("Total gasto: " + cliente.getDinheiroGasto()));

        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }
    // Setters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
}