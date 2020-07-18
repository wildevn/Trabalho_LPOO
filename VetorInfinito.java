public class VetorInfinitoString{
    private int tamInicial;
    private int quantElementosAdicionados;
    private String[] vetor;

    VetorInfinitoString(){
        setTamInicial(10);
        setQuantElementosAdicionados(0);
        vetor = new String[tamInicial];
    }

    public void adicionaNoFinal(String novo){
        if(quantElementosAdicionados < vetor.length)
            vetor[quantElementosAdicionados] = novo;
        else{
            String[] novoVetor = new String[quantElementosAdicionados*2];
            for(int i = 0; i <= quantElementosAdicionados; i++){
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
            vetor[quantElementosAdicionados] = novo;
        }
        quantElementosAdicionados++;
    }

    void setTamInicial(int tamInicial){
        this.tamInicial = tamInicial;
    }
    void setQuantElementosAdicionados(int quantElementosAdicionados){
        this.quantElementosAdicionados = quantElementosAdicionados;
    }
}
