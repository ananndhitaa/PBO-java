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
public class KartuKredit extends Pembayaran{
    public KartuKredit(double totalBayar){
        super(totalBayar);
    }
    
    @Override
    public void metode(){
        System.out.println("Proses Kartu Kredit:");
        System.out.println("1. Masukkan kartu ke mesin EDC");
        System.out.println("2. Nominal yang akan ditagihkan = " +totalBayar);
        System.out.println("4. Silahkan masukkan PIN anda");
        System.out.println("5. Pembayaran anda berhasil!");
        
    }
    
}
