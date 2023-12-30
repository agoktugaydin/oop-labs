package lab11;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Sayıyı kullanıcıdan alma
            System.out.print("Bir sayı girin: ");
            String sayiStr = scanner.nextLine();
            int sayi = 0;

            try {
                // Sayı formatını kontrol etme
                sayi = Integer.parseInt(sayiStr);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Sayı formatı hatalı!");
            }

            // Yaşı kullanıcıdan alma
            System.out.print("Bir yaş girin: ");
            int yas = scanner.nextInt();

            // Yaş formatını kontrol etme
            if (yas < 18) {
                throw new InvalidAgeException("Yaş 18'den küçük olamaz!");
            }

            // Hata olmadığı durum
            System.out.println("Dogru Format : Girilen sayı: " + sayi);
            System.out.println("Dogru Format : Girilen yaş: " + yas);
            System.out.println("Sayının karesi: " + (sayi * sayi));

        } catch (NumberFormatException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            // Scanner kapatma
            scanner.close();
        }
    }
}