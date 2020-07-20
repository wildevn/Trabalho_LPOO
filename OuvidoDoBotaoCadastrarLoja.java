import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoCadastrarLoja implements ActionListener
{
    private Janela janela;
    JTextField txtNomeLoja;
    JTextField txtEnderecoLoja;
    OuvidoDoBotaoCadastrarLoja(Janela janela)
    {
        setJanela(janela);
    }

@Override
public void actionPerformed(ActionEvent evento)
{
    JButton botaoOkLoja = new JButton("Cadastrar");
    JPanel painelCadastramento = new JPanel(new GridLayout(4, 2));
    janela.getBarraDeStatus().setText("carregando cadastramento de loja...");

    // itens da loja
    painelCadastramento.add(new JLabel("Nome da Loja: "));
    txtNomeLoja = new JTextField();
    painelCadastramento.add(txtNomeLoja);

    painelCadastramento.add(new JLabel("Endereco: "));
    txtEnderecoLoja = new JTextField();
    painelCadastramento.add(txtEnderecoLoja);

    botaoOkLoja.addActionListener(new OuvidoDoBotaoOkLoja(janela, txtNomeLoja, txtEnderecoLoja));
    painelCadastramento.add(new JLabel(""));
    painelCadastramento.add(botaoOkLoja);
    janela.getBarraDeStatus().setText(" ");

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
