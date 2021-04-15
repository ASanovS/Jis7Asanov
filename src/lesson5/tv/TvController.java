package lesson5.tv;

public class TvController {

    private final int FIRST_CHANNEL = 1;
    private final int LAST_CHANNEL = 30;
    private final int MIN_LEVEL_SOUND = 0;
    private final int MAX_LEVEL_SOUND = 100;

    private int switchToTheNextChannel(Tv tv) {
        tv.setCurrentChannel(+1);
        if (tv.getCurrentChannel() > LAST_CHANNEL) {
            tv.setCurrentChannel(FIRST_CHANNEL);
        }
        return tv.getCurrentChannel();
    }

    private int switchToThePreviousChannel(Tv tv) {
        tv.setCurrentChannel(-1);
        if (tv.getCurrentChannel() < FIRST_CHANNEL) {
            tv.setCurrentChannel(LAST_CHANNEL);
        }
        return tv.getCurrentChannel();
    }

    private int increaseSound(Tv tv) {
        tv.setCurrentSound(+1);
        if (tv.getCurrentSound() > 100) {
            tv.setCurrentChannel(MAX_LEVEL_SOUND);
        }
        return tv.getCurrentSound();
    }

    private int decreaseSound(Tv tv) {
        tv.setCurrentSound(-1);
        if (tv.getCurrentSound() < 0) {
            tv.setCurrentSound(MIN_LEVEL_SOUND);
        }
        return tv.getCurrentSound();
    }

    private boolean turnOnTv(Tv tv) {
        if (!tv.isOnOrOfTv()) {
            tv.setOnOrOfTv(true);
        }
        return tv.isOnOrOfTv();
    }

    private boolean turnOfTv(Tv tv) {
        if (tv.isOnOrOfTv()) {
            tv.setOnOrOfTv(false);
        }
        return tv.isOnOrOfTv();
    }

    private void alertOfTv(Tv tv) {
        if (tv.isOnOrOfTv()) {
            System.out.println("Tv off.Use turnOnTv");
        }
    }
}
