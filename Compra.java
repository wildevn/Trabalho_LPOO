public class Compra{

    private double valor;
    private int parcelas;

    // Contrutor
    Compra(double valor, int parcelas){
    setValor(valor);
    setParcelas(parcelas);
    }

    // Metodos
    public void gerenciaCompra(Loja loja, Produto produto, Cliente cliente){
        loja.processarCompra(produto, valor, parcelas);
        cliente.comprar(produto);
    }

    

    // Setters e getters
    public void setValor(double valor){
    this.valor = valor;
    }
    public void setParcelas(int parcelas){
    this.parcelas = parcelas;
    }
    public double getValor(){
    return valor;
    }
    public int getParcelas(){
    return parcelas;
    }
}
