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
public class Lingkaran {
    
    private double r;
    
    public Lingkaran (){
        
    }
    
    public Lingkaran(double r){
        this.r=r;
    }
    
    public void setR (double r){
        this.r = r;
    }
    
    public double getR (){
        return this.r;
    }
    
    public double getDiameter (){
        return 2 * this.r;
    }
    
    public double getKeliling (){
        return 2 * Math.PI * r;
    }
    
    public double getLuas (){
        return Math.PI * r * r ;
    }
    
    @Override
    public String toString(){
        return "Lingkaran (r=" + r + ", diameter=" + getDiameter() 
               + ", keliling=" + getKeliling() + ", luas=" + getLuas() + ")";
    }
}