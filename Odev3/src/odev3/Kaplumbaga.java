package odev3;
public class Kaplumbaga {
    
    public int kHareket(int x){
        int kAdim=0;
        if(x>=1 && x<=5 )
            kAdim=3;
        else if(x>5 && x<=7)
            kAdim=-6;
        else if (x>7 && x<=10)
            kAdim=1;
        return kAdim;
    }
}