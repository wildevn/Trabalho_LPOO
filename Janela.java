import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Janela
{
private JFrame janela;
private JMenuBar barraDeMenu;

private BotaoQualquer menuBuscar;
private BotaoQualquer menuBuscaProduto;
private BotaoQualquer menuCadastrar;

    // construtor
    Janela(String titulo)
    {
        janela = new JFrame(titulo);

        barraDeMenu = new JMenuBar();
    
        configMenuBusca();
        configMenuCadastrar();

        barraDeMenu.add(menuBuscar.getMenu());
        barraDeMenu.add(menuCadastrar.getMenu());

        janela.setJMenuBar(barraDeMenu);
        janela.setSize(800, 600);
        janela.setVisible(true);
    }

// métodos
public void configMenuBusca()
{
    configMenuBuscaProduto();
    menuBuscar = new BotaoQualquer("Buscar", 2);
    menuBuscar.setOpcaoNova("Lojas");
    System.out.println("Comparando");
    menuBuscar.setOpcaoPronta(menuBuscaProduto.getMenu(), null);
    // setados os nomes e objetos, porem ainda sem action listener
}
public void configMenuBuscaProduto()
{ 
    menuBuscaProduto = new BotaoQualquer("Produtos", 4);
    menuBuscaProduto.setOpcaoNova("Todos os Produtos");
    menuBuscaProduto.setOpcaoNova("Acessorios");
    menuBuscaProduto.setOpcaoNova("Dia a Dia");
    menuBuscaProduto.setOpcaoNova("Tecnologia");
    // setados os nomes e objetos, porem ainda sem action listener
}
public void configMenuCadastrar()
{
    menuCadastrar = new BotaoQualquer("Cadastrar", 3);
    menuCadastrar.setOpcaoNova("Cliente");
    menuCadastrar.setOpcaoNova("Loja");
    menuCadastrar.setOpcaoNova("Produto");
    // setados os nomes e objetos, porem ainda sem action listener
}
}
