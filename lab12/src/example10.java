public class example10 {
    public static void main(String[] args) {
        String input = "Привет мир, это тестовая строка";
        String vowelsChars = "аеёиоуыэюяAEIOUYaeiou"; // гласные
        int vowels = 0;
        int consonants = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsChars.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }
}