/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanss4;
import java.util.Scanner;
/**
 *
 * @author ica
 */
public class LatihanSS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari = baca.nextLine();
        
        int a = 0;
        for(int i=0; i<cari.length(); i++){
            if(cari.charAt(i) == 'a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat diatas adalah " + a);
    }
    
}
