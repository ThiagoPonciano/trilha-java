public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv foi ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Tv foi desligada? " + smartTv.ligada);

        smartTv.mudarCanal(10);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        
    }
    
}
