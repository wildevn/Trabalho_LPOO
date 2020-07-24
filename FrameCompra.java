import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameCompra
{
private Janela janela;
private Produto produto;
private Loja loja;
private Compra compra;
private JTextField txtQuantParcelas;

    public FrameCompra(Janela janela, Produto produto)
    {
        setJanela(janela);
        setProduto(produto);
        configPrimeiraTelaCompra();
    }

    // metodos
    configPrimeiraTelaCompra()
    {
        JPanel painel;
        JButton botao;
        
        if(produto.getQuantidade() != 0)
        {
            painel = new JPanel(new GridLayout(3,2));
            // pegar a loja do BD e exibir a quantidade de parcelas sem juros
            // setar a loja assim que a receber
            painel.add(new JLabel("Qta de max parcelas sem juros no cartao: ")); 
            painel.add(new JLabel("Qta de max parcelas com juros no cartao: ")); // exibir a qta de parcelas com juros
            painel.add(new JLabel("A vista no boleto = 15\% de desconto."));
            painel.add(new JLabel(""));

            botao = configBotaoCartao();
            painel.add(botao)
            botao = configBotaoBoleto();
            painel.add(botao);

            janela.removePainelAnterior();
            janela.setPainelAnterior(painel);
            janela.getFrame().add(painel, BorderLayout.CENTER);
            janela.getFrame().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Produto esgotado!", "Alert!!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void configTelaCartao()
    {
        JPanel painel = new JPanel(new GridLayout(1,2));
        JButton botao = configuraBotaoProximo();
        txtQuantParcelas = new JTextField();


        painel.add(new JLabel(" Insira a quantidade: "));
        painel.add(txtQuantParcelas);

        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }
    public void configTelaFinalCartao()
    {
        JPanel painel = new JPanel(new GridLayout(2,2));
        JButton botao = configuraBotaoFinalizarCompra();

        compra = new Compra(produto.getPreco(), txtQuantParcelas.getText());
        //compra.gerenciaCompraInicioC(loja, produto)
        painel.add(new JLabel(" Produto: " + produto.getNome()));
        painel.add(new JLabel(" Preco final: " + compra.getValorAtualizado()));
    }
    public void configTelaBoleto()
    {
        JPanel painel = new GridLayout(2,2);
        JButton botao = configuraBotaoFinalizarCompra();
        
        compra = new compra(produto.getValor(), 1);
        // compra.gerenciaCompraInicioB(loja, produto)
        painel.add(new JLabel(" Produto:" + produto.getNome()));
       // painel.add(new JLabel("Valor com desconto: " + compra.getValorAtualizado()));
        painel.add(new JLabel(""));
        painel.add(botao);
        
        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel, BorderLayout.CENTER);
        janela.getFrame().setVisible(true);
    }

    public JButton configuraBotaoFinalizarCompra(int opcao)
    {
        JButton botao = new JButton("Finalizar compra");
        ActionListener ouvidoDoBotaoFinalizarCompra = new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                // compra.gerenciaCompraFinal(loja, produto, cliente);
                // JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!", "Parabens!!!", JOptionPane.ERROR_MESSAGE);
                janela.configTelaInicial();
            }
        };
    
        botao.addActionListener(ouvidoDoBotaoFinalizarCompra)
    }
    public JButton configuraBotaoProximo()
    {
        JButton botao = JButton("Proximo");
        ActionListener ouvidoDoBotaoProx = new ActionListener()
        {
            configTelaFinalCartao();
        }
    }

    public JButton configBotaoCartao()
    {
        JButton botao = new JButton("Cartao");
        ActionListener ouvidoDoBotaoCartao = new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                configTelaCartao();
            }
        };
        botao.addActionListener(ouvidoDoBotaoCartao);

        return botao;
    }
    public JButton configBotaoBoleto()
    {
        JButton botao = new JButton("Boleto");
        ActionListener ouvidoDoBotaoBoleto = new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                configTelaBoleto();
            }
        };
        botao.addActionListener(ouvidoDoBotaoBoleto);

        return botao;
    }



    // Setters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

}