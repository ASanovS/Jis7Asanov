package lesson4.lightColorDetector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LightColorDetectorTest {

    @Test
    void detectInvisibleLightMinHeight() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(379);
        String actualResult = "Invisible Light";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectInvisibleLightMaxHeight() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(751);
        String actualResult = "Invisible Light";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectViolet() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(400);
        String actualResult = "Violet";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectBlue() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(490);
        String actualResult = "Blue";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectGreen() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(500);
        String actualResult = "Green";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectYellow() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(580);
        String actualResult = "Yellow";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectOrange() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(600);
        String actualResult = "Orange";
        Assertions.assertEquals(actualResult, invisibleLight);
    }

    @Test
    void detectRed() {
        LightColorDetector detector = new LightColorDetector();
        String invisibleLight = detector.detect(621);
        String actualResult = "Red";
        Assertions.assertEquals(actualResult, invisibleLight);
    }
}