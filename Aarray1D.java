package pratikumTugas;
/**
 Program : Array 1 Dimensi
 Tanggal : 07 maret 2025
 */
import java.util.Scanner;
import java.util.Random;
public class Aarray1D {
   public static void main(String[] args){
      int A[];
      int B[];
      int C[];
      int i, nA, nB;
   
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("Masukan ukuran Array A = ");
      nA = in.nextInt();
      System.out.print("Masukan ukuran Array B = ");
      nB = in.nextInt();
      
        A = new int[nA];
        B = new int[nB];
        C = new int[nA + nB];
        
       System.out.println("Array A = ");
       for (i=0; i< nA ;i++){
           A[i] = rand.nextInt(100);
           System.out.print(A[i] + " ");    
       }
       System.out.println();
       
       System.out.println("Array B = ");
       for (i=0; i< nB ;i++){
           B[i] = rand.nextInt(100);
           System.out.print(B[i] + " ");          
       }
       System.out.println();
       
       for (i=0; i < nA; i++){
           C[i] = A[i];
       }
       for (i=0; i < nB; i++){
           C[nA + i] = B[i];
       }
       
       System.out.println("Array C = ");
       for (i=0; i < nA + nB; i++){
           System.out.print(C[i] + " ");
           
       }      
       System.out.println();
      
      
       
   }  
}
