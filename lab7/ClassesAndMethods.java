import java.util.ArrayList;


public class ClassesAndMethods {
    public static void main(String[] args) {
        // 1. Oluşturulan nesne (Default Constructor ile)
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.OgrenciBilgisiYaz();
        ogrenci1.OgrenciDersBilgiYaz();

        // 2. Oluşturulan nesne (2 parametreli Constructor ile)
        ArrayList<Ders> dersListesi2 = new ArrayList<>();
        Ders ders1 = new Ders("Kesikli Matematik", 1, "Alev Hoca");
        dersListesi2.add(ders1);
        Ogrenci ogrenci2 = new Ogrenci("Ahmet", dersListesi2);
        ogrenci2.OgrenciBilgisiYaz();
        ogrenci2.OgrenciDersBilgiYaz();

        // 3. Oluşturulan nesne (3 parametreli Constructor ile)
        ArrayList<Ders> dersListesi3 = new ArrayList<>();
        Ders ders2 = new Ders("Isletim Sistemleri", 2, "Suhap Hoca");
        Ders ders3 = new Ders("Bilgisayar Aglari", 2, "Adnan Hoca");
        dersListesi3.add(ders2);
        dersListesi3.add(ders3);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", 11, dersListesi3);
        ogrenci3.OgrenciBilgisiYaz();
        ogrenci3.OgrenciDersBilgiYaz();

        // Ders sayısı bilgisini yazdır
        Ders.DersSayiBilgisiYaz();
    }
}