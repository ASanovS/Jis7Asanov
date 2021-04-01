package lesson3.encoder;

class EncoderTest {

    @org.junit.jupiter.api.Test
    void encode() {
        short input = 65;
        char output = 'A';
        boolean actualResult = (char) input == output;
        if (actualResult != true) {
            System.out.println("Test no checked");
        }
    }

    @org.junit.jupiter.api.Test
    void decode() {
        char input = 'X';
        short output = 88;
        boolean actualResult = (short) input == output;
        if (actualResult != true) {
            System.out.println("Test no checked");
        }
    }
}