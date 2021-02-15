package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(0, 10, 0, 100);
    @Test
    //Проверка текущей станции
    public void shouldCurrentRadioStation(){
        radio.setRadioStationNumber(8);
        assertEquals(8, radio.getRadioStationNumber());
    }
    @Test
    // Установка станции с пульта больше возможной
    public void shouldCurrentRadioStationUpperNotValid(){
        radio.setRadioStationNumber(11);
        assertEquals(0, radio.getRadioStationNumber());
    }
    @Test
    //Установка станции с пульта меньше валидной
    public void shouldCurrentRadioStationLowerNotValid(){
        radio.setRadioStationNumber(-1);
        assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    //Следущая станция
    public void shouldNexStation(){
        radio.setRadioStationNumber(5);
        radio.nextStation();
        assertEquals(6, radio.getRadioStationNumber());
    }
    @Test
    //Следущая станция после максимальной
    public void shouldNexStationMax(){
        radio.setRadioStationNumber(10);
        radio.nextStation();
        assertEquals(0, radio.getRadioStationNumber());
    }
    @Test
    //Предыдущая станция
    public void shouldPrevStation(){
        radio.setRadioStationNumber(5);
        radio.prevStation();
        assertEquals(4, radio.getRadioStationNumber());
    }
    @Test
    //Предыдущая станция после минимальной
    public void shouldPrevStationMin(){
        radio.setRadioStationNumber(0);
        radio.prevStation();
        assertEquals(10, radio.getRadioStationNumber());
    }
    @Test
    //Текущая громкость
    public void shouldCurrentSoundVolume(){
        radio.setSoundVolume(50);
        assertEquals(50, radio.getSoundVolume());
    }
    @Test
    //установка громкости выше лимита
    public void shouldCurrentSoundVolumeUpperNotValid(){
        radio.setSoundVolume(101);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    //установка громкости ниже лимита
    public void shouldCurrentSoundVolumeLowerNotValid(){
        radio.setSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    //уменьшение громкости
    public void shouldSoundVolumeDecrease(){
        radio.setSoundVolume(1);
        radio.soundVolumeDecrease();
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    //уменьшение громкости после минимальной
    public void shouldSoundVolumeDecreaseMin(){
        radio.setSoundVolume(0);
        radio.soundVolumeDecrease();
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    //увеличение громкости
    public void shouldSoundVolumeIncrease(){
        radio.setSoundVolume(99);
        radio.soundVolumeIncrease();
        assertEquals(100, radio.getSoundVolume());
    }
    @Test
    //Увеличение громкости после максимальной
    public void shouldSoundVolumeIncreaseMax() {
        radio.setSoundVolume(100);
        radio.soundVolumeIncrease();
        assertEquals(100, radio.getSoundVolume());
    }


}