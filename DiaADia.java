class DiaADia extends Produto{

  String tipoDiaADia;

  // Construtor
  DiaADia(String idProduto, String nome, String cor, String descricaoTecnica, String tipo, double preco, int quantidade, String tipoDiaADia){
    super(idProduto, nome, cor, descricaoTecnica, tipo, preco, quantidade);
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
