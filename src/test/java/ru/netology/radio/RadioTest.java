package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void TestSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 1;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 0;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 2;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        int expected = 9;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 9;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 8;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 0;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        int expected = 7;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void inCreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.inCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void inCreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.inCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void inCreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;
        int actual = radio.inCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void inCreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 2;
        int actual = radio.inCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void deCreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.deCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void deCreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.deCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void deCreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 0;
        int actual = radio.deCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void deCreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 8;
        int actual = radio.deCreaseVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}