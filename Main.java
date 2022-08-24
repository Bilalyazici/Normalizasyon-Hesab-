package com.company;
import java.util.Random;

public class Main {

    public static void main(String args[]) {
        double dizi[] = new double[500];
        double[] diziMinMax = new double[dizi.length];
        Random Rand = new Random();
        double max = 0;
        double min = dizi[0];
        for (int i = 0; i < 500; i++) {
            double RandNum = Rand.nextInt(10000);
            dizi[i] = RandNum;
            if (i == 0) System.out.print("[");
            System.out.print(dizi[i] + " ");
            if (i == 499) System.out.println("]");
            if (RandNum > max) {
                max = RandNum;
            }
            if (i > 0) {
                if (RandNum < dizi[0]) {
                    min = RandNum;
                }
            }
        }
        System.out.println("Minimum Sayi: " + min);
        System.out.println("Maximum Sayi: " + max);
        double sonuc;
        for (int i = 0; i < dizi.length; i++) {
            sonuc = (dizi[i]-min)/(max-min);
            diziMinMax[i] = sonuc;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i] + " Normalizasyon sonucu=" + diziMinMax[i]);
        }
    }
    }
