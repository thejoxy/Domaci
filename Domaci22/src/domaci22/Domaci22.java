/*
Kreirati klasu pod nazivom ImePrezime sa odgovarajućim atributima i metodama za učitavanje dva rec1inga, 
ispisivanje poruke o njihovoj dužini, njihovo spajanje u jedan rec1ing i ispisivanje na taj način dobijenog rec1inga. 
U klasi pod nazivom GlavnaKlasa, a u okviru main metode, po potrebi pozivati odgovarajuće atribute i metode 
iz klase ImePrezime radi ispunjenja uslova zadatka i uspešnog izvršenja programskog koda.
 */
package domaci22;

import java.util.Scanner;

public class Domaci22 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Unesite dve reci: ");
        String rec1= scanner.nextLine();
        String rec2= scanner.nextLine();
        String rec3= rec1+rec2;
        
        ImePrezime a = new ImePrezime();
        
        a.setRec1(rec1);
        a.setRec2(rec2);
        
        System.out.println(a.toString());
        
        int len1 = rec1.length(); 
        System.out.println("Duzina prve reci: " + len1);
        int len2 = rec2.length(); 
        System.out.println("Duzina druge reci: " + len2);
 
    }
}
