import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoCadastrarCliente implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoCadastrarCliente(Janela janela)
    {
        setJanela(janela);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    janela.getBarraDeStatus().setText("testei cliente");
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}
}
