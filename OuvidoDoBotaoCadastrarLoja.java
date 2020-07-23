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
    private JTextField txtMaxCartaoSemJuros;
    private JTextField txtMaxCartaoComJuros;
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
    JPanel painelCadastramento = new JPanel(new GridLayout(7, 2));

    // itens da loja
    txtNomeLoja = new JTextField();
    txtEnderecoLoja = new JTextField();
    txtMaxCartaoSemJuros = new JTextField();
    txtMaxCartaoComJuros = new JTextField();
    txtIdLoja = new JTextField();
    txtSenhaLoja = new JPasswordField();

    painelCadastramento.add(new JLabel("Nome da Loja:"));
    painelCadastramento.add(txtNomeLoja);

    painelCadastramento.add(new JLabel("Endereco:"));
    painelCadastramento.add(txtEnderecoLoja);

    painelCadastramento.add(new JLabel("Qtda Max de parcelas SEM juros no cartao:"));
    painelCadastramento.add(txtMaxCartaoSemJuros);

    painelCadastramento.add(new JLabel("Qtda Max de parcelas COM juros no cartao:"));
    painelCadastramento.add(txtMaxCartaoComJuros);

    painelCadastramento.add(new JLabel("id Loja:"));
    painelCadastramento.add(txtIdLoja);

    painelCadastramento.add(new JLabel("senha: "));
    painelCadastramento.add(txtSenhaLoja);

    botaoOkLoja.addActionListener(new OuvidoDoBotaoOkLoja(janela, txtNomeLoja, txtEnderecoLoja, txtMaxCartaoSemJuros, txtMaxCartaoComJuros, txtIdLoja, txtSenhaLoja));
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
