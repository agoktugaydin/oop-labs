package lab8;

public class Otomobil extends Arac {
    private String marka;
    private double agirlik;
    private int tekerSayisi;

    // Parametre alan constructor
    public Otomobil(String tur, int yapimYili, String marka, double agirlik, int tekerSayisi) {
        super(tur, yapimYili);
        this.marka = marka;
        this.agirlik = agirlik;
        this.tekerSayisi = tekerSayisi;
    }

    // İkinci parametreli constructor
    public Otomobil(String marka, double agirlik, int tekerSayisi) {
        super(); // Varsayılan değerleri kullanarak Arac sınıfının constructor'ını çağırıyoruz.
        this.marka = marka;
        this.agirlik = agirlik;
        this.tekerSayisi = tekerSayisi;
    }

    // Parametresiz constructor
    public Otomobil() {
        super(); // Varsayılan değerleri kullanarak Arac sınıfının constructor'ını çağırıyoruz.
        this.marka = "Belirtilmemiş";
        this.agirlik = 0.0;
        this.tekerSayisi = 0;
    }

    // Getter ve setter metotları
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    @Override
    public void ekranaYazdir() {
        System.out.println("Otomobil: Marka - " + marka + ", Ağırlık - " + agirlik + ", Teker Sayısı - " + tekerSayisi);
    }

    // Yeni metot
    @Override
    public void ozelBilgiyiYazdir() {
        System.out.println("Bu Otomobilin özel bilgisi: Spor bir otomobildir.");
    }
}
