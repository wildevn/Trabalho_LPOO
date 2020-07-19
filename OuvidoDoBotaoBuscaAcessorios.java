import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

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
    janela.getBarraDeStatus().setText("testei buscar acessorios");
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}

}
