public class CharacterCounter {
    public static void main(String[] args) {
        String paragraph = "Bugün hava güzel. Yürüyüş yoluna gidelim.";

        int countA = 0;
        int countUpperCase = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (c == 'a') {
                countA++;
            } else if (Character.isUpperCase(c)) {
                countUpperCase++;
            }
        }

        System.out.println("a karakteri sayısı: " + countA);
        System.out.println("Büyük harfli karakter sayısı: " + countUpperCase);
    }
}
