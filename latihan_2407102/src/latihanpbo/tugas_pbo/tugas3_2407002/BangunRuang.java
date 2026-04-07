package tugas_pbo;

import java.util.Scanner;

public class BangunRuang extends BangunDatar {
    private int tinggi;


    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // ambil dari class parent
        this.tinggi = tinggi;
    }


    public int hitungVolume() {
        return hitungLuas() * tinggi; // pakai method dari parent
    }
}