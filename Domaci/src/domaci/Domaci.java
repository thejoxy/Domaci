/*
Kreirati klasu sa odgovarajućim atributima i metodama 
koja u okviru main metode izračunava sumu unetih n prirodnih brojeva. 
Brojevi se unose i sabiraju dok korisnik ne unese broj 0.
 */
package domaci;

import java.util.Scanner;

public class Domaci {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj :");
        int broj = scanner.nextInt();
        int suma=broj;
        
            do{
                System.out.println("Unesite sledeci broj :");
                broj = scanner.nextInt();
                if(broj>0){
                suma= suma+broj;
                System.out.println(suma);
                }else {
                    System.out.println(suma);
                    
                }
           
            }  while (broj > 0);
            
    }
}
