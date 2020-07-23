import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoInicio implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoInicio(Janela janela)
    {
        setJanela(janela);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    janela.configTelaInicial();
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}
}