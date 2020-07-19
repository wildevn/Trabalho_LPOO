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

        janela.getBarraDeStatus().setText("carregando Tecnologia...");
        // encontrar e puxar todas as lojas do BD e a quantidade

        painelTecnologia = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
                aux = new JLabel("nomeProdutoTecnologico");
            else if((i % 5) == 1)
                aux = new JLabel("");
            else if((i % 5) == 2)
                aux = new JLabel("quantidade: x");
            else if((i % 5) == 3)
                aux = new JLabel("");
            else
                aux = new JLabel("RS w.00");
            painelTecnologia.add(aux);
        }
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelTecnologia);
        janela.getFrame().add(painelTecnologia, BorderLayout.CENTER);
        janela.getBarraDeStatus().setText(" ");
        janela.getFrame().setVisible(true);
}

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
}
