import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoBuscaDiaADia extends Ouvido implements ActionListener
{

    OuvidoDoBotaoBuscaDiaADia(JLabel barraDeStatus)
    {
        super(barraDeStatus);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    super.getBarraDeStatus().setText("testei buscar produtos do Dia a Dia");
}
}