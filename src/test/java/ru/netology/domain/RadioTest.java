package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void constructorNextStation() {
        Radio radio = new Radio("SoloRX",
                4,
                0,
                9);

        radio.nextStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorNextStationMax() {
        Radio radio = new Radio("SoloRX",
                9,
                0,
                9);

        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorStationPrevMin() {
        Radio radio = new Radio("SoloRX",
                0,
                0,
                9);

        radio.afterStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorStationPrev() {
        Radio radio = new Radio("SoloRX",
                5,
                0,
                9);

        radio.afterStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void stationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void stationMin() {
        Radio radio = new Radio("JuliaXX",
                -1,
                0,
                9);

        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorNextMaxVolume() {
        Radio radio = new Radio("Gloria",
                7,
                0,
                9,
                100,
                100,
                0);

        radio.moreVolume();
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void constructorAfterMinVolume() {
        Radio radio = new Radio(0,
                100,
                0);

        radio.afterVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void constructorBeforeVolume() {
        Radio radio = new Radio(50,
                100,
                0);

        radio.afterVolume();
        assertEquals(49, radio.getCurrentVolume());
    }


    @Test
    public void constructorNextVolume() {
        Radio radio = new Radio(40,
                100,
                0);

        radio.moreVolume();
        assertEquals(41, radio.getCurrentVolume());
    }

    @Test
    public void moreMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }
}