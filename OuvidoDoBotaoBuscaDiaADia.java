import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

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
    janela.getBarraDeStatus().setText("testei buscar produtos do Dia a Dia");
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}
}
