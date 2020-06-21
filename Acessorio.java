class Acessorio extends Produto{

  String tipoAcessorio;

  // Construtor
  Acessorio(String idProduto, String nome, String cor, String descricaoTecnica, String tipo, double preco, int quantidade, String tipoAcessorio){
    super(idProduto, nome, cor, descricaoTecnica, tipo, preco, quantidade);
    setTipoAcessorio(tipoAcessorio);
  }

  // Setters e getters
  void setTipoAcessorio(String tipoAcessorio){
    this.tipoAcessorio = tipoAcessorio;
  }
  String getTipoAcessorio(){
    return tipoAcessorio;
  }
}
