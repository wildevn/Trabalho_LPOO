import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaTecnologia implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoBuscaTecnologia(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
    JLabel aux;
    JPanel painelTecnologia;
    JButton botaoDetalhes;

        // encontrar e puxar todas as lojas do BD e a quantidade

        painelTecnologia = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
            {
                aux = new JLabel("nomeProdutoTecnologico");
                painelTecnologia.add(aux);
            }
            else if((i % 5) == 1)
            {
                aux = new JLabel("");
                painelTecnologia.add(aux);
            }
            else if((i % 5) == 2)
            {
                aux = new JLabel("quantidade: x");
                painelTecnologia.add(aux);
            }
            else if((i % 5) == 3)
            {
                aux = new JLabel("Preco: w.00");
                painelTecnologia.add(aux);
            }
            else
            {
                botaoDetalhes = new JButton("Detalhes");
                botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new Tecnologia(" ", " asd", "fd", "TEste", "tipo 2", 23.4, 15, "Avulso")));
                painelTecnologia.add(botaoDetalhes);
            }
        }
        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelTecnologia);
        janela.getFrame().add(painelTecnologia, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
}

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
}
