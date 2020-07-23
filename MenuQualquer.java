import java.awt.event.ActionListener;
import java.awt.Component;

import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MenuQualquer
{
    private JMenu menu;
    private Component opcoes[];
    private int quantAtualDeOpcoes;

    // construtor
        MenuQualquer(String nomeMenu, int quantDeOpcoes)
        {
            setMenu(nomeMenu);
            opcoes = new Component[quantDeOpcoes];
            setQuantAtualDeOpcoes(0);
        }

    // Métodos
    public void adicionaActionListener(ActionListener ouvido, int indice)
    {
        ((JMenuItem)opcoes[indice]).addActionListener(ouvido);
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
        if(menu == null)
        {
            opcoes[quantAtualDeOpcoes] = menuItem;
            this.menu.add(menuItem);
        }
        else if(menuItem == null)
        {
            opcoes[quantAtualDeOpcoes] = menu;
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
    public Component getOpcao(int indice) 
    {
        return opcoes[indice];
    }
    public int getQuantAtualDeOpcoes()
    {
        return this.quantAtualDeOpcoes;
    }
}
