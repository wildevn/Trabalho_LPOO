import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class BotaoQualquer
{
private JMenu menu;
private JMenuItem opcoes[];
private int quantAtualDeOpcoes;

    // construtor
    BotaoQualquer(String nomeMenu, int quantDeOpcoes)
    {
        setMenu(nomeMenu);
        opcoes = new JMenuItem[quantDeOpcoes];
        setQuantAtualDeOpcoes(0);
    }

// Métodos
public void adicionaActionListener(ActionListener ouvido, int indice)
{
    getOpcao(indice).addActionListener(ouvido);
}

// Setters e Getters
public void setMenu(String nomeMenu)
{
    this.menu = new JMenu(nomeMenu);
}
public void setOpcaoNova(String nomeOpcao)
{
    opcoes[quantAtualDeOpcoes] = new JMenuItem(nomeOpcao);
    menu.add(opcoes[quantAtualDeOpcoes]);
    setQuantAtualDeOpcoes(getQuantAtualDeOpcoes() + 1);
}
public void setOpcaoPronta(JMenu menu, JMenuItem menuItem)
{
    System.out.println("Comparando");
    if(menu == null)
    {
        System.out.println("1");
        opcoes[quantAtualDeOpcoes] = menuItem;
    }
    else if(menuItem == null)
    {
        System.out.println("outro");
        opcoes[quantAtualDeOpcoes] = menu;
    }
    System.out.println("Saiu");
    menu.add(opcoes[quantAtualDeOpcoes]);
    setQuantAtualDeOpcoes(getQuantAtualDeOpcoes() + 1);
}
public void setQuantAtualDeOpcoes(int quantDeOpcoes)
{
    this.quantAtualDeOpcoes = quantDeOpcoes;
}
public JMenu getMenu()
{
    return this.menu;
}
public JMenuItem getOpcao(int indice)
{
    return this.opcoes[indice];
}
public int getQuantAtualDeOpcoes()
{
    return this.quantAtualDeOpcoes;
}
}