class Acessorio extends Produto{

  String tipoAcessorio;

  // Construtor
  Acessorio(String nome, String cor, String descricaoTecnica, String idLoja, double preco, int quantidade, String tipoAcessorio){
    super(nome, cor, descricaoTecnica, idLoja, preco, quantidade);
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
