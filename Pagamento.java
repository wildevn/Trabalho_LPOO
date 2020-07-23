class Pagamento{

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
    double calcularJuro(double preco, double juros, int parcelas){

        juros = preco*Math.pow((1+0.05), parcelas) - preco;

        return juros;
    }
    
    // Setters e getters
    void setMaxSemJuros(int maxSemJuros){
        this.maxSemJuros = maxSemJuros;
    }
    void setMaxComJuros(int maxComJuros){
        this.maxComJuros = maxComJuros;
    }
    int getMaxSemJuros(){
        return maxSemJuros;
    }
    int getMaxComJuros(){
        return maxComJuros;
    }
    void setNumBoleto(String numBoleto){
        this.numBoleto = numBoleto;
    }
    String getNumBoleto(){
        return numBoleto;
    }
}
