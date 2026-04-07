package latihanpbo.latihan3;

public class Lingkaran extends BangunDatar{

    public double LuasLingkaran(){
        return Math.PI * getJari() * getJari();
    }

    public double KelilingLingkaran(){
        return 2 * Math.PI * getJari();
    }

}