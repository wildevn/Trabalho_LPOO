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

private JButton botaoInicio;
private JButton botaoListarLojas;
private MenuQualquer menuBuscaProduto;
private MenuQualquer menuCadastrar;
private MenuQualquer menuGerenciar;

private JPanel painelAnterior;

    // construtor
    public Janela(String titulo)
    {
        janela = new JFrame(titulo);
        janela.setLayout(new BorderLayout());

        barraDeMenu = new JMenuBar();
        
        configBotaoInicio();
        configMenuBuscaProduto();
        configBotaoListarLojas();
        configMenuCadastrar();
        configMenuGerenciar();

        barraDeMenu.add(botaoInicio);
        barraDeMenu.add(menuBuscaProduto.getMenu());
        barraDeMenu.add(botaoListarLojas);
        barraDeMenu.add(menuCadastrar.getMenu());
        barraDeMenu.add(menuGerenciar.getMenu());

        configTelaInicial();
        
        janela.setJMenuBar(barraDeMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(900, 700);
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
        JPanel painel = new JPanel();
        painel.add(new JLabel("Bem vindo ao sistema de lojas"));

        removePainelAnterior();
        setPainelAnterior(painel);
        janela.add(painel, BorderLayout.CENTER);
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
        menuCadastrar = new MenuQualquer("Cadastrar", 2);
        menuCadastrar.setOpcaoNova("Cliente");
        menuCadastrar.setOpcaoNova("Loja");
        // action listeners
        menuCadastrar.adicionaActionListener(new OuvidoDoBotaoCadastrarCliente(this), 0);
        menuCadastrar.adicionaActionListener(new OuvidoDoBotaoCadastrarLoja(this), 1);
    }
    public void configMenuGerenciar()
    {

        // config nome do menu e das opcoes
        menuGerenciar = new MenuQualquer("Gerenciar", 2);
        menuGerenciar.setOpcaoNova("Cliente");
        menuGerenciar.setOpcaoNova("Loja");
        // action listeners
        menuGerenciar.adicionaActionListener(new OuvidoLogin(this, 0), 0);  // login cliente
        menuGerenciar.adicionaActionListener(new OuvidoLogin(this, 1), 1);  // login loja
    }

// Setters e Getters
public JFrame getFrame()
{
    return this.janela;
}
public void setPainelAnterior(JPanel painelAnterior)
{
    this.painelAnterior = painelAnterior;
}
}
