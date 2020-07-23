public class Pagamento{

    private int maxSemJuros, maxComJuros;
    private String numBoleto;
    private Aleatorio aleatorio = new Aleatorio();

    // Construtor
    Pagamento(){
        numBoleto = aleatorio.geraBoleto();
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
