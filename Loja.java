class Loja{

  private String idLoja, nome, endereco;
  VetorInfinitoString idClientes = new VetorInfinitoString();
  VetorInfinitoString idProdutos = new VetorInfinitoString();

  // Construtor
  Loja(String idLoja, String nome, String endereco){
    setIdLoja(idLoja);
    setNome(nome);
    setEndereco(endereco);
  }
  
  // Metodos
  void cadastroProduto(Produto produto){
        idProdutos.adicionaNoFinal(produto.getIdProduto());
  }
  
  void cadastroCliente(Cliente cliente){
        idClientes.adicionaNoFinal(cliente.getIdCliente());
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
