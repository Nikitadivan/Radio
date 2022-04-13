package ru.netology.radio;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    // Блок взаимодействия с радиостанциями:
    public int getCurrentNumberStation() {

        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation > 9) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public int nextNumberStation() {
        if (currentNumberStation < 9) {
            return currentNumberStation = currentNumberStation + 1;
        }
        return currentNumberStation = 0;

    }

    public int prevNumberStation() {
        if (currentNumberStation > 0) {
            return currentNumberStation = currentNumberStation - 1;
        }

        return currentNumberStation = 9;

    }

    // блок взаимодействия со звуком:
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int inCreaseVolume() {
        if (currentVolume < 10) {
            return currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int deCreaseVolume() {
        if (currentVolume > 0) {
            return currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}