import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class BotaoQualquer
{
private JMenu menu;
private Opcao opcoes[];
private int quantAtualDeOpcoes;

    // construtor
    BotaoQualquer(String nomeMenu, int quantDeOpcoes)
    {
        setMenu(nomeMenu);
        opcoes = new Opcao[quantDeOpcoes];
        setQuantAtualDeOpcoes(0);
    }

// Métodos
/*public void adicionaActionListener(ActionListener ouvido, int indice)
{
    getOpcao(indice).addActionListener(ouvido);
}*/

// Setters e Getters
public void setMenu(String nomeMenu)
{
    this.menu = new JMenu(nomeMenu);
}
public void setOpcaoNova(String nomeOpcao)
{
    opcoes[quantAtualDeOpcoes] = new OpcaoItem(null, nomeOpcao);
    menu.add(((OpcaoItem)opcoes[quantAtualDeOpcoes]).getOpcaoX());
    setQuantAtualDeOpcoes(getQuantAtualDeOpcoes() + 1);
}
public void setOpcaoPronta(JMenu menu, JMenuItem menuItem)
{
    if(menu == null)
    {
        opcoes[quantAtualDeOpcoes] = new OpcaoItem(menuItem, null);
        this.menu.add(menuItem);
    }
    else if(menuItem == null)
    {
        opcoes[quantAtualDeOpcoes] = new OpcaoMenu(menu, null);
        this.menu.add(menu);
    }
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
/*public JMenuItem getOpcao(int indice) // trocar
{
   // return this.opcoes[indice];
}*/
public int getQuantAtualDeOpcoes()
{
    return this.quantAtualDeOpcoes;
}
}
