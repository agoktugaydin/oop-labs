package lab9;

public class SoyutSiniflar {

    public static void main(String[] args) {
        Matematik matematikDersi = new Matematik("Matematik", "Amfi-1");
        Fizik fizikDersi = new Fizik("Fizik", "Amfi-2");
        Kimya kimyaDersi = new Kimya("Kimya", "Amfi-3");

        // Matematik Dersi için metotlar ve soyut metotlar
        matematikDersi.IsmiBuyut(matematikDersi.DersAd);
        matematikDersi.IsimGetir();
        matematikDersi.SinifGetir();
        matematikDersi.SozluSunum();
        matematikDersi.YaziliSunum();

        System.out.println(); 

        // Fizik Dersi için metotlar ve soyut metotlar
        fizikDersi.IsmiBuyut(fizikDersi.DersAd);
        fizikDersi.IsimGetir();
        fizikDersi.SinifGetir();
        fizikDersi.SozluSunum();
        fizikDersi.YaziliSunum();

        System.out.println(); 

        // Kimya Dersi için metotlar ve soyut metotlar
        kimyaDersi.IsmiBuyut(kimyaDersi.DersAd);
        kimyaDersi.IsimGetir();
        kimyaDersi.SinifGetir();
        kimyaDersi.SozluSunum();
        kimyaDersi.YaziliSunum();
    }
}
