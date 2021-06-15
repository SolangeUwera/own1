package plant;

import plantobject.Akarere;
import plantobject.umurima;
import java.util.Scanner;


public class plant {


    public static void main(String[] args) {
       /*igihe cyihinga*/
        System.out.println("Karbu muri gahunda yo guhinga kijyambere");
        System.out.println("Mwatangira mwinjiza amakuru yibanze kumuhinzi");
        
        System.out.println("Shyiramo igihembwe cyihinga ushaka guhingamo: ");
        Scanner igihembweCyihingwa=new Scanner(System.in);
      
         System.out.println("Shyiramo igihembwe cyihinga mumurima wa 1 ushaka guhingamo: ");
        Scanner igiheCyihinga;
        igiheCyihinga = new Scanner(System.in);
        System.out.println("Shyiramo igihembwe cyihinga mumurima wa 2 ushaka guhingamo: ");
        Scanner igiheCyihinga3;
        igiheCyihinga3 = new Scanner(System.in);
         //akarere
        System.out.print("Injizamo akarere umurima uherereyemo:");
         Scanner akarereKumurima=new Scanner(System.in);
        String _akarere=akarereKumurima.next();
        Akarere akarere=new Akarere();
        akarere.setIzina(_akarere);
      
        
        //umurima
        System.out.print("Injizamo amakuru arebana numurima wandika ubwoko bwumurima munyuguti nto:");
         Scanner ubwokoBwumurima=new Scanner(System.in);
        String ubwoko=ubwokoBwumurima.next();
        umurima umurima=new umurima();
        umurima.setizina(ubwoko);
      
        
    }
    
}