
package zadatak3;


public class Zadatak3 {

   
    public static void main(String[] args) {
        MuzickiStub k = new MuzickiStub(false,0);
        k.ukljuci();
        for(int i=0;i<5;i++)
            k.pojacajTon();
        k.promeniStranicu(102.9);
        k.ispisi();
    }
    
    
}