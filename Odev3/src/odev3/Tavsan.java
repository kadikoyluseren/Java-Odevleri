package odev3;
public class Tavsan {
    
    public int tHareket(int x){
        int tAdim=0;
        if(x>=1 && x<=2 )
            tAdim=0;
        else if(x>2 && x<=4)
            tAdim=9;
        else if (x == 5)
            tAdim=-12;
        else if(x>5 && x<=8)
            tAdim=1;
        else if(x>8 && x<=10)
            tAdim=-2;
        return tAdim;
    }
}