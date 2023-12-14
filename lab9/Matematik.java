package lab9;

class Matematik extends Ders {
    public Matematik(String dersAd, String dersSinif) {
        super(dersAd, dersSinif);
    }

    @Override
    public void IsimGetir() {
        System.out.println("Matematik Dersinin Adı: " + DersAd);
    }

    @Override
    public void SinifGetir() {
        System.out.println("Matematik Dersinin Sınıfı: " + DersSinif);
    }

    @Override
    public void SozluSunum() {
        System.out.println("Matematik Sozlu Sunum");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Matematik Yazılı Sunum");
    }
}
