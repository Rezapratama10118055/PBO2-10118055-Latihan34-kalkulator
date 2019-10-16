/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan34.kalkulator;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class PBO210118055Latihan34Kalkulator {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner userInput = new Scanner(System.in);
        data kalkulator = new data();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        
        System.out.println("Masukkan Angka ke-1 :");
       kalkulator.value1 = userInput.nextDouble();
        System.out.println("Masukkan Angka ke-2 :");
       kalkulator.value2=userInput.nextDouble();
    
        
    System.out.println("Hasil pertambahan:"+kalkulator.tambahBilangan());
    System.out.println("Hasil pengurangan:"+kalkulator.kurangBilangan());
    System.out.println("Hasil perkalian:"+kalkulator.kaliBilangan());
    System.out.println("Hasil pembagian:"+kalkulator.bagiBilangan());
    System.out.println("Hasil sisa:"+kalkulator.sisaBilangan());

    
        
        
        
        
        
        
    }
    
}
