class Loja{

    private String idLoja, nome, endereco, senha;
    private VetorInfinitoString idProdutos = new VetorInfinitoString();
    private Pagamento[] formasPagamento = new Pagamento[2];
  
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

    void processarCompra(String idProduto){
        for(int i = 0; i<idProdutos.getQuantElementosAdicionados(); i++){
            if(idProdutos.getElemento(i).equals(idProduto)){
                // busca produto no bd com o id
                // diminui a quantidade do produto em 1
            }
        }
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
    void setSenha(String senha){
        this.senha = senha;
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
    String getSenha(){
        return senha;
    }
    VetorInfinitoString getIdProdutos()
    {
      return idProdutos;
    }
}
