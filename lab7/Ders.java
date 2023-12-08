class Ders {
    String ad;
    int sinif;
    String hoca;
    static int dersSayisi = 0;

    // Default constructor
    public Ders() {
        dersSayisi++;
    }

    // Constructor with one parameter
    public Ders(String a) {
        ad = a;
        dersSayisi++;
    }

    // Constructor with three parameters
    public Ders(String a, int s, String h) {
        ad = a;
        sinif = s;
        hoca = h;
        dersSayisi++;
    }

    // Method to print course information
	public void DersBilgisiYaz() {
		System.out.println("Ders Bilgisi: Adı: " + ad + ", Sınıf: " + sinif + ", Hoca: " + hoca);
	}

	// Method to print the total number of courses
	public static void DersSayiBilgisiYaz() {
		System.out.println("Toplam Ders Sayısı: " + dersSayisi);
	}

}
