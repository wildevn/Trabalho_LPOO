class DiaADia extends Produto{

  String tipoDiaADia;

  // Construtor
  DiaADia(String nome, String cor, String descricaoTecnica, String idLoja, double preco, int quantidade, String tipoDiaADia){
    super(nome, cor, descricaoTecnica, tipo, preco, quantidade);
    setTipoDiaADia(tipoDiaADia);
  }

  // Setters e getters
  void setTipoDiaADia(String tipoDiaADia){
    this.tipoDiaADia = tipoDiaADia;
  }
  String getTipoDiaADia(){
    return tipoDiaADia;
  }
}
