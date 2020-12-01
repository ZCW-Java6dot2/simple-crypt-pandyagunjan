import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Test
    public void cryptCaesarTest1() {
        Caesar caesar = new Caesar(2);
        String Q1 = "Hello world!";
        String A1 = "Jgnnq yqtnf!";
       // When
        String actual = caesar.crypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);
       // Then

        assertTrue(actual.equals(A1));
    }


    @Test
    public void cryptCaesarTest2() {
        Caesar caesar = new Caesar(1);
        String Q1 = "Hello world!";
        String A1 = "Ifmmp xpsme!";
        // When
        String actual = caesar.crypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);
        // Then
        assertTrue(actual.equals(A1));
    }

    @Test
    public void cryptCaesarTest3() {
        Caesar caesar = new Caesar(13);
        String Q1 = "Why did the chicken cross the road?";
        String A1 = "Jul qvq gur puvpxra pebff gur ebnq?";
        // When
        String actual = caesar.crypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);
        System.out.println(actual);
        // Then
        assertTrue(actual.equals(A1));
    }


}
