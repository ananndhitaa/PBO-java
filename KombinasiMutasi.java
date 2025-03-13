package pratikumTugas;

/**
 Program : Nilai permutasindan kombinasi input user
 Tanggal : 07 maret 2025
*/
import java.util.Scanner;
public class KombinasiMutasi {
public static void main(String[] args){
    
    int n,r,i;
    int mutasi = 1;
    int kombinasi = 1;
    int x = 1;
    
    Scanner in = new Scanner(System.in);
    
    System.out.print(" Masukan Nilai n = ");
    n = in.nextInt();
    System.out.print(" Masukan Nilai r = ");
    r = in.nextInt();
    
    for (i=n;i>(n-r);i--){
        mutasi *=i;
    }
    for (i=r;i>1;i--){
        x *=i;
    }
    kombinasi = mutasi / x;
    
    System.out.println("Nilai Permutasi = "+mutasi);
    System.out.println("Nilai Kombinasi = "+kombinasi);
    
}    
}
