import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
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
        botaoProdutos = new JButton("exibir produtos da loja");
        painelLoja = new JPanel(new GridLayout(2, 2));
        painelLoja.add(new JLabel(loja.getNome()));
        painelLoja.add(new JLabel(loja.getEndereco()));
        painelLoja.add(new JLabel("Quantidade de produtos: ")); // falta pegar a quantidade de produtos da loja
        painelLoja.add(botaoProdutos);

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