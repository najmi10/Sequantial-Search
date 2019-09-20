/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequantials1;
import java.util.Scanner;
/**
 *
 * @author ica
 */
public class SequantialS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = {"Surabaya","Malang","Blitar","Tulungagung","Kediri"};
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = baca.next();
        for(String data1 : data){
            if (cari == null ? data1 == null : cari.equalsIgnoreCase(data1)){
                found = true;
                break;
                        
            }
        }
        
        if(found == true){
            System.out.println("Data ditemukan!");
        }else{
            System.out.println("Data tidak ditemukan!");
        }
        
    }
    
}
