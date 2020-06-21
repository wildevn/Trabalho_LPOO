class Cartao extends Pagamento{

  int maxSemJuros, maxComJuros;

  // Construtor
  Cartao(int maxSemJuros, int maxComJuros){
    setMaxSemJuros(maxSemJuros);
    setMaxComJuros(maxComJuros);
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
}
