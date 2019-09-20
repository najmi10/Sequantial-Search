/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansequantials2;

import java.util.Scanner;

/**
 *
 * @author ica
 */
public class LatihanSequantialS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{8,90,56,90,87,76,42};
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari: ");
        cari = baca.nextInt();
        for (int i=0; i < data.length; i++){
            if (cari == data[i]){
                found = true;
                System.out.println("Data yang ditemukan pada indeks ke-" + i);
            }
        }
        if (found != true){
            System.out.println("Data tidak ditemukan!"); 
        }
        
    }
    
}
