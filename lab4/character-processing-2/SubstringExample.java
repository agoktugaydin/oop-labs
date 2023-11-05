public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Dersi Java 2012 Programlama Fall";
        // "Java Programlama Dersi Fall 2012"
        
        String part1 = originalString.substring(6, 10); // "Java"
        String part2 = originalString.substring(16, 27); // "Programlama"
        String part3 = originalString.substring(0, 5); // "Dersi"
        String part4 = originalString.substring(28); // "Fall"
        String part5 = originalString.substring(11, 15); // "2012"
         
        String newString = part1 + " " + part2 + " " + part3 + " " + part4 + " " + part5;
        System.out.println(newString);
    }
}
