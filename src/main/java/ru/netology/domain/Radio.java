package ru.netology.domain;

public class Radio {
    private String name;
    private int currentRadioStation;
    private final int minRadioStation = 0;
    private final int maxRadioStation = 10;
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void afterStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void moreVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void afterVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }

    }
}