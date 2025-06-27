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
public class MainUtama {
    public static void main(String[]args){
        
        Mobil mobil = new Mobil("Toyota Avanza", 2022,4,"Automatic");
        Motor motor = new Motor("Yamaha NMAX",2023, "Full Face",155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
    }
    
}
