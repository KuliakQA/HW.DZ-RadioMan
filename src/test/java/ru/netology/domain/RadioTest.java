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
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetStationMoreMax() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(50);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetStationUnderMin() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(-10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationMin() {
        radio.setMaxRadioStation(91);   // (9)
        radio.setMinRadioStation(0);
        assertEquals(9, radio.reduceStation(0));
    }

    @Test
    public void prevStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        assertEquals(6, radio.reduceStation(7));
    }

    @Test
    public void nextStationMax() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        assertEquals(0, radio.increaseStation(9));
    }

    @Test
    public void nextStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        assertEquals(6, radio.increaseStation(5));
    }

    @Test
    public void shouldSetVolume() {
        radio.setMaxVolume(110);   // (10)
        radio.setMinVolume(10);    // (0)
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMoreMax() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(74);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-14);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        assertEquals(5, radio.increaseVolume(4));
    }

    @Test
    public void nextVolumeMax() {
        radio.setMaxVolume(110);   // (10)
        radio.setMinVolume(011);   // (0)
        assertEquals(10, radio.increaseVolume(10));
    }

    @Test
    public void prevVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        assertEquals(7, radio.reduceVolume(8));
    }

    @Test
    public void prevVolumeMin() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        assertEquals(0, radio.reduceVolume(0));
    }

}