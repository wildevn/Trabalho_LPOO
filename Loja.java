class Loja{

  private String idLoja, nome, endereco;
  private String[] idClientes = new String[];
  private String[] idProdutos = new String[];

  // Construtor
  Loja(String idLoja, String nome, String endereco){
    setIdLoja(idLoja);
    setNome(nome);
    setEndereco(endereco);
  }

  // Setters e getters
  void setIdLoja(String idLoja){
    this.idLoja = idLoja;
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setEndereco(String endereco){
    this.endereco = endereco;
  }
  String getIdLoja(){
    return idLoja;
  }
  String getNome(){
    return nome;
  }
  String getEndereco(){
    return endereco;
  }
}
