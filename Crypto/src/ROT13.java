import java.io.*;

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
        int  shift=cf-cs;  //to get difference of characters value for shifting
      StringBuilder crypted = new StringBuilder();
     for(int i=0; i < text.length();i++)
     {
          char c= text.charAt(i);
          if(c >='a' && c <='m')
          {
              c+=shift;
          }
          else   if(c >='A' && c <= 'M')
          {
              c+=shift;
          }else   if(c >='n' && c <= 'z')
          {
              c-=shift;
          }else   if(c >='N' && c <= 'Z')
          {
              c-=shift;
          }
          crypted.append(c);
     }
        return crypted.toString();
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


        public void encryptTextFile(File file){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter("sonnet18.enc"));
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(encrypt(line) + "\n");
                }
                writer.close();
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
       }

    public void decryptTextFile(File file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sonnet18.enc"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("sonnet18.dec"));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(decrypt(line) + "\n");
            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

