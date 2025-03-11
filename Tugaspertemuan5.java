/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.tugaspertemuan5;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Tugaspertemuan5 {
    /*
    // SOAL NOMOR 1 GANJIL
    static void myMethod(int N) {
        int jml = 0;
        
        for (int i = 1; i <= N; i++) {
            jml += i;
            
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }
        System.out.print(" = " + jml);
    }

    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        
        System.out.print("Masukan nilai N : ");
        int N = objekInput.nextInt();
        
        myMethod(N);
    } 
    
    
    
    // SOAL NOMOR 2 GANJIL
    static void myMethod(int batasAwal, int batasAkhir) {
        System.out.println("Bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah : ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        
        System.out.print("Masukkan Batas Awal : ");
        int batasAwal = objekInput.nextInt();
        System.out.print("Masukan Batas Akhir : ");
        int batasAkhir = objekInput.nextInt();
        
        myMethod(batasAwal, batasAkhir);
    } */
    
    
    
    // SOAL NOMOR 3 GANJIL
    static int myMethod(int n) {
        int faktorial = 1;
        for (int i = n; i > 0; i--) {
                faktorial *= i;
        }
        return faktorial;
    }
    
    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        
        System.out.print("Masukan bilangan : ");
        int n = objekInput.nextInt();
        
        System.out.print("Faktorial dari " + n + "! = ");
        if (n < 0) {
            System.out.print("Bilangan tidak boleh kurang dari 0");
        } else if (n == 0) {
            System.out.print("1");
        } else {
            for (int i = n; i > 0; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + myMethod(n));
        }
    }
}
