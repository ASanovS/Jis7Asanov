package lesson10.dataBase;

public class ItemNotFoundException extends Exception {

    public void itemNotFoundException() throws ItemNotFoundException {
        throw new ItemNotFoundException();
    }
}
