class Compra{

  private double valor;
  private int parcelas;

  // Contrutor
  Compra(double valor, int parcelas){
    setValor(valor);
    setParcelas(parcelas);
  }

  // Setters e getters
  void setValor(double valor){
    this.valor = valor;
  }
  void setParcelas(int parcelas){
    this.parcelas = parcelas;
  }
  double getValor(){
    return valor;
  }
  int getParcelas(){
    return parcelas;
  }
}
