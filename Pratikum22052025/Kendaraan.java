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
public abstract class Kendaraan {
    
        protected String merek;
        protected int tahun;
        
        public Kendaraan(String merek, int tahun){
            this.merek=merek;
            this.tahun=tahun;
        }
        public void setMerek(String merek){
            this.merek=merek;
        }
        public String getMerek(String merek){
            return merek;
        }
        public void setTahun(int tahun){
            this.tahun=tahun;
        }
        public int getTahun(int tahun){
            return tahun;
        }
        
        public void nyalakan(){
            System.out.println("Kendaraan dinyalakan ");
        }
        public void matikan(){
            System.out.println("kendaraan dimatikan ");
        }
        
        public abstract void info();
        public abstract void periksaKondisi();
        public abstract void servis();
        
    
}
