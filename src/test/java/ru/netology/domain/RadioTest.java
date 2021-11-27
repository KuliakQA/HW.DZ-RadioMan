package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldUseSetGet() {
        radio.setName("Radio S10");
        assertEquals("Radio S10", radio.getName());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetStationMoreMax() {
        radio.setCurrentRadioStation(50);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetStationUnderMin() {
        radio.setCurrentRadioStation(-10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationMin() {
        radio.setCurrentRadioStation(0);
        radio.afterStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        radio.setCurrentRadioStation(7);
        radio.afterStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationMax() {
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        radio.setCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMoreMax() {
        radio.setCurrentVolume(74);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        radio.setCurrentVolume(-14);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextVolume() {
        radio.setCurrentVolume(4);
        radio.moreVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeMax() {
        radio.setCurrentVolume(10);
        radio.moreVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        radio.setCurrentVolume(8);
        radio.afterVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void prevVolumeMin() {
        radio.setCurrentVolume(0);
        radio.afterVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}