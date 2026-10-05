/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul10;

/**
 *
 * @author sutan
 */
public class sisimiring9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double alas= 8; //deklarasi variabel alas segitiga dengan nilai 8
        double tinggi= 10; //deklarasi variabel tinggi alas segitiga dengan nilai 10
        
        double kuadratsisi= (alas*alas)+ (tinggi*tinggi); //deklarasi hitungan awal dengan mengkuadratkan alas dan tinggi lalu dijumlah
        double sisimiring= Math.sqrt(kuadratsisi); //deklarasi hitungan akhir dengan mencari akar kuadarat dari hitungan awal
        
        System.out.println("jadi panjang sisi miring segtiga adalah=" +sisimiring);//menampilkan teks dan hasil hitungan ke layar
    }
    
}
