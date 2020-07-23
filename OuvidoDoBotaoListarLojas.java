import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoListarLojas implements ActionListener
{
    private Janela janela;

    OuvidoDoBotaoListarLojas(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
    JLabel aux;
    JPanel painelListarLojas;
    JButton botaoDetalhes;
    
        // encontrar e puxar todas as lojas do BD e a quantidade

        painelListarLojas = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
            {
                aux = new JLabel("nomeLoja");
                painelListarLojas.add(aux);
            }
            else if((i % 5) == 1)
            {
                aux = new JLabel("");
                painelListarLojas.add(aux);
            }
            else if((i % 5) == 2)
            {
                aux = new JLabel("Afonco Pena");
                painelListarLojas.add(aux);
            }
            else if((i % 5) == 3)
            {
                aux = new JLabel("532");
                painelListarLojas.add(aux);
            }
            else 
            {
                botaoDetalhes = new JButton("Detalhes");
                botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new Loja("x", "x0", "x1"))); // será passada a loja obtida do BD
                painelListarLojas.add(botaoDetalhes);
            }
        }
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelListarLojas);
        janela.getFrame().add(painelListarLojas, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
}
