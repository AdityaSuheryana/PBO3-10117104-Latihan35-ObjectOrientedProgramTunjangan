/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi : User Menginput Gaji dan Status .
 *             Program Menampilkan Hasil gaji secara object oriented
 */
public class Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scn = new Scanner(System.in);
        GajiKaryawan gk = new GajiKaryawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gk.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gk.status = scn.next();

        gk.HasilHitung(gk.status,gk.gajiPokok);

    }
    
}
