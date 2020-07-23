import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameGerenciarLoja
{
private Janela janela;
private Loja loja;
private JPanel painelGerenciar;
private JPanel painel;
private JButton botao;

    // Construtor
    public FrameGerenciarLoja(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
        painelGerenciar = new JPanel(new GridLayout(5, 1)); // deve estar na forma grid(3+quantidade de produtos na loja, 1 coluna);
        painel = new JPanel(new GridLayout(2, 2)); 
        
        painel.add(new JLabel("  Nome: " + loja.getNome()));
        painel.add(new JLabel("  Endereco: " + loja.getEndereco()));
        painel.add(new JLabel("  id Loja: " + loja.getIdLoja()));

        botao = configBotaoExcluirLoja();

        painel.add(botao);
        painelGerenciar.add(painel);


        botao = new JButton("Adicionar produto"); // adcionar action listener
        botao.addActionListener(new OuvidoDoBotaoAdicionarProduto(janela, loja));
        painelGerenciar.add(botao);

        painelGerenciar.add(new JLabel("  Quantidade total de produtos: " + loja.getIdProdutos().getQuantElementosAdicionados()));

        for(int i = 0; i < 2; i++)
        {
            painel = new JPanel(new GridLayout(1, 3));
            for(int j = 0; j < 3; j++)
            {
                if(j % 3 == 0)
                {
                    painel.add(new JLabel("Nome produto"));
                }
                else if(j % 3 == 1)
                {
                    painel.add(new JLabel("Quantidade do produto"));
                }
                else
                {
                    botao = configBotaoExcluirProduto();
                    painel.add(botao);
                }
            }
            painelGerenciar.add(painel);
        }

        janela.removePainelAnterior();
        janela.setPainelAnterior(painelGerenciar);
        janela.getFrame().add(painelGerenciar);
        janela.getFrame().setVisible(true);
    }

    // metodos
    public JButton configBotaoExcluirLoja()
    {
        JButton botao = new JButton("Excluir Loja");
        ActionListener ouvidoDoBotaoExcluirLoja = new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                // chamar pra excluir
            }
            
        };
        botao.addActionListener(ouvidoDoBotaoExcluirLoja);

        return botao;
    }
    public JButton configBotaoExcluirProduto()
    {
        JButton botao = new JButton("Excluir Produto");
        ActionListener ouvidoDoBotaoExcluirProduto = new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                // chamar para excluir
            }
        };
        botao.addActionListener(ouvidoDoBotaoExcluirProduto);

        return botao;
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