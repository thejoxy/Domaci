
package domaci22;

public class ImePrezime {
    
   private String rec1;
   private String rec2;
   
   public String getRec1(){
       return rec1;
   }

   public void setRec1(String rec1){
       if(rec1== null)
           System.out.println("Greska");
       else
           this.rec1=rec1 ;
   }
    public String getRec2(){
       return rec2;
   }
   public void setRec2(String rec2){
       if(rec2== null)
           System.out.println("Greska");
       else
           this.rec2=rec2;
   }
   public String toString(){
       return "Prva rec: " + rec1 + "\nDruga rec: " + rec2 + "\nRec1 + Rec2: " + rec1+rec2;
   }
   
    
}
