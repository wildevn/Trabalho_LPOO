import java.awt.BorderLayout;

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


private JButton botaoListarLojas;
private MenuQualquer menuBuscaProduto;
private MenuQualquer menuCadastrar;

    // construtor
    Janela(String titulo)
    {
        janela = new JFrame(titulo);
        janela.setLayout(new BorderLayout());

        barraDeStatus = new JLabel(" ");
        barraDeMenu = new JMenuBar();
        
        configMenuBuscaProduto();
        configBotaoListarLojas();
        configMenuCadastrar();

        barraDeMenu.add(menuBuscaProduto.getMenu());
        barraDeMenu.add(botaoListarLojas);
        barraDeMenu.add(menuCadastrar.getMenu());

        janela.add(barraDeStatus, BorderLayout.SOUTH);
        janela.setJMenuBar(barraDeMenu);
        janela.setSize(800, 600);
        janela.setVisible(true);
    }

// métodos
public void configBotaoListarLojas()
{
OuvidoDoBotaoListarLojas ouvidoDoBotaoListarLojas = new OuvidoDoBotaoListarLojas(barraDeStatus);

    // config nome
    botaoListarLojas = new JButton("Lista de Lojas");
    // action listener
    botaoListarLojas.addActionListener(ouvidoDoBotaoListarLojas);
}
public void configMenuBuscaProduto()
{ 
OuvidoDoBotaoBuscaTodosProdutos ouvidoDoBotaoBuscaTodosProdutos = new OuvidoDoBotaoBuscaTodosProdutos(barraDeStatus);
OuvidoDoBotaoBuscaAcessorios ouvidoDoBotaoBuscaAcessorios = new OuvidoDoBotaoBuscaAcessorios(barraDeStatus);
OuvidoDoBotaoBuscaDiaADia ouvidoDoBotaoBuscaDiaADia = new OuvidoDoBotaoBuscaDiaADia(barraDeStatus);
OuvidoDoBotaoBuscaTecnologia ouvidoDoBotaoBuscaTecnologia = new OuvidoDoBotaoBuscaTecnologia(barraDeStatus);

    // config nomes do menu e das opcoes
    menuBuscaProduto = new MenuQualquer("Produtos", 4);
    menuBuscaProduto.setOpcaoNova("Todos os Produtos"); 
    menuBuscaProduto.setOpcaoNova("Acessorios"); 
    menuBuscaProduto.setOpcaoNova("Dia a Dia");
    menuBuscaProduto.setOpcaoNova("Tecnologia");
    // action listeners
    menuBuscaProduto.adicionaActionListener(ouvidoDoBotaoBuscaTodosProdutos, 0);
    menuBuscaProduto.adicionaActionListener(ouvidoDoBotaoBuscaAcessorios, 1);
    menuBuscaProduto.adicionaActionListener(ouvidoDoBotaoBuscaDiaADia, 2);
    menuBuscaProduto.adicionaActionListener(ouvidoDoBotaoBuscaTecnologia, 3);
}
public void configMenuCadastrar()
{
OuvidoDoBotaoCliente ouvidoDoBotaoCliente = new OuvidoDoBotaoCliente(barraDeStatus);
OuvidoDoBotaoCadastrarLoja ouvidoDoBotaoCadastrarLoja = new OuvidoDoBotaoCadastrarLoja(barraDeStatus);
OuvidoDoBotaoCadastrarProduto ouvidoDoBotaoCadastrarProduto = new OuvidoDoBotaoCadastrarProduto(barraDeStatus);

    // config nome do menu e das opcoes
    menuCadastrar = new MenuQualquer("Cadastrar", 3);
    menuCadastrar.setOpcaoNova("Cliente");
    menuCadastrar.setOpcaoNova("Loja");
    menuCadastrar.setOpcaoNova("Produto");
    // action listeners
    menuCadastrar.adicionaActionListener(ouvidoDoBotaoCliente, 0);
    menuCadastrar.adicionaActionListener(ouvidoDoBotaoCadastrarLoja, 1);
    menuCadastrar.adicionaActionListener(ouvidoDoBotaoCadastrarProduto, 2);
}
}
