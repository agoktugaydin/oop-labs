public class CharacterCounter {
    public static void main(String[] args) {
        String paragraph = "Bugün hava güzel. Yürüyüş yoluna gidelim.";

        int countWhiteSpace = 0;
        int countLowerCase = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (c == ' ') {
                countWhiteSpace++;
            } else if (Character.isLowerCase(c)) {
                countLowerCase++;
            }
        }

        System.out.println("Boşluk karakteri sayısı: " + countWhiteSpace);
        System.out.println("Küçük harfli karakter sayısı: " + countLowerCase);
    }
}
