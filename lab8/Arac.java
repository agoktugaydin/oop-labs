package lab8;

public class Arac {
    private String tur;
    private int yapimYili;

    // Parametre alan constructor
    public Arac(String tur, int yapimYili) {
        this.tur = tur;
        this.yapimYili = yapimYili;
    }

    // Parametresiz constructor
    public Arac() {
        this.tur = "Belirtilmemiş";
        this.yapimYili = 0;
    }

    // Getter ve setter metotları
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(int yapimYili) {
        this.yapimYili = yapimYili;
    }

    public void ekranaYazdir() {
        System.out.println("Arac: Tür - " + tur + ", Yapım Yılı - " + yapimYili);
    }

    // Yeni bağımsız metot
    public void ozelBilgiyiYazdir() {
        System.out.println("Bu Arac'ın özel bilgisi henüz belirlenmemiştir.");
    }
}
