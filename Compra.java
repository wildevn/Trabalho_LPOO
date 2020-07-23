public class Compra{

    private double valor, valorAtualizado;
    private int parcelas;

    // Contrutor
    public Compra(double valor, int parcelas){
    setValor(valor);
    setParcelas(parcelas);
    }

    // Metodos
    public void gerenciaCompraFinal(Loja loja, Produto produto, Cliente cliente){
        loja.processarCompra(produto);
        cliente.comprar(produto, valorAtualizado);
    }

    public void gerenciaCompraInicioC(Loja loja, Produto produto){
        valorAtualizado = loja.calculaPrecoC(valor, parcelas);
    }

    public void gerenciaCompraInicioB(Loja loja, Produto produto){
        valorAtualizado = loja.calculaPrecoB(valor);
    }

    // Setters e getters
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }
    public void setValorAtualizado(double valor){
        this.valorAtualizado = valor;
    }
    public double getValorAtualizado(){
        return valorAtualizado;
    }
    public double getValor(){
        return valor;
    }
    public int getParcelas(){
        return parcelas;
    }
}
