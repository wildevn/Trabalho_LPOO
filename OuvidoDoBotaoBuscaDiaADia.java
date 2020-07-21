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
    
        // encontrar e puxar todas as lojas do BD e a quantidade

        painelDiaADia = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
                aux = new JLabel("nomeProdutoDiaADia");
            else if((i % 5) == 1)
                aux = new JLabel("");
            else if((i % 5) == 2)
                aux = new JLabel("quantidade: x");
            else if((i % 5) == 3)
                aux = new JLabel("");
            else
                aux = new JLabel("RS w.00");
            painelDiaADia.add(aux);
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
