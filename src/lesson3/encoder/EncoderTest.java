package lesson3.encoder;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    /*
    1P.Для входного параметра 65 текст может выводиться следующим образом:
    65 => 'A'
     */
    @org.junit.jupiter.api.Test
    void encode() {
        short input = 65;
        char output = 'A';
        boolean actualResult = (char) input == output;
        System.out.println(actualResult);
    }

    /*
    2P. Для входного параметра 'X' текст может выводиться следующим образом:
    'X' => 88
     */
    @org.junit.jupiter.api.Test
    void decode() {
    }
}