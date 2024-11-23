package lab12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class Ders {
    private String dersAdi;
    private String donem;
    private int not;

    public Ders(String dersAdi, String donem, int not) {
        this.dersAdi = dersAdi;
        this.donem = donem;
        this.not = not;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    @Override
    public String toString() {
        return "Ders Adı: " + dersAdi + ", Dönem: " + donem + ", Not: " + not;
    }
}

class Ogrenci {
    private String ad;
    private String soyAd;
    private String ogrenciNo;
    private ArrayList<Ders> dersListesi;

    public Ogrenci(String ad, String soyAd, String ogrenciNo, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.ogrenciNo = ogrenciNo;
        this.dersListesi = dersListesi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public ArrayList<Ders> getDersListesi() {
        return dersListesi;
    }

    public void setDersListesi(ArrayList<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ad: ").append(ad).append(", Soyad: ").append(soyAd).append(", Ogrenci No: ").append(ogrenciNo).append("\n");
        for (Ders ders : dersListesi) {
            result.append(ders.toString()).append("\n");
        }
        return result.toString();
    }

    public double ortalamaNot() {
        int toplamNot = 0;
        for (Ders ders : dersListesi) {
            System.out.println("Ders Adı: " + ders.getDersAdi() + ", Not: " + ders.getNot());
            toplamNot += ders.getNot();
        }
        System.out.println("Toplam Not: " + toplamNot);
        System.out.println("Ders Sayısı: " + dersListesi.size());

        return (double) toplamNot / dersListesi.size();
    }

    public void dersleriListele() {
        for (Ders ders : dersListesi) {
            System.out.println("Ders Adı: " + ders.getDersAdi() +
                    ", Dönem: " + ders.getDonem() +
                    ", Not: " + ders.getNot());
        }
    }
}
