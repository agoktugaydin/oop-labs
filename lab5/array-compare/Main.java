import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk diziyi kullanıcıdan al
        System.out.println("İlk dizinin elemanlarını giriniz:");
        int[][][][][] firstArray = new int[2][2][2][2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            firstArray[i][j][k][l][m] = scanner.nextInt();
                        }
                    }
                }
            }
        }

        // İkinci diziyi kullanıcıdan al
        System.out.println("İkinci dizinin elemanlarını giriniz:");
        int[][][][][] secondArray = new int[2][2][2][2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            secondArray[i][j][k][l][m] = scanner.nextInt();
                        }
                    }
                }
            }
        }

        // Dizilerin eşitliğini kontrol et
        if (Arrays.deepEquals(firstArray, secondArray)) {
            System.out.println("Diziler eşittir.");
        } else {
            System.out.println("Diziler eşit değildir.");
        }
        scanner.close();
    }
}
