package odev3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Random rand=new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<String> win_k = new ArrayList<>();
        ArrayList<String> win_t = new ArrayList<>();
        
        System.out.print("Tavsan sayisi : ");
        int tSayisi = scan.nextInt();
        System.out.print("Kaplumbaga sayisi : ");
        int kSayisi = scan.nextInt();

        int[] tk = new int[tSayisi];
        for (int i = 0; i < tSayisi; i++) {
            tk[i] = 0;
        }
        int[] kk = new int[kSayisi];
        for (int i = 0; i < kSayisi; i++) {
            kk[i] = 0;
        }

        Tavsan t[] = new Tavsan[tSayisi];
        for (int i = 0; i < tSayisi; i++) {
            t[i] = new Tavsan();
        }
        Kaplumbaga k[] = new Kaplumbaga[kSayisi];
        for (int i = 0; i < kSayisi; i++) {
            k[i] = new Kaplumbaga();
        }

        while (true) {
            for (int i = 0; i < tSayisi; i++) {
                int tOlasilik = rand.nextInt(10) + 1;
                int x = t[i].tHareket(tOlasilik);
                tk[i] = tk[i] + x;
                if (tk[i] < 0) {
                    tk[i] = 0;
                } else if (tk[i] > 70) {
                    break;
                }
            }
            for (int j = 0; j < kSayisi; j++) {
                int kOlasilik = rand.nextInt(10) + 1;
                int y = k[j].kHareket(kOlasilik);
                kk[j] = kk[j] + y;
                if (kk[j] < 0) {
                    kk[j] = 0;
                } else if (kk[j] > 70) {
                    break;
                }
            }

            for (int f = 0; f < tSayisi; f++) {
                for (int d = 0; d < 70; d++) {
                    if (tk[f] == d) {
                        System.out.print("T");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println("\n");
            }
            for (int s = 0; s < kSayisi; s++) {
                for (int l = 0; l < 70; l++) {
                    if (kk[s] == l) {
                        System.out.print("K");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println("\n");
            }

            int winner_counter = 0;

            for (int i = 0; i < tk.length; i++) {
                if (tk[i] >= 70) {
                    win_t.add("Tavsan"+(i+1));
                    winner_counter++;
                }
            }

            for (int i = 0; i < kk.length; i++) {
                if (kk[i] >= 70) {
                    win_k.add("Kaplumbaga"+(i+1));
                    winner_counter++;
                }
            }
            if (winner_counter >= 1) {
                break;
            }
            System.out.println("\n");
        }

        if (win_t.size() + win_k.size() > 1) {
            System.out.print("BERABERE : ");
            for (int i = 0; i < win_t.size(); i++) {
                System.out.print(win_t.get(i)+" ");
            }
            for (int i = 0; i < win_k.size(); i++) {
                System.out.print(win_k.get(i)+" ");
            }
        }
        else{
            if(win_t.size()==1)
                System.out.print("KAZANAN TAVŞAN : "+win_t.get(0));
            else
                System.out.print("KAZANAN KAPLUMBAĞA : "+win_k.get(0));
        }
        System.out.println("\n");
    }
}