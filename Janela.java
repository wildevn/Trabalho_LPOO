import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Janela
{
private JFrame janela;

private JMenuBar barraDeMenu;
private JLabel barraDeStatus;

private JButton botaoInicio;
private JButton botaoListarLojas;
private MenuQualquer menuBuscaProduto;
private MenuQualquer menuCadastrar;

private JPanel painelAnterior;

    // construtor
    Janela(String titulo)
    {
        janela = new JFrame(titulo);
        janela.setLayout(new BorderLayout());

        barraDeStatus = new JLabel(" ");
        barraDeMenu = new JMenuBar();
        
        configBotaoInicio();
        configMenuBuscaProduto();
        configBotaoListarLojas();
        configMenuCadastrar();

        barraDeMenu.add(botaoInicio);
        barraDeMenu.add(menuBuscaProduto.getMenu());
        barraDeMenu.add(botaoListarLojas);
        barraDeMenu.add(menuCadastrar.getMenu());

        configTelaInicial();
        
        janela.add(barraDeStatus, BorderLayout.SOUTH);
        janela.setJMenuBar(barraDeMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 600);
        janela.setVisible(true);
    }

    // métodos
    public void removePainelAnterior()
    {
        if(painelAnterior != null)
            janela.remove(painelAnterior);
    }
    public void configBotaoInicio()
    {   
        // config nome
        botaoInicio = new JButton("Inicio");
        // action listener
        botaoInicio.addActionListener(new OuvidoDoBotaoInicio(this));
    }
    public void configTelaInicial()
    {
        // criar tela de bem vindo
        JPanel painel1 = new JPanel(new GridLayout(2, 1));
        JPanel painel2 = new JPanel();
        painel1.add(new JLabel("Bem vindo ao sistema de lojas"));
        painel2.add(new JLabel("X Usuarios cadastrados"));
        painel2.add(new JLabel("Y Lojas conveniadas"));
        painel2.add(new JLabel("W Produtos disponiveis para compra"));
        painel1.add(painel2);
        removePainelAnterior();
        setPainelAnterior(painel1);
        janela.add(painel1, BorderLayout.CENTER);
        janela.setVisible(true);

    }
    public void configBotaoListarLojas()
    {
        // config nome
        botaoListarLojas = new JButton("Lista de Lojas");
        // action listener
        botaoListarLojas.addActionListener(new OuvidoDoBotaoListarLojas(this));
    }
    public void configMenuBuscaProduto()
    { 
        // config nomes do menu e das opcoes
        menuBuscaProduto = new MenuQualquer("Produtos", 4);
        menuBuscaProduto.setOpcaoNova("Todos os Produtos"); 
        menuBuscaProduto.setOpcaoNova("Acessorios"); 
        menuBuscaProduto.setOpcaoNova("Dia a Dia");
        menuBuscaProduto.setOpcaoNova("Tecnologia");
        // action listeners
        menuBuscaProduto.adicionaActionListener(new OuvidoDoBotaoBuscaTodosProdutos(this), 0);
        menuBuscaProduto.adicionaActionListener(new OuvidoDoBotaoBuscaAcessorios(this), 1);
        menuBuscaProduto.adicionaActionListener(new OuvidoDoBotaoBuscaDiaADia(this), 2);
        menuBuscaProduto.adicionaActionListener(new OuvidoDoBotaoBuscaTecnologia(this), 3);
    }
    public void configMenuCadastrar()
    {
        // config nome do menu e das opcoes
        menuCadastrar = new MenuQualquer("Cadastrar", 3);
        menuCadastrar.setOpcaoNova("Cliente");
        menuCadastrar.setOpcaoNova("Loja");
        menuCadastrar.setOpcaoNova("Produto");
        // action listeners
        menuCadastrar.adicionaActionListener(new OuvidoDoBotaoCliente(this), 0);
        menuCadastrar.adicionaActionListener(new OuvidoDoBotaoCadastrarLoja(this), 1);
        menuCadastrar.adicionaActionListener(new OuvidoDoBotaoCadastrarProduto(this), 2);
    }

// Setters e Getters
public JFrame getFrame()
{
    return this.janela;
}
public JLabel getBarraDeStatus()
{
    return this.barraDeStatus;
}
public void setPainelAnterior(JPanel painelAnterior)
{
    this.painelAnterior = painelAnterior;
}
}
