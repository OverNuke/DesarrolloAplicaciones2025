import java.util.regex.Pattern;

public class StringCharacters {
    public static void main(String[] args) {
        String text = "Este autobús va muy lento, si no acelera llegaré muy tarde a clases y" +
                "no podré presentar el examen, el profesor no va a creerme, reprobaré" +
                " y ¿Qué será de mí? Ni siquiera es mi culpa, pero todos actuarán como" +
                " or to taje arms against a sea of troubles," +
                " así fuera.";
        text = text.toLowerCase();

        int spaces = 0
                , vowels = 0
                , letters = 0;

        // --------------------------------------------------------------------------
        String [] TextSplitList;

        spaces = text.split("\\s").length - 1;

        text = text.replaceAll("\\s","");

        Pattern regexExpVowel = Pattern.compile("[à-ü |aeiou]", Pattern.CASE_INSENSITIVE);
        vowels = text.split(regexExpVowel.pattern()).length;

        Pattern regexExpLetters = Pattern.compile("[a-z|à-ü]", Pattern.CASE_INSENSITIVE);
        letters = text.split(regexExpLetters.pattern()).length;

        // --------------------------------------------------------------------------
        System.out.println("The text contained vowels: " +vowels+ "\n" + "Consonants:" +
                (letters - vowels) + "\nspaces: "+ spaces);
    }
}
