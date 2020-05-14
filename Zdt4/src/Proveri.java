
public class Proveri {
    private String s;

    public Proveri(String s) {
        this.s = s;
    }
    
    public boolean daLiJeBroj(){
        if (s == null)
            return false;
        try {
            int n = Integer.parseInt(s);
        }catch (NumberFormatException nfe) {
        return false;
    }
    return true;
    }
    String s1;
    
    public String brojCifara(){
        
        int n = Integer.parseInt(s);
     
    int br = 0;
        
        while (n>0){
            n/=10;
            br++;
        }
        switch (br){
            case 0:
                s1= "Niste uneli broj.";
                break;
            case 1:
                s1 =  "JEDNOCIFREN BROJ";
                break;
            case 2:
                s1 =  "DVOCIFREN BROJ.";
                break;
            case 3:
                s1 = "TROCIFREN BROJ.";
                break;
    }
        return s1;
    }            
        
}

