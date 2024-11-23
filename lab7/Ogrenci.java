import java.util.ArrayList;


class Ogrenci {
	String ad;
	int sinif;
	ArrayList<Ders> dersListesi;
	static int ogrenciSayisi = 0;

	// Default constructor
	public Ogrenci() {
		ogrenciSayisi++;
	}

	// 2 parametreli Constructor
	public Ogrenci(String a, ArrayList<Ders> d) {
		ad = a;
		dersListesi = d;
		ogrenciSayisi++;
	}

	// 3 parametreli Constructor
	public Ogrenci(String a, int s, ArrayList<Ders> d) {
		ad = a;
		sinif = s;
		dersListesi = d;
		ogrenciSayisi++;
	}

	// Ogrenci bilgisini yazdir
	public void OgrenciBilgisiYaz() {
		System.out.println("Öğrenci Bilgisi: Adı: " + ad + ", Sınıf: " + sinif + ", Öğrenci Sayısı: " + ogrenciSayisi +
				", Aldığı Ders Sayısı: " + (dersListesi != null ? dersListesi.size() : 0));
	}

	// Ogrencinin ders bilgisini yazdir
	public void OgrenciDersBilgiYaz() {
		if (dersListesi != null) {
			System.out.println("Öğrenci Ders Bilgisi: Adı: " + ad + ", Aldığı Ders Sayısı: " + dersListesi.size());

			for (Ders d : dersListesi) {
				if (d != null) {
					d.DersBilgisiYaz();
				}
			}
		} else {
			System.out.println("Öğrenci Ders Bilgisi: Adı: " + ad + ", Aldığı Ders Sayısı: 0");
		}
	}
}
