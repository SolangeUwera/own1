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
public class ifumbire {
   public int id;
   public String izina;

    /**
     *
     * @param izina
     * @param id
     */
    public ifumbire(String izina, int id){
   this.id=id;
   this.izina=izina;
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
}
