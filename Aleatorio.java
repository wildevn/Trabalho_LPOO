import java.util.Random;

public class Aleatorio{

    private int[] array = new int[1000];
    private Random random = new Random();
    private boolean temnumero = false;
    private int cont = 0;

    private int geraAleatorio(){
        int valor = random.nextInt(1000);

        for(int i = 0; i<1000){
            if(array[i] == valor)
                temnumero = true;
            
            if(temnumero){
                valor = geraAleatorio();
            }
            else{
                array[cont] = valor;
                cont++
            }
        }
        return valor;
    }

    String geraBoleto(){
        return geraAleatorio().toString();
    }
}
