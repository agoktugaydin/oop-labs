import java.util.ArrayList;
import java.util.Scanner;

public class CharacterMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Menüyü göster
            System.out.println("----- MENU -----");
            System.out.println("1. Karakter sayısını say");
            System.out.println("2. İki kelime arasındaki ortak karakterleri bul");
            System.out.println("3. Cümleyi ArrayList'e dönüştür");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            // Kullanıcının seçimini al
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Kullanıcının seçimine göre işlem yap
            switch (choice) {
                case 1:
                    System.out.print("Bir cümle girin: ");
                    String sentence = scanner.nextLine();
                    int charCount = countCharacters(sentence);
                    System.out.println("Karakter sayısı: " + charCount);
                    break;
                case 2:
                    System.out.print("İki kelime girin (boşluklu): ");
                    String wordsInput = scanner.nextLine();
                    String[] words = wordsInput.split(" ");
                    findCommonCharacters(words[0], words[1]);
                    break;
                case 3:
                    System.out.print("Bir cümle girin: ");
                    String inputSentence = scanner.nextLine();
                    ArrayList<String> wordList = convertToArrayList(inputSentence);
                    System.out.println("ArrayList: " + wordList);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }

        // Scanner'ı kapat
        scanner.close();
    }

    // Karakter sayısını sayan metod
    private static int countCharacters(String sentence) {
        return sentence.length();
    }

    // İki kelime arasındaki ortak karakterleri bulan metod
    private static void findCommonCharacters(String word1, String word2) {
        System.out.print("Ortak karakterler: ");
        for (char c : word1.toCharArray()) {
            // System.out.print(c);
            if (word2.contains(String.valueOf(c))) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    // Cümleyi ArrayList'e dönüştüren metod
    private static ArrayList<String> convertToArrayList(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        return wordList;
    }
}
