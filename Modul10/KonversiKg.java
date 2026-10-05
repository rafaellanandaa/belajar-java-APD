/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul10;

/**
 *
 * @author sutan
 */
public class KonversiKg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pon, Kg; //deklarasi variabel pon dan kg bertipe bilangan desimal maka pakai doubele
        
        pon= 55.5;//deklarasi pengisian nilai 55.5 ke variabel pon
        Kg = 0.454 * pon; //deklarasi perhtiungan konversi dari pon ke kilogram
                
        System.out.print(pon + " pon = " +Kg );//menampilkan nilai pon dan hasil konversi kg
    }
    
}
