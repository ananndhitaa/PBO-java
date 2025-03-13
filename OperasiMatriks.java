package pratikumTugas;

/**
 Program : Operasi Matriks
 Tanggal : 07 maret 2025
 */
import java.util.Scanner;
import java.util.Random;
public class OperasiMatriks {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Random rand = new Random();
   
   char ulang = 'y';
   int pilih, baris, kolom;
   int i,j;
   int Matriks1[][];
   int Matriks2[][];
   int hasil[][];
   
   do {
       System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4.Identitas\n"
               + "5. Transpose\n6. exit");
       System.out.print("Pilih Program 1- 6 = ");
       pilih = in.nextInt();
       
       if (pilih == 6){
           System.out.println("Anda telah keluar dari program.");
           break;      
       }
       if (pilih < 1 || pilih > 6){
           System.out.println("Pilihan tidak ada di menu ");
           System.out.print("Apakah ingin mengulang program? (y/n)");
           ulang = in.next().charAt(0);
           continue;}
           
       System.out.print("Masukan jumlah baris = ");
       baris = in.nextInt();
       System.out.print("Masukan jumlah kolom = ");
       kolom = in.nextInt();
       
       if (baris <= 0 || kolom <= 0){
           System.out.println("Baris dan kolom harus lebih besar dari 0 ");
       }
       
       Matriks1 = new int[baris][kolom];
       Matriks2 = new int[baris][kolom];
       hasil = new int[baris][kolom];
       
       System.out.println("Matriks 1 = ");
       for (i=0; i < baris; i++){
           for (j =0; j < kolom; j++){
              Matriks1[i][j] = rand.nextInt(50) + 1;
              System.out.print("\t" + Matriks1[i][j]);   
           }
           System.out.println();
       }
       if (pilih !=4 && pilih !=5){
           System.out.println("Matriks 2 = ");
           for (i = 0; i < baris; i++){
               for (j = 0; j < kolom; j++){
                   Matriks2[i][j] = rand.nextInt(50) + 1;
                   System.out.print("\t" + Matriks2[i][j]);
               }
               System.out.println();
               }
           }
       if (pilih == 1){
           System.out.println("Hasil Penjumlahan = ");
           for (i = 0; i< baris; i++){
               for (j = 0; j < kolom; j++){
                   hasil[i][j] = Matriks1[i][j] + Matriks2[i][j];
                   System.out.print("\t" + hasil[i][j]);              
               }
               System.out.println();
           }
       }
       else if (pilih == 2) {
                System.out.println("Hasil Pengurangan:");
                for (i = 0; i < baris; i++) {
                    for (j = 0; j < kolom; j++) {
                        hasil[i][j] = Matriks1[i][j] - Matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();       
                }
       }
       else if (pilih == 3) {
                System.out.println("Hasil Perkalian:");
                for (i = 0; i < baris; i++) {
                    for (j = 0; j < kolom; j++) {
                        hasil[i][j]=0;
                        for (int k = 0; k < kolom; k++) {
                            hasil[i][j] += Matriks1[i][k] * Matriks2[k][j];
                             System.out.print(hasil[i][j] + "\t");
                            
                        }
                        
                    System.out.println();
                }
       }
       }
       
        else if (pilih == 4) {
                if (baris != kolom) {
                    System.out.println("Matriks harus persegi untuk menjadi identitas.");
                } 
                else {
                    System.out.println("Matriks Identitas = ");
                    for (i = 0; i < baris; i++) {
                        for (j = 0; j < kolom; j++) {
                            hasil[i][j] = (i == j) ? 1 : 0;
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
        }
       else if (pilih == 5) {
                System.out.println("Transpose Matriks 1 = ");
                for (i = 0; i < kolom; i++) {
                    for (j = 0; j < baris; j++) {
                        System.out.print(Matriks1[j][i] + "\t");
                    }
                    System.out.println();
                }
            }
       System.out.print("Apakah ingin mengulang program? (y/n)= ");
            ulang = in.next().charAt(0);
        } while (ulang == 'y');




}   
} 

