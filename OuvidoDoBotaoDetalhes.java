import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoDetalhes implements ActionListener
{
private Janela janela;
private Loja loja;
private Produto produto;

    // construtores
    OuvidoDoBotaoDetalhes(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
    }
    OuvidoDoBotaoDetalhes(Janela janela, Produto produto)
    {
        setJanela(janela);
        setProduto(produto);
    }
    


    @Override
    public void actionPerformed(ActionEvent evento)
    {
        JPanel painel;
        // Descobrindo qual elemento nao e nulo para exibir os detalhes
        if(loja != null)
        {
            FrameLoja frameLoja = new FrameLoja(janela, loja);
        }
        else
        {
            FrameProduto frameProduto = new FrameProduto(janela, produto);
        }
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
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

}
