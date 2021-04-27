package lesson5.tv;

public class TvDemo {
    public static void main(String[] args) {
        Tv tv = new Tv("Samsung");

        TvController controller = new TvController(tv);


        System.out.println(tv);
        System.out.println();
        controller.remoteController();

        System.out.println();
        System.out.println(tv);
    }
}
