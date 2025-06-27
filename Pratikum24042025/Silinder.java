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
public class Silinder extends Lingkaran {
    
    private double tinggi;
    
    public Silinder (){
        
    }
    
    public Silinder ( double r, double t ){
        super (r);
        this.tinggi=t;
    }
    
    public void setTinggi (double tinggi){
         this.tinggi=tinggi;
    }
    
    public double getTinggi (){
        return this.tinggi;
    }
    
    public double getVolume (){
       return super.getLuas() * tinggi;
    }
        
    
    @Override
    public String toString(){
        return "Silinder" + getVolume();
    }
        
    @Override
     public double getLuas(){
         return 2*Math.PI*super.getR()*tinggi;
     }

}





   

 

    
