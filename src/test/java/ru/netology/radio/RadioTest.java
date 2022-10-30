package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "10, 0"
    })
    public void findStation(int setCurrentRadioStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(setCurrentRadioStation);
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "8, 9",
            "9, 0"
    })
    public void nextStation(int setCurrentRadioStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(setCurrentRadioStation);
        radio.next();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 9",
            "0, 9",
            "1, 0",
            "2, 1",
            "8, 7",
            "9, 8",
            "10, 9",
            "11, 9"
    })
    public void prevStation(int setCurrentRadioStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(setCurrentRadioStation);
        radio.prev();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-2, 1",
            "-1, 1",
            "0, 1",
            "1, 2",
            "8, 9",
            "9, 10",
            "10, 10",
            "11, 1"
    })
    public void plusVolume(int setCurrentVolume, int expected) {

        Radio radio = new Radio();
        radio.setCurrentVolume(setCurrentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 0",
            "8, 7",
            "9, 8",
            "10, 9",
            "11, 0",
            "12, 0"
    })
    public void minusVolume(int setCurrentVolume, int expected) {

        Radio radio = new Radio();
        radio.setCurrentVolume(setCurrentVolume);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}