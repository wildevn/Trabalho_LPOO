import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class OuvidoDoBotaoDetalhes implements ActionListener
{
private Janela janela;
private Loja loja;
private Acessorio acessorio;
private Tecnologia tecnologia;
private DiaADia diaADia;

    // construtores
    OuvidoDoBotaoDetalhes(Janela janela, Loja loja)
    {
        setJanela(janela);
        setLoja(loja);
    }
    OuvidoDoBotaoDetalhes(Janela janela, Acessorio acessorio)
    {
        setJanela(janela);
        setAcessorio(acessorio);
    }
    OuvidoDoBotaoDetalhes(Janela janela, Tecnologia tecnologia)
    {
        setJanela(janela);
        setTecnologia(tecnologia);
    }
    OuvidoDoBotaoDetalhes(Janela janela, DiaADia diaADia)
    {
        setJanela(janela);
        setDiaADia(diaADia);
    }
    


    @Override
    public void actionPerformed(ActionEvent evento)
    {
        JPanel painel;
        // Descobrindo qual elemento nao e nulo para exibir os detalhes
        if(loja != null)
        {
            FrameLoja frameLoja = new FrameLoja(janela, loja);
        }
        else if(acessorio != null)
        {
            //
        }
        else if(tecnologia != null)
        {
            //
        }
        else 
        {
            //
        }
        
        // tirar;.....
        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel, BorderLayout.CENTER);
        //janela.getBarraDeStatus().setText(" ");
        janela.getFrame().setVisible(true);
    }

    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setLoja(Loja loja)
    {
        this.loja = loja;
    }
    public void setAcessorio(Acessorio acessorio)
    {
        this.acessorio = acessorio;
    }
    public void setTecnologia(Tecnologia tecnologia)
    {
        this.tecnologia = tecnologia;
    }
    public void setDiaADia(DiaADia diaADia)
    {
        this.diaADia = diaADia;
    }

}