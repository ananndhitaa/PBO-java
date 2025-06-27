/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum22052025;

/**
 *
 * @author user
 */
public class Mobil extends Kendaraan {
    
    private int jumlahPintu;
    private String transmisi;
    
    public Mobil(String merek, int tahun,int jumlahPintu, String transmisi) {
        super(merek,tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("mobil "+merek+" dinyalakan dengan kunci");
    }
    
    @Override
    public void matikan(){
        System.out.println("mobil "+merek+" dimatikan");
        
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu=jumlahPintu;
    }
    
    public int getJumlahPintu(int jumlahPintu){
        return jumlahPintu;
    }
    public void setTransmisi(String transmisi){
        this.transmisi=transmisi;
    }
    public String getTransmisi(String transmisi){
        return transmisi;
    }
    
    @Override
     public void info(){
        System.out.println("mobil = "+merek+", tahun "+tahun+", jumlah pintu "+jumlahPintu+", "+"Transmisi: "+transmisi);
    }
    @Override
     public void periksaKondisi(){
         System.out.println("Periksa oli, rem, dan tekanan ban mobil "+merek);
     }
    @Override
     public void servis(){
         System.out.println("Mobil "+merek+" dijadwalkan servis setiap 10.000 KM");
     }
}
