abstract class Produto{

  private String idProduto, nome, cor, descricaoTecnica, tipo;
  private double preco;
  private int quantidade;

  // Construtor
  Produto(String idProduto, String nome, String cor, String descricaoTecnica, String tipo, double preco, int quantidade){
    setIdProduto(idProduto);
    setNome(nome);
    setCor(cor);
    setDescricaoTecnica(descricaoTecnica);
    setTipo(tipo);
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
  void setTipo(String tipo){
    this.tipo = tipo;
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
  String getTipo(){
    return tipo;
  }
  double getPreco(){
    return preco;
  }
  int getQuantidade(){
    return quantidade;
  }
}
