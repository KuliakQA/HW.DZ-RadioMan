package ru.netology.domain;

public class Radio {
    private String name;
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
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

    public int reduceStation(int currentRadioStation) {
        if (currentRadioStation > minRadioStation) {
                currentRadioStation--;
        }
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    public int increaseStation(int currentRadioStation) {
        if (currentRadioStation < maxRadioStation) {
                currentRadioStation++;
        }
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
                currentVolume++;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
        }

     public int reduceVolume(int currentVolume) {
        if (currentVolume > minVolume) {
                currentVolume--;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;

        }
    }
