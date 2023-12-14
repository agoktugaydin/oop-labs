package lab9;

abstract class Ders implements DersIsle {
    protected String DersAd;
    protected String DersSinif;

    public Ders(String dersAd, String dersSinif) {
        this.DersAd = dersAd;
        this.DersSinif = dersSinif;
    }

    public abstract void IsimGetir();
    public abstract void SinifGetir();

    public void IsmiBuyut(String dersAd) {
        System.out.println(dersAd.toUpperCase());
    }
}
