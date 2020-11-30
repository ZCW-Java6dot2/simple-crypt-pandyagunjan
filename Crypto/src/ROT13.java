import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
   private Character cs;
    private Character cf;

    ROT13(Character cs, Character cf) {
        this.cs=cs;
        this.cf=cf;
    }

    ROT13() {
        cs='a';
        cf='n';
    }


    public String crypt(String text) throws UnsupportedOperationException {
     char[] textAsArray= text.toCharArray();


        return "";
    }

    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        Integer indexOfChar = 0;
        StringBuilder bufferString = new StringBuilder();
        indexOfChar = s.indexOf(c); //index of the character
        bufferString.append(s.substring(indexOfChar,s.length())); //copy from index to end
        bufferString.append(s.substring(0,indexOfChar)); //copy from 0 to index
        return bufferString.toString();

    }

}

