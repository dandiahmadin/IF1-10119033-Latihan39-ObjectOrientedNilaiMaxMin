/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.objectorientednilaimaxmin;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan nilai tertinggi dan terendah
 */
public class IF110119033Latihan39ObjectOrientedNilaiMaxMin {

    /**
     * @param args the command line arguments
     */
    
    private static String nama;
    private static int banyakMhs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("===Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
        System.out.print("Masukan Nama Petugas : ");
        nama = input.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = input.nextInt();
        
        NilaiMaxMin nilai = new NilaiMaxMin();
        nilai.pengecekanNilai(nama, banyakMhs);
    }
    
    
    
}
