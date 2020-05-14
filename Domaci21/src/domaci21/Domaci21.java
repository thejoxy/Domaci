/*
Kreirati klasu pod nazivom ImePrezime sa odgovarajućim atributima i metodama 
za učitavanje dva stringa i proveru da li su uneti stringovi isti. 
U klasi pod nazivom GlavnaKlasa, a u okviru main metode, po potrebi pozivati odgovarajuće atribute 
i metode iz klase ImePrezime radi ispunjenja uslova zadatka i uspešnog izvršenja programskog koda.
 */
package domaci21;

import java.util.Scanner;

public class Domaci21 {

    public static void main(String[] args) {
        
        ImePrezime a = new ImePrezime();
        
        System.out.println("Molim unesite svoje ime i prezime : ");
        Scanner scanner= new Scanner(System.in);
        String prvi = scanner.nextLine();
        String drugi = scanner.nextLine();
        
        a.setImePrezime1(prvi);
        a.setImePrezime2(drugi);
 
        System.out.println(a.toString());        
        System.out.println(stringCompare(prvi, drugi));
    }

    private static String stringCompare(String prvi, String drugi) {
        if(prvi.equals(drugi))
            return("Unosi su isti. ");
        else
            return("Unosi se razlikuju. ");
     
    }
}
