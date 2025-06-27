/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum24042025;

/**
 *
 * @author user
 */
public class Kerucut extends Lingkaran {
    
   private double tinggi;
    
   public Kerucut (){
      
   }
   
   public Kerucut (double r, double t ){
        super(r);
        this.tinggi=t;
}
   public void setTinggi (double tinggi){
       this.tinggi=tinggi;
   }
   
   public double getTinggi (){
       return this.tinggi;
   }
   
   public double getVolume (){
       return (1.0 / 3.0) * Math.PI * Math.pow(super.getR(), 2) * this.tinggi;
   }
   
   @Override
   public String toString(){
      return "Kerucut" + getVolume();
   }
   
    public double getLuas(){
        double s = Math.sqrt((tinggi * tinggi) + (super.getR() * super.getR()));
        return Math.PI * super.getR()*s;
    }

}


    
