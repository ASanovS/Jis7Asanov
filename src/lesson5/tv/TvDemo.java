package lesson5.tv;

public class TvDemo {
    public static void main(String[] args) {
        TvController controller = new TvController();
        Tv tv = new Tv("Samsung");
        System.out.println(tv);
        System.out.println();
        controller.remoteController(tv);

        System.out.println();
        System.out.println(tv);
    }
}
