package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {
        int conta = 3;

        GaiaRobo umaGaiaRobo = new GaiaRobo();
        JonasRobo umJonasRobo = new JonasRobo();

        if(conta>0){
            System.out.println("Atenção vou chamar a Gaia");
            conta--;
        }

        while (conta>0){
            System.out.println(conta);
            conta--;
        }

        umaGaiaRobo.abrirChromeS();
        umaGaiaRobo.fazerLogin();
        umaGaiaRobo.lancarNota();

        umJonasRobo.tirarXerox();
    }


}


