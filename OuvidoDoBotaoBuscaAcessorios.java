import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaAcessorios implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoBuscaAcessorios(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
    JLabel aux;
    JPanel painelAcessorios;
    JButton botaoDetalhes;

        // encontrar e puxar todas as lojas do BD e a quantidade

        painelAcessorios = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
            {
                aux = new JLabel("nomeAcessorio");
                painelAcessorios.add(aux);
            }
            else if((i % 5) == 1)
            {
                aux = new JLabel("");
                painelAcessorios.add(aux);
            }
            else if((i % 5) == 2)
            {
                aux = new JLabel("quantidade: x");
                painelAcessorios.add(aux);
            }
            else if((i % 5) == 3)
            {
                aux = new JLabel("RS w.00");
                painelAcessorios.add(aux);
            }
            else
            {
                botaoDetalhes = new JButton("Detalhes");
                botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new Acessorio("Relogio digital tec", "branco", "Este relogio e feito pela maior criadora de relogios do mundo contendo nao apenas uma loja mas 900 ao redor do globo", "tipo 2", 23.4, 15, "Avulso")));
                painelAcessorios.add(botaoDetalhes);
            }
        }
        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelAcessorios);
        janela.getFrame().add(painelAcessorios, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }

}