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
     StringBuilder crypted = new StringBuilder();

     for(int i=0; i < text.length();i++)
     {
          char c= textAsArray[i];
          if(c >='a' && c <= 'm')
          {
              c+=13;
          }
          else   if(c >='A' && c <= 'M')
          {
              c+=13;
          }else   if(c >='n' && c <= 'z')
          {
              c-=13;
          }else   if(c >='N' && c <= 'Z')
          {
              c-=13;
          }
          crypted.append(c);
     }


        return crypted.toString();
    }

    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {
      //  return crypt(text);
        return null;
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

