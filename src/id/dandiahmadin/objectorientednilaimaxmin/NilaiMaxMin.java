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
 * Deskripsi Program : Program ini berisi class NilaiMaxMin
 */
public class NilaiMaxMin {
    
    private int nilaiMhs[], max, min;
    
        
    private void inputNilai(int banyakMhs) {
        nilaiMhs = new int[banyakMhs];
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i < nilaiMhs.length ; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = ");
            nilaiMhs[i] = scanner.nextInt();
        }
        System.out.println();
    }
    
    private int nilaiMax(int paramNilai, int paramMax) {
        if (paramNilai > paramMax) {
            paramMax = paramNilai;
        }
        return paramMax;
    }
    
    private int nilaiMin(int paramNilai, int paramMin) {
        if (paramNilai < paramMin) {
            paramMin = paramNilai;
        }
        return paramMin;
    }
    
    private void cetakHasil(String nama) {
        System.out.println("======Hasil Nilai Mahasiswa======");
        max = -999;
        min = 999;
        for (int i = 0; i < nilaiMhs.length; i++) {
            max = nilaiMax(nilaiMhs[i], max);
            min = nilaiMin(nilaiMhs[i], min);
            System.out.println("Nilai Mahasiswa Ke-"+ (i+1) +" = "+nilaiMhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("\nPetugas : ".concat(nama));
    }

    public void pengecekanNilai(String nama, int banyakMhs) {
        inputNilai(banyakMhs);
        cetakHasil(nama);
    }
}
