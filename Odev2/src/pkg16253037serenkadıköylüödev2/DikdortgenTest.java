package pkg16253037serenkadıköylüödev2;
public class DikdortgenTest 
{    
    public static void main(String[] args) 
    {
        //Dikdortgen(en,boy,x,y)
        
        Dikdortgen dik1=new Dikdortgen(13,12,-2,8);
        System.out.println("Eski Sol Alt Kose Koordinati : "+"("+dik1.getX()+","+dik1.getY()+")");
        System.out.println("Yeni Sol Alt Kose Koordinati : "+dik1.gez(0,0 ));
        System.out.println("Alan : "+dik1.alan());
        System.out.println("Cevre : "+dik1.cevre());
        
        Dikdortgen dik2=new Dikdortgen(3,6,0,0);
        System.out.println("\nEski Sol Alt Kose Koordinati : "+"("+dik2.getX()+","+dik2.getY()+")");
        System.out.println("Yeni Sol Alt Kose Koordinati : "+dik2.gez(3, 5));
        System.out.println("Alan : "+dik2.alan());
        System.out.println("Cevre : "+dik2.cevre());
        
        Dikdortgen dik3=new Dikdortgen(32,5,23,67);
        System.out.println("\nEski Sol Alt Kose Koordinati : "+"("+dik3.getX()+","+dik3.getY()+")");
        System.out.println("Yeni Sol Alt Kose Koordinati : "+dik3.gez(-5, 3));
        System.out.println("Alan : "+dik3.alan());
        System.out.println("Cevre : "+dik3.cevre());
        
        Dikdortgen dik4=new Dikdortgen(10,60,0,4);
        System.out.println("\nEski Sol Alt Kose Koordinati : "+"("+dik4.getX()+","+dik4.getY()+")");
        System.out.println("Yeni Sol Alt Kose Koordinati : "+dik4.gez(-15, -18));
        System.out.println("Alan : "+dik4.alan());
        System.out.println("Cevre : "+dik4.cevre());
    }
}
