package ru.netology.javaqa.javaqamvn.services;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int nextStation() {
        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
        return currentStationNumber;
    }

    public int prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
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
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume >= 10) {
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
