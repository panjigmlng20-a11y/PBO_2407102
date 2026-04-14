package latihanpbo.latihan_13april;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        // Tambahin ini biar keluar "Bangun Datar"
        bd = new BangunDatar(3, 4);
        bd.tampilkan();

        bd = new Persegi(5);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 4);
        bd.tampilkan();

        bd = new Segitiga(8, 3);
        bd.tampilkan();
    }
}