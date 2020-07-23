public class Loja{

    private String idLoja, nome, endereco, senha;
    private VetorInfinitoString idProdutos = new VetorInfinitoString();
    private int maxComJuros, maxSemJuros;


    // Construtor
    Loja(String idLoja, String nome, String endereco, int maxComJuros, int maxSemJuros){
      setIdLoja(idLoja);
      setNome(nome);
      setEndereco(endereco);
      setMaxComJuros(maxComJuros);
      setMaxSemJuros(maxSemJuros);
    }

    private Pagamento cartao = new Pagamento(maxSemJuros, maxComJuros);    
    
    // Metodos
    public void cadastroProduto(Produto produto){
          idProdutos.adicionaNoFinal(produto.getIdProduto());
    }

    public void processarCompra(Produto produto, double preco, int parcelas){
      if(produto.getQuantidade() > 0)
        produto.diminuiQuant();
      else{
        // não há o produto no estoque
      }
    }



    public String processarCompraBoleto(){
      Pagamento boleto = new Pagamento();
      return boleto.getNumBoleto();
    }
  
    // Setters e getters
    public void setIdLoja(String idLoja){
      this.idLoja = idLoja;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    public void setSenha(String senha){
      this.senha = senha;
    }
    public void setMaxSemJuros(int maxSemJuros){
      this.maxSemJuros = maxSemJuros;
    }
    public void setMaxComJuros(int maxComJuros){
      this.maxComJuros = maxComJuros;
    }
    public int getMaxSemJuros(){
      return maxSemJuros;
    }
    public int getMaxComJuros(){
      return maxComJuros;
    }
    public String getIdLoja(){
      return idLoja;
    }
    public String getNome(){
      return nome;
    }
    public String getEndereco(){
      return endereco;
    }
    public String getSenha(){
        return senha;
    }

}
