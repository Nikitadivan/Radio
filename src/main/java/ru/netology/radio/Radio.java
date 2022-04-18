package ru.netology.radio;

public class Radio {
    private int currentNumberStation;
    private int amountStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    // Блок взаимодействия с радиостанциями:
    public int getCurrentNumberStation() {

        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation >= amountStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }


    public int nextNumberStation() {
        if (currentNumberStation < (amountStation - 1)) {
            return currentNumberStation = currentNumberStation + 1;
        }
        return currentNumberStation = 0;

    }

    public int prevNumberStation() {
        if (currentNumberStation > 0) {
            return currentNumberStation = currentNumberStation - 1;
        }

        return currentNumberStation = amountStation - 1;

    }

    // блок взаимодействия со звуком:
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 100) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public int inCreaseVolume() {
        if (currentVolume < 100) {
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