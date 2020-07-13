import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Janela
{
private JFrame janela;
private JMenuBar barraDeMenu;

private MenuQualquer menuListarLojas;
private MenuQualquer menuBuscaProduto;
private MenuQualquer menuCadastrar;

    // construtor
    Janela(String titulo)
    {
        janela = new JFrame(titulo);

        barraDeMenu = new JMenuBar();
    
        configMenuBuscaProduto();
        configMenuListarLojas();
        configMenuCadastrar();

        barraDeMenu.add(menuBuscaProduto.getMenu());
        barraDeMenu.add(menuListarLojas.getMenu());
        barraDeMenu.add(menuCadastrar.getMenu());

        janela.setJMenuBar(barraDeMenu);
        janela.setSize(800, 600);
        janela.setVisible(true);
    }

// métodos
public void configMenuBusca()
{
    menuListarLojas = new MenuQualquer("Buscar", 0);
    // menuBuscar.setOpcaoNova("Lojas");
    // setados os nomes e objetos, porem ainda sem action listener
}
public void configMenuBuscaProduto()
{ 
    menuBuscaProduto = new MenuQualquer("Produtos", 4);
    menuBuscaProduto.setOpcaoNova("Todos os Produtos");
    menuBuscaProduto.setOpcaoNova("Acessorios");
    menuBuscaProduto.setOpcaoNova("Dia a Dia");
    menuBuscaProduto.setOpcaoNova("Tecnologia");
    // setados os nomes e objetos, porem ainda sem action listener
}
public void configMenuCadastrar()
{
    menuCadastrar = new MenuQualquer("Cadastrar", 3);
    menuCadastrar.setOpcaoNova("Cliente");
    menuCadastrar.setOpcaoNova("Loja");
    menuCadastrar.setOpcaoNova("Produto");
    // setados os nomes e objetos, porem ainda sem action listener
}
}
