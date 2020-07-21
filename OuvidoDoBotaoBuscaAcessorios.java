import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
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

        // encontrar e puxar todas as lojas do BD e a quantidade

        painelAcessorios = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
                aux = new JLabel("nomeAcessorio");
            else if((i % 5) == 1)
                aux = new JLabel("");
            else if((i % 5) == 2)
                aux = new JLabel("quantidade: x");
            else if((i % 5) == 3)
                aux = new JLabel("");
            else
                aux = new JLabel("RS w.00");
            painelAcessorios.add(aux);
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
