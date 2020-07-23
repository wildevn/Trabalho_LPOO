abstract class Produto{

  private String idProduto, nome, cor, descricaoTecnica, idLoja;
  private double preco;
  private int quantidade;

  // Construtor
  Produto(String idProduto, String nome, String cor, String descricaoTecnica, String idLoja, double preco, int quantidade){
    setIdProduto(idProduto);
    setNome(nome);
    setCor(cor);
    setDescricaoTecnica(descricaoTecnica);
    setIdLoja(idLoja);
    setPreco(preco);
    setQuantidade(quantidade);
  }
  
  // Metodos
  void diminuiQuant(){
    setQuantidade(getQuantidade()-1);
  }

  // Setters e getters
  void setIdProduto(String idProduto){
    this.idProduto = idProduto;
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setCor(String cor){
    this.cor = cor;
  }
  void setDescricaoTecnica(String descricaoTecnica){
    this.descricaoTecnica = descricaoTecnica;
  }
  void setIdLoja(String idLoja){
    this.idLoja = idLoja;
  }
  void setPreco(double preco){
    this.preco = preco;
  }
  void setQuantidade(int quantidade){
    this.quantidade = quantidade;
  }
  String getIdProduto(){
    return idProduto;
  }
  String getNome(){
    return nome;
  }
  String getCor(){
    return cor;
  }
  String getDescricaoTecnica(){
    return descricaoTecnica;
  }
  String getIdLoja(){
    return idLoja;
  }
  double getPreco(){
    return preco;
  }
  int getQuantidade(){
    return quantidade;
  }
}
