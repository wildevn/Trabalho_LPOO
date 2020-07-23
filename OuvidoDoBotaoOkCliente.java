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

public class OuvidoDoBotaoOkCliente implements ActionListener
{
private Janela janela;
private JTextField txtNomeCliente;
private JTextField txtEndereco;
private JTextField txtCpf;
private JTextField txtIdade;
private JTextField txtNumCartao;
private JTextField txtIdCliente;
private JPasswordField txtSenhaCliente;


    OuvidoDoBotaoOkCliente(Janela janela, JTextField txtNomeCliente,JTextField txtEndereco, JTextField txtCpf, JTextField txtIdade, JTextField txtNumCartao, JTextField txtIdCliente, JPasswordField txtSenhaCliente)
    {
        setJanela(janela);
        setTxtNomeCliente(txtNomeCliente);
        setTxtEndereco(txtEndereco);
        setTxtCpf(txtCpf);
        setTxtIdade(txtIdade);
        setTxtNumCartao(txtNumCartao);
        setTxtIdCliente(txtIdCliente);
        setTxtSenhaCliente(txtSenhaCliente);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
        String aux = new String(txtSenhaCliente.getPassword());
        //Cliente cliente;
        if(txtNomeCliente.getText().equals("") || txtEndereco.getText().equals("") || txtCpf.getText().equals("") || txtIdade.getText().equals("") || txtNumCartao.getText().equals("") || txtIdCliente.getText().equals("") || aux.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os campos necessarios para a criacao de uma novo cliente!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }// VERIFICAR SE O ID DO CLIENTE JA EXISTE, SE SIM DEVE GERAR UM ERRO
        else
        {
            //cliente = new cliente(info dele);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Parabens!!", JOptionPane.ERROR_MESSAGE);
            janela.configTelaInicial();
        }
    }

    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setTxtNomeCliente(JTextField txtNomeCliente)
    {
        this.txtNomeCliente = txtNomeCliente;
    }
    public void setTxtEndereco(JTextField txtEndereco)
    {
        this.txtEndereco= txtEndereco;
    }
    public void setTxtCpf(JTextField txtCpf)
    {
        this.txtCpf = txtCpf;
    }
    public void setTxtIdade(JTextField txtIdade)
    {
        this.txtIdade = txtIdade;
    }
    public void setTxtNumCartao(JTextField txtNumCartao)
    {
        this.txtNumCartao = txtNumCartao;
    }
    public void setTxtIdCliente(JTextField txtIdCliente)
    {
        this.txtIdCliente = txtIdCliente;
    }
    public void setTxtSenhaCliente(JPasswordField txtSenhaCliente)
    {
        this.txtSenhaCliente = txtSenhaCliente;
    }
}
