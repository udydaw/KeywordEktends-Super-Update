/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendssuper;

/**
 *
 * @author ACER
 */
public class Nota {
    int harga = 15000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaftarCucian Motor = new DaftarCucian();
        Motor.Menu(15000);
        Motor.Pilih();
 
        Transaksi proses = new Transaksi();
        proses.Transaksi();

    }

    void Nota(){
        System.out.println(" ");
        System.out.println("===============================");
        System.out.println("    CUCI MOTOR MAKIN BERSIH    ");
        System.out.println(" ");
    }
    
}
