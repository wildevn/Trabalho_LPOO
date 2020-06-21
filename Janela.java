import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JPanel;

class Janela
{
private JFrame janela;
private JMenuBar barraDeMenu;
private JMenu menuBuscar;
private JMenuItem buscaLoja;
private JMenu buscaProduto;
private JMenuItem buscaTodosProdutos;
private JMenuItem buscaAcessorio;
private JMenuItem buscaDiaADia;
private JMenuItem buscaTecnologia;

private JMenu menuCadastrar;
private JMenuItem cadastraCliente;
private JMenuItem cadastraLoja;
private JMenuItem cadastraProduto;

    Janela(String titulo)
    {
        janela = new JFrame(titulo);

        barraDeMenu = new JMenuBar();
    
        // busca de lojas e produtos
        buscaTodosProdutos = new JMenuItem("Todos Produtos");
        buscaAcessorio = new JMenuItem("Acessorios");
        buscaDiaADia = new JMenuItem("Dia a Dia");
        buscaTecnologia = new JMenuItem("Tecnologia");
        buscaProduto = new JMenu("Produtos");
        buscaProduto.add(buscaTodosProdutos);
        buscaProduto.add(buscaAcessorio);
        buscaProduto.add(buscaDiaADia);
        buscaProduto.add(buscaTecnologia);

        buscaLoja = new JMenuItem("Lojas");

        menuBuscar = new JMenu("Buscar");
        menuBuscar.add(buscaLoja);
        menuBuscar.add(buscaProduto);

        // castramento
        cadastraCliente = new JMenuItem("Cliente");
        cadastraLoja = new JMenuItem("Loja");
        cadastraProduto = new JMenuItem("Produto");
        menuCadastrar = new JMenu("Cadastrar");

        menuCadastrar.add(cadastraCliente);
        menuCadastrar.add(cadastraLoja);
        menuCadastrar.add(cadastraProduto);

        barraDeMenu.add(menuBuscar);
        barraDeMenu.add(menuCadastrar);

        janela.setJMenuBar(barraDeMenu);
        janela.setSize(800, 600);
        janela.setVisible(true);
    }



}
