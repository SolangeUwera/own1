/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantobject;

import java.time.LocalDateTime;

/**
 *
 * @author Solange
 */
public class Season {
    


//import java.time.LocalDateTime;

   private int id;
   private String igiheCyihinga1;
   private String igiheCyihinga2;
   private LocalDateTime startDate;
   private LocalDateTime endDate;
   
   public Season(String igiheCyihinga1,String igiheCyihinga2, LocalDateTime startDate,LocalDateTime endDate){
       String igiheCyihinga = null;
   this.igiheCyihinga1= igiheCyihinga;
       String igihecyihinga3 = null;
   this.igiheCyihinga2= igihecyihinga3;
   this.startDate=startDate;
   this.endDate=endDate;
   }

    public Season() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public void setId(int id){
   this.id=id;
   }
   public int getId(){
   return id;
   }
   
   public void setStartDate(LocalDateTime startDate){
   this.startDate=startDate;
   }
   public LocalDateTime getStartDate(){
   return startDate;
           
   }
   
   public void setEndDate(LocalDateTime endDate){
   this.endDate=endDate;
   }
   public LocalDateTime getEndDate(){
   return endDate;
           
   }
   
   public void setIgigeCyihinga(String igiheCyihinga){
   this.igiheCyihinga1=igiheCyihinga;
   }
   
   public String getIgiheCyihinga(){
   return igiheCyihinga1;
   }

    public void setIzina(String _season) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIzina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


