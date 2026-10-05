/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul10;

/**
 *
 * @author sutan
 */
public class lingkaran6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jarijari= 21; //deklarasi variabel jarijari bertipe bilangan desimal maka pakai double
        double pi= 22.0 / 7.0;//deklarasi variabel pi bertipe bilangan desimal maka pakai double
        
        double luas= pi* jarijari * jarijari;//deklarasi perhitungan rumus luas lingkaran
        double keliling= 2 * pi * jarijari;//deklarasi perhitungan keliling lingkaran
                
        System.out.println("luas lingkaran adalah:"+ luas);//menampilkan teks dan hasil dari perhitungan luas lingkaran
        System.out.println("keliling lingkaran adalah:" + keliling); //menampilkan teks dan hasil perhitungan keliling lingkaran
    }
    
}
