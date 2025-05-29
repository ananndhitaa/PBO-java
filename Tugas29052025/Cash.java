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
public class Cash extends Pembayaran{
    
    
    public Cash(double totalBayar){
        super(totalBayar);
        
    }
    
    @Override
    public void metode(){
        
        System.out.println("Proses Cash:");
        System.out.println("1. Metode = Pembayaran tunai");
        System.out.println("2. Jumlah Bayar = "+totalBayar);
        System.out.println("5. Pembayaran anda lunas & berikan kembalian jika ada");
    }
    
    
    
}
