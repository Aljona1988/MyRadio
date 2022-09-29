import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.Radio;

public class RadioTest {

    @Test
    public void shouldSetCurrentStationGood() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBad() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 6;
        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNotSetFailedStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(12);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumberGood() {
        Radio radio = new Radio();
        radio.currentStationNumber = 8;

        int expected = 9;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseStationNumberBad() {
        Radio radio = new Radio();
        radio.currentStationNumber = 9;

        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseStationNumberGood() {
        Radio radio = new Radio();
        radio.currentStationNumber = 9;

        int expected = 8;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumberBad() {
        Radio radio = new Radio();
        radio.currentStationNumber = 0;

        int expected = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeGood() {
        Radio radio = new Radio();
        radio.currentVolume = 3;

        int expected = 4;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeBad() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeGood() {
        Radio radio = new Radio();
        radio.currentVolume = 3;

        int expected = 2;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeBad() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}