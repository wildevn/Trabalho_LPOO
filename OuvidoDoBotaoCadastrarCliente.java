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
import javax.swing.JPasswordField;

public class OuvidoDoBotaoCadastrarCliente implements ActionListener
{
private Janela janela;
private JTextField txtNomeCliente;
private JTextField txtEndereco;
private JTextField txtCpf;
private JTextField txtIdade;
private JTextField txtIdCliente;
private JPasswordField txtSenhaCliente;

    OuvidoDoBotaoCadastrarCliente(Janela janela)
    {
        setJanela(janela);
    }

    @Override
    public void actionPerformed(ActionEvent evento)
    {
        JButton botaoOkCliente = new JButton("Cadastrar");
        JPanel painelCadastraCliente = new JPanel(new GridLayout(7,2));
        
        // criando novas caixas de texto
        txtNomeCliente = new JTextField();
        txtEndereco = new JTextField();
        txtCpf = new JTextField();
        txtIdade = new JTextField();
        txtIdCliente = new JTextField();
        txtSenhaCliente = new JPasswordField();

        // adicionando os labels e caixas de texto no painel
        painelCadastraCliente.add(new JLabel("Nome Completo:"));
        painelCadastraCliente.add(txtNomeCliente);

        painelCadastraCliente.add(new JLabel("Endereco:"));
        painelCadastraCliente.add(txtEndereco);

        painelCadastraCliente.add(new JLabel("Cpf:"));
        painelCadastraCliente.add(txtCpf);

        painelCadastraCliente.add(new JLabel("Idade:"));
        painelCadastraCliente.add(txtIdade);

        painelCadastraCliente.add(new JLabel("Id do cliente:"));
        painelCadastraCliente.add(txtIdCliente);

        painelCadastraCliente.add(new JLabel("Senha:"));
        painelCadastraCliente.add(txtSenhaCliente);

        painelCadastraCliente.add(new JLabel(""));
        botaoOkCliente.addActionListener(new OuvidoDoBotaoOkCliente(janela, txtNomeCliente, txtEndereco, txtCpf, txtIdade, txtIdCliente, txtSenhaCliente));
        painelCadastraCliente.add(botaoOkCliente);

        // mandando o painel para a janela e atualizando o frame
        janela.removePainelAnterior();
        janela.setPainelAnterior(painelCadastraCliente);
        janela.getFrame().add(painelCadastraCliente, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public JTextField getTxtNomeCliente()
    {
        return this.txtNomeCliente;
    }
    public JTextField getTxtEndereco()
    {
        return this.txtEndereco;
    }
    public JTextField getTxtCpf()
    {
        return this.txtCpf;
    }
    public JTextField getTxtIdade()
    {
        return this.txtIdade;
    }
    public JTextField getTxtIdCliente()
    {
        return this.txtIdCliente;
    }
    public JPasswordField getTxtSenhaCliente()
    {
        return this.txtSenhaCliente;
    }
}
