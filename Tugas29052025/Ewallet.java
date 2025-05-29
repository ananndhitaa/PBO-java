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
public class Ewallet extends Pembayaran implements MetodePembayaran{
   
    
    public Ewallet(double totalBayar){
        super(totalBayar);
        
    }
    
    @Override
    public void metode(){
        System.out.println("Metode = Pembayaran Ewallet");
        
    }
    
    @Override
    public void prosesBayar(){
        
        System.out.println("Proses E-Wallet:");
        System.out.println("1. Buka aplikasi e-wallet");
        System.out.println("2. Scan QR code");
        System.out.println("3. Bayar Rp." + totalBayar);
        System.out.println("Pembayaran selesai!");
    }
    
}
