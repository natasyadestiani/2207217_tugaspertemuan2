/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_latihankedua;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalLatihanKedua {

    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input/masukkan 
        Scanner input = new Scanner(System.in);
        
        // Meminta memasukkan jumlah uang dalam rupiah
        System.out.print("Input jumlah uang (dalam rupiah): ");
        int uang = input.nextInt();
        
        // Meminta memasukkan status cuaca (true jika hujan, false jika tidak)
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        // Menentukan apakah seseorang akan membeli gorengan atau tidak
        boolean akanMembeliGorengan = (uang > 5000) && (!hujan);
        
        // Menampilkan hasil output
        if (akanMembeliGorengan) {
            System.out.println("Yeay anda akan membeli gorengan hari ini!");
        } else {
            System.out.println("Yah anda tidak akan membeli gorengan hari ini.");
        }
        
        // Menutup scanner
        input.close();
    }
}
