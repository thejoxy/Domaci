
package domaci21;

public class ImePrezime {
    
    private String imePrezime1;
    private String imePrezime2;
    
    public String getImePrezime1(){
        return imePrezime1;
    }
    
    public void setImePrezime1(String imePrezime1){
        if(imePrezime1 == null)
            System.out.println("Greska"); 
         else {
                this.imePrezime1= imePrezime1;
        }
                    
    }
    
    public String getImePrezime2(){
        return imePrezime2;
    }
    public void setImePrezime2(String imePrezime2){
        if(imePrezime2 == null)
            System.out.println("Greska");  
        else 
            this.imePrezime2= imePrezime2;      
    }
    
       
    
    public String toString(){
        return "Prva uneta vrednost: " + imePrezime1 + "\n" + "Druga uneta vrednost: " + imePrezime2;
    }

    
}
