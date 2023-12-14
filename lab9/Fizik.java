package lab9;

class Fizik extends Ders {
    public Fizik(String dersAd, String dersSinif) {
        super(dersAd, dersSinif);
    }

    @Override
    public void IsimGetir() {
        System.out.println("Fizik Dersinin Adı: " + DersAd);
    }

    @Override
    public void SinifGetir() {
        System.out.println("Fizik Dersinin Sınıfı: " + DersSinif);
    }

    @Override
    public void SozluSunum() {
        System.out.println("Fizik Sozlu Sunum");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Fizik Yazılı Sunum");
    }
}
