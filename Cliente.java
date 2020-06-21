class Cliente{

  private String idCliente, nome, cpf, endereco, numCartao;
  private int idade;

  // Construtor
  Cliente(String idCliente, String nome, String cpf, String endereco, String numCartao, int idade){
    setIdCliente(idCliente);
    setNome(nome);
    setCpf(cpf);
    setEndereco(endereco);
    setIdade(idade);
    setNumCartao(numCartao);
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
}
