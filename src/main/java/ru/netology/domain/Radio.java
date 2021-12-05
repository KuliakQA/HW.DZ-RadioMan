package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private final int minRadioStation = 0;
    private final int maxRadioStation = 10;
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

     /*public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getMinRadioStation() {
        return minRadioStation;
        }

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
*/

    public Radio(int currentRadioStation, int currentVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
    }

    public Radio() {

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void afterStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else
            currentRadioStation--;
    }

    public void nextStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else
            currentRadioStation++;
    }

    public void moreVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else
        currentVolume++;
    }

    public void afterVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else
        currentVolume --;

    }
}