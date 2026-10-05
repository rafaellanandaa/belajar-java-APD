/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul10;

/**
 *
 * @author sutan
 */
public class SegiTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alas,tinggi; //deklarasi variabel alas dan tinggi bertipe bilangan bulat maka pakai integer
        double luasSeg; //deklarasi variabel luas segiitga bertipe bilangan desimal maka pakai double
        
        alas= 35; //deklarasi nilai 35 ke variabel alas
        tinggi= 3; //deklarasi nilai 3 ke variabel tinggi
        luasSeg= 0.5 * alas * tinggi; //deklarasi perhitungan rumus luas segitiga
        System.out.print(" Hasil dari luas segitiga dengan alas adalah: "  +alas+  " dan tinggi: "  +tinggi+  " adalah= "  +luasSeg);
        //menampilkan teks dan hasil luas segitiga beserta nilai alas dan tingginya
    }
    
}
