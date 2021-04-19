package lesson5.tv;

import java.util.Objects;

public class Tv {
    private final String manufacturer;
    private int currentChannel = 1;
    private int currentSound = 0;
    private boolean isEnabled = false;

    public Tv(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public void enable() {
        this.isEnabled = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel && currentSound == tv.currentSound && isEnabled == tv.isEnabled && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentSound, manufacturer, isEnabled);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentSound=" + currentSound +
                ", manufacturer='" + manufacturer + '\'' +
                ", onOrOfTv=" + isEnabled +
                '}';
    }
}
