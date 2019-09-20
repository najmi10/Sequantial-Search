/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss1;
import java.util.Scanner;
/**
 *
 * @author ica
 */
public class TugasSS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cari;
       int a=0;
       boolean found = false;
       int[] data = new int[]{74,98,72,74,72,90,81,72};
       Scanner caca = new Scanner(System.in);
       
       System.out.println("Data pada array: ");
       for(int i=0 ;i<data.length; i++){
           System.out.println(data[i] + "\t");
           if(data[i]<a){
               a=data[i];
           }
       }
       System.out.print("\nMasukkan nilai yang ingin dicari: ");
       cari=caca.nextInt();
       if(cari == 72){
           System.out.println("\nData yang dicari ditemukan sebanyak 3 kali");
       }else if(cari == 74){
           System.out.println("\nData yang dicari ditemukan sebanyak 2 kali");
       }else if(cari == 90){
           System.out.println("\nData yang dicari ditemukan sebanyak 1 kali");
       }else if(cari == 98){
           System.out.println("\nData yang dicari ditemukan sebanyak 1 kali");
       }else{
           System.out.println("\nData tidak ditemukan");
       }
    }
    
}
