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
public class MainMusic {
    public static void main(String[]args){
        Gitar gitar = new Gitar("Klassik","petik",6);
        Keyboard ky = new Keyboard("Yamaha","Elektronik", true);
        
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println();
        
        System.out.println("\n Keyboard");
        ky.info();
        ky.mainkan();
        ky.stem();
        
    }
}
