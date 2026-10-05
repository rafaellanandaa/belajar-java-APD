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
public class bandingUmur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan nama:");
        String nama1 = input.next();
        
        System.out.print("masukan umur:");
        int umur1 = input.nextInt();
        
        System.out.print("masukan nama:");
        String nama2 = input.next();
        
        System.out.print("masukan umur:");
        int umur2 =input.nextInt();
        
        if (umur1 < umur2){
            System.out.println(" umur " +nama1+ " lebih muda dari " +nama2);
        } else {
            System.out.println(" umur " +nama1+ " lebih tua dari " +nama2);
        } 
        
    }
    
}
