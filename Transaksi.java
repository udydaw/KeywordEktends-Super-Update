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
public class Transaksi extends Nota {
    
    int total, bayar, kembalian;

    void Transaksi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        System.out.println(" ");
        super.Nota();
        total = super.harga * jumlah;
        System.out.println("Total:          Rp. " + total);
        System.out.print("Bayar:          Rp. ");
        bayar = input.nextInt();
        if (bayar >= total) {
            kembalian = bayar - total;
            System.out.println("Kembalian:      Rp. " + kembalian);
        }
        else{
            System.out.println("Maaf Nominal Anda Kurang");
            System.out.println("Nominal Anda Kurang: Rp. "+(total-bayar));
        }

    }
}
