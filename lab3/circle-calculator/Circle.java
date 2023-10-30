import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        double radius = scanner.nextDouble();

        // Çevre hesaplama
        double circumference = 2 * Math.PI * radius;
        System.out.println("Dairenin çevresi: " + circumference);

        // Alan hesaplama
        double area = Math.PI * radius * radius;
        System.out.println("Dairenin alanı: " + area);

        scanner.close();
    }
}
