package com.tugas1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        if(selde(angka))
            System.out.println(angka+" adalah selde.");
        else
            System.out.println(angka+" bukan selde.");
    }
    static boolean selde (int x)
    {
        int z=0, t=x,y;
        while(x!=0)
        {
            y=x%10;
            z=z*10+y;
            x=x/10;
        }
        return t==z;
    }
}