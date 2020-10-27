/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan28;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program ganti kata
 * 
 * 
 */
public class GantiKata {
    
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        
        String kalimat, ganti, menjadi = "";
        
        System.out.println("====Program Mengganti Kata====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        input = scanner.nextLine(); kalimat = input;
        System.out.print("Ganti Kata : ");
        input = scanner.nextLine(); ganti = input;
        System.out.print("Menjadi Kata : ");
        input = scanner.nextLine(); menjadi = input;
        System.out.println("");
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : ".concat(kalimat));
        kalimat = kalimat.replace(ganti, menjadi);
        System.out.println("Kalimat baru : ".concat(kalimat));
    }
}
