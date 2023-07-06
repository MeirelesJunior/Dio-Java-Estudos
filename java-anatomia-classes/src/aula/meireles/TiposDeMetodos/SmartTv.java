package aula.meireles.TiposDeMetodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume +=1;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume -=1;
         System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
         canal = novoCanal;  
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    
}
