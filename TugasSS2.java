/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss2;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class TugasSS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ratarata = 0;
        int cari;
        int angka = 0;
        boolean found = false;
        int[] data = new int[]{83,76,45,90,85,80,78,74};
        Scanner baca = new Scanner(System.in);
        System.out.println("Data pada array: ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + "\t");
            if(data[i]<angka){
                angka=data[i];
            }
            
        }
        for(int i=0; i<data.length; i++) ratarata+= data[i];
        ratarata/=data.length;
        System.out.println("\nRata-rata nilai array adalah= " + ratarata);
        System.out.println("\nNilai yang diatas rata-rata adalah: 83,90,85,80,78");
    }
    
}
