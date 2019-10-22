/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan tabungan menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program penarikan uang");
        System.out.print("Masukkan saldo awal : ");
        Scanner s = new Scanner(System.in);
        String saldo = s.next();
        System.out.print("Jumlah uang yang akan diambil : ");
        Scanner s2 = new Scanner(System.in);
        String jumlah = s2.next();
        
        Tabungan t = new Tabungan(Integer.parseInt(saldo));
        System.out.println("Saldo Anda sekarang : "+t.ambilUang(Integer.parseInt(jumlah)));
    }
    
}
