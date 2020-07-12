import javax.swing.JMenu;

public class OpcaoMenu extends Opcao
{
private JMenu menu;

    // Construtor
    OpcaoMenu(JMenu menu, String nomeMenu)   
    {
        if(nomeMenu == null)
            setOpcaoPronta(menu);  // passando menu pronto
        else
            setOpcaoNova(nomeMenu); // criando um novo menu
    }
// Setters e Getters
public void setOpcaoPronta(JMenu menu)
{
    this.menu = menu;
}
public void setOpcaoNova(String nomeMenu)
{
    this.menu = new JMenu(nomeMenu);
}

public JMenu getOpcaoX()
{
    return this.menu;
}
}