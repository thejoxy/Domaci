
package domaci22;

public class prebrojavanje {
    static final int MAX_CHAR = 256; 

  
    static void getOccuringChar(String rec1) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
       // int count[] = new int[MAX_CHAR]; 
  
        int len = rec1.length(); 
  
        // Initialize count array index 
       // for (int i = 0; i < len; i++) 
          //  count[rec1.charAt(i)]++; 
  
        // Create an array of given String size 
        //char ch[] = new char[rec1.length()]; 
        //for (int i = 0; i < len; i++) { 
           // ch[i] = rec1.charAt(i); 
            //int find = 0; 
            //for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
               // if (rec1.charAt(i) == ch[j])  
                   // find++;                 
            //} 
  
           // if (find == 1)  
                System.out.println("Number of Occurrence of :" + 
                 len);             
      //  } 
    } 
} 
    
