import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaTodosProdutos implements ActionListener
{
private Janela janela;
    OuvidoDoBotaoBuscaTodosProdutos(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
        JPanel painelTodosOsProdutos;
        JLabel aux;
        janela.getBarraDeStatus().setText("carregando todos os Produtos...");
        // BD

        painelTodosOsProdutos = new JPanel(new GridLayout(20, 5)); // modelo: (nItens, 5 colunas)
        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
                aux = new JLabel("nomeProdutoxx");
            else if((i % 5) == 1)
                aux = new JLabel("");
            else if((i % 5) == 2)
                aux = new JLabel("quantidade: x");
            else if((i % 5) == 3)
                aux = new JLabel("");
            else
                aux = new JLabel("RS w.00");
            painelTodosOsProdutos.add(aux);
        }
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelTodosOsProdutos);
        janela.getFrame().add(painelTodosOsProdutos);
        janela.getBarraDeStatus().setText(" ");
        janela.getFrame().setVisible(true);
    }

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }

}
