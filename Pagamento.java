import java.util.Random;

public class Pagamento{

    private int maxSemJuros, maxComJuros;
    private String numBoleto;
    //private Aleatorio aleatorio = new Aleatorio();

    // Construtor
    Pagamento(){
        Random random = new Random();
        numBoleto = random.nextInt(1000);
        setNumBoleto(numBoleto);
    }
    Pagamento(int maxSemJuros, int maxComJuros){
        setMaxSemJuros(maxSemJuros);
        setMaxComJuros(maxComJuros);
    }

    // Metodos
    public double calcularJuro(double preco, int parcelas){
        int total = preco*Math.pow((1+0.05), parcelas);
        return total;
    }

    public double calcularPrecoC(double preco, int parcelas){
        if(parcelas <= maxSemJuros){
            return preco;
        }
        else{
            return calcularJuro(preco, parcelas);
        }
    }

    public double calcularPrecoB(double preco){
        return preco*0.85;
    }
    
    // Setters e getters
    public void setMaxSemJuros(int maxSemJuros){
        this.maxSemJuros = maxSemJuros;
    }
    public void setMaxComJuros(int maxComJuros){
        this.maxComJuros = maxComJuros;
    }
    public int getMaxSemJuros(){
        return maxSemJuros;
    }
    public int getMaxComJuros(){
        return maxComJuros;
    }
    public void setNumBoleto(String numBoleto){
        this.numBoleto = numBoleto;
    }
    public String getNumBoleto(){
        return numBoleto;
    }
}
