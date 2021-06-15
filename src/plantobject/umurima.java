/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantobject;

/**
 *
 * @author Solange
 */
public class umurima {

    private int id;
    private String izina;
    private Akarere Akarere;
    private int ubuso;
    private boolean urahinze;
    private boolean  urateye;
    private Igihingwa igihingwa;
    private String ubwokoBwumurima;
    
    
    public umurima(String izina,Akarere Akarere, int ubuso,String ubwokoBwumurima, boolean urahinze,boolean urateye,Igihingwa igihingwa){
        this.izina=izina;
          this.Akarere=Akarere;
          this.urahinze=urahinze;
          this.ubuso=ubuso;
          this.urateye=urateye;
          this.igihingwa=igihingwa;
          this.ubwokoBwumurima=ubwokoBwumurima;
        
    }

    public umurima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void setId(int id){
   this.id=id;
   }
   public int getId(){
   return id;
   }
    public void setizina(String izina){
    this.izina=izina;
    }
    public String getIzina(){
        return izina;
    }
    
    public void setAkarere(Akarere Akarere){
    this.Akarere=Akarere;
    }
    public Akarere getAkarere(){
        return Akarere;
    }
    
    public void setUbuso(int ubuso){
    this.ubuso=ubuso;
    }
    public int getUbuso(){
        return ubuso;
    }
    public void setUrahinze(boolean urahinze){
    this.urahinze=urahinze;
    }
    public boolean getUrahinze(){
        return urahinze;
    }
    
     public void setUrateye(boolean urateye){
    this.urateye=urateye;
    }
    public boolean getUrateye(){
        return urateye;
    }
    
    public void setIgihingwa(Igihingwa igihingwa){
    this.igihingwa=igihingwa;
    }
    public Igihingwa getIgihingwa(){
        return igihingwa;
    }
    
    public void setUbwokoBwumurima(String ubwoko){
    this.ubwokoBwumurima=ubwoko;
    }
    public String getUbwokoBwumurima(){
        return ubwokoBwumurima;
    }
    
    
}

