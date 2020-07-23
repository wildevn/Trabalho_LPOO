class Boleto extends Pagamento{

  private String numBoleto;

  // Construtor
  Boleto(String numBoleto){
    setNumBoleto(numBoleto);
  }
  
  // funcoes
  //@override
  

  // Setters e getters
  void setNumBoleto(String numBoleto){
    this.numBoleto = numBoleto;
  }
  String getNumBoleto(){
    return numBoleto;
  }
}
