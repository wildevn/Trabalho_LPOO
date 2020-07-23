import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaDiaADia implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoBuscaDiaADia(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
    JLabel aux;
    JPanel painelDiaADia;
    JButton botaoDetalhes;
        // encontrar e puxar todas as lojas do BD e a quantidade

        painelDiaADia = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
            {
                aux = new JLabel("nomeProdutoDiaADia");
                painelDiaADia.add(aux);
            }
            else if((i % 5) == 1)
            {
                aux = new JLabel("");
                painelDiaADia.add(aux);
            }
            else if((i % 5) == 2)
            {
                aux = new JLabel("quantidade: x");
                painelDiaADia.add(aux);
            }
            else if((i % 5) == 3)
            {
                aux = new JLabel("RS w.00");
                painelDiaADia.add(aux);
            }
            else
            {
                botaoDetalhes = new JButton("Detalhes");
                botaoDetalhes.addActionListener(new OuvidoDoBotaoDetalhes(janela, new DiaADia(" ", " asd", "fd", "TEste", "tipo 2", 23.4f, 15, "Avulso")));
                painelDiaADia.add(botaoDetalhes);
            }
        }
        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelDiaADia);
        janela.getFrame().add(painelDiaADia, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
}
