/*
	SEREN KADIKÖYLÜ
	16253037
*/
import java.util.Scanner;
public class Seren_16253037
{    
    public static int faktoriyel(int n)
    {
        int fakt=1;
        if (n==0 || n==1)
            fakt=1;
        else
            for (int i = 2; i <= n; i++) {
                fakt*=i;
            }
        return fakt;
    }
    
    public static float eSayisi(int n)
    {
        float toplam=0;
        float f;
        for (int i = 0; i < n; i++) {
            f=faktoriyel(i);
            toplam+=1/f;            
        }
        return toplam;
    }
    
    public static void main(String[] args) {
        
        Scanner girdi=new Scanner(System.in);
		int n;
		System.out.print("Faktoriyelini almak istediginiz sayi: ");
        n=girdi.nextInt();
        System.out.println(faktoriyel(n)+"\n");
		System.out.print("e Sayisi icin toplanacak terim adedi: ");
        n=girdi.nextInt();
        System.out.println(eSayisi(n)+"\n");
	}
}