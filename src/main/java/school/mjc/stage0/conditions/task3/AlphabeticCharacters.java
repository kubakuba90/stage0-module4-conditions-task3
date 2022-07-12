package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        Character ch = character;
        String charConv = String.valueOf(character);

        if(charConv.matches("[a-zA-Z]+")) {
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("wrong alphabet!");
        }




    }
}
