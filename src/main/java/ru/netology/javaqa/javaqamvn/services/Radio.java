package ru.netology.javaqa.javaqamvn.services;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int maxStation;

    public Radio () {
        this.maxStation = 9;

    }

    public Radio (int stationAmount) {
        this.maxStation = stationAmount - 1;

    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > maxStation) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int nextStation() {
        if (currentStationNumber >= maxStation) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
        return currentStationNumber;
    }

    public int prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = maxStation;
        } else {

            currentStationNumber--;
        }
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = currentVolume;
        } else {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        } else {
            currentVolume--;
        }
        return currentVolume;
    }

}
