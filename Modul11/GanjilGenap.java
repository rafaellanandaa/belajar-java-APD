/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul11;
import java.util.Scanner;
/**
 *
 * @author sutan
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("masukan bialangan:"); 
        int bil = input.nextInt();
        
        if(bil % 2 == 0) {
            System.out.println("Angka" + bil + "adalah genap");
        } else {
            System.out.println("Angka" + bil + "adalah ganjil");
        }
                
    }
    
}
