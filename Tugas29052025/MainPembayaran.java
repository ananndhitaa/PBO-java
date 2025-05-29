/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas29052025;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MainPembayaran {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);

        boolean ulangi = true;

        while (ulangi) {
            System.out.println("\n=== Sistem Pembayaran ===");

            double totalBayar = 0;
            boolean inputValid = false;
            
            while (!inputValid) {
                System.out.print("Masukkan total bayar (minimal Rp 5000): Rp. ");
                if (in.hasNextDouble()) {
                    totalBayar = in.nextDouble();
                    in.nextLine(); 

                    if (totalBayar >= 5000) {
                        inputValid = true;
                    } else {
                        System.out.println("Maaf, minimal pembayaran adalah Rp5000");
                    }
                } else {
                    System.out.println("Input tidak valid. Masukkan angka.");
                    in.next();
                }
            }

            System.out.println("\nPilih metode pembayaran:");
            System.out.println("1. Transfer");
            System.out.println("2. Cash");
            System.out.println("3. E-Wallet");
            System.out.println("4. Kartu Kredit");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();
            in.nextLine();

            Pembayaran metodePembayaran = null;

            if (pilihan == 1) {
                System.out.print("Masukkan nama bank: ");
                String namaBank = in.nextLine();
                metodePembayaran = new Transfer(namaBank,totalBayar);
            } else if (pilihan == 2) {
                metodePembayaran = new Cash(totalBayar);
            } else if (pilihan == 3) {
                metodePembayaran = new Ewallet(totalBayar);
            } else if (pilihan == 4) {
                metodePembayaran = new KartuKredit(totalBayar);
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                continue;
            }

            System.out.println("\n=== Detail Pembayaran ===");
            metodePembayaran.metode();
            System.out.println("Total: Rp" + totalBayar);

            System.out.println("\n=== Proses Pembayaran ===");
            ((MetodePembayaran) metodePembayaran).prosesBayar();

            System.out.print("\nLakukan pembayaran lagi? (y/n): ");
            String jawab = in.nextLine();
            ulangi = jawab.equalsIgnoreCase("y");
            
           System.out.println("\nTerima kasih telah menggunakan sistem pembayaran!");
        }

    }  
    }
   


