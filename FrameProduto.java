import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameProduto
{
private Janela janela;
private Produto produto;
private JPanel painel;
private JPanel painelInterno;
private JButton botaoDetalhes;
private JButton botaoComprar;


    // Construtor
    public FrameProduto(Janela janela, Produto produto) // precisa do frame gerado anteriormente
    {
        setJanela(janela);
        setProduto(produto);
        painel = new JPanel(new GridLayout(3,2)); // Necessista arrumar a quantidade de linhas e colunas alem dos itens a serem mostrados na tela e o botao de compra
        painelInterno = new JPanel(new GridLayout(2, 1));

        painelInterno.add(new JLabel("  Nome: " + produto.getNome())); 
        painelInterno.add(new JLabel("  Cor: " + produto.getCor()));                                 // 2
        painel.add(painelInterno);
       
        painel.add(new JLabel("  Descricao Tecnica: " + produto.getDescricaoTecnica()));      // 3

        painelInterno = new JPanel(new GridLayout(2, 1));
        if(produto instanceof Acessorio)
        {
            painelInterno.add(new JLabel("  Tipo: " + ((Acessorio)produto).getTipoAcessorio()));      // 4
        }
        else if(produto instanceof Tecnologia)
        {
            painelInterno.add(new JLabel("  Tipo: " + ((Tecnologia)produto).getTipoTecnologia()));
        }
        else 
        {
            painelInterno.add(new JLabel("  Tipo: " + ((DiaADia)produto).getTipoDiaADia()));
        }
        painelInterno.add(new JLabel("  Codigo do produto: " + produto.getIdProduto()));               // 5 
        painel.add(painelInterno);

        painelInterno = new JPanel(new GridLayout(2, 1));
        painelInterno.add(new JLabel("  Quantidade: " + Integer.toString(produto.getQuantidade())));   // 6
        painelInterno.add(new JLabel("  Preco: " + Double.toString(produto.getPreco())));              // 7
        painel.add(painelInterno);

        painelInterno = new JPanel(new GridLayout(2, 1));
        painelInterno.add(new JLabel("  Loja: xyz")); // + produto.getLoja()
        botaoDetalhes = new JButton("Detalhes da Loja");
        botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new Loja("x", "x0", "x1")));
        painelInterno.add(botaoDetalhes);
        painel.add(painelInterno);
        botaoComprar = new JButton("Comprar");
        botaoComprar.addActionListener(new OuvidoLogin(janela, produto));
        painel.add(botaoComprar); 
        

        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel);
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
}