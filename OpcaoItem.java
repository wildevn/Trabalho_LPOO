import javax.swing.JMenuItem;

public class OpcaoItem extends Opcao
{
    private JMenuItem item;

    // Construtores
        OpcaoItem(JMenuItem item, String nomeItem)
        {
            if(nomeItem == null)
                setOpcaoPronta(item); //  item ja criado
            else
                setOpcaoNova(nomeItem); // criando novo item
        }

    // Setters e Getters
    public void setOpcaoPronta(JMenuItem item)
    {
        this.item = item;
    }
    public void setOpcaoNova(String nomeItem)
    {
        this.item = new JMenuItem(nomeItem);
    }
    public JMenuItem getOpcaoX()
    {
        return this.item;
    }
}
