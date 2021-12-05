package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationMinus() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-2);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void beforeStationMaxi() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(44);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void stationPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.afterStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void stationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.afterStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void nextMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.moreVolume();
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void afterMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.afterVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void afterMoreMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.afterVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void beforeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.afterVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.moreVolume();
        assertEquals(41, radio.getCurrentVolume());
    }

    @Test
    public void moreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.moreVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void constructorMoreStationAndLessVolume() {
        Radio radio = new Radio(5, 50);
        radio.nextStation();
        radio.afterVolume();
        assertEquals(6, radio.getCurrentRadioStation());
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void constructorMoreMaxStationAndVolume() {
        Radio radio = new Radio(10, 100);
        radio.nextStation();
        radio.moreVolume();
        assertEquals(0, radio.getCurrentRadioStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void constructorLessMinStationAndVolume() {
        Radio radio = new Radio(0, 0);
        radio.afterStation();
        radio.afterVolume();
        assertEquals(10, radio.getCurrentRadioStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void constructorMoreStationAndVolume() {
        Radio radio = new Radio(4, 44);
        radio.nextStation();
        radio.moreVolume();
        assertEquals(5, radio.getCurrentRadioStation());
        assertEquals(45, radio.getCurrentVolume());
    }

    @Test
    public void constructorArbitraryVolume() {
        Radio radio = new Radio(55, 555);
        radio.moreVolume();
        radio.nextStation();
        assertEquals(100, radio.getCurrentVolume());
        assertEquals(0, radio.getCurrentRadioStation());
    }

}