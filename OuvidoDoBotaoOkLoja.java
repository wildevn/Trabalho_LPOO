import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
private JTextField txtIdLoja;
private JPasswordField txtSenhaLoja;


    OuvidoDoBotaoOkLoja(Janela janela, JTextField txtNomeLoja,JTextField txtEnderecoLoja, JTextField txtIdLoja, JPasswordField txtSenhaLoja)
    {
        setJanela(janela);
        setTxtNomeLoja(txtNomeLoja);
        setTxtEnderecoLoja(txtEnderecoLoja);
        setTxtIdLoja(txtIdLoja);
        setTxtSenhaLoja(txtSenhaLoja);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
        String aux = new String(txtSenhaLoja.getPassword());
        //Loja loja;
        if(txtNomeLoja.getText().equals("") || txtEnderecoLoja.getText().equals("") || txtIdLoja.getText().equals("") || aux.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para a criacao de uma nova loja!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }// VERIFICAR SE O ID DA LOJA JA EXISTE, SE SIM DEVE GERAR UM ERRO
        else
        {
            //loja = new Loja("nada", txtNomeLoja.getText(), txtEnderecoLoja.getText());
            JOptionPane.showMessageDialog(null, "Loja criada com sucesso!", "Parabens lojista!", JOptionPane.ERROR_MESSAGE);
            janela.configTelaInicial();
        }
    }

    // Setters e Getters
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
    public void setTxtIdLoja(JTextField txtIdLoja)
    {
        this.txtIdLoja = txtIdLoja;
    }
    public void setTxtSenhaLoja(JPasswordField txtSenhaLoja)
    {
        this.txtSenhaLoja = txtSenhaLoja;
    }
}
