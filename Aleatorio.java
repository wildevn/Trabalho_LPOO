import java.util.Random;

public class Aleatorio{

    private int[] array = new int[1000];
    private Random random = new Random();
    private boolean temNumero = false;
    private int cont = 0;

    private int geraAleatorio(){
        int valor = random.nextInt(1000);

        for(int i = 0; i<1000; i++){
            if(array[i] == valor)
                temNumero = true;
            
            if(temNumero){
                valor = geraAleatorio();
            }
            else{
                array[cont] = valor;
                cont++;
            }
        }
        return valor;
    }

    String geraBoleto(){
        return Integer.toString(geraAleatorio());
    }
}
