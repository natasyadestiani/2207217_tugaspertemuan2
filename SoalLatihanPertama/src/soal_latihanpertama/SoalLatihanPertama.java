/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_latihanpertama;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalLatihanPertama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input bilangan 
        System.out.print("Input bilangan pertama: ");
        int bilanganPertama = input.nextInt();
        
        System.out.print("Input bilangan kedua: ");
        int bilanganKedua = input.nextInt();
        
        System.out.print("Input bilangan ketiga: ");
        int bilanganKetiga = input.nextInt();
        
        // Menampilkan output hasil operasi penambahan
        int hasilPenambahan = bilanganPertama + bilanganKedua + bilanganKetiga;
        System.out.println("Hasil penambahan ketiga bilangan: " + hasilPenambahan);
        
        // Menampilkan output hasil operasi pengurangan
        int hasilPengurangan = bilanganPertama - bilanganKedua - bilanganKetiga;
        System.out.println("Hasil pengurangan ketiga bilangan: " + hasilPengurangan);
        
        // Menampilkan output hasil operasi perkalian
        int hasilPerkalian = bilanganPertama * bilanganKedua * bilanganKetiga;
        System.out.println("Hasil perkalian ketiga bilangan: " + hasilPerkalian);
        
        int hasilPembagian = bilanganPertama / bilanganKedua / bilanganKetiga;
        System.out.println("Hasil pembagian ketiga bilangan: " + hasilPembagian);
    }
}     