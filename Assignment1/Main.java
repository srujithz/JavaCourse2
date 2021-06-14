package Assignment1;

public class Main {

    public static void main(String[] args) {
        WordPlay w1 = new WordPlay();
        System.out.println(w1.isVowel('A'));
        System.out.println(w1.isVowel('J'));
        System.out.println(w1.isVowel('i'));
        System.out.println(w1.replaceVowels("Hello World", '*'));
        System.out.println(w1.emphasize("My name is Srujith", 'i'));
    }
}
