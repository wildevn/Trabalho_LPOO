import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaTodosProdutos implements ActionListener
{
    private Janela janela;
    OuvidoDoBotaoBuscaTodosProdutos(Janela janela)
    {
        setJanela(janela);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    janela.getBarraDeStatus().setText("testei busca todos os Produtos");
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}
}
