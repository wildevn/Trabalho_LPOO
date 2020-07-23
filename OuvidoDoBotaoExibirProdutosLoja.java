import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoDoBotaoExibirProdutosLoja implements ActionListener
{
private Janela janela;
private Loja loja;

    // construtor
    OuvidoDoBotaoExibirProdutosLoja(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
    }

    public void actionPerformed(ActionEvent evento)
    {
        JPanel painelTodosOsProdutos;
        JLabel aux;
        JButton botaoDetalhes;
        // BD // puxar os produtos da loja.

        painelTodosOsProdutos = new JPanel(new GridLayout(20, 5)); // modelo: (nItens, 5 colunas)
        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
            {
                aux = new JLabel("nomeProdutoxx");
                painelTodosOsProdutos.add(aux);
            }
            else if((i % 5) == 1)
            {
                aux = new JLabel("");
                painelTodosOsProdutos.add(aux);
            }
            else if((i % 5) == 2)
            {
                aux = new JLabel("quantidade: x");
                painelTodosOsProdutos.add(aux);
            }
            else if((i % 5) == 3)
            {
                aux = new JLabel("RS w.00");
                painelTodosOsProdutos.add(aux);
            }
            else
            {
                botaoDetalhes = new JButton("Detalhes");
                botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new Acessorio(" ", " asd", "fd", "TEste", "tipo 2", 23.4f, 15, "Avulso")));
                painelTodosOsProdutos.add(botaoDetalhes);
            }
        }
        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelTodosOsProdutos);
        janela.getFrame().add(painelTodosOsProdutos);
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