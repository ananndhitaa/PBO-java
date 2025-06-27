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
public class Motor extends Kendaraan {
    
    private String jenisHelm;
    private int cc;

    public Motor(String merek, int tahun, String jenisHelm, int cc) {
        super(merek, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm=jenisHelm;
    }
    public String getJenisHelm(String jenisHelm){
        return jenisHelm;
    }
    public void setCc(int cc){
        this.cc=cc;
    }
    public int getCc(int cc){
        return cc;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("Motor "+merek+" dinyalan dengan starter");
    }
    @Override
    public void matikan(){
        System.out.println("Motor "+merek+"dimatikan");
    }
    @Override
    public void info(){
        System.out.println("Motor "+merek+", tahun "+tahun+", "+"CC: "+cc+", Helm "+jenisHelm);
    }
    @Override
    public void periksaKondisi(){
        System.out.println("Periksa oli mesin, rem, dan tekanan ban motor "+merek);
    }
    @Override
    public void servis(){
        System.out.println("Motor "+merek+" dijadwalkan servis setiap 3.000 KM");
    }
}
