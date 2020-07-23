import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameLoja
{
private Janela janela;
private Loja loja;
private JPanel painelLoja;
private JButton botaoProdutos;

    // construtor
    FrameLoja(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
        botaoProdutos = new JButton("Produtos da loja");
        painelLoja = new JPanel(new GridLayout(2, 2)); // mudar a quantidade de itens para ficar correto
        painelLoja.add(new JLabel("Nome: " + loja.getNome()));
        painelLoja.add(new JLabel("Endereco:" + loja.getEndereco()));
        //painelLoja.add(new JLabel("Qta max sem juros no cartao: " + loja.getMaxSemJurosCartao()));
        //painelLoja.add(new JLabel("Qta max com juros no cartao: " + loja.getMaxComJurosCartao()));
        painelLoja.add(new JLabel("Quantidade de produtos: " + loja.getIdProdutos().getQuantElementosAdicionados()));
        botaoProdutos.addActionListener(new OuvidoDoBotaoExibirProdutosLoja(janela, loja));
        painelLoja.add(botaoProdutos); // adicionar action listener

        janela.removePainelAnterior();
        janela.setPainelAnterior(painelLoja);
        janela.getFrame().add(painelLoja, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setLoja(Loja loja)
    {
        this.loja = loja;
    }

}
