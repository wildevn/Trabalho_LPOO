class Tecnologia extends Produto{

  String tipoTecnologia;

  // Construtor
  Tecnologia(String idProduto, String nome, String cor, String descricaoTecnica, String tipo, double preco, int quantidade, String tipoTecnologia){
    super(idProduto, nome, cor, descricaoTecnica, tipo, preco, quantidade);
    setTipoTecnologia(tipoTecnologia);
  }

  // Setters e getters
  void setTipoTecnologia(String tipoTecnologia){
    this.tipoTecnologia = tipoTecnologia;
  }
  String getTipoTecnologia(){
    return tipoTecnologia;
  }
}
