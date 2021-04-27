package lesson5.tv;

import java.util.Scanner;

public class TvController {
    private final Tv tv;
    private final int FIRST_CHANNEL = 1;
    private final int LAST_CHANNEL = 30;
    private final int MIN_LEVEL_SOUND = 0;
    private final int MAX_LEVEL_SOUND = 100;

    public TvController(Tv tv) {
        this.tv = tv;
    }

    public void remoteController() {
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
                    tv.enable();
                    System.out.println("Tv on");
                    break;
                case 2:
                    tv.disable();
                    System.out.println("Tv of");
                    scanner().close();
                    break;
                case 3:
                    if (isTvEnabled()) break;
                    System.out.println("Tv channel increase = " + switchToTheNextChannel());
                    break;
                case 4:
                    if (isTvEnabled()) break;
                    System.out.println("Tv channel decrease = " + switchToThePreviousChannel());
                    break;
                case 5:
                    if (isTvEnabled()) break;
                    System.out.println("Sound tv increase = " + increaseSound());
                    break;
                case 6:
                    if (isTvEnabled()) break;
                    System.out.println("Sound tv decrease = " + decreaseSound());
                    break;
            }
        } while (tv.isEnabled());
    }

    private boolean isTvEnabled() {
        if (!tv.isEnabled()) {
            System.out.println("Tv off please on tv");
            return true;
        }
        return false;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }

    private int switchToTheNextChannel() {
        if (tv.getCurrentChannel() == LAST_CHANNEL) {
            tv.setCurrentChannel(FIRST_CHANNEL);
        } else {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
        return tv.getCurrentChannel();
    }

    private int switchToThePreviousChannel() {
        if (tv.getCurrentChannel() == FIRST_CHANNEL) {
            tv.setCurrentChannel(LAST_CHANNEL);
        } else {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
        return tv.getCurrentChannel();
    }

    private int increaseSound() {
        if (tv.getCurrentSound() == MAX_LEVEL_SOUND) {
            tv.setCurrentSound(MAX_LEVEL_SOUND);
        } else {
            tv.setCurrentSound(tv.getCurrentSound() + 1);
        }
        return tv.getCurrentSound();
    }

    private int decreaseSound() {
        if (tv.getCurrentSound() == MIN_LEVEL_SOUND) {
            tv.setCurrentSound(MIN_LEVEL_SOUND);
        } else {
            tv.setCurrentSound(tv.getCurrentSound() - 1);
        }
        return tv.getCurrentSound();
    }
}
