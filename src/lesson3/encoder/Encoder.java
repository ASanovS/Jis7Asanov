package lesson3.encoder;

public class Encoder {

    public void encode(short code){
        char outputResult = (char) code;
        System.out.println(outputResult);
    }

    public void decode(char symbol){
        short outputResult = (short) symbol;
        System.out.println(outputResult);
    }
}
