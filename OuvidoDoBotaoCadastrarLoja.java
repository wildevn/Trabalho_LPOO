import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoCadastrarLoja implements ActionListener
{
    private Janela janela;
    private JTextField txtNomeLoja;
    private JTextField txtEnderecoLoja;
    private JTextField txtIdLoja;
    private JPasswordField txtSenhaLoja;

    OuvidoDoBotaoCadastrarLoja(Janela janela)
    {
        setJanela(janela);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    JButton botaoOkLoja = new JButton("Cadastrar");
    JPanel painelCadastramento = new JPanel(new GridLayout(5, 2));

    // itens da loja
    txtNomeLoja = new JTextField();
    txtEnderecoLoja = new JTextField();
    txtIdLoja = new JTextField();
    txtSenhaLoja = new JPasswordField();

    painelCadastramento.add(new JLabel("Nome da Loja:"));
    painelCadastramento.add(txtNomeLoja);

    painelCadastramento.add(new JLabel("Endereco:"));
    painelCadastramento.add(txtEnderecoLoja);

    painelCadastramento.add(new JLabel("id Loja:"));
    painelCadastramento.add(txtIdLoja);

    painelCadastramento.add(new JLabel("senha: "));
    painelCadastramento.add(txtSenhaLoja);

    botaoOkLoja.addActionListener(new OuvidoDoBotaoOkLoja(janela, txtNomeLoja, txtEnderecoLoja, txtIdLoja, txtSenhaLoja));
    painelCadastramento.add(new JLabel(""));
    painelCadastramento.add(botaoOkLoja);
    
    janela.removePainelAnterior();
    janela.setPainelAnterior(painelCadastramento);
    janela.getFrame().add(painelCadastramento);
    janela.getFrame().setVisible(true);
}

public void setJanela(Janela janela)
{
    this.janela = janela;
}
}
