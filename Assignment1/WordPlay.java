package Assignment1;

public class WordPlay {
    public boolean isVowel(char ch){
        boolean isVowel = false;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<vowels.length();i++){
            if(ch == vowels.charAt(i)){
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    public String replaceVowels(String phrase, char ch){
        String vowels = "aeiouAEIOU";
        StringBuilder retPhrase = new StringBuilder(phrase);
        for(int i=0;i<vowels.length();i++){
            for(int j=0;j<phrase.length();j++){
                if(phrase.charAt(j)==vowels.charAt(i)){
                    retPhrase.setCharAt(j, ch);
                }
            }
        }
        return retPhrase.toString();
    }

    public String emphasize(String phrase, char ch){
        StringBuilder retPhrase = new StringBuilder(phrase);
        char ch1 = Character.toUpperCase(ch);
        char ch2 = Character.toLowerCase(ch);
        for(int i=0;i<phrase.length();i++){
            if(phrase.charAt(i)==ch1 || phrase.charAt(i)==ch2){
                if(i%2==0){
                    retPhrase.setCharAt(i, '*');
                }
                else{
                    retPhrase.setCharAt(i, '+');
                }
            }
        }
        return retPhrase.toString();
    }
}
