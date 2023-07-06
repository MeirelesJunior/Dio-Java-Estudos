package aula.meireles.TiposDeMetodos;

public class Usuario {
    public static void main(String[] args) {
      
        SmartTv tv = new SmartTv();

       System.out.println("A Tv está ligada? " + tv.ligada);
       System.out.println("Canal atual: " + tv.canal);
       System.out.println("Volume atual: " + tv.volume);

       tv.ligar();
       System.out.println("Novo status - A Tv está ligada? " + tv.ligada);

       tv.desligar();
       System.out.println("Novo status - A Tv está ligada? " + tv.ligada);

       tv.aumentarVolume();
       tv.aumentarVolume();
       System.out.println("Volume atual: " + tv.volume);
       
       System.out.println("Canal atual: " + tv.canal);
       tv.mudarCanal(13);
       System.out.println("Canal atual: " + tv.canal);
       
    }
}
