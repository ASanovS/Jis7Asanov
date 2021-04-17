package lesson5.tv;

import java.util.Scanner;

public class TvController {

    private final int FIRST_CHANNEL = 1;
    private final int LAST_CHANNEL = 30;
    private final int MIN_LEVEL_SOUND = 0;
    private final int MAX_LEVEL_SOUND = 100;

    public void remoteController(Tv tv) {
        System.out.println("Remote controller tv:\n" +
                "1 - On tv\n" +
                "2 - Of tv\n" +
                "3 - Next channel\n" +
                "4 - Previous channel\n" +
                "5 - Increase sound\n" +
                "6 - Decrease sound\n");
        do {
            int menu = scanner().nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Tv on = " + turnOnTv(tv));
                    break;
                case 2:
                    System.out.println("Tv of = " + turnOfTv(tv));
                    break;
                case 3:
                    if (validateOnTv(tv)) break;
                    System.out.println("Tv channel increase = " + switchToTheNextChannel(tv));
                    break;
                case 4:
                    if (validateOnTv(tv)) break;
                    System.out.println("Tv channel decrease = " + switchToThePreviousChannel(tv));
                    break;
                case 5:
                    if (validateOnTv(tv)) break;
                    System.out.println("Sound tv increase = " + increaseSound(tv));
                    break;
                case 6:
                    if (validateOnTv(tv)) break;
                    System.out.println("Sound tv decrease = " + decreaseSound(tv));
                    break;
            }
        } while (!validateOnTv(tv));
    }

    private boolean validateOnTv(Tv tv) {
        if (!tv.isOnOrOfTv()) {
            System.out.println("Tv off.Use turnOnTv");
            return true;
        }
        return false;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }


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
}
