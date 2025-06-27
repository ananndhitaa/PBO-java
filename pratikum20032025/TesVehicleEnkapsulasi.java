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
import java.util.Scanner;
public class TesVehicleEnkapsulasi {
    public static void main(String[] args)
    {
        // berat maximum kendaraan
        System.out.println("muat kendaraan maksimum 10000 kg ");
        VehicleEnkapsulasi kend1=new VehicleEnkapsulasi(10000);
        
        //menambahkan berat pada kendaraan
        
         System.out.println("Menambahkan beban 1 (500 kg)"+kend1.addBox(500));
         
         System.out.println("Menambahkan beban 2 (1000 kg)"+kend1.addBox(1000));
        
         System.out.println("Menambahkan beban 3 (5000 kg)"+kend1.addBox(5000));
         
         System.out.println("Menambahkan beban 4 (750 kg)"+kend1.addBox(750));
         
         System.out.println("Menambahkan beban 5 (3000 kg)"+kend1.addBox(3000));
         
         //beban kendaraan saat ini
         System.out.println("Beban kendaraan saat ini ");
         System.out.println(kend1.getLoad()+" kg ");
         
         // objek kedua dengan kontruktor tanpa paramete
         Scanner in = new Scanner(System.in);
         VehicleEnkapsulasi kend2=new VehicleEnkapsulasi();
          System.out.print("Beban Maksimal kendaraan = ");
          double bebanMax = in.nextDouble();
          kend2.setMaxLoad(bebanMax);
          // mengisi kendaran dengan beban 
          System.out.print("Masukkan beban ke kendaraan = ");
          double beban = in.nextDouble();
          while(kend2.addBox(beban )){
              kend2.addBox(beban);
              System.out.print("Masukkan beban ke kendaraan = ");
              beban = in.nextDouble();
              
          }
          if (!kend2.addBox(beban)){
              System.out.println("Maaf beban berlebih pada kendaraan,penambahan beban batal ");
          }
          System.out.println("Beban kendaraan saat ini ");
          System.out.println(kend2.getLoad()+" kg ");
         
    }}
