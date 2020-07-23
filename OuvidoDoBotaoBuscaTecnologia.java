class Tecnologia extends Produto{

  String tipoTecnologia;

  // Construtor
  Tecnologia(String nome, String cor, String descricaoTecnica, String idLoja, double preco, int quantidade, String tipoTecnologia){
    super(nome, cor, descricaoTecnica, tipo, preco, quantidade);
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
