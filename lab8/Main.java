package lab8;

public class Main {
    public static void main(String[] args) {
        // Parametreli constructorlar 
        Arac arac1 = new Arac("Taşıma", 2020);
        arac1.ekranaYazdir();
        arac1.ozelBilgiyiYazdir();

        Otomobil otomobil1 = new Otomobil("Binek", 2022, "Toyota", 1500.0, 4);
        otomobil1.ekranaYazdir();
        otomobil1.ozelBilgiyiYazdir();

        otomobil1.setTur(arac1.getTur());

        
        Bmw bmw1 = new Bmw("Binek", 2023, "Bmw", 1800.0, 4, "X5", "Siyah", 150000.0);
        bmw1.ekranaYazdir();
        bmw1.ozelBilgiyiYazdir();

        // // Parametresiz constructorlar ile test senaryoları
        // Arac arac2 = new Arac();
        // arac2.ekranaYazdir();
        // arac2.ozelBilgiyiYazdir();

        // Otomobil otomobil2 = new Otomobil();
        // otomobil2.ekranaYazdir();
        // otomobil2.ozelBilgiyiYazdir();

        // Bmw bmw2 = new Bmw();
        // bmw2.ekranaYazdir();
        // bmw2.ozelBilgiyiYazdir();
    }
}
