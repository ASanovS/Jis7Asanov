package lesson3.encoder;

/*
1. Разработать класс - кодировщик, у
которого должны быть следующие характеристики:
    Методы:

        Преобразование кода в символ и вывод
        на экран (void encode(short code))1P

        Преобразование символ в код и вывод на
        экран (void decode(char symbol))2P
 */

public class Encoder {

    public void encode(short code){
        char outputResult = (char) code;
        System.out.println(outputResult);
    }

    public void decode(char symbol){

    }
}
