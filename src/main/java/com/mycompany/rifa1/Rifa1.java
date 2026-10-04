/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rifa1;

import java.util.Scanner;

public class Rifa1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        iniMethod();

        System.out.println("\n=== KALKULATOR ===");

        System.out.print("Masukkan angka 1: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka 2: ");
        int angka2 = input.nextInt();

        menuUtama();

        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan = "
                        + penjumlahan(angka1, angka2));
                break;

            case 2:
                System.out.println("Hasil pengurangan = "
                        + pengurangan(angka1, angka2));
                break;

            case 3:
                System.out.println("Hasil perkalian = "
                        + perkalian(angka1, angka2));
                break;

            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil pembagian = "
                            + pembagian(angka1, angka2));
                } else {
                    System.out.println("Tidak bisa membagi dengan 0!");
                }
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static int pembagian(int a, int b) {
        return a / b;
    }

    public static void iniMethod() {
        System.out.println("Biodata");
        System.out.println("========");
        System.out.println("Nama : Rifa");
    }

    public static void menuUtama() {
        System.out.println("\nMenu:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
    }
}
