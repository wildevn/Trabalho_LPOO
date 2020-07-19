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
        janela.getBarraDeStatus().setText("carregando Listar Lojas...");
        // encontrar e puxar todas as lojas do BD e a quantidade

        painelListarLojas = new JPanel(new GridLayout(20, 5)); // grid deve ser no formato (nLojas, 5 colunas)

        for(int i = 0; i < 100; i++)
        {
            if((i % 5) == 0)
                aux = new JLabel("nomeProduto");
            else if((i % 5) == 1)
                aux = new JLabel("");
            else if((i % 5) == 2)
                aux = new JLabel("quantidade: x");
            else if((i % 5) == 3)
                aux = new JLabel("");
            else
                aux = new JLabel("RS w.00");
            painelListarLojas.add(aux);
        }
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelListarLojas);
        janela.getFrame().add(painelListarLojas, BorderLayout.CENTER);
        janela.getBarraDeStatus().setText(" ");
        janela.getFrame().setVisible(true);
    }
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }

}
