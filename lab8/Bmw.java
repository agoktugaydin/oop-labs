package lab8;

public class Bmw extends Otomobil {
    private String model;
    private String renk;
    private double fiyat;

    // Parametre alan constructor
    public Bmw(String tur, int yapimYili, String marka, double agirlik, int tekerSayisi,
               String model, String renk, double fiyat) {
        super(tur, yapimYili, marka, agirlik, tekerSayisi);
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    // İkinci parametreli constructor
    public Bmw(String model, String renk, double fiyat) {
        super(); // Varsayılan değerleri kullanarak Otomobil sınıfının constructor'ını çağırıyoruz.
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    // Parametresiz constructor
    public Bmw() {
        super(); // Varsayılan değerleri kullanarak Otomobil sınıfının constructor'ını çağırıyoruz.
        this.model = "Belirtilmemiş";
        this.renk = "Belirtilmemiş";
        this.fiyat = 0.0;
    }

    // Getter ve setter metotları
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public void ekranaYazdir() {
        System.out.println("Bmw: Model - " + model + ", Renk - " + renk + ", Fiyat - " + fiyat);
    }

    // Yeni metot
    @Override
    public void ozelBilgiyiYazdir() {
        System.out.println("Bu Bmw'nin özel bilgisi: Lüks bir otomobildir.");
    }
}

