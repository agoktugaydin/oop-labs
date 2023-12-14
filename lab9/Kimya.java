package lab9;

class Kimya extends Ders {
    public Kimya(String dersAd, String dersSinif) {
        super(dersAd, dersSinif);
    }

    @Override
    public void IsimGetir() {
        System.out.println("Kimya Dersinin Adı: " + DersAd);
    }

    @Override
    public void SinifGetir() {
        System.out.println("Kimya Dersinin Sınıfı: " + DersSinif);
    }

    @Override
    public void SozluSunum() {
        System.out.println("Kimya Sozlu Sunum");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Kimya Yazılı Sunum");
    }
}
