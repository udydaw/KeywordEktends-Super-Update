/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendssuper;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class DaftarCucian extends Nota{
    String pilih;
    int jumlah;

    void Menu(int harga){
        System.out.println("       DAFTAR CUCI MOTOR       ");
        System.out.println("- Cuci Salju         Rp. "+harga);
        System.out.println("- Cuci Bersih        Rp. "+harga);
    }
    void Pilih(){
        Scanner input = new Scanner (System.in);
        System.out.println(" ");
        System.out.print("Pilihan daftar anda : ");
        pilih = input.nextLine();
    }

}
