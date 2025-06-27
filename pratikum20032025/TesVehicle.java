/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum20032025;

/**
 *
 * @author user
 */
public class TesVehicle {
     public static void main(String[] args){
         // buat kendaraan dengan maximal 10000KG
         
         System.out.println("Buat kendaraan maxsimal beban 10000KG");
         Vehicle ken1 = new Vehicle(1000);
         
         // menambahkan beberapa beban ke kendaraan
         System.out.println("Menambahkan beban 1 (500 kg)");
         ken1.load=ken1.load+500;
         System.out.println("Menambahkan beban 2 (1000 kg)");
         ken1.load=ken1.load+1000;
         System.out.println("Menambahkan beban 3 (5000 kg)");
         ken1.load=ken1.load+5000;
         System.out.println("Menambahkan beban 4 (750 kg)");
         ken1.load=ken1.load+750;
         System.out.println("Menambahkan beban 5 (3000 kg)");
         ken1.load=ken1.load+3000;
         
         //menampilkan beban kendaraan saat ini 
         System.out.println("Beban kendaraan saat ini");
         System.out.println(ken1.getLoad()+" kg ");
         
         
         
         
         
     }
}
