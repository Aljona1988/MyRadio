import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.Radio;

public class RadioTest {

    @Test
    public void shouldSetCurrentStationGood() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBad() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void shouldNotSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentVolumeAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentVolumeUnder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetFailedStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(12);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumberGood() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        int expected = 9;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseStationNumberBad() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        ;

        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseStationNumberGood() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        int expected = 8;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumberBad() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        int expected = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeGood() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        int expected = 4;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeBad() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeGood() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        int expected = 2;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeBad() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewAmount() {
        Radio radio = new Radio (30);
        radio.setCurrentStationNumber(20);

        int expected = 20;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewAmountBorder() {
        Radio radio = new Radio (30);
        radio.setCurrentStationNumber(30);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNewAmount() {
        Radio radio = new Radio (30);
        radio.setCurrentStationNumber(31);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}