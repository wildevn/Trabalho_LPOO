import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoOkLoja implements ActionListener
{
private Janela janela;
private JTextField txtNomeLoja;
private JTextField txtEnderecoLoja;

    OuvidoDoBotaoOkLoja(Janela janela, JTextField txtNomeLoja,JTextField txtEnderecoLoja)
    {
        setJanela(janela);
        setTxtNomeLoja(txtNomeLoja);
        setTxtEnderecoLoja(txtEnderecoLoja);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
        //Loja loja;
        if(txtNomeLoja.getText().equals("") || txtEnderecoLoja.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para a criacao de uma nova loja!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }//"Por favor, verifique os campos neceassarios para a criacao de uma nova loja
        else if(txtNomeLoja.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para a criacao de uma nova loja!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtEnderecoLoja.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para a criacao de uma nova loja!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //loja = new Loja("nada", txtNomeLoja.getText(), txtEnderecoLoja.getText());
            JOptionPane.showMessageDialog(null, "Loja criada com sucesso!", "Parabens lojista!", JOptionPane.ERROR_MESSAGE);
            janela.configTelaInicial();
        }
    }

    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setTxtNomeLoja(JTextField txtNomeLoja)
    {
        this.txtNomeLoja = txtNomeLoja;
    }
    public void setTxtEnderecoLoja(JTextField txtEnderecoLoja)
    {
        this.txtEnderecoLoja = txtEnderecoLoja;
    }
}