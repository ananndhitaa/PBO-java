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
public class Transfer extends Pembayaran implements MetodePembayaran{
    private String namaBank;
    
    public Transfer(String namaBank,double totalBayar){
        super(totalBayar);
        this.namaBank=namaBank;
    }
    
    
    @Override
    public void metode(){
        System.out.println("Metode = Pembayaran Trnasfer");
        System.out.println("Nama bank = "+namaBank);
    }
    
    @Override
    public void prosesBayar(){
        System.out.println("Proses Transfer:");
        System.out.println("1. Buka aplikasi mobile banking");
        System.out.println("2. Proses pembayaran transfer ke " + namaBank + " sedang diproses...");
        System.out.println("3. Silakan transfer Rp" + totalBayar + " ke rekening tujuan");
        System.out.println("4. Pembayaran anda berhasil");
    }
}
