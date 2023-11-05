public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Java Programlama Dersi Fall 2012";
        String targetString = "Programlama Dersi";

        int startIndex = originalString.indexOf(targetString);
        int endIndex = startIndex + targetString.length();

        if (startIndex != -1) {
            String result = originalString.substring(startIndex, endIndex);
            System.out.println(result);
        }
    }
}
