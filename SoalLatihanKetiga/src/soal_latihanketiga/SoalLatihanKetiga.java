/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_latihanketiga;

/**
 * 
 * @author ASUS
 */
import java.util.Scanner;

public class SoalLatihanKetiga {

    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima inputan
        Scanner input = new Scanner(System.in);
        
        // Meminta memasukkan dua karakter, karakter pertama dan kedua
        System.out.print("Input karakter pertama: ");
        char karakterPertama = input.next().charAt(0);
        
        System.out.print("Input karakter kedua: ");
        char karakterKedua = input.next().charAt(0);
        
        // Menghitung kode ASCII dari karakter pertama dan kedua
        int kodeASCII1 = (int) karakterPertama;
        int kodeASCII2 = (int) karakterKedua;
        
        // Menjumlahkan kode ASCII dari kedua karakter
        int hasilJumlah = kodeASCII1 + kodeASCII2;
        
        // Menampilkan hasil jumlah dari kedua karakter
        System.out.println("Jumlah kode ASCII dari " + karakterPertama + " dan " + karakterKedua + " adalah: " + hasilJumlah);
        
        // Menutup scanner
        input.close();
    }
}