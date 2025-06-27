/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum24042025;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class MainSemuanya {
    
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int pilihan;

    do 
    {
        
        System.out.println("\nPilih Bangun nya :");
        System.out.println("1. Lingkaran");
        System.out.println("2. Kerucut");
        System.out.println("3. Silinder");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan: ");
        pilihan = scanner.nextInt();

    switch (pilihan) {
        case 1:
        System.out.print("Masukkan jari-jari: ");
        double rLingkaran = scanner.nextDouble();
        Lingkaran lingkaran = new Lingkaran(rLingkaran);
        System.out.println("Diameter: " + lingkaran.getDiameter());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println("Luas: " + lingkaran.getLuas());
        break;
                  
        case 2:
        System.out.print("Masukkan jari-jari: ");
        double rKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tKerucut = scanner.nextDouble();
        Kerucut kerucut = new Kerucut(rKerucut, tKerucut);
        System.out.println("Volume Kerucut: " + kerucut.getVolume());
        System.out.println("Luas Selimut: " + kerucut.getLuas());
        break;

        case 3:
        System.out.print("Masukkan jari-jari: ");
        double rSilinder = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tSilinder = scanner.nextDouble();
        Silinder silinder = new Silinder(rSilinder, tSilinder);
        System.out.println("Volume Silinder: " + silinder.getVolume());
        System.out.println("Luas Selimut: " + silinder.getLuas());
        break;

        case 4:
        System.out.println("Terima kasih Keluar dari program.");
        break;

        default:
        System.out.println("Pilihan tidak bisa, silakan coba lagi.");
        }
    } while (pilihan != 4);

        scanner.close();



      }
}

