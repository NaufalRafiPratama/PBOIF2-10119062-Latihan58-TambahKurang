/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan58.tambahkurang;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * tambah kurang 
 */
public class PBOIF210119062Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JumlahBilangan objJumlahBilangan = new JumlahBilangan();
        SelisihBilangan objSelisihBilangan = new SelisihBilangan();
        
        System.out.print("Hasil perjumahan = ");objJumlahBilangan.tampilHasilJumlah();
        System.out.print("Hasil Selisih 3 - 4 = ");objSelisihBilangan.tampilSelisih();
    }
    
}
