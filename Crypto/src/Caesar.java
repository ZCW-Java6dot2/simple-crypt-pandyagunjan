

public class Caesar extends ROT13{
   int ceaserShift;

    Caesar(int ceaserShift) {
        this.ceaserShift=ceaserShift;
    }

    public String crypt(String text) throws UnsupportedOperationException {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + ceaserShift - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + ceaserShift - 97) % 26 + 97);
                result.append(ch);
            } else {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
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
