package pkg16253037serenkadıköylüödev2;
import java.util.Scanner;
public class Vigenere 
{    
    public void sifrele(String kelime, String sifre)
    {    
        StringBuilder sifreliKelime=new StringBuilder();
        String alfabe="abcdefghijklmnopqrstuvwxyz";
        
        int[] idx;
        idx=new int[kelime.length()];
        
        //kelime şifreden kısaysa
        if(kelime.length()<sifre.length())
        {
            int mod=sifre.length()%kelime.length();
            sifre=sifre.substring(0,mod+1);
        }
        
        //kelime şifreden uzunsa
        if(sifre.length()<kelime.length())
        {
            int mod=kelime.length()%sifre.length();
            sifre=sifre+sifre.substring(0,mod);
        }
        
        //kelime şifre aynı uzunluktaysa
        for (int i = 0; i < kelime.length(); i++) 
        {
            idx[i]=(((alfabe.indexOf(kelime.charAt(i))+1)+(alfabe.indexOf(sifre.charAt(i))+1))%26);
            sifreliKelime.append(alfabe.charAt(idx[i]-1));
        }  
        System.out.println("Sifreli kelime : "+sifreliKelime);
    }
    
    public static void main(String[] args)
    {
        Scanner girdi=new Scanner(System.in);
        
        System.out.print("Sifrelenecek kelime : ");
        String kelime=girdi.next();
        
        System.out.print("Sifre : ");
        String sifre=girdi.next();
        
        Vigenere ornek=new Vigenere();
        ornek.sifrele(kelime.toLowerCase(),sifre.toLowerCase()); 
    } 
}