import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaTodosProdutos extends Ouvido implements ActionListener
{

    OuvidoDoBotaoBuscaTodosProdutos(JLabel barraDeStatus)
    {
        super(barraDeStatus);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    super.getBarraDeStatus().setText("testei busca todos os Produtos");
}
}