import javax.swing.JLabel;

public class Ouvido
{
    protected JLabel barraDeStatus;

    Ouvido(JLabel barraDeStatus)
    {
        setBarraDeStatus(barraDeStatus);
    }

    public void setBarraDeStatus(JLabel barraDeStatus)
    {
        this.barraDeStatus = barraDeStatus;
    }
    public JLabel getBarraDeStatus()
    {
        return this.barraDeStatus;
    }
}
