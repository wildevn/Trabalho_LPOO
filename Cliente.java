class Cliente{

    private String idCliente, nome, cpf, endereco, numCartao, senha;
    private int idade, cont;
    private VetorInfinitoString inventario = new VetorInfinitoString();
  
    // Construtor
    Cliente(String idCliente, String nome, String cpf, String endereco, String numCartao, int idade){
      setIdCliente(idCliente);
      setNome(nome);
      setCpf(cpf);
      setEndereco(endereco);
      setIdade(idade);
      setNumCartao(numCartao);
    }

    // Metodos
    void comprar(Produto produto){
        String novaCompra = produto.getIdProduto();
        inventario.adicionaNoFinal(novaCompra);
        dinheiroGasto += produto.getPreco();
    }
  
    // Setters e getters
    void setIdCliente(String idCliente){
      this.idCliente = idCliente;
    }
    void setNome(String nome){
      this.nome = nome;
    }
    void setCpf(String cpf){
      this.cpf = cpf;
    }
    void setEndereco(String endereco){
      this.endereco = endereco;
    }
    void setIdade(int idade){
      this.idade = idade;
    }
    void setNumCartao(String numCartao){
      this.numCartao = numCartao;
    }
    void setSenha(String senha){
        this.senha = senha;
    }
    String getIdCliente(){
      return idCliente;
    }
    String getNome(){
      return nome;
    }
    String getCpf(){
      return cpf;
    }
    String getEndereco(){
      return endereco;
    }
    int getIdade(){
      return idade;
    }
    String getNumCartao(){
      return numCartao;
    }
    String getSenha(){
        return senha;
    }
}
